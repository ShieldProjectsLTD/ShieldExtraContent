package net.shieldprojects.shieldextracontent.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.shieldprojects.shieldextracontent.item.CustomRarity;
import net.shieldprojects.shieldextracontent.item.ModItems;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class LockedSoul extends Item {
    private final int burnTime;

    public LockedSoul(Properties properties, int burnTime) {
        super(properties
                .rarity(CustomRarity.UNCOMMON_RARITY.getValue())
        );
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        Vec3 eyePos = player.getEyePosition();
        Vec3 look = player.getLookAngle().normalize().scale(1.0);

        Sheep sheep = new Sheep(EntityType.SHEEP, level);
        sheep.setPos(eyePos.x + look.x, eyePos.y - 0.3, eyePos.z + look.z);
        level.addFreshEntity(sheep);

        ItemStack newStack = ModItems.UNHOLY_SOUL.toStack();
        newStack.setCount(1);

        if(!player.addItem(newStack)) {
            level.addFreshEntity(
                    new ItemEntity(level, player.getX(), player.getY(), player.getZ(), newStack)
            );
        }

        stack.shrink(1);

        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.SOUL_ESCAPE, SoundSource.AMBIENT, 5.0F, 1.0F);
        return InteractionResultHolder.consume(stack);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> components, @NotNull TooltipFlag flag)
    {
        if(Screen.hasShiftDown())
        {
            components.add(Component.translatable("tooltip.shieldextracontent.locked_soul.title_shifted"));
        }
        else
        {
            components.add(Component.translatable("tooltip.shieldextracontent.locked_soul.title"));
        }

        super.appendHoverText(stack, context, components, flag);
    }
}
