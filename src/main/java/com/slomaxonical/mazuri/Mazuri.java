package com.slomaxonical.mazuri;

import com.slomaxonical.mazuri.registery.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Mazuri implements ModInitializer {

    //MOD_ID
    public static final String MOD_ID = "mazuri";
    public static final ItemGroup MAZURI_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "mazuri_group"),
            () -> new ItemStack(ModItems.COIN_TWENTY)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
