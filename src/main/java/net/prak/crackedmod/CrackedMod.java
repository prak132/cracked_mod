package net.prak.crackedmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.prak.crackedmod.block.ModBlocks;
import net.prak.crackedmod.event.JoinServerEventHandler;
import net.prak.crackedmod.item.ModItems;
import net.prak.crackedmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrackedMod implements ModInitializer {
	public static final String MOD_ID = "crackedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ClientPlayConnectionEvents.JOIN.register(new JoinServerEventHandler());
	}
}
