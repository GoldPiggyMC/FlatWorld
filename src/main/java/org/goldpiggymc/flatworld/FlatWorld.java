package org.goldpiggymc.flatworld;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class FlatWorld implements ModInitializer {
  private static final RegistryKey<World> FLAT_DIMENSION_KEY =
      RegistryKey.of(RegistryKeys.WORLD, new Identifier(Vars.MOD_ID, "flat_dimension"));

  @Override
  public void onInitialize() {
    FieldRegistrationHandler.register(ItemManager.class, Vars.MOD_ID, false);
    FieldRegistrationHandler.register(BlockManager.class, Vars.MOD_ID, false);

    Vars.FLATWORLD_TAB.initialize();

      ItemGroupEvents.modifyEntriesEvent(Vars.FLATWORLD_TAB).register(content -> {
          content.add(ItemManager.HEART_OF_THE_EARTH);
          content.add(BlockManager.FLATWORLD_PORTAL);
      });

    registerDimension();
    registerPortal();
  }

  private void registerDimension() {
    RegistryKey.of(RegistryKeys.DIMENSION_TYPE, FLAT_DIMENSION_KEY.getValue());
  }

  private void registerPortal() {
    CustomPortalBuilder.beginPortal()
        .frameBlock(BlockManager.FLATWORLD_PORTAL)
        .lightWithItem(ItemManager.HEART_OF_THE_EARTH)
        .destDimID(FLAT_DIMENSION_KEY.getValue())
        .tintColor(149, 165, 166)
        .onlyLightInOverworld()
        .registerPortal();
  }
}
