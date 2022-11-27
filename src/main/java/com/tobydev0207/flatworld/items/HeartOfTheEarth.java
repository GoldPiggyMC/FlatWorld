package com.tobydev0207.flatworld.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class HeartOfTheEarth {
    public static final String NAME = "heart_of_the_earth";
    public static final Item HEART_OF_THE_EARTH = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static Item getItem() {
        return HEART_OF_THE_EARTH;
    }

    public static String getName() {
        return NAME;
    }
}
