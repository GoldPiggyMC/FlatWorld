package org.goldpiggymc.flatworld.fabric;

import net.fabricmc.api.ModInitializer;
import org.goldpiggymc.flatworld.FlatWorld;

public class FlatWorldFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FlatWorld.init();
    }
}
