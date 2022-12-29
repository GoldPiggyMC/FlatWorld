package org.goldpiggymc.flatworld;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class FlatWorld implements ModInitializer {

  private static final RegistryKey<World> FLAT_DIMENSION_KEY =
      RegistryKey.of(Registry.WORLD_KEY, new Identifier(Vars.MOD_ID, "flat_dimension"));

  @Override
  public void onInitialize() {
    FieldRegistrationHandler.register(ItemManager.class, Vars.MOD_ID, false);
    FieldRegistrationHandler.register(BlockManager.class, Vars.MOD_ID, false);

    registerDimension();
    registerPortal();

    Vars.FLAT_WORLD_GROUP.initialize();
  }

  private void registerDimension() {
    RegistryKey.of(Registry.DIMENSION_TYPE_KEY, FLAT_DIMENSION_KEY.getValue());
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
