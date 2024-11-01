package net.shieldprojects.shieldextracontent.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.shieldprojects.shieldextracontent.component.ModDataComponents;
import net.shieldprojects.shieldextracontent.item.CustomRarity;
import net.shieldprojects.shieldextracontent.utils.Vec2Codec;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class StoneRewind extends Item {

    public StoneRewind(Properties properties) {
        super(properties
                .durability(2)
                .fireResistant()
                .rarity(CustomRarity.RARE_RARITY.getValue())
                .stacksTo(1)
        );
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (player.isShiftKeyDown()) {
            // Запоминаем координаты игрока
            stack.set(ModDataComponents.PLAYER_COORDINATES, player.getOnPos());
            stack.set(ModDataComponents.PLAYER_HEAD_ROTATIONS, new Vec2Codec(player.getXRot(), player.getYRot()));
            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BEACON_POWER_SELECT, SoundSource.AMBIENT, 1.5F, 1.0F);
            player.displayClientMessage(Component.literal("Воспоминание сохранено!").withStyle(ChatFormatting.BOLD), true);
        } else {
            if (getDamage(stack) != getMaxDamage(stack)) {
                BlockPos nbt = stack.get(ModDataComponents.PLAYER_COORDINATES);
                Vec2Codec headRot = stack.get(ModDataComponents.PLAYER_HEAD_ROTATIONS);
                player.displayClientMessage(Component.literal("В камне нет воспоминаний..." ), true);
                if (nbt != null && headRot != null) {
                    player.displayClientMessage(Component.literal("Телепортация..." ), true);
                    final int delayTicks = 30;

                    level.playLocalSound(player.getOnPos(), SoundEvents.BEACON_ACTIVATE, SoundSource.AMBIENT, 0.5F, 1.0F, false);
                    level.playLocalSound(player.getOnPos(), SoundEvents.BEACON_POWER_SELECT, SoundSource.AMBIENT, 0.5F, 1.0F, false);
                    // Спавн фиолетовых частиц
                    for (int i = 0; i < 200; i++) {
                        level.addParticle(
                                ParticleTypes.PORTAL,
                                player.getX() + (Math.random() - 0.5),
                                player.getY() + (Math.random() - 0.5),
                                player.getZ() + (Math.random() - 0.5),
                                0, 0, 0
                        );
                    }

                    Minecraft.getInstance().execute(() -> {
                        if(player.isAlive()) {
                            new Timer().schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    level.playLocalSound(player.getOnPos(), SoundEvents.BEACON_DEACTIVATE, SoundSource.AMBIENT, 0.65F, 1.0F, false);
                                    player.setPos(nbt.getX(), nbt.getY()+1, nbt.getZ());
                                    // set player head rotation
                                    player.setXRot(headRot.getX());
                                    player.setYRot(headRot.getY());
                                    level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BEACON_DEACTIVATE, SoundSource.AMBIENT, 0.65F, 1.0F);
                                    for (int i = 0; i < 200; i++) {
                                        level.addParticle(
                                                ParticleTypes.PORTAL,
                                                player.getX() + (Math.random() - 0.5),
                                                player.getY() + (Math.random() - 0.5),
                                                player.getZ() + (Math.random() - 0.5),
                                                0, 0, 0
                                        );
                                    }
                                }
                            }, delayTicks * 50);
                        }
                    });


                    // damage item
                    if (!player.isCreative())
                    {
                        int damageCount = 1;
                        if(getMaxDamage(stack) != getDamage(stack) + damageCount) {
                            stack.setDamageValue(getDamage(stack) + damageCount);
                        }
                        else {
                            stack.setCount(stack.getCount() - 1);
                            level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.AMETHYST_BLOCK_BREAK, SoundSource.AMBIENT, 1.5F, 1.0F);
                        }
                    }
                }
            } else {
                stack.setCount(stack.getCount() - 1);
                level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.AMETHYST_BLOCK_BREAK, SoundSource.AMBIENT, 1.5F, 1.0F);
            }
        }

        return InteractionResultHolder.consume(stack);
    }


    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> components, @NotNull TooltipFlag flag)
    {
        if(Screen.hasControlDown())
        {
            components.add(Component.translatable("tooltip.shieldextracontent.stone_rewind.title_shifted"));
        }
        else
        {
            components.add(Component.translatable("tooltip.shieldextracontent.stone_rewind.title"));
        }

        BlockPos blockPos = stack.get(ModDataComponents.PLAYER_COORDINATES);
        if(blockPos != null) {
            components.add(Component.literal("\nX: " + blockPos.getX() + " | Y: " + blockPos.getY() + " | Z: " + blockPos.getZ()));
        }

        super.appendHoverText(stack, context, components, flag);
    }
}
