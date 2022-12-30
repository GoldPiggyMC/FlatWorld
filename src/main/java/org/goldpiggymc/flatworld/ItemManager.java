package org.goldpiggymc.flatworld;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ItemManager implements ItemRegistryContainer {
  public static final Item HEART_OF_THE_EARTH = new Item(new OwoItemSettings().group(Vars.FLATWORLD_TAB));
}
