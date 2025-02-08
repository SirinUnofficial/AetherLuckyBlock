package io.github.sycamore0.aetherluckyblock;

import io.github.sycamore0.myluckyblock.MyLuckyBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ItemGroupModifier {
    public static void modify() {
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MyLuckyBlock.MOD_ID, "myluckyblock_group"))).register(entries -> {
            entries.add(AddonBlocks.AETHER_LUCKY_BLOCK);
        });
    }
}
