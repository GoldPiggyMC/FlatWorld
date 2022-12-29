package org.goldpiggymc.flatworld;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class FlatWorld {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Vars.MOD_ID, Registry.ITEM_REGISTRY);

    public static final CreativeModeTab FLATWORLD_TAB = CreativeTabRegistry.create(new ResourceLocation(Vars.MOD_ID, "flatworld_tab"), () ->
        new ItemStack(FlatWorld.HEART_OF_THE_EARTH.get()));

    public static final RegistrySupplier<Item> HEART_OF_THE_EARTH = ITEMS.register("heart_of_the_earth", () -> new Item(new Item.Properties().tab(FLATWORLD_TAB)));

    public static void init() {
        ITEMS.register();
    }
}
