package net.shieldprojects.shieldextracontent.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;

@EventBusSubscriber(modid = ShieldExtraContentMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MinecraftCreativeTabs {

    @SubscribeEvent
    public static void onTabBuildContents(final BuildCreativeModeTabContentsEvent event) {
        final ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if(tab.equals(CreativeModeTabs.INGREDIENTS)) {
            event.insertAfter(Items.COAL.getDefaultInstance(), ModItems.SMALL_COAL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.HEART_OF_THE_SEA.getDefaultInstance(), ModItems.LOCKED_SOUL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(ModItems.LOCKED_SOUL.toStack(), ModItems.UNHOLY_SOUL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(tab.equals(CreativeModeTabs.TOOLS_AND_UTILITIES)) {
            event.insertAfter(Items.ENDER_EYE.getDefaultInstance(), ModItems.STONE_REWIND.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.WIND_CHARGE.getDefaultInstance(), ModItems.LOCKED_SOUL.toStack(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}