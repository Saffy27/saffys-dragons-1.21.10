package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.entity.custom.entity.red_dragon.AncientRedDragonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class AncientRedDragonRenderer<R extends EntityRenderState & GeoRenderState> extends GeoEntityRenderer<AncientRedDragonEntity, R> {

    public AncientRedDragonRenderer(EntityRendererFactory.Context context) {
        super(context, new AncientRedDragonModel());
    }
}
