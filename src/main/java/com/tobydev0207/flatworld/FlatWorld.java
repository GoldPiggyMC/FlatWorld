package com.tobydev0207.flatworld;

import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class FlatWorld implements ModInitializer {
    public static final String MOD_ID = "flatworld";

    private static final RegistryKey<World> FLAT_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(FlatWorld.MOD_ID, "flat_dimension"));

    @Override
    public void onInitialize() {
        registerDimension();
        registerPortal();
    }

    private void registerDimension() {
        RegistryKey.of(Registry.DIMENSION_TYPE_KEY, FLAT_DIMENSION_KEY.getValue());
    }
    private void registerPortal() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.STONE)
                .lightWithItem(Items.IRON_INGOT)
                .destDimID(FLAT_DIMENSION_KEY.getValue())
                .tintColor(149, 165, 166)
                .onlyLightInOverworld()
                .registerPortal();
    }
}
