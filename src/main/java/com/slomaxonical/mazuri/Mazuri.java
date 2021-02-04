package com.slomaxonical.mazuri;

import com.slomaxonical.mazuri.registery.ModItems;
import net.fabricmc.api.ModInitializer;

public class Mazuri implements ModInitializer {

    //MOD_ID
    public static final String MOD_ID = "mazuri";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
