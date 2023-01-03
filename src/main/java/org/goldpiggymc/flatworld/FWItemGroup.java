package org.goldpiggymc.flatworld;

import io.wispforest.owo.itemgroup.OwoItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FWItemGroup extends OwoItemGroup {

    protected FWItemGroup(Identifier id) {
        super(id);
    }

    @Override
    protected void setup() {}

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemManager.HEART_OF_THE_EARTH);
    }
}
