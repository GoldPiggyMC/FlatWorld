package com.tobydev0207.flatworld;

import com.tobydev0207.flatworld.items.HeartOfTheEarth;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemManager {

  public static void register() {
    Registry.register(
        Registries.ITEM,
        new Identifier(FlatWorld.MOD_ID, HeartOfTheEarth.getName()),
        HeartOfTheEarth.getItem());
  }
}
