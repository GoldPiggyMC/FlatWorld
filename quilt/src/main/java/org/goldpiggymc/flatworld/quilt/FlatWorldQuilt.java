package org.goldpiggymc.flatworld.quilt;

import org.goldpiggymc.flatworld.FlatWorld;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class FlatWorldQuilt implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        FlatWorld.init();
    }
}
