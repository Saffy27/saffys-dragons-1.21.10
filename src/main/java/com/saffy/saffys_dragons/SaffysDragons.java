package com.saffy.saffys_dragons;

import com.saffy.saffys_dragons.block.ModBlocks;
import com.saffy.saffys_dragons.entity.ModEntities;
import com.saffy.saffys_dragons.entity.custom.entity.DragonEntity;
import com.saffy.saffys_dragons.item.ModItemGroups;
import com.saffy.saffys_dragons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaffysDragons implements ModInitializer {
	public static final String MOD_ID = "saffys-dragons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final RegistryKey<EntityType<?>> DRAGON_ENTITY_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of("saffys-dragons", "dragon_entity"));

    public static final EntityType<DragonEntity> DRAGON_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("saffys-dragons", "dragon_entity"),
            EntityType.Builder.create(DragonEntity::new, SpawnGroup.CREATURE).dimensions(5, 5).build(DRAGON_ENTITY_KEY));

	@Override
	public void onInitialize() {
		LOGGER.info("Let there be dragons...");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModEntities.registerModEntities();
        ModItemGroups.registerItemGroups();

	}
}