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
