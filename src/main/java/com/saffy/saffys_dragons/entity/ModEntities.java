package com.saffy.saffys_dragons.entity;

import com.saffy.saffys_dragons.SaffysDragons;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.AncientRedDragonEntity;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.BabyRedDragonEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEntities {

    // Example Entity registration
    public static final EntityType<AncientRedDragonEntity> AncientRedDragon = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(SaffysDragons.MOD_ID, "ancient_red_dragon"),
            EntityType.Builder.create(AncientRedDragonEntity::new, SpawnGroup.CREATURE)
                    .dimensions(30f, 10f)
                    .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(),
                            Identifier.of(SaffysDragons.MOD_ID, "ancient_red_dragon"))));

    public static final EntityType<BabyRedDragonEntity> BabyRedDragon = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(SaffysDragons.MOD_ID, "baby_red_dragon"),
            EntityType.Builder.create(BabyRedDragonEntity::new, SpawnGroup.CREATURE)
                    .dimensions(2f,2f)
                    .build(RegistryKey.of(Registries.ENTITY_TYPE.getKey(),
                            Identifier.of(SaffysDragons.MOD_ID, "baby_red_dragon"))));

    public static void registerModEntities()
    {
        SaffysDragons.LOGGER.info("Registering Mod Entities");
    }
}
