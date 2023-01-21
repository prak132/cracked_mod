package net.prak.crackedmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prak.crackedmod.CrackedMod;

public class ModItems {
    public static final Item SUSSY = registerItem("sussy",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CAT_BALL = registerItem("cat_ball",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CrackedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CrackedMod.LOGGER.debug("Registering Mod Items for" + CrackedMod.MOD_ID);
    }

}