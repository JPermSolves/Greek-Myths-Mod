package main.java.net.theelementguy.greekmyths;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import main.java.net.theelementguy.greekmyths.block.ModBlocks;
import main.java.net.theelementguy.greekmyths.world.feature.ModConfiguredFeatures;
import main.java.net.theelementguy.greekmyths.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.theelementguy.greekmyths.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GreekMythsMod.MOD_ID)
public class GreekMythsMod {
    public static final String MOD_ID = "greekmyths";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GreekMythsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);

        ModPlacedFeatures.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            
        }
        
    }
}
