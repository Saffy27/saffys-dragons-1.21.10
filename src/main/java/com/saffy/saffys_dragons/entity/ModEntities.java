package com.saffy.saffys_dragons.entity;

import com.saffy.saffys_dragons.SaffysDragons;
import com.saffy.saffys_dragons.entity.custom.entity.DragonEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEntities {

    // Example Entity registration
    public static final EntityType<DragonEntity> TestDragon = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(SaffysDragons.MOD_ID, "test_dragon"),
            EntityType.Builder.create(DragonEntity::new, SpawnGroup.CREATURE)
                    .dimensions(30f, 10f)
                    .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(),
                            Identifier.of(SaffysDragons.MOD_ID, "test_dragon"))));

    public static void registerModEntities()
    {
        SaffysDragons.LOGGER.info("Registering Mod Entities");
    }
}
