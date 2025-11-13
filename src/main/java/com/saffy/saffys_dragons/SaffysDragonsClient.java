package com.saffy.saffys_dragons;

import com.saffy.saffys_dragons.entity.ModEntities;
import com.saffy.saffys_dragons.entity.client.TestDragonRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.EntityRendererFactories;

public class SaffysDragonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient()
    {
        EntityRendererFactories.register(ModEntities.TestDragon, TestDragonRenderer::new);
        //EntityRendererRegistry.register(SaffysDragons.DRAGON_ENTITY, TestDragonRenderer::new);
    }
}
