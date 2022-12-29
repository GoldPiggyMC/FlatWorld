package org.goldpiggymc.flatworld;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Vars.MOD_ID)
public class FlatWorldForge {
    public FlatWorldForge() {
        EventBuses.registerModEventBus(Vars.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FlatWorld.init();
    }
}