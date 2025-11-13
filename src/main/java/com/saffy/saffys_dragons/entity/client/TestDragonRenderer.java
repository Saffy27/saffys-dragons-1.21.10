package com.saffy.saffys_dragons.entity.client;

import com.saffy.saffys_dragons.entity.custom.entity.DragonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.state.EntityRenderState;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class TestDragonRenderer<R extends EntityRenderState & GeoRenderState> extends GeoEntityRenderer<DragonEntity, R> {


    public TestDragonRenderer(EntityRendererFactory.Context context) {
        super(context, new TestDragonModel());
    }
}
