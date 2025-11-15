package com.saffy.saffys_dragons;

import com.saffy.saffys_dragons.block.ModBlocks;
import com.saffy.saffys_dragons.entity.ModEntities;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.AncientRedDragonEntity;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.BabyRedDragonEntity;
import com.saffy.saffys_dragons.item.ModItemGroups;
import com.saffy.saffys_dragons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaffysDragons implements ModInitializer {
	public static final String MOD_ID = "saffys-dragons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Let there be dragons...");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEntities.registerModEntities();
        ModItemGroups.registerItemGroups();

        FabricDefaultAttributeRegistry.register(ModEntities.AncientRedDragon, AncientRedDragonEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.BabyRedDragon, BabyRedDragonEntity.createAttributes());
	}
}