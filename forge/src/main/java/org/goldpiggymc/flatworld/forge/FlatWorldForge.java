package org.goldpiggymc.flatworld.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.goldpiggymc.flatworld.FlatWorld;
import org.goldpiggymc.flatworld.Vars;

@Mod(Vars.MOD_ID)
public class FlatWorldForge {
    public FlatWorldForge() {
        EventBuses.registerModEventBus(
                Vars.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FlatWorld.init();
    }
}
