package net.prak.crackedmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.prak.crackedmod.CrackedMod;

public class ModItemGroup {

    public static final ItemGroup CAT_MILK = FabricItemGroupBuilder.build(
            new Identifier(CrackedMod.MOD_ID, "cat_milk"), () -> new ItemStack(ModItems.CAT_MILK));
}
