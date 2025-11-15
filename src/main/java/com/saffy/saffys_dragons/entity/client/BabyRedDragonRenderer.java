package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.BabyRedDragonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class BabyRedDragonRenderer<R extends EntityRenderState & GeoRenderState> extends GeoEntityRenderer<BabyRedDragonEntity, R> {

    public BabyRedDragonRenderer(EntityRendererFactory.Context context) {
        super(context, new BabyRedDragonModel());
    }
}
