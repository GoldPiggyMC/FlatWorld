package com.tobydev0207.flatworld;

import com.tobydev0207.flatworld.items.HeartOfTheEarth;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemManager {

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(FlatWorld.MOD_ID, HeartOfTheEarth.getName()), HeartOfTheEarth.getItem());
    }
}
