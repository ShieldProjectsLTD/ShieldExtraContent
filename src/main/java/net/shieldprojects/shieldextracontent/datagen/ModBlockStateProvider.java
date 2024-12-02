package net.shieldprojects.shieldextracontent.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ShieldExtraContentMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        oakBlocks();
        spruceBlocks();
        birchBlocks();
        jungleBlocks();
        acaciaBlocks();
        darkOakBlocks();
        mangroveBlocks();
        cherryBlocks();
        warpedBlocks();
        crimsonBlocks();
//        bambooBlocks();
    }

    private void blockWithItem(@NotNull DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(@NotNull DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("shieldextracontent:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(@NotNull DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("shieldextracontent:block/" + deferredBlock.getId().getPath() + appendix));
    }

    private void oakBlocks() {
        stairsBlock(ModBlocks.OAK_WOOD_STAIRS.get(), blockTexture(Blocks.OAK_LOG));
        stairsBlock(ModBlocks.OAK_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));
        stairsBlock(ModBlocks.OAK_LOG_STAIRS.get(),
                mcLoc("block/oak_log"),
                mcLoc("block/oak_log_top"),
                mcLoc("block/oak_log_top"));
        stairsBlock(ModBlocks.OAK_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_oak_log"),
                mcLoc("block/stripped_oak_log_top"),
                mcLoc("block/stripped_oak_log_top")
        );

        slabBlock(ModBlocks.OAK_WOOD_SLAB.get(), blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG));
        slabBlock(ModBlocks.OAK_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_OAK_LOG), blockTexture(Blocks.STRIPPED_OAK_LOG));
        slabBlock(ModBlocks.OAK_LOG_SLAB.get(),
                blockTexture(Blocks.OAK_LOG),
                mcLoc("block/oak_log"),
                mcLoc("block/oak_log_top"),
                mcLoc("block/oak_log_top")
        );
        slabBlock(ModBlocks.OAK_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_OAK_LOG),
                mcLoc("block/stripped_oak_log"),
                mcLoc("block/stripped_oak_log_top"),
                mcLoc("block/stripped_oak_log_top")
        );

        pressurePlateBlock(ModBlocks.OAK_WOOD_PRESSURE_PLATE.get(), mcLoc("block/oak_log"));
        pressurePlateBlock(ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_oak_log"));
        pressurePlateBlock(ModBlocks.OAK_LOG_PRESSURE_PLATE.get(), mcLoc("block/oak_log_top"));
        pressurePlateBlock(ModBlocks.OAK_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_oak_log_top"));

        buttonBlock(ModBlocks.OAK_WOOD_BUTTON.get(), mcLoc("block/oak_log"));
        buttonBlock(ModBlocks.OAK_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_oak_log"));
        buttonBlock(ModBlocks.OAK_LOG_BUTTON.get(), mcLoc("block/oak_log_top"));
        buttonBlock(ModBlocks.OAK_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_oak_log_top"));

        fenceBlock(ModBlocks.OAK_WOOD_FENCE.get(), blockTexture(Blocks.OAK_LOG));
        fenceBlock(ModBlocks.OAK_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));

        fenceGateBlock(ModBlocks.OAK_WOOD_FENCE_GATE.get(), blockTexture(Blocks.OAK_LOG));
        fenceGateBlock(ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));

        wallBlock(ModBlocks.OAK_PLANK_WALL.get(), blockTexture(Blocks.OAK_PLANKS));
        wallBlock(ModBlocks.OAK_WOOD_WALL.get(), blockTexture(Blocks.OAK_LOG));
        wallBlock(ModBlocks.OAK_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));

        blockItem(ModBlocks.OAK_WOOD_STAIRS);
        blockItem(ModBlocks.OAK_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.OAK_LOG_STAIRS);
        blockItem(ModBlocks.OAK_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.OAK_WOOD_SLAB);
        blockItem(ModBlocks.OAK_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.OAK_LOG_SLAB);
        blockItem(ModBlocks.OAK_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.OAK_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.OAK_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.OAK_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.OAK_WOOD_FENCE_GATE);
        blockItem(ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE);
    }

    private void spruceBlocks() {
        stairsBlock(ModBlocks.SPRUCE_WOOD_STAIRS.get(), blockTexture(Blocks.SPRUCE_LOG));
        stairsBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        stairsBlock(ModBlocks.SPRUCE_LOG_STAIRS.get(),
                mcLoc("block/spruce_log"),
                mcLoc("block/spruce_log_top"),
                mcLoc("block/spruce_log_top"));
        stairsBlock(ModBlocks.SPRUCE_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_spruce_log"),
                mcLoc("block/stripped_spruce_log_top"),
                mcLoc("block/stripped_spruce_log_top")
        );

        slabBlock(ModBlocks.SPRUCE_WOOD_SLAB.get(), blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG));
        slabBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        slabBlock(ModBlocks.SPRUCE_LOG_SLAB.get(),
                blockTexture(Blocks.SPRUCE_LOG),
                mcLoc("block/spruce_log"),
                mcLoc("block/spruce_log_top"),
                mcLoc("block/spruce_log_top")
        );
        slabBlock(ModBlocks.SPRUCE_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_SPRUCE_LOG),
                mcLoc("block/stripped_spruce_log"),
                mcLoc("block/stripped_spruce_log_top"),
                mcLoc("block/stripped_spruce_log_top")
        );

        pressurePlateBlock(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE.get(), mcLoc("block/spruce_log"));
        pressurePlateBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_spruce_log"));
        pressurePlateBlock(ModBlocks.SPRUCE_LOG_PRESSURE_PLATE.get(), mcLoc("block/spruce_log_top"));
        pressurePlateBlock(ModBlocks.SPRUCE_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_spruce_log_top"));

        buttonBlock(ModBlocks.SPRUCE_WOOD_BUTTON.get(), mcLoc("block/spruce_log"));
        buttonBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_spruce_log"));
        buttonBlock(ModBlocks.SPRUCE_LOG_BUTTON.get(), mcLoc("block/spruce_log_top"));
        buttonBlock(ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_spruce_log_top"));

        fenceBlock(ModBlocks.SPRUCE_WOOD_FENCE.get(), blockTexture(Blocks.SPRUCE_LOG));
        fenceBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));

        fenceGateBlock(ModBlocks.SPRUCE_WOOD_FENCE_GATE.get(), blockTexture(Blocks.SPRUCE_LOG));
        fenceGateBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));

        wallBlock(ModBlocks.SPRUCE_PLANK_WALL.get(), blockTexture(Blocks.SPRUCE_PLANKS));
        wallBlock(ModBlocks.SPRUCE_WOOD_WALL.get(), blockTexture(Blocks.SPRUCE_LOG));
        wallBlock(ModBlocks.SPRUCE_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));

        blockItem(ModBlocks.SPRUCE_WOOD_STAIRS);
        blockItem(ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.SPRUCE_LOG_STAIRS);
        blockItem(ModBlocks.SPRUCE_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.SPRUCE_WOOD_SLAB);
        blockItem(ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.SPRUCE_LOG_SLAB);
        blockItem(ModBlocks.SPRUCE_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.SPRUCE_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.SPRUCE_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE);
    }

    private void birchBlocks() {
        stairsBlock(ModBlocks.BIRCH_WOOD_STAIRS.get(), blockTexture(Blocks.BIRCH_LOG));
        stairsBlock(ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        stairsBlock(ModBlocks.BIRCH_LOG_STAIRS.get(),
                mcLoc("block/birch_log"),
                mcLoc("block/birch_log_top"),
                mcLoc("block/birch_log_top"));
        stairsBlock(ModBlocks.BIRCH_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_birch_log"),
                mcLoc("block/stripped_birch_log_top"),
                mcLoc("block/stripped_birch_log_top")
        );

        slabBlock(ModBlocks.BIRCH_WOOD_SLAB.get(), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG));
        slabBlock(ModBlocks.BIRCH_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        slabBlock(ModBlocks.BIRCH_LOG_SLAB.get(),
                blockTexture(Blocks.BIRCH_LOG),
                mcLoc("block/birch_log"),
                mcLoc("block/birch_log_top"),
                mcLoc("block/birch_log_top")
        );
        slabBlock(ModBlocks.BIRCH_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_BIRCH_LOG),
                mcLoc("block/stripped_birch_log"),
                mcLoc("block/stripped_birch_log_top"),
                mcLoc("block/stripped_birch_log_top")
        );

        pressurePlateBlock(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE.get(), mcLoc("block/birch_log"));
        pressurePlateBlock(ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_birch_log"));
        pressurePlateBlock(ModBlocks.BIRCH_LOG_PRESSURE_PLATE.get(), mcLoc("block/birch_log_top"));
        pressurePlateBlock(ModBlocks.BIRCH_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_birch_log_top"));

        buttonBlock(ModBlocks.BIRCH_WOOD_BUTTON.get(), mcLoc("block/birch_log"));
        buttonBlock(ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_birch_log"));
        buttonBlock(ModBlocks.BIRCH_LOG_BUTTON.get(), mcLoc("block/birch_log_top"));
        buttonBlock(ModBlocks.BIRCH_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_birch_log_top"));

        fenceBlock(ModBlocks.BIRCH_WOOD_FENCE.get(), blockTexture(Blocks.BIRCH_LOG));
        fenceBlock(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));

        fenceGateBlock(ModBlocks.BIRCH_WOOD_FENCE_GATE.get(), blockTexture(Blocks.BIRCH_LOG));
        fenceGateBlock(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));

        wallBlock(ModBlocks.BIRCH_PLANK_WALL.get(), blockTexture(Blocks.BIRCH_PLANKS));
        wallBlock(ModBlocks.BIRCH_WOOD_WALL.get(), blockTexture(Blocks.BIRCH_LOG));
        wallBlock(ModBlocks.BIRCH_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));

        blockItem(ModBlocks.BIRCH_WOOD_STAIRS);
        blockItem(ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.BIRCH_LOG_STAIRS);
        blockItem(ModBlocks.BIRCH_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.BIRCH_WOOD_SLAB);
        blockItem(ModBlocks.BIRCH_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.BIRCH_LOG_SLAB);
        blockItem(ModBlocks.BIRCH_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.BIRCH_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.BIRCH_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        blockItem(ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE);
    }

    private void jungleBlocks() {
        stairsBlock(ModBlocks.JUNGLE_WOOD_STAIRS.get(), blockTexture(Blocks.JUNGLE_LOG));
        stairsBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        stairsBlock(ModBlocks.JUNGLE_LOG_STAIRS.get(),
                mcLoc("block/jungle_log"),
                mcLoc("block/jungle_log_top"),
                mcLoc("block/jungle_log_top"));
        stairsBlock(ModBlocks.JUNGLE_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_jungle_log"),
                mcLoc("block/stripped_jungle_log_top"),
                mcLoc("block/stripped_jungle_log_top")
        );

        slabBlock(ModBlocks.JUNGLE_WOOD_SLAB.get(), blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG));
        slabBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        slabBlock(ModBlocks.JUNGLE_LOG_SLAB.get(),
                blockTexture(Blocks.JUNGLE_LOG),
                mcLoc("block/jungle_log"),
                mcLoc("block/jungle_log_top"),
                mcLoc("block/jungle_log_top")
        );
        slabBlock(ModBlocks.JUNGLE_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_JUNGLE_LOG),
                mcLoc("block/stripped_jungle_log"),
                mcLoc("block/stripped_jungle_log_top"),
                mcLoc("block/stripped_jungle_log_top")
        );

        pressurePlateBlock(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE.get(), mcLoc("block/jungle_log"));
        pressurePlateBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_jungle_log"));
        pressurePlateBlock(ModBlocks.JUNGLE_LOG_PRESSURE_PLATE.get(), mcLoc("block/jungle_log_top"));
        pressurePlateBlock(ModBlocks.JUNGLE_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_jungle_log_top"));

        buttonBlock(ModBlocks.JUNGLE_WOOD_BUTTON.get(), mcLoc("block/jungle_log"));
        buttonBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_jungle_log"));
        buttonBlock(ModBlocks.JUNGLE_LOG_BUTTON.get(), mcLoc("block/jungle_log_top"));
        buttonBlock(ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_jungle_log_top"));

        fenceBlock(ModBlocks.JUNGLE_WOOD_FENCE.get(), blockTexture(Blocks.JUNGLE_LOG));
        fenceBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));

        fenceGateBlock(ModBlocks.JUNGLE_WOOD_FENCE_GATE.get(), blockTexture(Blocks.JUNGLE_LOG));
        fenceGateBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));

        wallBlock(ModBlocks.JUNGLE_PLANK_WALL.get(), blockTexture(Blocks.JUNGLE_PLANKS));
        wallBlock(ModBlocks.JUNGLE_WOOD_WALL.get(), blockTexture(Blocks.JUNGLE_LOG));
        wallBlock(ModBlocks.JUNGLE_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));

        blockItem(ModBlocks.JUNGLE_WOOD_STAIRS);
        blockItem(ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.JUNGLE_LOG_STAIRS);
        blockItem(ModBlocks.JUNGLE_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.JUNGLE_WOOD_SLAB);
        blockItem(ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.JUNGLE_LOG_SLAB);
        blockItem(ModBlocks.JUNGLE_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.JUNGLE_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.JUNGLE_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE);
    }

    private void acaciaBlocks() {
        stairsBlock(ModBlocks.ACACIA_WOOD_STAIRS.get(), blockTexture(Blocks.ACACIA_LOG));
        stairsBlock(ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        stairsBlock(ModBlocks.ACACIA_LOG_STAIRS.get(),
                mcLoc("block/acacia_log"),
                mcLoc("block/acacia_log_top"),
                mcLoc("block/acacia_log_top"));
        stairsBlock(ModBlocks.ACACIA_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_acacia_log"),
                mcLoc("block/stripped_acacia_log_top"),
                mcLoc("block/stripped_acacia_log_top")
        );

        slabBlock(ModBlocks.ACACIA_WOOD_SLAB.get(), blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG));
        slabBlock(ModBlocks.ACACIA_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        slabBlock(ModBlocks.ACACIA_LOG_SLAB.get(),
                blockTexture(Blocks.ACACIA_LOG),
                mcLoc("block/acacia_log"),
                mcLoc("block/acacia_log_top"),
                mcLoc("block/acacia_log_top")
        );
        slabBlock(ModBlocks.ACACIA_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_ACACIA_LOG),
                mcLoc("block/stripped_acacia_log"),
                mcLoc("block/stripped_acacia_log_top"),
                mcLoc("block/stripped_acacia_log_top")
        );

        pressurePlateBlock(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE.get(), mcLoc("block/acacia_log"));
        pressurePlateBlock(ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_acacia_log"));
        pressurePlateBlock(ModBlocks.ACACIA_LOG_PRESSURE_PLATE.get(), mcLoc("block/acacia_log_top"));
        pressurePlateBlock(ModBlocks.ACACIA_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_acacia_log_top"));

        buttonBlock(ModBlocks.ACACIA_WOOD_BUTTON.get(), mcLoc("block/acacia_log"));
        buttonBlock(ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_acacia_log"));
        buttonBlock(ModBlocks.ACACIA_LOG_BUTTON.get(), mcLoc("block/acacia_log_top"));
        buttonBlock(ModBlocks.ACACIA_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_acacia_log_top"));

        fenceBlock(ModBlocks.ACACIA_WOOD_FENCE.get(), blockTexture(Blocks.ACACIA_LOG));
        fenceBlock(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));

        fenceGateBlock(ModBlocks.ACACIA_WOOD_FENCE_GATE.get(), blockTexture(Blocks.ACACIA_LOG));
        fenceGateBlock(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));

        wallBlock(ModBlocks.ACACIA_PLANK_WALL.get(), blockTexture(Blocks.ACACIA_PLANKS));
        wallBlock(ModBlocks.ACACIA_WOOD_WALL.get(), blockTexture(Blocks.ACACIA_LOG));
        wallBlock(ModBlocks.ACACIA_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));

        blockItem(ModBlocks.ACACIA_WOOD_STAIRS);
        blockItem(ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.ACACIA_LOG_STAIRS);
        blockItem(ModBlocks.ACACIA_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.ACACIA_WOOD_SLAB);
        blockItem(ModBlocks.ACACIA_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.ACACIA_LOG_SLAB);
        blockItem(ModBlocks.ACACIA_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.ACACIA_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.ACACIA_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        blockItem(ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE);
    }

    private void darkOakBlocks() {
        stairsBlock(ModBlocks.DARK_OAK_WOOD_STAIRS.get(), blockTexture(Blocks.DARK_OAK_LOG));
        stairsBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        stairsBlock(ModBlocks.DARK_OAK_LOG_STAIRS.get(),
                mcLoc("block/dark_oak_log"),
                mcLoc("block/dark_oak_log_top"),
                mcLoc("block/dark_oak_log_top"));
        stairsBlock(ModBlocks.DARK_OAK_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_dark_oak_log"),
                mcLoc("block/stripped_dark_oak_log_top"),
                mcLoc("block/stripped_dark_oak_log_top")
        );

        slabBlock(ModBlocks.DARK_OAK_WOOD_SLAB.get(), blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG));
        slabBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        slabBlock(ModBlocks.DARK_OAK_LOG_SLAB.get(),
                blockTexture(Blocks.DARK_OAK_LOG),
                mcLoc("block/dark_oak_log"),
                mcLoc("block/dark_oak_log_top"),
                mcLoc("block/dark_oak_log_top")
        );
        slabBlock(ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_DARK_OAK_LOG),
                mcLoc("block/stripped_dark_oak_log"),
                mcLoc("block/stripped_dark_oak_log_top"),
                mcLoc("block/stripped_dark_oak_log_top")
        );

        pressurePlateBlock(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE.get(), mcLoc("block/dark_oak_log"));
        pressurePlateBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_dark_oak_log"));
        pressurePlateBlock(ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE.get(), mcLoc("block/dark_oak_log_top"));
        pressurePlateBlock(ModBlocks.DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_dark_oak_log_top"));

        buttonBlock(ModBlocks.DARK_OAK_WOOD_BUTTON.get(), mcLoc("block/dark_oak_log"));
        buttonBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_dark_oak_log"));
        buttonBlock(ModBlocks.DARK_OAK_LOG_BUTTON.get(), mcLoc("block/dark_oak_log_top"));
        buttonBlock(ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_dark_oak_log_top"));

        fenceBlock(ModBlocks.DARK_OAK_WOOD_FENCE.get(), blockTexture(Blocks.DARK_OAK_LOG));
        fenceBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));

        fenceGateBlock(ModBlocks.DARK_OAK_WOOD_FENCE_GATE.get(), blockTexture(Blocks.DARK_OAK_LOG));
        fenceGateBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));

        wallBlock(ModBlocks.DARK_OAK_PLANK_WALL.get(), blockTexture(Blocks.DARK_OAK_PLANKS));
        wallBlock(ModBlocks.DARK_OAK_WOOD_WALL.get(), blockTexture(Blocks.DARK_OAK_LOG));
        wallBlock(ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));

        blockItem(ModBlocks.DARK_OAK_WOOD_STAIRS);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.DARK_OAK_LOG_STAIRS);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.DARK_OAK_WOOD_SLAB);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.DARK_OAK_LOG_SLAB);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        blockItem(ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE);
    }

    private void mangroveBlocks() {
        stairsBlock(ModBlocks.MANGROVE_WOOD_STAIRS.get(), blockTexture(Blocks.MANGROVE_LOG));
        stairsBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        stairsBlock(ModBlocks.MANGROVE_LOG_STAIRS.get(),
                mcLoc("block/mangrove_log"),
                mcLoc("block/mangrove_log_top"),
                mcLoc("block/mangrove_log_top"));
        stairsBlock(ModBlocks.MANGROVE_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_mangrove_log"),
                mcLoc("block/stripped_mangrove_log_top"),
                mcLoc("block/stripped_mangrove_log_top")
        );

        slabBlock(ModBlocks.MANGROVE_WOOD_SLAB.get(), blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG));
        slabBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        slabBlock(ModBlocks.MANGROVE_LOG_SLAB.get(),
                blockTexture(Blocks.MANGROVE_LOG),
                mcLoc("block/mangrove_log"),
                mcLoc("block/mangrove_log_top"),
                mcLoc("block/mangrove_log_top")
        );
        slabBlock(ModBlocks.MANGROVE_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_MANGROVE_LOG),
                mcLoc("block/stripped_mangrove_log"),
                mcLoc("block/stripped_mangrove_log_top"),
                mcLoc("block/stripped_mangrove_log_top")
        );

        pressurePlateBlock(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE.get(), mcLoc("block/mangrove_log"));
        pressurePlateBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_mangrove_log"));
        pressurePlateBlock(ModBlocks.MANGROVE_LOG_PRESSURE_PLATE.get(), mcLoc("block/mangrove_log_top"));
        pressurePlateBlock(ModBlocks.MANGROVE_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_mangrove_log_top"));

        buttonBlock(ModBlocks.MANGROVE_WOOD_BUTTON.get(), mcLoc("block/mangrove_log"));
        buttonBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_mangrove_log"));
        buttonBlock(ModBlocks.MANGROVE_LOG_BUTTON.get(), mcLoc("block/mangrove_log_top"));
        buttonBlock(ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_mangrove_log_top"));

        fenceBlock(ModBlocks.MANGROVE_WOOD_FENCE.get(), blockTexture(Blocks.MANGROVE_LOG));
        fenceBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));

        fenceGateBlock(ModBlocks.MANGROVE_WOOD_FENCE_GATE.get(), blockTexture(Blocks.MANGROVE_LOG));
        fenceGateBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));

        wallBlock(ModBlocks.MANGROVE_PLANK_WALL.get(), blockTexture(Blocks.MANGROVE_PLANKS));
        wallBlock(ModBlocks.MANGROVE_WOOD_WALL.get(), blockTexture(Blocks.MANGROVE_LOG));
        wallBlock(ModBlocks.MANGROVE_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));

        blockItem(ModBlocks.MANGROVE_WOOD_STAIRS);
        blockItem(ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.MANGROVE_LOG_STAIRS);
        blockItem(ModBlocks.MANGROVE_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.MANGROVE_WOOD_SLAB);
        blockItem(ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.MANGROVE_LOG_SLAB);
        blockItem(ModBlocks.MANGROVE_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.MANGROVE_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.MANGROVE_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        blockItem(ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE);
    }

    private void cherryBlocks() {
        stairsBlock(ModBlocks.CHERRY_WOOD_STAIRS.get(), blockTexture(Blocks.CHERRY_LOG));
        stairsBlock(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
        stairsBlock(ModBlocks.CHERRY_LOG_STAIRS.get(),
                mcLoc("block/cherry_log"),
                mcLoc("block/cherry_log_top"),
                mcLoc("block/cherry_log_top"));
        stairsBlock(ModBlocks.CHERRY_STRIPPED_LOG_STAIRS.get(),
                mcLoc("block/stripped_cherry_log"),
                mcLoc("block/stripped_cherry_log_top"),
                mcLoc("block/stripped_cherry_log_top")
        );

        slabBlock(ModBlocks.CHERRY_WOOD_SLAB.get(), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
        slabBlock(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
        slabBlock(ModBlocks.CHERRY_LOG_SLAB.get(),
                blockTexture(Blocks.CHERRY_LOG),
                mcLoc("block/cherry_log"),
                mcLoc("block/cherry_log_top"),
                mcLoc("block/cherry_log_top")
        );
        slabBlock(ModBlocks.CHERRY_STRIPPED_LOG_SLAB.get(),
                blockTexture(Blocks.STRIPPED_CHERRY_LOG),
                mcLoc("block/stripped_cherry_log"),
                mcLoc("block/stripped_cherry_log_top"),
                mcLoc("block/stripped_cherry_log_top")
        );

        pressurePlateBlock(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE.get(), mcLoc("block/cherry_log"));
        pressurePlateBlock(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_cherry_log"));
        pressurePlateBlock(ModBlocks.CHERRY_LOG_PRESSURE_PLATE.get(), mcLoc("block/cherry_log_top"));
        pressurePlateBlock(ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_cherry_log_top"));

        buttonBlock(ModBlocks.CHERRY_WOOD_BUTTON.get(), mcLoc("block/cherry_log"));
        buttonBlock(ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_cherry_log"));
        buttonBlock(ModBlocks.CHERRY_LOG_BUTTON.get(), mcLoc("block/cherry_log_top"));
        buttonBlock(ModBlocks.CHERRY_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_cherry_log_top"));

        fenceBlock(ModBlocks.CHERRY_WOOD_FENCE.get(), blockTexture(Blocks.CHERRY_LOG));
        fenceBlock(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));

        fenceGateBlock(ModBlocks.CHERRY_WOOD_FENCE_GATE.get(), blockTexture(Blocks.CHERRY_LOG));
        fenceGateBlock(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));

        wallBlock(ModBlocks.CHERRY_PLANK_WALL.get(), blockTexture(Blocks.CHERRY_PLANKS));
        wallBlock(ModBlocks.CHERRY_WOOD_WALL.get(), blockTexture(Blocks.CHERRY_LOG));
        wallBlock(ModBlocks.CHERRY_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));

        blockItem(ModBlocks.CHERRY_WOOD_STAIRS);
        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS);
        blockItem(ModBlocks.CHERRY_LOG_STAIRS);
        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_STAIRS);

        blockItem(ModBlocks.CHERRY_WOOD_SLAB);
        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB);
        blockItem(ModBlocks.CHERRY_LOG_SLAB);
        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_SLAB);

        blockItem(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.CHERRY_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE);

        blockItem(ModBlocks.CHERRY_WOOD_FENCE_GATE);
        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE);
    }

    private void warpedBlocks() {
        stairsBlock(ModBlocks.WARPED_HYPHAE_STAIRS.get(), blockTexture(Blocks.WARPED_STEM));
        stairsBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS.get(), blockTexture(Blocks.STRIPPED_WARPED_STEM));
        stairsBlock(ModBlocks.WARPED_STEM_STAIRS.get(),
                mcLoc("block/warped_stem"),
                mcLoc("block/warped_stem_top"),
                mcLoc("block/warped_stem_top"));
        stairsBlock(ModBlocks.WARPED_STRIPPED_STEM_STAIRS.get(),
                mcLoc("block/stripped_warped_stem"),
                mcLoc("block/stripped_warped_stem_top"),
                mcLoc("block/stripped_warped_stem_top")
        );

        slabBlock(ModBlocks.WARPED_HYPHAE_SLAB.get(), blockTexture(Blocks.WARPED_STEM), blockTexture(Blocks.WARPED_STEM));
        slabBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB.get(), blockTexture(Blocks.STRIPPED_WARPED_STEM), blockTexture(Blocks.STRIPPED_WARPED_STEM));
        slabBlock(ModBlocks.WARPED_STEM_SLAB.get(),
                blockTexture(Blocks.WARPED_STEM),
                mcLoc("block/warped_stem"),
                mcLoc("block/warped_stem_top"),
                mcLoc("block/warped_stem_top")
        );
        slabBlock(ModBlocks.WARPED_STRIPPED_STEM_SLAB.get(),
                blockTexture(Blocks.STRIPPED_WARPED_STEM),
                mcLoc("block/stripped_warped_stem"),
                mcLoc("block/stripped_warped_stem_top"),
                mcLoc("block/stripped_warped_stem_top")
        );

        pressurePlateBlock(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE.get(), mcLoc("block/warped_stem"));
        pressurePlateBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE.get(), mcLoc("block/stripped_warped_stem"));
        pressurePlateBlock(ModBlocks.WARPED_STEM_PRESSURE_PLATE.get(), mcLoc("block/warped_stem_top"));
        pressurePlateBlock(ModBlocks.WARPED_STRIPPED_STEM_PRESSURE_PLATE.get(), mcLoc("block/stripped_warped_stem_top"));

        buttonBlock(ModBlocks.WARPED_HYPHAE_BUTTON.get(), mcLoc("block/warped_stem"));
        buttonBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON.get(), mcLoc("block/stripped_warped_stem"));
        buttonBlock(ModBlocks.WARPED_STEM_BUTTON.get(), mcLoc("block/warped_stem"));
        buttonBlock(ModBlocks.WARPED_STRIPPED_STEM_BUTTON.get(), mcLoc("block/stripped_warped_stem_top"));

        fenceBlock(ModBlocks.WARPED_HYPHAE_FENCE.get(), blockTexture(Blocks.WARPED_STEM));
        fenceBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE.get(), blockTexture(Blocks.STRIPPED_WARPED_STEM));

        fenceGateBlock(ModBlocks.WARPED_HYPHAE_FENCE_GATE.get(), blockTexture(Blocks.WARPED_STEM));
        fenceGateBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_WARPED_STEM));

        wallBlock(ModBlocks.WARPED_PLANK_WALL.get(), blockTexture(Blocks.WARPED_PLANKS));
        wallBlock(ModBlocks.WARPED_HYPHAE_WALL.get(), blockTexture(Blocks.WARPED_STEM));
        wallBlock(ModBlocks.WARPED_STRIPPED_HYPHAE_WALL.get(), blockTexture(Blocks.STRIPPED_WARPED_STEM));

        blockItem(ModBlocks.WARPED_HYPHAE_STAIRS);
        blockItem(ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS);
        blockItem(ModBlocks.WARPED_STEM_STAIRS);
        blockItem(ModBlocks.WARPED_STRIPPED_STEM_STAIRS);

        blockItem(ModBlocks.WARPED_HYPHAE_SLAB);
        blockItem(ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB);
        blockItem(ModBlocks.WARPED_STEM_SLAB);
        blockItem(ModBlocks.WARPED_STRIPPED_STEM_SLAB);

        blockItem(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE);
        blockItem(ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE);
        blockItem(ModBlocks.WARPED_STEM_PRESSURE_PLATE);
        blockItem(ModBlocks.WARPED_STRIPPED_STEM_PRESSURE_PLATE);

        blockItem(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        blockItem(ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE);
    }

    private void crimsonBlocks() {
        stairsBlock(ModBlocks.CRIMSON_HYPHAE_STAIRS.get(), blockTexture(Blocks.CRIMSON_STEM));
        stairsBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS.get(), blockTexture(Blocks.STRIPPED_CRIMSON_STEM));
        stairsBlock(ModBlocks.CRIMSON_STEM_STAIRS.get(),
                mcLoc("block/crimson_stem"),
                mcLoc("block/crimson_stem_top"),
                mcLoc("block/crimson_stem_top"));
        stairsBlock(ModBlocks.CRIMSON_STRIPPED_STEM_STAIRS.get(),
                mcLoc("block/stripped_crimson_stem"),
                mcLoc("block/stripped_crimson_stem_top"),
                mcLoc("block/stripped_crimson_stem_top")
        );

        slabBlock(ModBlocks.CRIMSON_HYPHAE_SLAB.get(), blockTexture(Blocks.CRIMSON_STEM), blockTexture(Blocks.CRIMSON_STEM));
        slabBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB.get(), blockTexture(Blocks.STRIPPED_CRIMSON_STEM), blockTexture(Blocks.STRIPPED_CRIMSON_STEM));
        slabBlock(ModBlocks.CRIMSON_STEM_SLAB.get(),
                blockTexture(Blocks.CRIMSON_STEM),
                mcLoc("block/crimson_stem"),
                mcLoc("block/crimson_stem_top"),
                mcLoc("block/crimson_stem_top")
        );
        slabBlock(ModBlocks.CRIMSON_STRIPPED_STEM_SLAB.get(),
                blockTexture(Blocks.STRIPPED_CRIMSON_STEM),
                mcLoc("block/stripped_crimson_stem"),
                mcLoc("block/stripped_crimson_stem_top"),
                mcLoc("block/stripped_crimson_stem_top")
        );

        pressurePlateBlock(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE.get(), mcLoc("block/crimson_stem"));
        pressurePlateBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE.get(), mcLoc("block/stripped_crimson_stem"));
        pressurePlateBlock(ModBlocks.CRIMSON_STEM_PRESSURE_PLATE.get(), mcLoc("block/crimson_stem_top"));
        pressurePlateBlock(ModBlocks.CRIMSON_STRIPPED_STEM_PRESSURE_PLATE.get(), mcLoc("block/stripped_crimson_stem_top"));

        buttonBlock(ModBlocks.CRIMSON_HYPHAE_BUTTON.get(), mcLoc("block/crimson_stem"));
        buttonBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON.get(), mcLoc("block/stripped_crimson_stem"));
        buttonBlock(ModBlocks.CRIMSON_STEM_BUTTON.get(), mcLoc("block/crimson_stem"));
        buttonBlock(ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON.get(), mcLoc("block/stripped_crimson_stem_top"));

        fenceBlock(ModBlocks.CRIMSON_HYPHAE_FENCE.get(), blockTexture(Blocks.CRIMSON_STEM));
        fenceBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE.get(), blockTexture(Blocks.STRIPPED_CRIMSON_STEM));

        fenceGateBlock(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE.get(), blockTexture(Blocks.CRIMSON_STEM));
        fenceGateBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_CRIMSON_STEM));

        wallBlock(ModBlocks.CRIMSON_PLANK_WALL.get(), blockTexture(Blocks.CRIMSON_PLANKS));
        wallBlock(ModBlocks.CRIMSON_HYPHAE_WALL.get(), blockTexture(Blocks.CRIMSON_STEM));
        wallBlock(ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL.get(), blockTexture(Blocks.STRIPPED_CRIMSON_STEM));

        blockItem(ModBlocks.CRIMSON_HYPHAE_STAIRS);
        blockItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS);
        blockItem(ModBlocks.CRIMSON_STEM_STAIRS);
        blockItem(ModBlocks.CRIMSON_STRIPPED_STEM_STAIRS);

        blockItem(ModBlocks.CRIMSON_HYPHAE_SLAB);
        blockItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB);
        blockItem(ModBlocks.CRIMSON_STEM_SLAB);
        blockItem(ModBlocks.CRIMSON_STRIPPED_STEM_SLAB);

        blockItem(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE);
        blockItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE);
        blockItem(ModBlocks.CRIMSON_STEM_PRESSURE_PLATE);
        blockItem(ModBlocks.CRIMSON_STRIPPED_STEM_PRESSURE_PLATE);

        blockItem(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
        blockItem(ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE);
    }

