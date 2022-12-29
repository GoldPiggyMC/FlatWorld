package org.goldpiggymc.flatworld;

import net.fabricmc.api.ModInitializer;

public class FlatWorldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FlatWorld.init();
    }
}
