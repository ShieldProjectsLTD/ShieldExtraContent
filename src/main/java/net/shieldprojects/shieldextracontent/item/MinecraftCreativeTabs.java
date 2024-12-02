package net.shieldprojects.shieldextracontent.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;

@EventBusSubscriber(modid = ShieldExtraContentMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MinecraftCreativeTabs {

    @SubscribeEvent
    public static void onTabBuildContents(final BuildCreativeModeTabContentsEvent event) {
        final ResourceKey<CreativeModeTab> tab = event.getTabKey();

        if(tab.equals(CreativeModeTabs.BUILDING_BLOCKS)) {
            BuildingBlocksOak(event);
            BuildingBlocksSpruce(event);
            BuildingBlocksBirch(event);
            BuildingBlocksJungle(event);
            BuildingBlocksAcacia(event);
            BuildingBlocksDarkOak(event);
            BuildingBlocksMangrove(event);
            BuildingBlocksCherry(event);
            BuildingBlocksCrimson(event);
            BuildingBlocksWarped(event);
        }
    }

    private static void BuildingBlocksOak(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.OAK_STAIRS.getDefaultInstance(), ModBlocks.OAK_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_STAIRS.toStack(), ModBlocks.OAK_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.OAK_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_LOG_STAIRS.toStack(), ModBlocks.OAK_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.OAK_SLAB.getDefaultInstance(), ModBlocks.OAK_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_SLAB.toStack(), ModBlocks.OAK_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.OAK_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_LOG_SLAB.toStack(), ModBlocks.OAK_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.OAK_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.OAK_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.OAK_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_LOG_PRESSURE_PLATE.toStack(), ModBlocks.OAK_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.OAK_BUTTON.getDefaultInstance(), ModBlocks.OAK_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_BUTTON.toStack(), ModBlocks.OAK_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.OAK_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_LOG_BUTTON.toStack(), ModBlocks.OAK_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.OAK_FENCE.getDefaultInstance(), ModBlocks.OAK_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_FENCE.toStack(), ModBlocks.OAK_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.OAK_FENCE_GATE.getDefaultInstance(), ModBlocks.OAK_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_FENCE_GATE.toStack(), ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.OAK_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.OAK_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_PLANK_WALL.toStack(), ModBlocks.OAK_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.OAK_WOOD_WALL.toStack(), ModBlocks.OAK_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksSpruce(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.SPRUCE_STAIRS.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_STAIRS.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.SPRUCE_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_LOG_STAIRS.toStack(), ModBlocks.SPRUCE_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.SPRUCE_SLAB.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_SLAB.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.SPRUCE_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_LOG_SLAB.toStack(), ModBlocks.SPRUCE_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.SPRUCE_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.SPRUCE_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_LOG_PRESSURE_PLATE.toStack(), ModBlocks.SPRUCE_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.SPRUCE_BUTTON.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_BUTTON.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.SPRUCE_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_LOG_BUTTON.toStack(), ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.SPRUCE_FENCE.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_FENCE.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.SPRUCE_FENCE_GATE.getDefaultInstance(), ModBlocks.SPRUCE_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_FENCE_GATE.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.SPRUCE_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_PLANK_WALL.toStack(), ModBlocks.SPRUCE_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.SPRUCE_WOOD_WALL.toStack(), ModBlocks.SPRUCE_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksBirch(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.BIRCH_STAIRS.getDefaultInstance(), ModBlocks.BIRCH_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_STAIRS.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.BIRCH_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_LOG_STAIRS.toStack(), ModBlocks.BIRCH_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BIRCH_SLAB.getDefaultInstance(), ModBlocks.BIRCH_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_SLAB.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.BIRCH_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_LOG_SLAB.toStack(), ModBlocks.BIRCH_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BIRCH_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.BIRCH_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.BIRCH_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_LOG_PRESSURE_PLATE.toStack(), ModBlocks.BIRCH_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BIRCH_BUTTON.getDefaultInstance(), ModBlocks.BIRCH_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_BUTTON.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.BIRCH_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_LOG_BUTTON.toStack(), ModBlocks.BIRCH_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BIRCH_FENCE.getDefaultInstance(), ModBlocks.BIRCH_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_FENCE.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.BIRCH_FENCE_GATE.getDefaultInstance(), ModBlocks.BIRCH_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_FENCE_GATE.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.BIRCH_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.BIRCH_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_PLANK_WALL.toStack(), ModBlocks.BIRCH_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.BIRCH_WOOD_WALL.toStack(), ModBlocks.BIRCH_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksJungle(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.JUNGLE_STAIRS.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_STAIRS.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.JUNGLE_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_LOG_STAIRS.toStack(), ModBlocks.JUNGLE_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.JUNGLE_SLAB.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_SLAB.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.JUNGLE_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_LOG_SLAB.toStack(), ModBlocks.JUNGLE_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.JUNGLE_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.JUNGLE_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_LOG_PRESSURE_PLATE.toStack(), ModBlocks.JUNGLE_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.JUNGLE_BUTTON.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_BUTTON.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.JUNGLE_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_LOG_BUTTON.toStack(), ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.JUNGLE_FENCE.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_FENCE.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.JUNGLE_FENCE_GATE.getDefaultInstance(), ModBlocks.JUNGLE_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_FENCE_GATE.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.JUNGLE_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_PLANK_WALL.toStack(), ModBlocks.JUNGLE_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.JUNGLE_WOOD_WALL.toStack(), ModBlocks.JUNGLE_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksAcacia(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.ACACIA_STAIRS.getDefaultInstance(), ModBlocks.ACACIA_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_STAIRS.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.ACACIA_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_LOG_STAIRS.toStack(), ModBlocks.ACACIA_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.ACACIA_SLAB.getDefaultInstance(), ModBlocks.ACACIA_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_SLAB.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.ACACIA_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_LOG_SLAB.toStack(), ModBlocks.ACACIA_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.ACACIA_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.ACACIA_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.ACACIA_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_LOG_PRESSURE_PLATE.toStack(), ModBlocks.ACACIA_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.ACACIA_BUTTON.getDefaultInstance(), ModBlocks.ACACIA_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_BUTTON.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.ACACIA_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_LOG_BUTTON.toStack(), ModBlocks.ACACIA_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.ACACIA_FENCE.getDefaultInstance(), ModBlocks.ACACIA_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_FENCE.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.ACACIA_FENCE_GATE.getDefaultInstance(), ModBlocks.ACACIA_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_FENCE_GATE.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.ACACIA_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.ACACIA_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_PLANK_WALL.toStack(), ModBlocks.ACACIA_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.ACACIA_WOOD_WALL.toStack(), ModBlocks.ACACIA_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksDarkOak(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.DARK_OAK_STAIRS.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_STAIRS.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.DARK_OAK_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_LOG_STAIRS.toStack(), ModBlocks.DARK_OAK_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.DARK_OAK_SLAB.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_SLAB.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.DARK_OAK_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_LOG_SLAB.toStack(), ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.DARK_OAK_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE.toStack(), ModBlocks.DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.DARK_OAK_BUTTON.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_BUTTON.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.DARK_OAK_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_LOG_BUTTON.toStack(), ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.DARK_OAK_FENCE.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_FENCE.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.DARK_OAK_FENCE_GATE.getDefaultInstance(), ModBlocks.DARK_OAK_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_FENCE_GATE.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.DARK_OAK_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_PLANK_WALL.toStack(), ModBlocks.DARK_OAK_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.DARK_OAK_WOOD_WALL.toStack(), ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksMangrove(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.MANGROVE_STAIRS.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_STAIRS.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.MANGROVE_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_LOG_STAIRS.toStack(), ModBlocks.MANGROVE_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.MANGROVE_SLAB.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_SLAB.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.MANGROVE_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_LOG_SLAB.toStack(), ModBlocks.MANGROVE_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.MANGROVE_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.MANGROVE_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_LOG_PRESSURE_PLATE.toStack(), ModBlocks.MANGROVE_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.MANGROVE_BUTTON.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_BUTTON.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.MANGROVE_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_LOG_BUTTON.toStack(), ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.MANGROVE_FENCE.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_FENCE.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.MANGROVE_FENCE_GATE.getDefaultInstance(), ModBlocks.MANGROVE_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_FENCE_GATE.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.MANGROVE_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_PLANK_WALL.toStack(), ModBlocks.MANGROVE_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.MANGROVE_WOOD_WALL.toStack(), ModBlocks.MANGROVE_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksCherry(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.CHERRY_STAIRS.getDefaultInstance(), ModBlocks.CHERRY_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_STAIRS.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS.toStack(), ModBlocks.CHERRY_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_LOG_STAIRS.toStack(), ModBlocks.CHERRY_STRIPPED_LOG_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CHERRY_SLAB.getDefaultInstance(), ModBlocks.CHERRY_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_SLAB.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_STRIPPED_WOOD_SLAB.toStack(), ModBlocks.CHERRY_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_LOG_SLAB.toStack(), ModBlocks.CHERRY_STRIPPED_LOG_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CHERRY_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.CHERRY_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE.toStack(), ModBlocks.CHERRY_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_LOG_PRESSURE_PLATE.toStack(), ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CHERRY_BUTTON.getDefaultInstance(), ModBlocks.CHERRY_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_BUTTON.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON.toStack(), ModBlocks.CHERRY_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_LOG_BUTTON.toStack(), ModBlocks.CHERRY_STRIPPED_LOG_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CHERRY_FENCE.getDefaultInstance(), ModBlocks.CHERRY_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_FENCE.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CHERRY_FENCE_GATE.getDefaultInstance(), ModBlocks.CHERRY_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_FENCE_GATE.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.CHERRY_STRIPPED_LOG_BUTTON.toStack(), ModBlocks.CHERRY_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_PLANK_WALL.toStack(), ModBlocks.CHERRY_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CHERRY_WOOD_WALL.toStack(), ModBlocks.CHERRY_STRIPPED_WOOD_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksCrimson(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.CRIMSON_STAIRS.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_STAIRS.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS.toStack(), ModBlocks.CRIMSON_STEM_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STEM_STAIRS.toStack(), ModBlocks.CRIMSON_STRIPPED_STEM_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CRIMSON_SLAB.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_SLAB.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB.toStack(), ModBlocks.CRIMSON_STEM_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STEM_SLAB.toStack(), ModBlocks.CRIMSON_STRIPPED_STEM_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CRIMSON_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE.toStack(), ModBlocks.CRIMSON_STEM_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STEM_PRESSURE_PLATE.toStack(), ModBlocks.CRIMSON_STRIPPED_STEM_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CRIMSON_BUTTON.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_BUTTON.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON.toStack(), ModBlocks.CRIMSON_STEM_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_STEM_BUTTON.toStack(), ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CRIMSON_FENCE.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_FENCE.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.CRIMSON_FENCE_GATE.getDefaultInstance(), ModBlocks.CRIMSON_HYPHAE_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON.toStack(), ModBlocks.CRIMSON_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_PLANK_WALL.toStack(), ModBlocks.CRIMSON_HYPHAE_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.CRIMSON_HYPHAE_WALL.toStack(), ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

    private static void BuildingBlocksWarped(final BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(Items.WARPED_STAIRS.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_STAIRS.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS.toStack(), ModBlocks.WARPED_STEM_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STEM_STAIRS.toStack(), ModBlocks.WARPED_STRIPPED_STEM_STAIRS.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.WARPED_SLAB.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_SLAB.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB.toStack(), ModBlocks.WARPED_STEM_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STEM_SLAB.toStack(), ModBlocks.WARPED_STRIPPED_STEM_SLAB.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.WARPED_PRESSURE_PLATE.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE.toStack(), ModBlocks.WARPED_STEM_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STEM_PRESSURE_PLATE.toStack(), ModBlocks.WARPED_STRIPPED_STEM_PRESSURE_PLATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.WARPED_BUTTON.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_BUTTON.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON.toStack(), ModBlocks.WARPED_STEM_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_STEM_BUTTON.toStack(), ModBlocks.WARPED_STRIPPED_STEM_BUTTON.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.WARPED_FENCE.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_FENCE.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(Items.WARPED_FENCE_GATE.getDefaultInstance(), ModBlocks.WARPED_HYPHAE_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_FENCE_GATE.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        event.insertAfter(ModBlocks.WARPED_STRIPPED_STEM_BUTTON.toStack(), ModBlocks.WARPED_PLANK_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_PLANK_WALL.toStack(), ModBlocks.WARPED_HYPHAE_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        event.insertAfter(ModBlocks.WARPED_HYPHAE_WALL.toStack(), ModBlocks.WARPED_STRIPPED_HYPHAE_WALL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}