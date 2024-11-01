package net.shieldprojects.shieldextracontent.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.shieldprojects.shieldextracontent.item.CustomRarity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UnholySoul extends Item {
    public UnholySoul(Properties properties)
    {
        super(properties
                .stacksTo(16)
                .rarity(CustomRarity.TRASH_RARITY.getValue())
        );
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext context)
    {
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> components, @NotNull TooltipFlag flag)
    {
        if(Screen.hasShiftDown())
        {
            components.add(Component.translatable("tooltip.shieldextracontent.unholy_soul.title_shifted"));
        }
        else
        {
            components.add(Component.translatable("tooltip.shieldextracontent.unholy_soul.title"));
        }

        super.appendHoverText(stack, context, components, flag);
    }
}
