package io.github.sycamore0.aetherluckyblock;

import io.github.sycamore0.myluckyblock.CommonClass;
import io.github.sycamore0.myluckyblock.utils.AddonUtil;
import net.fabricmc.api.ModInitializer;

public class Aetherluckyblock implements ModInitializer {
    @Override
    public void onInitialize() {
        AddonUtil.createLB("aether_lucky_block", Constants.MOD_ID, Constants.EVENT_PACK_ID, false);
        CommonClass.addEventPackId(Constants.EVENT_PACK_ID);
    }
}
