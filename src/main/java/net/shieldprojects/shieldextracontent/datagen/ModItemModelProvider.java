package net.shieldprojects.shieldextracontent.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ShieldExtraContentMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        buttonItem(ModBlocks.WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE);
        wallItem(ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);

        buttonItem(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE);
        wallItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);

        buttonItem(ModBlocks.GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE);
        wallItem(ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);

        buttonItem(ModBlocks.BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE);
        wallItem(ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);

        buttonItem(ModBlocks.BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE);
        wallItem(ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);

        buttonItem(ModBlocks.RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE);
        wallItem(ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);

        buttonItem(ModBlocks.ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE);
        wallItem(ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);

        buttonItem(ModBlocks.YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE);
        wallItem(ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);

        buttonItem(ModBlocks.LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE);
        wallItem(ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);

        buttonItem(ModBlocks.GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE);
        wallItem(ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);

        buttonItem(ModBlocks.CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE);
        wallItem(ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);

        buttonItem(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE);
        wallItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);

        buttonItem(ModBlocks.BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE);
        wallItem(ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);

        buttonItem(ModBlocks.PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE);
        wallItem(ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);

        buttonItem(ModBlocks.MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE);
        wallItem(ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);

        buttonItem(ModBlocks.PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE);
        wallItem(ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);

        //
        //

        buttonItem(ModBlocks.OAK_WOOD_BUTTON, Blocks.OAK_WOOD);
        buttonItem(ModBlocks.OAK_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_OAK_WOOD);
        buttonItem(ModBlocks.OAK_LOG_BUTTON, Blocks.OAK_LOG);
        buttonItem(ModBlocks.OAK_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_OAK_LOG);

        fenceItem(ModBlocks.OAK_WOOD_FENCE, Blocks.OAK_WOOD);
        fenceItem(ModBlocks.OAK_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_OAK_WOOD);

        wallItem(ModBlocks.OAK_PLANK_WALL, Blocks.OAK_PLANKS);
        wallItem(ModBlocks.OAK_WOOD_WALL, Blocks.OAK_WOOD);
        wallItem(ModBlocks.OAK_STRIPPED_WOOD_WALL, Blocks.STRIPPED_OAK_WOOD);

        //
        //

        buttonItem(ModBlocks.SPRUCE_WOOD_BUTTON, Blocks.SPRUCE_WOOD);
        buttonItem(ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_SPRUCE_WOOD);
        buttonItem(ModBlocks.SPRUCE_LOG_BUTTON, Blocks.SPRUCE_LOG);
        buttonItem(ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_SPRUCE_LOG);

        fenceItem(ModBlocks.SPRUCE_WOOD_FENCE, Blocks.SPRUCE_WOOD);
        fenceItem(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_SPRUCE_WOOD);

        wallItem(ModBlocks.SPRUCE_PLANK_WALL, Blocks.SPRUCE_PLANKS);
        wallItem(ModBlocks.SPRUCE_WOOD_WALL, Blocks.SPRUCE_WOOD);
        wallItem(ModBlocks.SPRUCE_STRIPPED_WOOD_WALL, Blocks.STRIPPED_SPRUCE_WOOD);

        //
        //

        buttonItem(ModBlocks.BIRCH_WOOD_BUTTON, Blocks.BIRCH_WOOD);
        buttonItem(ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_BIRCH_WOOD);
        buttonItem(ModBlocks.BIRCH_LOG_BUTTON, Blocks.BIRCH_LOG);
        buttonItem(ModBlocks.BIRCH_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_BIRCH_LOG);

        fenceItem(ModBlocks.BIRCH_WOOD_FENCE, Blocks.BIRCH_WOOD);
        fenceItem(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_BIRCH_WOOD);

        wallItem(ModBlocks.BIRCH_PLANK_WALL, Blocks.BIRCH_PLANKS);
        wallItem(ModBlocks.BIRCH_WOOD_WALL, Blocks.BIRCH_WOOD);
        wallItem(ModBlocks.BIRCH_STRIPPED_WOOD_WALL, Blocks.STRIPPED_BIRCH_WOOD);

        //
        //

        buttonItem(ModBlocks.JUNGLE_WOOD_BUTTON, Blocks.JUNGLE_WOOD);
        buttonItem(ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_JUNGLE_WOOD);
        buttonItem(ModBlocks.JUNGLE_LOG_BUTTON, Blocks.JUNGLE_LOG);
        buttonItem(ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_JUNGLE_LOG);

        fenceItem(ModBlocks.JUNGLE_WOOD_FENCE, Blocks.JUNGLE_WOOD);
        fenceItem(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_JUNGLE_WOOD);

        wallItem(ModBlocks.JUNGLE_PLANK_WALL, Blocks.JUNGLE_PLANKS);
        wallItem(ModBlocks.JUNGLE_WOOD_WALL, Blocks.JUNGLE_WOOD);
        wallItem(ModBlocks.JUNGLE_STRIPPED_WOOD_WALL, Blocks.STRIPPED_JUNGLE_WOOD);

        //
        //

        buttonItem(ModBlocks.ACACIA_WOOD_BUTTON, Blocks.ACACIA_WOOD);
        buttonItem(ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_ACACIA_WOOD);
        buttonItem(ModBlocks.ACACIA_LOG_BUTTON, Blocks.ACACIA_LOG);
        buttonItem(ModBlocks.ACACIA_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_ACACIA_LOG);

        fenceItem(ModBlocks.ACACIA_WOOD_FENCE, Blocks.ACACIA_WOOD);
        fenceItem(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_ACACIA_WOOD);

        wallItem(ModBlocks.ACACIA_PLANK_WALL, Blocks.ACACIA_PLANKS);
        wallItem(ModBlocks.ACACIA_WOOD_WALL, Blocks.ACACIA_WOOD);
        wallItem(ModBlocks.ACACIA_STRIPPED_WOOD_WALL, Blocks.STRIPPED_ACACIA_WOOD);

        //
        //

        buttonItem(ModBlocks.DARK_OAK_WOOD_BUTTON, Blocks.DARK_OAK_WOOD);
        buttonItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_DARK_OAK_WOOD);
        buttonItem(ModBlocks.DARK_OAK_LOG_BUTTON, Blocks.DARK_OAK_LOG);
        buttonItem(ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_DARK_OAK_LOG);

        fenceItem(ModBlocks.DARK_OAK_WOOD_FENCE, Blocks.DARK_OAK_WOOD);
        fenceItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_DARK_OAK_WOOD);

        wallItem(ModBlocks.DARK_OAK_PLANK_WALL, Blocks.DARK_OAK_PLANKS);
        wallItem(ModBlocks.DARK_OAK_WOOD_WALL, Blocks.DARK_OAK_WOOD);
        wallItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL, Blocks.STRIPPED_DARK_OAK_WOOD);

        //
        //

        buttonItem(ModBlocks.MANGROVE_WOOD_BUTTON, Blocks.MANGROVE_WOOD);
        buttonItem(ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_MANGROVE_WOOD);
        buttonItem(ModBlocks.MANGROVE_LOG_BUTTON, Blocks.MANGROVE_LOG);
        buttonItem(ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_MANGROVE_LOG);

        fenceItem(ModBlocks.MANGROVE_WOOD_FENCE, Blocks.MANGROVE_WOOD);
        fenceItem(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_MANGROVE_WOOD);

        wallItem(ModBlocks.MANGROVE_PLANK_WALL, Blocks.MANGROVE_PLANKS);
        wallItem(ModBlocks.MANGROVE_WOOD_WALL, Blocks.MANGROVE_WOOD);
        wallItem(ModBlocks.MANGROVE_STRIPPED_WOOD_WALL, Blocks.STRIPPED_MANGROVE_WOOD);

        //
        //

        buttonItem(ModBlocks.CHERRY_WOOD_BUTTON, Blocks.CHERRY_WOOD);
        buttonItem(ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON, Blocks.STRIPPED_CHERRY_WOOD);
        buttonItem(ModBlocks.CHERRY_LOG_BUTTON, Blocks.CHERRY_LOG);
        buttonItem(ModBlocks.CHERRY_STRIPPED_LOG_BUTTON, Blocks.STRIPPED_CHERRY_LOG);

        fenceItem(ModBlocks.CHERRY_WOOD_FENCE, Blocks.CHERRY_WOOD);
        fenceItem(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE, Blocks.STRIPPED_CHERRY_WOOD);

        wallItem(ModBlocks.CHERRY_PLANK_WALL, Blocks.CHERRY_PLANKS);
        wallItem(ModBlocks.CHERRY_WOOD_WALL, Blocks.CHERRY_WOOD);
        wallItem(ModBlocks.CHERRY_STRIPPED_WOOD_WALL, Blocks.STRIPPED_CHERRY_WOOD);

        //
        //

        buttonItem(ModBlocks.CRIMSON_HYPHAE_BUTTON, Blocks.CRIMSON_HYPHAE);
        buttonItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON, Blocks.STRIPPED_CRIMSON_HYPHAE);
        buttonItem(ModBlocks.CRIMSON_STEM_BUTTON, Blocks.CRIMSON_STEM);
        buttonItem(ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON, Blocks.STRIPPED_CRIMSON_STEM);

        fenceItem(ModBlocks.CRIMSON_HYPHAE_FENCE, Blocks.CRIMSON_HYPHAE);
        fenceItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE, Blocks.STRIPPED_CRIMSON_HYPHAE);

        wallItem(ModBlocks.CRIMSON_PLANK_WALL, Blocks.CRIMSON_PLANKS);
        wallItem(ModBlocks.CRIMSON_HYPHAE_WALL, Blocks.CRIMSON_HYPHAE);
        wallItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL, Blocks.STRIPPED_CRIMSON_HYPHAE);

        //
        //

        buttonItem(ModBlocks.WARPED_HYPHAE_BUTTON, Blocks.WARPED_HYPHAE);
        buttonItem(ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON, Blocks.STRIPPED_WARPED_HYPHAE);
        buttonItem(ModBlocks.WARPED_STEM_BUTTON, Blocks.WARPED_STEM);
        buttonItem(ModBlocks.WARPED_STRIPPED_STEM_BUTTON, Blocks.STRIPPED_WARPED_STEM);

        fenceItem(ModBlocks.WARPED_HYPHAE_FENCE, Blocks.WARPED_HYPHAE);
        fenceItem(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE, Blocks.STRIPPED_WARPED_HYPHAE);

        wallItem(ModBlocks.WARPED_PLANK_WALL, Blocks.WARPED_PLANKS);
        wallItem(ModBlocks.WARPED_HYPHAE_WALL, Blocks.WARPED_HYPHAE);
        wallItem(ModBlocks.WARPED_STRIPPED_HYPHAE_WALL, Blocks.STRIPPED_WARPED_HYPHAE);
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, Block baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, Block baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, Block baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID,
                        "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID, "item/" + item.getId().getPath()));
    }


}
