package org.goldpiggymc.flatworld;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.minecraft.util.Identifier;

public class Vars {
  public static final String MOD_ID = "flatworld";

  public static final OwoItemGroup FLATWORLD_TAB = OwoItemGroup.builder(new Identifier(MOD_ID, "flatworld_tab"), () -> Icon.of(ItemManager.HEART_OF_THE_EARTH)).build();
}
