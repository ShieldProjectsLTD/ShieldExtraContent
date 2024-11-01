package net.shieldprojects.shieldextracontent.item;

import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Rarity;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;
import net.minecraft.ChatFormatting;

import java.util.function.UnaryOperator;

public class CustomRarity {

    public static final EnumProxy<Rarity> MYTHIC_RARITY = new EnumProxy<>(
            Rarity.class, -1, "shieldextracontent:mythic_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.RED).withBold(true)
    );

    public static final EnumProxy<Rarity> LEGENDARY_RARITY = new EnumProxy<>(
            Rarity.class, -1, "shieldextracontent:legendary_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.GOLD).withItalic(true)
    );

    public static final EnumProxy<Rarity> EPIC_RARITY = new EnumProxy<>(
            Rarity.class, 3, "shieldextracontent:epic_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.LIGHT_PURPLE)
    );

    public static final EnumProxy<Rarity> RARE_RARITY = new EnumProxy<>(
            Rarity.class, 2, "shieldextracontent:rare_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.BLUE)
    );

    public static final EnumProxy<Rarity> UNCOMMON_RARITY = new EnumProxy<>(
            Rarity.class, 1, "shieldextracontent:uncommon_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.YELLOW)
    );

    public static final EnumProxy<Rarity> COMMON_RARITY = new EnumProxy<>(
            Rarity.class, 0, "shieldextracontent:common_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.WHITE)
    );

    public static final EnumProxy<Rarity> TRASH_RARITY = new EnumProxy<>(
            Rarity.class, -1, "shieldextracontent:trash_rarity",
            (UnaryOperator<Style>) style -> style.withColor(ChatFormatting.DARK_GRAY)
    );

}