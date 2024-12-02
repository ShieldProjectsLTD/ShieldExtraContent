package net.shieldprojects.shieldextracontent.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ShieldExtraContentMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.FENCES)
                .add(ModBlocks.OAK_WOOD_FENCE.get())
                .add(ModBlocks.OAK_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.SPRUCE_WOOD_FENCE.get())
                .add(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.BIRCH_WOOD_FENCE.get())
                .add(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.JUNGLE_WOOD_FENCE.get())
                .add(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.ACACIA_WOOD_FENCE.get())
                .add(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.DARK_OAK_WOOD_FENCE.get())
                .add(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.MANGROVE_WOOD_FENCE.get())
                .add(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.CHERRY_WOOD_FENCE.get())
                .add(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE.get())

                .add(ModBlocks.CRIMSON_HYPHAE_FENCE.get())
                .add(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE.get())

                .add(ModBlocks.WARPED_HYPHAE_FENCE.get())
                .add(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.OAK_WOOD_FENCE_GATE.get())
                .add(ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.SPRUCE_WOOD_FENCE_GATE.get())
                .add(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.BIRCH_WOOD_FENCE_GATE.get())
                .add(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.JUNGLE_WOOD_FENCE_GATE.get())
                .add(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.ACACIA_WOOD_FENCE_GATE.get())
                .add(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE.get())
                .add(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.MANGROVE_WOOD_FENCE_GATE.get())
                .add(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.CHERRY_WOOD_FENCE_GATE.get())
                .add(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE.get())

                .add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE.get())
                .add(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE.get())

                .add(ModBlocks.WARPED_HYPHAE_FENCE_GATE.get())
                .add(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.OAK_PLANK_WALL.get())
                .add(ModBlocks.OAK_WOOD_WALL.get())
                .add(ModBlocks.OAK_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.SPRUCE_PLANK_WALL.get())
                .add(ModBlocks.SPRUCE_WOOD_WALL.get())
                .add(ModBlocks.SPRUCE_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.BIRCH_PLANK_WALL.get())
                .add(ModBlocks.BIRCH_WOOD_WALL.get())
                .add(ModBlocks.BIRCH_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.JUNGLE_PLANK_WALL.get())
                .add(ModBlocks.JUNGLE_WOOD_WALL.get())
                .add(ModBlocks.JUNGLE_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.ACACIA_PLANK_WALL.get())
                .add(ModBlocks.ACACIA_WOOD_WALL.get())
                .add(ModBlocks.ACACIA_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.DARK_OAK_PLANK_WALL.get())
                .add(ModBlocks.DARK_OAK_WOOD_WALL.get())
                .add(ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.MANGROVE_PLANK_WALL.get())
                .add(ModBlocks.MANGROVE_WOOD_WALL.get())
                .add(ModBlocks.MANGROVE_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.CHERRY_PLANK_WALL.get())
                .add(ModBlocks.CHERRY_WOOD_WALL.get())
                .add(ModBlocks.CHERRY_STRIPPED_WOOD_WALL.get())

                .add(ModBlocks.CRIMSON_PLANK_WALL.get())
                .add(ModBlocks.CRIMSON_HYPHAE_WALL.get())
                .add(ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL.get())

                .add(ModBlocks.WARPED_PLANK_WALL.get())
                .add(ModBlocks.WARPED_HYPHAE_WALL.get())
                .add(ModBlocks.WARPED_STRIPPED_HYPHAE_WALL.get());
    }
}
