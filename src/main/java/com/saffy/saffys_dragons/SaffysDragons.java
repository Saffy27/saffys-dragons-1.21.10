package com.saffy.saffys_dragons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaffysDragons implements ModInitializer {
	public static final String MOD_ID = "saffys-dragons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Let there be dragons...");
	}
}