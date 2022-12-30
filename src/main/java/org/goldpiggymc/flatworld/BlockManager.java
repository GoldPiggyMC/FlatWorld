package org.goldpiggymc.flatworld;

import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockManager implements BlockRegistryContainer {

    public static final Block FLATWORLD_PORTAL = new Block(FabricBlockSettings.of(Material.METAL));

    @Override
    public BlockItem createBlockItem(Block block, String identifier) {
        return new BlockItem(block, new OwoItemSettings().group(Vars.FLATWORLD_TAB));
    }
}
