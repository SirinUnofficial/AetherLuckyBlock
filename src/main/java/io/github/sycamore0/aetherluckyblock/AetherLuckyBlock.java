package io.github.sycamore0.aetherluckyblock;

import io.github.sycamore0.myluckyblock.MyLuckyBlock;
import net.fabricmc.api.ModInitializer;

public class AetherLuckyBlock implements ModInitializer {
    public static final String MOD_ID = "aetherluckyblock";

    @Override
    public void onInitialize() {
        AddonBlocks.regBlocks();
        ItemGroupModifier.modify();

        MyLuckyBlock.addModId(MOD_ID);
    }
}
