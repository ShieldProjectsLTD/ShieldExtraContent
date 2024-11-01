package net.shieldprojects.shieldextracontent.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.shieldprojects.shieldextracontent.item.CustomRarity;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class SmallCoal extends Item {
    private final int burnTime;

    public SmallCoal(Properties properties, int burnTime) {
        super(properties
                .rarity(CustomRarity.COMMON_RARITY.getValue())
        );
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
