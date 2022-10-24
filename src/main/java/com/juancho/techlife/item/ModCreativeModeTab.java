package com.juancho.techlife.item;

import com.juancho.techlife.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };
    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_ORE.get());
        }
    };
}
