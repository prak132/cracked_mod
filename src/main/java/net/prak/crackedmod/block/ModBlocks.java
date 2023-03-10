package net.prak.crackedmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prak.crackedmod.CrackedMod;
import net.prak.crackedmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block CAT_BLOCK = registerBlock("cat_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.CAT_MILK);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(CrackedMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(CrackedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        CrackedMod.LOGGER.debug("Registering ModBlocks for " + CrackedMod.MOD_ID);
        CrackedMod.LOGGER.debug("Loading...");

    }

}
