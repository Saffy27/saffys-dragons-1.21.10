package com.saffy.saffys_dragons.entity.custom.entity.red_dragon;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.manager.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class AncientRedDragonEntity extends HostileEntity implements GeoEntity {

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

    public AncientRedDragonEntity(EntityType<? extends HostileEntity> type, World world) {
        super(type, world);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    public static DefaultAttributeContainer.Builder createAttributes()
    {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 1024)
                .add(EntityAttributes.ARMOR, 40)
                .add(EntityAttributes.ARMOR_TOUGHNESS, 20)
                .add(EntityAttributes.FLYING_SPEED, 0.5)
                .add(EntityAttributes.ATTACK_DAMAGE, 50)
                .add(EntityAttributes.ATTACK_SPEED, 0.25)
                .add(EntityAttributes.ATTACK_KNOCKBACK, 2)
                .add(EntityAttributes.SWEEPING_DAMAGE_RATIO, 0.9)
                .add(EntityAttributes.KNOCKBACK_RESISTANCE, 1)
                .add(EntityAttributes.EXPLOSION_KNOCKBACK_RESISTANCE, .9)
                .add(EntityAttributes.FOLLOW_RANGE, 100)
                .add(EntityAttributes.MOVEMENT_EFFICIENCY, 0.9)
                .add(EntityAttributes.WATER_MOVEMENT_EFFICIENCY, 0.7)
                .add(EntityAttributes.STEP_HEIGHT, 5);
    }
}
