package net.shieldprojects.shieldextracontent.blocks;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.shieldprojects.shieldextracontent.item.ModItems;

import java.util.function.Supplier;

@SuppressWarnings("ALL")
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ShieldExtraContentMod.MOD_ID);


    public static final DeferredBlock<StairBlock> OAK_WOOD_STAIRS = registerBlock("oak_wood_stairs",
            () -> new StairBlock(Blocks.OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> OAK_STRIPPED_WOOD_STAIRS = registerBlock("oak_stripped_wood_stairs",
            () -> new StairBlock(Blocks.OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> OAK_LOG_STAIRS = registerBlock("oak_log_stairs",
            () -> new StairBlock(Blocks.OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> OAK_STRIPPED_LOG_STAIRS = registerBlock("oak_stripped_log_stairs",
            () -> new StairBlock(Blocks.OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> OAK_STRIPPED_WOOD_SLAB = registerBlock("oak_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> OAK_LOG_SLAB = registerBlock("oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> OAK_STRIPPED_LOG_SLAB = registerBlock("oak_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> OAK_WOOD_PRESSURE_PLATE = registerBlock("oak_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> OAK_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("oak_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> OAK_LOG_PRESSURE_PLATE = registerBlock("oak_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> OAK_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("oak_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> OAK_WOOD_BUTTON = registerBlock("oak_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> OAK_STRIPPED_WOOD_BUTTON = registerBlock("oak_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> OAK_LOG_BUTTON = registerBlock("oak_log_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> OAK_STRIPPED_LOG_BUTTON = registerBlock("oak_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> OAK_WOOD_FENCE = registerBlock("oak_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> OAK_STRIPPED_WOOD_FENCE = registerBlock("oak_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> OAK_WOOD_FENCE_GATE = registerBlock("oak_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> OAK_STRIPPED_WOOD_FENCE_GATE = registerBlock("oak_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> OAK_PLANK_WALL = registerBlock("oak_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> OAK_WOOD_WALL = registerBlock("oak_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> OAK_STRIPPED_WOOD_WALL = registerBlock("oak_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> SPRUCE_WOOD_STAIRS = registerBlock("spruce_wood_stairs",
            () -> new StairBlock(Blocks.SPRUCE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SPRUCE_STRIPPED_WOOD_STAIRS = registerBlock("spruce_stripped_wood_stairs",
            () -> new StairBlock(Blocks.SPRUCE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SPRUCE_LOG_STAIRS = registerBlock("spruce_log_stairs",
            () -> new StairBlock(Blocks.SPRUCE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SPRUCE_STRIPPED_LOG_STAIRS = registerBlock("spruce_stripped_log_stairs",
            () -> new StairBlock(Blocks.SPRUCE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SPRUCE_STRIPPED_WOOD_SLAB = registerBlock("spruce_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SPRUCE_STRIPPED_LOG_SLAB = registerBlock("spruce_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> SPRUCE_WOOD_PRESSURE_PLATE = registerBlock("spruce_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("spruce_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> SPRUCE_LOG_PRESSURE_PLATE = registerBlock("spruce_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> SPRUCE_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("spruce_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.SPRUCE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> SPRUCE_WOOD_BUTTON = registerBlock("spruce_wood_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> SPRUCE_STRIPPED_WOOD_BUTTON = registerBlock("spruce_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> SPRUCE_LOG_BUTTON = registerBlock("spruce_log_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> SPRUCE_STRIPPED_LOG_BUTTON = registerBlock("spruce_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.SPRUCE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> SPRUCE_WOOD_FENCE = registerBlock("spruce_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> SPRUCE_STRIPPED_WOOD_FENCE = registerBlock("spruce_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> SPRUCE_WOOD_FENCE_GATE = registerBlock("spruce_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> SPRUCE_STRIPPED_WOOD_FENCE_GATE = registerBlock("spruce_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> SPRUCE_PLANK_WALL = registerBlock("spruce_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SPRUCE_WOOD_WALL = registerBlock("spruce_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SPRUCE_STRIPPED_WOOD_WALL = registerBlock("spruce_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> BIRCH_WOOD_STAIRS = registerBlock("birch_wood_stairs",
            () -> new StairBlock(Blocks.BIRCH_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BIRCH_STRIPPED_WOOD_STAIRS = registerBlock("birch_stripped_wood_stairs",
            () -> new StairBlock(Blocks.BIRCH_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BIRCH_LOG_STAIRS = registerBlock("birch_log_stairs",
            () -> new StairBlock(Blocks.BIRCH_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> BIRCH_STRIPPED_LOG_STAIRS = registerBlock("birch_stripped_log_stairs",
            () -> new StairBlock(Blocks.BIRCH_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BIRCH_STRIPPED_WOOD_SLAB = registerBlock("birch_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BIRCH_LOG_SLAB = registerBlock("birch_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BIRCH_STRIPPED_LOG_SLAB = registerBlock("birch_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> BIRCH_WOOD_PRESSURE_PLATE = registerBlock("birch_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BIRCH_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("birch_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BIRCH_LOG_PRESSURE_PLATE = registerBlock("birch_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BIRCH_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("birch_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.BIRCH,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> BIRCH_WOOD_BUTTON = registerBlock("birch_wood_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> BIRCH_STRIPPED_WOOD_BUTTON = registerBlock("birch_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> BIRCH_LOG_BUTTON = registerBlock("birch_log_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> BIRCH_STRIPPED_LOG_BUTTON = registerBlock("birch_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.BIRCH, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> BIRCH_WOOD_FENCE = registerBlock("birch_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> BIRCH_STRIPPED_WOOD_FENCE = registerBlock("birch_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> BIRCH_WOOD_FENCE_GATE = registerBlock("birch_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> BIRCH_STRIPPED_WOOD_FENCE_GATE = registerBlock("birch_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> BIRCH_PLANK_WALL = registerBlock("birch_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BIRCH_WOOD_WALL = registerBlock("birch_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BIRCH_STRIPPED_WOOD_WALL = registerBlock("birch_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> JUNGLE_WOOD_STAIRS = registerBlock("jungle_wood_stairs",
            () -> new StairBlock(Blocks.JUNGLE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> JUNGLE_STRIPPED_WOOD_STAIRS = registerBlock("jungle_stripped_wood_stairs",
            () -> new StairBlock(Blocks.JUNGLE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> JUNGLE_LOG_STAIRS = registerBlock("jungle_log_stairs",
            () -> new StairBlock(Blocks.JUNGLE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> JUNGLE_STRIPPED_LOG_STAIRS = registerBlock("jungle_stripped_log_stairs",
            () -> new StairBlock(Blocks.JUNGLE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> JUNGLE_STRIPPED_WOOD_SLAB = registerBlock("jungle_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> JUNGLE_STRIPPED_LOG_SLAB = registerBlock("jungle_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> JUNGLE_WOOD_PRESSURE_PLATE = registerBlock("jungle_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.JUNGLE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("jungle_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.JUNGLE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> JUNGLE_LOG_PRESSURE_PLATE = registerBlock("jungle_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.JUNGLE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> JUNGLE_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("jungle_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.JUNGLE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> JUNGLE_WOOD_BUTTON = registerBlock("jungle_wood_button",
            () -> new ButtonBlock(BlockSetType.JUNGLE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> JUNGLE_STRIPPED_WOOD_BUTTON = registerBlock("jungle_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.JUNGLE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> JUNGLE_LOG_BUTTON = registerBlock("jungle_log_button",
            () -> new ButtonBlock(BlockSetType.JUNGLE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> JUNGLE_STRIPPED_LOG_BUTTON = registerBlock("jungle_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.JUNGLE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> JUNGLE_WOOD_FENCE = registerBlock("jungle_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> JUNGLE_STRIPPED_WOOD_FENCE = registerBlock("jungle_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> JUNGLE_WOOD_FENCE_GATE = registerBlock("jungle_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.JUNGLE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> JUNGLE_STRIPPED_WOOD_FENCE_GATE = registerBlock("jungle_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.JUNGLE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> JUNGLE_PLANK_WALL = registerBlock("jungle_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> JUNGLE_WOOD_WALL = registerBlock("jungle_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> JUNGLE_STRIPPED_WOOD_WALL = registerBlock("jungle_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> ACACIA_WOOD_STAIRS = registerBlock("acacia_wood_stairs",
            () -> new StairBlock(Blocks.ACACIA_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> ACACIA_STRIPPED_WOOD_STAIRS = registerBlock("acacia_stripped_wood_stairs",
            () -> new StairBlock(Blocks.ACACIA_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> ACACIA_LOG_STAIRS = registerBlock("acacia_log_stairs",
            () -> new StairBlock(Blocks.ACACIA_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> ACACIA_STRIPPED_LOG_STAIRS = registerBlock("acacia_stripped_log_stairs",
            () -> new StairBlock(Blocks.ACACIA_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> ACACIA_STRIPPED_WOOD_SLAB = registerBlock("acacia_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> ACACIA_LOG_SLAB = registerBlock("acacia_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> ACACIA_STRIPPED_LOG_SLAB = registerBlock("acacia_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> ACACIA_WOOD_PRESSURE_PLATE = registerBlock("acacia_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.ACACIA,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> ACACIA_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("acacia_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.ACACIA,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> ACACIA_LOG_PRESSURE_PLATE = registerBlock("acacia_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.ACACIA,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> ACACIA_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("acacia_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.ACACIA,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> ACACIA_WOOD_BUTTON = registerBlock("acacia_wood_button",
            () -> new ButtonBlock(BlockSetType.ACACIA, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> ACACIA_STRIPPED_WOOD_BUTTON = registerBlock("acacia_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.ACACIA, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> ACACIA_LOG_BUTTON = registerBlock("acacia_log_button",
            () -> new ButtonBlock(BlockSetType.ACACIA, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> ACACIA_STRIPPED_LOG_BUTTON = registerBlock("acacia_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.ACACIA, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> ACACIA_WOOD_FENCE = registerBlock("acacia_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> ACACIA_STRIPPED_WOOD_FENCE = registerBlock("acacia_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> ACACIA_WOOD_FENCE_GATE = registerBlock("acacia_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> ACACIA_STRIPPED_WOOD_FENCE_GATE = registerBlock("acacia_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> ACACIA_PLANK_WALL = registerBlock("acacia_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> ACACIA_WOOD_WALL = registerBlock("acacia_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> ACACIA_STRIPPED_WOOD_WALL = registerBlock("acacia_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> DARK_OAK_WOOD_STAIRS = registerBlock("dark_oak_wood_stairs",
            () -> new StairBlock(Blocks.DARK_OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> DARK_OAK_STRIPPED_WOOD_STAIRS = registerBlock("dark_oak_stripped_wood_stairs",
            () -> new StairBlock(Blocks.DARK_OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> DARK_OAK_LOG_STAIRS = registerBlock("dark_oak_log_stairs",
            () -> new StairBlock(Blocks.DARK_OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> DARK_OAK_STRIPPED_LOG_STAIRS = registerBlock("dark_oak_stripped_log_stairs",
            () -> new StairBlock(Blocks.DARK_OAK_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> DARK_OAK_STRIPPED_WOOD_SLAB = registerBlock("dark_oak_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> DARK_OAK_STRIPPED_LOG_SLAB = registerBlock("dark_oak_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> DARK_OAK_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("dark_oak_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> DARK_OAK_LOG_PRESSURE_PLATE = registerBlock("dark_oak_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("dark_oak_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> DARK_OAK_WOOD_BUTTON = registerBlock("dark_oak_wood_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> DARK_OAK_STRIPPED_WOOD_BUTTON = registerBlock("dark_oak_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> DARK_OAK_LOG_BUTTON = registerBlock("dark_oak_log_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> DARK_OAK_STRIPPED_LOG_BUTTON = registerBlock("dark_oak_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> DARK_OAK_WOOD_FENCE = registerBlock("dark_oak_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> DARK_OAK_STRIPPED_WOOD_FENCE = registerBlock("dark_oak_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> DARK_OAK_WOOD_FENCE_GATE = registerBlock("dark_oak_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> DARK_OAK_STRIPPED_WOOD_FENCE_GATE = registerBlock("dark_oak_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> DARK_OAK_PLANK_WALL = registerBlock("dark_oak_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> DARK_OAK_WOOD_WALL = registerBlock("dark_oak_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> DARK_OAK_STRIPPED_WOOD_WALL = registerBlock("dark_oak_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> MANGROVE_WOOD_STAIRS = registerBlock("mangrove_wood_stairs",
            () -> new StairBlock(Blocks.MANGROVE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MANGROVE_STRIPPED_WOOD_STAIRS = registerBlock("mangrove_stripped_wood_stairs",
            () -> new StairBlock(Blocks.MANGROVE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MANGROVE_LOG_STAIRS = registerBlock("mangrove_log_stairs",
            () -> new StairBlock(Blocks.MANGROVE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MANGROVE_STRIPPED_LOG_STAIRS = registerBlock("mangrove_stripped_log_stairs",
            () -> new StairBlock(Blocks.MANGROVE_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MANGROVE_STRIPPED_WOOD_SLAB = registerBlock("mangrove_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MANGROVE_LOG_SLAB = registerBlock("mangrove_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MANGROVE_STRIPPED_LOG_SLAB = registerBlock("mangrove_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> MANGROVE_WOOD_PRESSURE_PLATE = registerBlock("mangrove_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.MANGROVE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("mangrove_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.MANGROVE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> MANGROVE_LOG_PRESSURE_PLATE = registerBlock("mangrove_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.MANGROVE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> MANGROVE_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("mangrove_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.MANGROVE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> MANGROVE_WOOD_BUTTON = registerBlock("mangrove_wood_button",
            () -> new ButtonBlock(BlockSetType.MANGROVE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> MANGROVE_STRIPPED_WOOD_BUTTON = registerBlock("mangrove_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.MANGROVE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> MANGROVE_LOG_BUTTON = registerBlock("mangrove_log_button",
            () -> new ButtonBlock(BlockSetType.MANGROVE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> MANGROVE_STRIPPED_LOG_BUTTON = registerBlock("mangrove_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.MANGROVE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> MANGROVE_WOOD_FENCE = registerBlock("mangrove_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> MANGROVE_STRIPPED_WOOD_FENCE = registerBlock("mangrove_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> MANGROVE_WOOD_FENCE_GATE = registerBlock("mangrove_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> MANGROVE_STRIPPED_WOOD_FENCE_GATE = registerBlock("mangrove_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> MANGROVE_PLANK_WALL = registerBlock("mangrove_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MANGROVE_WOOD_WALL = registerBlock("mangrove_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MANGROVE_STRIPPED_WOOD_WALL = registerBlock("mangrove_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> CHERRY_WOOD_STAIRS = registerBlock("cherry_wood_stairs",
            () -> new StairBlock(Blocks.CHERRY_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CHERRY_STRIPPED_WOOD_STAIRS = registerBlock("cherry_stripped_wood_stairs",
            () -> new StairBlock(Blocks.CHERRY_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CHERRY_LOG_STAIRS = registerBlock("cherry_log_stairs",
            () -> new StairBlock(Blocks.CHERRY_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CHERRY_STRIPPED_LOG_STAIRS = registerBlock("cherry_stripped_log_stairs",
            () -> new StairBlock(Blocks.CHERRY_WOOD.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CHERRY_STRIPPED_WOOD_SLAB = registerBlock("cherry_stripped_wood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CHERRY_LOG_SLAB = registerBlock("cherry_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CHERRY_STRIPPED_LOG_SLAB = registerBlock("cherry_stripped_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> CHERRY_WOOD_PRESSURE_PLATE = registerBlock("cherry_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CHERRY_STRIPPED_WOOD_PRESSURE_PLATE = registerBlock("cherry_stripped_wood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CHERRY_LOG_PRESSURE_PLATE = registerBlock("cherry_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CHERRY_STRIPPED_LOG_PRESSURE_PLATE = registerBlock("cherry_stripped_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> CHERRY_WOOD_BUTTON = registerBlock("cherry_wood_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CHERRY_STRIPPED_WOOD_BUTTON = registerBlock("cherry_stripped_wood_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CHERRY_LOG_BUTTON = registerBlock("cherry_log_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CHERRY_STRIPPED_LOG_BUTTON = registerBlock("cherry_stripped_log_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> CHERRY_WOOD_FENCE = registerBlock("cherry_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> CHERRY_STRIPPED_WOOD_FENCE = registerBlock("cherry_stripped_wood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> CHERRY_WOOD_FENCE_GATE = registerBlock("cherry_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> CHERRY_STRIPPED_WOOD_FENCE_GATE = registerBlock("cherry_stripped_wood_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> CHERRY_PLANK_WALL = registerBlock("cherry_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CHERRY_WOOD_WALL = registerBlock("cherry_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CHERRY_STRIPPED_WOOD_WALL = registerBlock("cherry_stripped_wood_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> WARPED_HYPHAE_STAIRS = registerBlock("warped_hyphae_stairs",
            () -> new StairBlock(Blocks.WARPED_HYPHAE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> WARPED_STRIPPED_HYPHAE_STAIRS = registerBlock("warped_stripped_hyphae_stairs",
            () -> new StairBlock(Blocks.WARPED_HYPHAE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> WARPED_STEM_STAIRS = registerBlock("warped_stem_stairs",
            () -> new StairBlock(Blocks.WARPED_STEM.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> WARPED_STRIPPED_STEM_STAIRS = registerBlock("warped_stripped_stem_stairs",
            () -> new StairBlock(Blocks.WARPED_STEM.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> WARPED_HYPHAE_SLAB = registerBlock("warped_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WARPED_STRIPPED_HYPHAE_SLAB = registerBlock("warped_stripped_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WARPED_STEM_SLAB = registerBlock("warped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WARPED_STRIPPED_STEM_SLAB = registerBlock("warped_stripped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> WARPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_hyphae_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.WARPED,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE = registerBlock("warped_stripped_hyphae_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.WARPED,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> WARPED_STEM_PRESSURE_PLATE = registerBlock("warped_stem_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.WARPED,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> WARPED_STRIPPED_STEM_PRESSURE_PLATE = registerBlock("warped_stripped_stem_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.WARPED,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> WARPED_HYPHAE_BUTTON = registerBlock("warped_hyphae_button",
            () -> new ButtonBlock(BlockSetType.WARPED, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> WARPED_STRIPPED_HYPHAE_BUTTON = registerBlock("warped_stripped_hyphae_button",
            () -> new ButtonBlock(BlockSetType.WARPED, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> WARPED_STEM_BUTTON = registerBlock("warped_stem_button",
            () -> new ButtonBlock(BlockSetType.WARPED, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> WARPED_STRIPPED_STEM_BUTTON = registerBlock("warped_stripped_stem_button",
            () -> new ButtonBlock(BlockSetType.WARPED, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> WARPED_HYPHAE_FENCE = registerBlock("warped_hyphae_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> WARPED_STRIPPED_HYPHAE_FENCE = registerBlock("warped_stripped_hyphae_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> WARPED_HYPHAE_FENCE_GATE = registerBlock("warped_hyphae_fence_gate",
            () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> WARPED_STRIPPED_HYPHAE_FENCE_GATE = registerBlock("warped_stripped_hyphae_fence_gate",
            () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> WARPED_PLANK_WALL = registerBlock("warped_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> WARPED_HYPHAE_WALL = registerBlock("warped_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> WARPED_STRIPPED_HYPHAE_WALL = registerBlock("warped_stripped_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    //
    //

    public static final DeferredBlock<StairBlock> CRIMSON_HYPHAE_STAIRS = registerBlock("crimson_hyphae_stairs",
            () -> new StairBlock(Blocks.CRIMSON_HYPHAE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CRIMSON_STRIPPED_HYPHAE_STAIRS = registerBlock("crimson_stripped_hyphae_stairs",
            () -> new StairBlock(Blocks.CRIMSON_HYPHAE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CRIMSON_STEM_STAIRS = registerBlock("crimson_stem_stairs",
            () -> new StairBlock(Blocks.CRIMSON_STEM.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> CRIMSON_STRIPPED_STEM_STAIRS = registerBlock("crimson_stripped_stem_stairs",
            () -> new StairBlock(Blocks.CRIMSON_STEM.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<SlabBlock> CRIMSON_HYPHAE_SLAB = registerBlock("crimson_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CRIMSON_STRIPPED_HYPHAE_SLAB = registerBlock("crimson_stripped_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CRIMSON_STEM_SLAB = registerBlock("crimson_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CRIMSON_STRIPPED_STEM_SLAB = registerBlock("crimson_stripped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<PressurePlateBlock> CRIMSON_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_hyphae_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE = registerBlock("crimson_stripped_hyphae_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CRIMSON_STEM_PRESSURE_PLATE = registerBlock("crimson_stem_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CRIMSON_STRIPPED_STEM_PRESSURE_PLATE = registerBlock("crimson_stripped_stem_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CRIMSON,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<ButtonBlock> CRIMSON_HYPHAE_BUTTON = registerBlock("crimson_hyphae_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CRIMSON_STRIPPED_HYPHAE_BUTTON = registerBlock("crimson_stripped_hyphae_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CRIMSON_STEM_BUTTON = registerBlock("crimson_stem_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<ButtonBlock> CRIMSON_STRIPPED_STEM_BUTTON = registerBlock("crimson_stripped_stem_button",
            () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<FenceBlock> CRIMSON_HYPHAE_FENCE = registerBlock("crimson_hyphae_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceBlock> CRIMSON_STRIPPED_HYPHAE_FENCE = registerBlock("crimson_stripped_hyphae_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<FenceGateBlock> CRIMSON_HYPHAE_FENCE_GATE = registerBlock("crimson_hyphae_fence_gate",
            () -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<FenceGateBlock> CRIMSON_STRIPPED_HYPHAE_FENCE_GATE = registerBlock("crimson_stripped_hyphae_fence_gate",
            () -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<WallBlock> CRIMSON_PLANK_WALL = registerBlock("crimson_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CRIMSON_HYPHAE_WALL = registerBlock("crimson_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CRIMSON_STRIPPED_HYPHAE_WALL = registerBlock("crimson_stripped_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> WHITE_CONCRETE_PRESSURE_PLATE = registerBlock("white_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("light_gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> GRAY_CONCRETE_PRESSURE_PLATE = registerBlock("gray_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BLACK_CONCRETE_PRESSURE_PLATE = registerBlock("black_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BROWN_CONCRETE_PRESSURE_PLATE = registerBlock("brown_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> RED_CONCRETE_PRESSURE_PLATE = registerBlock("red_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> ORANGE_CONCRETE_PRESSURE_PLATE = registerBlock("orange_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> YELLOW_CONCRETE_PRESSURE_PLATE = registerBlock("yellow_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> LIME_CONCRETE_PRESSURE_PLATE = registerBlock("lime_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> GREEN_CONCRETE_PRESSURE_PLATE = registerBlock("green_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> CYAN_CONCRETE_PRESSURE_PLATE = registerBlock("cyan_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("light_blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> BLUE_CONCRETE_PRESSURE_PLATE = registerBlock("blue_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> PURPLE_CONCRETE_PRESSURE_PLATE = registerBlock("purple_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> MAGENTA_CONCRETE_PRESSURE_PLATE = registerBlock("magenta_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));

    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> PINK_CONCRETE_PRESSURE_PLATE = registerBlock("pink_concrete_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.STONE,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            () -> new ButtonBlock(BlockSetType.STONE, 20,
                    BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().noCollission()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
