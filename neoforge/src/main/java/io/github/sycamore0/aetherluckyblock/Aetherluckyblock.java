package io.github.sycamore0.aetherluckyblock;


import io.github.sycamore0.myluckyblock.CommonClass;
import io.github.sycamore0.myluckyblock.block.LuckyBlock;
import io.github.sycamore0.myluckyblock.item.ModItemGroups;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class Aetherluckyblock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.Blocks.createBlocks(Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.Items.createItems(Constants.MOD_ID);
    public static final String AETHER_LUCKY_BLOCK_ID = "aether_lucky_block";
    public static final DeferredHolder<Block, Block> AETHER_LUCKY_BLOCK;

    static {
        AETHER_LUCKY_BLOCK = BLOCKS.register(AETHER_LUCKY_BLOCK_ID, () -> new LuckyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(0.5F).explosionResistance(5000000.0F), Constants.EVENT_PACK_ID, false));
        ITEMS.register(AETHER_LUCKY_BLOCK_ID, () -> new BlockItem(AETHER_LUCKY_BLOCK.get(), new Item.Properties()));
    }

    public Aetherluckyblock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        eventBus.addListener(Aetherluckyblock::buildCreativeTabContent);
        CommonClass.addEventPackId(Constants.EVENT_PACK_ID);
    }

    public static void buildCreativeTabContent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModItemGroups.MYLUCKYBLOCK_GROUP.get()) {
            event.accept(AETHER_LUCKY_BLOCK.get());
        }
    }
}
