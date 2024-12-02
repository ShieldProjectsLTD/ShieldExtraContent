package net.shieldprojects.shieldextracontent.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.OAK_WOOD_STAIRS.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.OAK_LOG_STAIRS.get());
        dropSelf(ModBlocks.OAK_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.OAK_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_WOOD_SLAB.get()));
        add(ModBlocks.OAK_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.OAK_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_LOG_SLAB.get()));
        add(ModBlocks.OAK_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.OAK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.OAK_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.OAK_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.OAK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.OAK_LOG_BUTTON.get());
        dropSelf(ModBlocks.OAK_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.OAK_WOOD_FENCE.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.OAK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.OAK_PLANK_WALL.get());
        dropSelf(ModBlocks.OAK_WOOD_WALL.get());
        dropSelf(ModBlocks.OAK_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.SPRUCE_WOOD_STAIRS.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.SPRUCE_LOG_STAIRS.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.SPRUCE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_WOOD_SLAB.get()));
        add(ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.SPRUCE_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_LOG_SLAB.get()));
        add(ModBlocks.SPRUCE_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SPRUCE_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.SPRUCE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.SPRUCE_LOG_BUTTON.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.SPRUCE_WOOD_FENCE.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.SPRUCE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.SPRUCE_PLANK_WALL.get());
        dropSelf(ModBlocks.SPRUCE_WOOD_WALL.get());
        dropSelf(ModBlocks.SPRUCE_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.BIRCH_WOOD_STAIRS.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.BIRCH_LOG_STAIRS.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.BIRCH_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_WOOD_SLAB.get()));
        add(ModBlocks.BIRCH_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.BIRCH_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_LOG_SLAB.get()));
        add(ModBlocks.BIRCH_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BIRCH_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.BIRCH_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.BIRCH_LOG_BUTTON.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.BIRCH_WOOD_FENCE.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.BIRCH_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.BIRCH_PLANK_WALL.get());
        dropSelf(ModBlocks.BIRCH_WOOD_WALL.get());
        dropSelf(ModBlocks.BIRCH_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.JUNGLE_WOOD_STAIRS.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.JUNGLE_LOG_STAIRS.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.JUNGLE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_WOOD_SLAB.get()));
        add(ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.JUNGLE_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_LOG_SLAB.get()));
        add(ModBlocks.JUNGLE_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.JUNGLE_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.JUNGLE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.JUNGLE_LOG_BUTTON.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.JUNGLE_WOOD_FENCE.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.JUNGLE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.JUNGLE_PLANK_WALL.get());
        dropSelf(ModBlocks.JUNGLE_WOOD_WALL.get());
        dropSelf(ModBlocks.JUNGLE_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.ACACIA_WOOD_STAIRS.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.ACACIA_LOG_STAIRS.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.ACACIA_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_WOOD_SLAB.get()));
        add(ModBlocks.ACACIA_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.ACACIA_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_LOG_SLAB.get()));
        add(ModBlocks.ACACIA_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ACACIA_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.ACACIA_WOOD_BUTTON.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.ACACIA_LOG_BUTTON.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.ACACIA_WOOD_FENCE.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.ACACIA_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.ACACIA_PLANK_WALL.get());
        dropSelf(ModBlocks.ACACIA_WOOD_WALL.get());
        dropSelf(ModBlocks.ACACIA_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.DARK_OAK_WOOD_STAIRS.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.DARK_OAK_LOG_STAIRS.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.DARK_OAK_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_WOOD_SLAB.get()));
        add(ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.DARK_OAK_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_LOG_SLAB.get()));
        add(ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.DARK_OAK_WOOD_BUTTON.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.DARK_OAK_LOG_BUTTON.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.DARK_OAK_WOOD_FENCE.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.DARK_OAK_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.DARK_OAK_PLANK_WALL.get());
        dropSelf(ModBlocks.DARK_OAK_WOOD_WALL.get());
        dropSelf(ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.MANGROVE_WOOD_STAIRS.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.MANGROVE_LOG_STAIRS.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.MANGROVE_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_WOOD_SLAB.get()));
        add(ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.MANGROVE_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_LOG_SLAB.get()));
        add(ModBlocks.MANGROVE_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MANGROVE_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.MANGROVE_WOOD_BUTTON.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.MANGROVE_LOG_BUTTON.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.MANGROVE_WOOD_FENCE.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.MANGROVE_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.MANGROVE_PLANK_WALL.get());
        dropSelf(ModBlocks.MANGROVE_WOOD_WALL.get());
        dropSelf(ModBlocks.MANGROVE_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.CHERRY_WOOD_STAIRS.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS.get());
        dropSelf(ModBlocks.CHERRY_LOG_STAIRS.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_LOG_STAIRS.get());

        add(ModBlocks.CHERRY_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_WOOD_SLAB.get()));
        add(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.get()));
        add(ModBlocks.CHERRY_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_LOG_SLAB.get()));
        add(ModBlocks.CHERRY_STRIPPED_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_STRIPPED_LOG_SLAB.get()));

        dropSelf(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CHERRY_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.CHERRY_WOOD_BUTTON.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON.get());
        dropSelf(ModBlocks.CHERRY_LOG_BUTTON.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_LOG_BUTTON.get());

        dropSelf(ModBlocks.CHERRY_WOOD_FENCE.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE.get());
        dropSelf(ModBlocks.CHERRY_WOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE.get());

        dropSelf(ModBlocks.CHERRY_PLANK_WALL.get());
        dropSelf(ModBlocks.CHERRY_WOOD_WALL.get());
        dropSelf(ModBlocks.CHERRY_STRIPPED_WOOD_WALL.get());

        //
        //

        dropSelf(ModBlocks.CRIMSON_HYPHAE_STAIRS.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS.get());
        dropSelf(ModBlocks.CRIMSON_STEM_STAIRS.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_STEM_STAIRS.get());

        add(ModBlocks.CRIMSON_HYPHAE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_HYPHAE_SLAB.get()));
        add(ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB.get()));
        add(ModBlocks.CRIMSON_STEM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_STEM_SLAB.get()));
        add(ModBlocks.CRIMSON_STRIPPED_STEM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_STRIPPED_STEM_SLAB.get()));

        dropSelf(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CRIMSON_STEM_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_STEM_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.CRIMSON_HYPHAE_BUTTON.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON.get());
        dropSelf(ModBlocks.CRIMSON_STEM_BUTTON.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON.get());

        dropSelf(ModBlocks.CRIMSON_HYPHAE_FENCE.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE.get());
        dropSelf(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE.get());

        dropSelf(ModBlocks.CRIMSON_PLANK_WALL.get());
        dropSelf(ModBlocks.CRIMSON_HYPHAE_WALL.get());
        dropSelf(ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL.get());

        //
        //

        dropSelf(ModBlocks.WARPED_HYPHAE_STAIRS.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS.get());
        dropSelf(ModBlocks.WARPED_STEM_STAIRS.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_STEM_STAIRS.get());

        add(ModBlocks.WARPED_HYPHAE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_HYPHAE_SLAB.get()));
        add(ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB.get()));
        add(ModBlocks.WARPED_STEM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_STEM_SLAB.get()));
        add(ModBlocks.WARPED_STRIPPED_STEM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_STRIPPED_STEM_SLAB.get()));

        dropSelf(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WARPED_STEM_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_STEM_PRESSURE_PLATE.get());

        dropSelf(ModBlocks.WARPED_HYPHAE_BUTTON.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON.get());
        dropSelf(ModBlocks.WARPED_STEM_BUTTON.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_STEM_BUTTON.get());

        dropSelf(ModBlocks.WARPED_HYPHAE_FENCE.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE.get());
        dropSelf(ModBlocks.WARPED_HYPHAE_FENCE_GATE.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE.get());

        dropSelf(ModBlocks.WARPED_PLANK_WALL.get());
        dropSelf(ModBlocks.WARPED_HYPHAE_WALL.get());
        dropSelf(ModBlocks.WARPED_STRIPPED_HYPHAE_WALL.get());

    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
