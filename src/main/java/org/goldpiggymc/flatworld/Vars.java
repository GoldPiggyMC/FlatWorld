package org.goldpiggymc.flatworld;

import io.wispforest.owo.itemgroup.Icon;
import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.minecraft.util.Identifier;

public class Vars {

    public static final String MOD_ID = "flatworld";

    public static final OwoItemGroup FW_ITEM_GROUP = OwoItemGroup
        .builder(
            new Identifier(MOD_ID, "flatworld_group"),
            () -> Icon.of(ItemManager.HEART_OF_THE_EARTH)
        )
        .build();
}
