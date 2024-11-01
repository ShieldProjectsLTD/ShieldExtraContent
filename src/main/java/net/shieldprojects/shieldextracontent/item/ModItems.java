package net.shieldprojects.shieldextracontent.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.shieldprojects.shieldextracontent.ShieldExtraContentMod;
import net.shieldprojects.shieldextracontent.item.custom.LockedSoul;
import net.shieldprojects.shieldextracontent.item.custom.StoneRewind;
import net.shieldprojects.shieldextracontent.item.custom.SmallCoal;
import net.shieldprojects.shieldextracontent.item.custom.UnholySoul;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ShieldExtraContentMod.MOD_ID);

    public static final DeferredItem<Item> SMALL_COAL = ITEMS.register("small_coal",
            () -> new SmallCoal(new Item.Properties(), 400));

    public static final DeferredItem<Item> LOCKED_SOUL = ITEMS.register("locked_soul",
            () -> new LockedSoul(new Item.Properties(), 16000));

    public static final DeferredItem<Item> UNHOLY_SOUL = ITEMS.register("unholy_soul",
            () -> new UnholySoul(new Item.Properties()));

    public static final DeferredItem<Item> STONE_REWIND = ITEMS.register("stone_rewind",
            () -> new StoneRewind(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}