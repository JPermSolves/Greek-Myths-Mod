package net.theelementguy.greekmyths.item;

import main.java.net.theelementguy.greekmyths.GreekMythsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GreekMythsMod.MOD_ID);

    public static final RegistryObject<Item> CELESTIAL_BRONZE_INGOT = ITEMS.register("celestial_bronze_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> IMPERIAL_GOLD_INGOT = ITEMS.register("imperial_gold_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> STYGIAN_IRON_INGOT = ITEMS.register("stygian_iron_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}