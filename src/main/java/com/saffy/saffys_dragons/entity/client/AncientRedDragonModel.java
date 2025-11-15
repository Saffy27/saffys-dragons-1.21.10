package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.SaffysDragons;
import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.AncientRedDragonEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class AncientRedDragonModel extends DefaultedEntityGeoModel<AncientRedDragonEntity> {

    public AncientRedDragonModel() {
        super(Identifier.of(SaffysDragons.MOD_ID, "ancient_red_dragon"));
    }
}