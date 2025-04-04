package io.github.sycamore0.aetherluckyblock;

import io.github.sycamore0.myluckyblock.CommonClass;
import io.github.sycamore0.myluckyblock.utils.AddonUtil;
import net.fabricmc.api.ModInitializer;

public class AetherLuckyBlock implements ModInitializer {
    public static final String MOD_ID = "aetherluckyblock";
    public static final String EVENT_PACK_ID = "aetherluckyblock";

    @Override
    public void onInitialize() {
        AddonUtil.createLB("aether_lucky_block", MOD_ID, EVENT_PACK_ID, false);
        CommonClass.addEventPackId(EVENT_PACK_ID);
    }
}
