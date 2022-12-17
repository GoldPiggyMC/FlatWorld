package com.tobydev0207.flatworld;

import com.tobydev0207.flatworld.items.HeartOfTheEarth;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class FlatWorld implements ModInitializer {
  public static final String MOD_ID = "flatworld";

  private static final RegistryKey<World> FLAT_DIMENSION_KEY =
      RegistryKey.of(RegistryKeys.WORLD, new Identifier(FlatWorld.MOD_ID, "flat_dimension"));

  @Override
  public void onInitialize() {
    ItemManager.register();
    registerDimension();
    registerPortal();
  }

  private void registerDimension() {
    RegistryKey.of(RegistryKeys.DIMENSION_TYPE, FLAT_DIMENSION_KEY.getValue());
  }

  private void registerPortal() {
    CustomPortalBuilder.beginPortal()
        .frameBlock(Blocks.STONE)
        .lightWithItem(HeartOfTheEarth.getItem())
        .destDimID(FLAT_DIMENSION_KEY.getValue())
        .tintColor(149, 165, 166)
        .onlyLightInOverworld()
        .registerPortal();
  }
}
