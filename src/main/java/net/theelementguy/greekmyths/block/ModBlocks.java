package main.java.net.theelementguy.greekmyths.block;

import java.util.function.Supplier;

import com.mojang.blaze3d.shaders.Uniform;

import main.java.net.theelementguy.greekmyths.GreekMythsMod;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.theelementguy.greekmyths.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GreekMythsMod.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static final RegistryObject<Block> CELESTIAL_BRONZE_BLOCK = registerBlock("celestial_bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CELESTIAL_BRONZE_DEEPSLATE_ORE = registerBlock("celestial_bronze_deepslate_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(6f), UniformInt.of(5, 10)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}