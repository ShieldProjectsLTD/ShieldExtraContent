package net.shieldprojects.shieldextracontent.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShieldExtraContentMod.MOD_ID);


    public static final Supplier<CreativeModeTab> WOODEN_BLOCKS_TAB = CREATIVE_MODE_TAB.register("wooden_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(Items.CHERRY_LOG))
                    .title(Component.translatable("creativetab.shieldextracontent.wooden_blocks_tab.title"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.OAK_LOG);
                        output.accept(Items.OAK_WOOD);
                        output.accept(Items.STRIPPED_OAK_LOG);
                        output.accept(Items.STRIPPED_OAK_WOOD);
                        output.accept(Items.OAK_PLANKS);
                        output.accept(Items.OAK_STAIRS);
                        output.accept(Items.OAK_SLAB);
                        output.accept(Items.OAK_FENCE);
                        output.accept(Items.OAK_FENCE_GATE);
                        output.accept(Items.OAK_DOOR);
                        output.accept(Items.OAK_TRAPDOOR);
                        output.accept(Items.OAK_PRESSURE_PLATE);
                        output.accept(Items.OAK_BUTTON);

                        output.accept(Items.SPRUCE_LOG);
                        output.accept(Items.SPRUCE_WOOD);
                        output.accept(Items.STRIPPED_SPRUCE_LOG);
                        output.accept(Items.STRIPPED_SPRUCE_WOOD);
                        output.accept(Items.SPRUCE_PLANKS);
                        output.accept(Items.SPRUCE_STAIRS);
                        output.accept(Items.SPRUCE_SLAB);
                        output.accept(Items.SPRUCE_FENCE);
                        output.accept(Items.SPRUCE_FENCE_GATE);
                        output.accept(Items.SPRUCE_DOOR);
                        output.accept(Items.SPRUCE_TRAPDOOR);
                        output.accept(Items.SPRUCE_PRESSURE_PLATE);
                        output.accept(Items.SPRUCE_BUTTON);

                        output.accept(Items.BIRCH_LOG);
                        output.accept(Items.BIRCH_WOOD);
                        output.accept(Items.STRIPPED_BIRCH_LOG);
                        output.accept(Items.STRIPPED_BIRCH_WOOD);
                        output.accept(Items.BIRCH_PLANKS);
                        output.accept(Items.BIRCH_STAIRS);
                        output.accept(Items.BIRCH_SLAB);
                        output.accept(Items.BIRCH_FENCE);
                        output.accept(Items.BIRCH_FENCE_GATE);
                        output.accept(Items.BIRCH_DOOR);
                        output.accept(Items.BIRCH_TRAPDOOR);
                        output.accept(Items.BIRCH_PRESSURE_PLATE);
                        output.accept(Items.BIRCH_BUTTON);

                        output.accept(Items.JUNGLE_LOG);
                        output.accept(Items.JUNGLE_WOOD);
                        output.accept(Items.STRIPPED_JUNGLE_LOG);
                        output.accept(Items.STRIPPED_JUNGLE_WOOD);
                        output.accept(Items.JUNGLE_PLANKS);
                        output.accept(Items.JUNGLE_STAIRS);
                        output.accept(Items.JUNGLE_SLAB);
                        output.accept(Items.JUNGLE_FENCE);
                        output.accept(Items.JUNGLE_FENCE_GATE);
                        output.accept(Items.JUNGLE_DOOR);
                        output.accept(Items.JUNGLE_TRAPDOOR);
                        output.accept(Items.JUNGLE_PRESSURE_PLATE);
                        output.accept(Items.JUNGLE_BUTTON);

                        output.accept(Items.ACACIA_LOG);
                        output.accept(Items.ACACIA_WOOD);
                        output.accept(Items.STRIPPED_ACACIA_LOG);
                        output.accept(Items.STRIPPED_ACACIA_WOOD);
                        output.accept(Items.ACACIA_PLANKS);
                        output.accept(Items.ACACIA_STAIRS);
                        output.accept(Items.ACACIA_SLAB);
                        output.accept(Items.ACACIA_FENCE);
                        output.accept(Items.ACACIA_FENCE_GATE);
                        output.accept(Items.ACACIA_DOOR);
                        output.accept(Items.ACACIA_TRAPDOOR);
                        output.accept(Items.ACACIA_PRESSURE_PLATE);
                        output.accept(Items.ACACIA_BUTTON);

                        output.accept(Items.DARK_OAK_LOG);
                        output.accept(Items.DARK_OAK_WOOD);
                        output.accept(Items.STRIPPED_DARK_OAK_LOG);
                        output.accept(Items.STRIPPED_DARK_OAK_WOOD);
                        output.accept(Items.DARK_OAK_PLANKS);
                        output.accept(Items.DARK_OAK_STAIRS);
                        output.accept(Items.DARK_OAK_SLAB);
                        output.accept(Items.DARK_OAK_FENCE);
                        output.accept(Items.DARK_OAK_FENCE_GATE);
                        output.accept(Items.DARK_OAK_DOOR);
                        output.accept(Items.DARK_OAK_TRAPDOOR);
                        output.accept(Items.DARK_OAK_PRESSURE_PLATE);
                        output.accept(Items.DARK_OAK_BUTTON);

                        output.accept(Items.MANGROVE_LOG);
                        output.accept(Items.MANGROVE_WOOD);
                        output.accept(Items.STRIPPED_MANGROVE_LOG);
                        output.accept(Items.STRIPPED_MANGROVE_WOOD);
                        output.accept(Items.MANGROVE_PLANKS);
                        output.accept(Items.MANGROVE_STAIRS);
                        output.accept(Items.MANGROVE_SLAB);
                        output.accept(Items.MANGROVE_FENCE);
                        output.accept(Items.MANGROVE_FENCE_GATE);
                        output.accept(Items.MANGROVE_DOOR);
                        output.accept(Items.MANGROVE_TRAPDOOR);
                        output.accept(Items.MANGROVE_PRESSURE_PLATE);
                        output.accept(Items.MANGROVE_BUTTON);

                        output.accept(Items.CHERRY_LOG);
                        output.accept(Items.CHERRY_WOOD);
                        output.accept(Items.STRIPPED_CHERRY_LOG);
                        output.accept(Items.STRIPPED_CHERRY_WOOD);
                        output.accept(Items.CHERRY_PLANKS);
                        output.accept(Items.CHERRY_STAIRS);
                        output.accept(Items.CHERRY_SLAB);
                        output.accept(Items.CHERRY_FENCE);
                        output.accept(Items.CHERRY_FENCE_GATE);
                        output.accept(Items.CHERRY_DOOR);
                        output.accept(Items.CHERRY_TRAPDOOR);
                        output.accept(Items.CHERRY_PRESSURE_PLATE);
                        output.accept(Items.CHERRY_BUTTON);

                        output.accept(Items.BAMBOO_BLOCK);
                        output.accept(Items.STRIPPED_BAMBOO_BLOCK);
                        output.accept(Items.BAMBOO_PLANKS);
                        output.accept(Items.BAMBOO_MOSAIC);
                        output.accept(Items.BAMBOO_STAIRS);
                        output.accept(Items.BAMBOO_MOSAIC_STAIRS);
                        output.accept(Items.BAMBOO_SLAB);
                        output.accept(Items.BAMBOO_MOSAIC_SLAB);
                        output.accept(Items.BAMBOO_FENCE);
                        output.accept(Items.BAMBOO_FENCE_GATE);
                        output.accept(Items.BAMBOO_DOOR);
                        output.accept(Items.BAMBOO_TRAPDOOR);
                        output.accept(Items.BAMBOO_PRESSURE_PLATE);
                        output.accept(Items.BAMBOO_BUTTON);

                        output.accept(Items.CRIMSON_STEM);
                        output.accept(Items.CRIMSON_HYPHAE);
                        output.accept(Items.STRIPPED_CRIMSON_STEM);
                        output.accept(Items.STRIPPED_CRIMSON_HYPHAE);
                        output.accept(Items.CRIMSON_PLANKS);
                        output.accept(Items.CRIMSON_STAIRS);
                        output.accept(Items.CRIMSON_SLAB);
                        output.accept(Items.CRIMSON_FENCE);
                        output.accept(Items.CRIMSON_FENCE_GATE);
                        output.accept(Items.CRIMSON_DOOR);
                        output.accept(Items.CRIMSON_TRAPDOOR);
                        output.accept(Items.CRIMSON_PRESSURE_PLATE);
                        output.accept(Items.CRIMSON_BUTTON);

                        output.accept(Items.WARPED_STEM);
                        output.accept(Items.WARPED_HYPHAE);
                        output.accept(Items.STRIPPED_WARPED_STEM);
                        output.accept(Items.STRIPPED_WARPED_HYPHAE);
                        output.accept(Items.WARPED_PLANKS);
                        output.accept(Items.WARPED_STAIRS);
                        output.accept(Items.WARPED_SLAB);
                        output.accept(Items.WARPED_FENCE);
                        output.accept(Items.WARPED_FENCE_GATE);
                        output.accept(Items.WARPED_DOOR);
                        output.accept(Items.WARPED_TRAPDOOR);
                        output.accept(Items.WARPED_PRESSURE_PLATE);
                        output.accept(Items.WARPED_BUTTON);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> STONE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("stone_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID, "wooden_blocks_tab"))
                    .icon(()-> new ItemStack(Items.SMOOTH_STONE))
                    .title(Component.translatable("creativetab.shieldextracontent.stone_blocks_tab.title"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.STONE);
                        output.accept(Items.STONE_BRICKS);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> NETHER_BLOCKS_TAB = CREATIVE_MODE_TAB.register("nether_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID, "stone_blocks_tab"))
                    .icon(()-> new ItemStack(Items.BASALT))
                    .title(Component.translatable("creativetab.shieldextracontent.nether_blocks_tab.title"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.NETHER_BRICKS);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> THE_END_BLOCKS_TAB = CREATIVE_MODE_TAB.register("the_end_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID, "stone_blocks_tab"))
                    .icon(()-> new ItemStack(Items.END_STONE_BRICKS))
                    .title(Component.translatable("creativetab.shieldextracontent.the_end_blocks_tab.title"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.END_STONE_BRICKS);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> DECORATIVE_BLOCKS_TAB = CREATIVE_MODE_TAB.register("decorative_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(ShieldExtraContentMod.MOD_ID, "stone_blocks_tab"))
                    .icon(()-> new ItemStack(Items.CHISELED_QUARTZ_BLOCK))
                    .title(Component.translatable("creativetab.shieldextracontent.decorative_blocks_tab.title"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.COAL_BLOCK);
                        output.accept(Items.IRON_BLOCK);
                        output.accept(Items.GOLD_BLOCK);
                        output.accept(Items.REDSTONE_BLOCK);
                        output.accept(Items.EMERALD_BLOCK);
                        output.accept(Items.LAPIS_BLOCK);
                        output.accept(Items.DIAMOND_BLOCK);
                        output.accept(Items.NETHERITE_BLOCK);
                        output.accept(Items.QUARTZ_BLOCK);
                        output.accept(Items.QUARTZ_STAIRS);
                        output.accept(Items.QUARTZ_SLAB);
                        output.accept(Items.CHISELED_QUARTZ_BLOCK);
                        output.accept(Items.QUARTZ_BRICKS);
                        output.accept(Items.QUARTZ_PILLAR);
                        output.accept(Items.SMOOTH_QUARTZ);
                        output.accept(Items.SMOOTH_QUARTZ_STAIRS);
                        output.accept(Items.SMOOTH_QUARTZ_SLAB);
                        output.accept(Items.AMETHYST_BLOCK);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
