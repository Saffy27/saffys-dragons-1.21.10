package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.SaffysDragons;
import com.saffy.saffys_dragons.entity.custom.entity.DragonEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class TestDragonModel extends DefaultedEntityGeoModel<DragonEntity> {

    public TestDragonModel() {
        super(Identifier.of(SaffysDragons.MOD_ID, "test_dragon"));
    }
}