//    private void bambooBlocks() {
//        stairsBlock(ModBlocks.CHERRY_WOOD_STAIRS.get(), blockTexture(Blocks.CHERRY_LOG));
//        stairsBlock(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
//        stairsBlock(ModBlocks.CHERRY_LOG_STAIRS.get(),
//                mcLoc("block/cherry_log"),
//                mcLoc("block/cherry_log_top"),
//                mcLoc("block/cherry_log_top"));
//        stairsBlock(ModBlocks.CHERRY_STRIPPED_LOG_STAIRS.get(),
//                mcLoc("block/stripped_cherry_log"),
//                mcLoc("block/stripped_cherry_log_top"),
//                mcLoc("block/stripped_cherry_log_top")
//        );
//
//        slabBlock(ModBlocks.CHERRY_WOOD_SLAB.get(), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
//        slabBlock(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
//        slabBlock(ModBlocks.CHERRY_LOG_SLAB.get(),
//                blockTexture(Blocks.CHERRY_LOG),
//                mcLoc("block/cherry_log"),
//                mcLoc("block/cherry_log_top"),
//                mcLoc("block/cherry_log_top")
//        );
//        slabBlock(ModBlocks.CHERRY_STRIPPED_LOG_SLAB.get(),
//                blockTexture(Blocks.STRIPPED_CHERRY_LOG),
//                mcLoc("block/stripped_cherry_log"),
//                mcLoc("block/stripped_cherry_log_top"),
//                mcLoc("block/stripped_cherry_log_top")
//        );
//
//        pressurePlateBlock(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE.get(), mcLoc("block/cherry_log"));
//        pressurePlateBlock(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE.get(), mcLoc("block/stripped_cherry_log"));
//        pressurePlateBlock(ModBlocks.CHERRY_LOG_PRESSURE_PLATE.get(), mcLoc("block/cherry_log_top"));
//        pressurePlateBlock(ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE.get(), mcLoc("block/stripped_cherry_log_top"));
//
//        buttonBlock(ModBlocks.CHERRY_WOOD_BUTTON.get(), mcLoc("block/cherry_log"));
//        buttonBlock(ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON.get(), mcLoc("block/stripped_cherry_log"));
//        buttonBlock(ModBlocks.CHERRY_LOG_BUTTON.get(), mcLoc("block/cherry_log_top"));
//        buttonBlock(ModBlocks.CHERRY_STRIPPED_LOG_BUTTON.get(), mcLoc("block/stripped_cherry_log_top"));
//
//        fenceBlock(ModBlocks.CHERRY_WOOD_FENCE.get(), blockTexture(Blocks.CHERRY_LOG));
//        fenceBlock(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
//
//        fenceGateBlock(ModBlocks.CHERRY_WOOD_FENCE_GATE.get(), blockTexture(Blocks.CHERRY_LOG));
//        fenceGateBlock(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
//
//        wallBlock(ModBlocks.CHERRY_PLANK_WALL.get(), blockTexture(Blocks.CHERRY_PLANKS));
//        wallBlock(ModBlocks.CHERRY_WOOD_WALL.get(), blockTexture(Blocks.CHERRY_LOG));
//        wallBlock(ModBlocks.CHERRY_STRIPPED_WOOD_WALL.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
//
//        blockItem(ModBlocks.CHERRY_WOOD_STAIRS);
//        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS);
//        blockItem(ModBlocks.CHERRY_LOG_STAIRS);
//        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_STAIRS);
//
//        blockItem(ModBlocks.CHERRY_WOOD_SLAB);
//        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB);
//        blockItem(ModBlocks.CHERRY_LOG_SLAB);
//        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_SLAB);
//
//        blockItem(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE);
//        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE);
//        blockItem(ModBlocks.CHERRY_LOG_PRESSURE_PLATE);
//        blockItem(ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE);
//
//        blockItem(ModBlocks.CHERRY_WOOD_FENCE_GATE);
//        blockItem(ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE);
//    }
}
