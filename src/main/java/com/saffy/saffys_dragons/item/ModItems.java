package com.saffy.saffys_dragons.item;

import com.saffy.saffys_dragons.SaffysDragons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(SaffysDragons.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        SaffysDragons.LOGGER.info(SaffysDragons.MOD_ID + " Mod Items registered.");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            // Example Items from Arcanum Unleashed
            //fabricItemGroupEntries.add(WIZARD_WAND);
            //fabricItemGroupEntries.add(WIZARD_SPELLBOOK);
        });
    }
}
