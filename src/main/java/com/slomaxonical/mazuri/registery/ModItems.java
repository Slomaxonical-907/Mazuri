package com.slomaxonical.mazuri.registery;

import com.slomaxonical.mazuri.Mazuri;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
        //chunks
    public static final Item IRON_CHUNKS = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item GOLD_CHUNKS = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item DIAMOND_CHUNKS = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
        //coins
    public static final Item COIN_ONE = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item COIN_FIVE = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item COIN_TWENTY = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item COIN_HUNDRED = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));
    public static final Item COIN_THOUSAND = new Item(new Item.Settings().group(Mazuri.MAZURI_GROUP));


    //RegisterItems
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "coin_1"), COIN_ONE );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "coin_5"), COIN_FIVE );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "coin_20"), COIN_TWENTY );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "coin_100"), COIN_HUNDRED );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "coin_1000"), COIN_THOUSAND );

        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "iron_chunk"), IRON_CHUNKS );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "gold_chunk"), GOLD_CHUNKS );
        Registry.register(Registry.ITEM, new Identifier(Mazuri.MOD_ID, "diamond_chunk"), DIAMOND_CHUNKS );


    }
}
