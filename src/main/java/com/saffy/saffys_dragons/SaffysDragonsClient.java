package com.saffy.saffys_dragons;

import com.saffy.saffys_dragons.entity.ModEntities;
import com.saffy.saffys_dragons.entity.client.BabyRedDragonRenderer;
import com.saffy.saffys_dragons.entity.client.AncientRedDragonRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.EntityRendererFactories;

public class SaffysDragonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient()
    {
        EntityRendererFactories.register(ModEntities.AncientRedDragon, AncientRedDragonRenderer::new);
        EntityRendererFactories.register(ModEntities.BabyRedDragon, BabyRedDragonRenderer::new);
    }
}
