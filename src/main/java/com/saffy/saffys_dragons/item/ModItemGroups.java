package com.saffy.saffys_dragons.item;

import com.saffy.saffys_dragons.SaffysDragons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SAFFYS_DRAGONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SaffysDragons.MOD_ID, "saffys_dragons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.DRAGON_HEAD))
                    .displayName(Text.translatable("itemgroup.saffys-dragons.saffys_dragons"))
                    .entries((displayContext, entries) -> {
                        // Example from Arcanum Unleashed
                        //entries.add(ModItems.WIZARD_SPELLBOOK);
                        //entries.add(ModItems.WIZARD_WAND);
                        //entries.add(ModBlocks.SORCERERS_ALTAR);
                    }).build());

    public static void registerItemGroups()
    {
        SaffysDragons.LOGGER.info("Registering Item Groups for " + SaffysDragons.MOD_ID);
    }
}
