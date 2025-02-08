package io.github.sycamore0.aetherluckyblock;

import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import io.github.sycamore0.myluckyblock.block.LuckyBlock;

public class AddonBlocks {
    public static final Block AETHER_LUCKY_BLOCK = register("aether_lucky_block", new LuckyBlock(Block.Settings.create().mapColor(MapColor.YELLOW).strength(0.5f).resistance(5000000.0f), AetherLuckyBlock.MOD_ID, false));

    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of(AetherLuckyBlock.MOD_ID, path), block);
        Registry.register(Registries.ITEM, Identifier.of(AetherLuckyBlock.MOD_ID, path), new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void regBlocks() {
    }
}
