package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.SaffysDragons;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.BabyRedDragonEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class BabyRedDragonModel extends DefaultedEntityGeoModel<BabyRedDragonEntity> {

    public BabyRedDragonModel() {
        super(Identifier.of(SaffysDragons.MOD_ID, "baby_red_dragon"));
    }
}