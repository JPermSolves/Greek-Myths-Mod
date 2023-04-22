package main.java.net.theelementguy.greekmyths.world.feature;

import java.util.List;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import main.java.net.theelementguy.greekmyths.GreekMythsMod;
import main.java.net.theelementguy.greekmyths.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.data.worldgen.features.OreFeatures;
import com.google.common.base.Suppliers;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GreekMythsMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_CELESTIAL_BRONZE_ORES = Suppliers.memoize(() -> List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.CELESTIAL_BRONZE_DEEPSLATE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CELESTIAL_BRONZE_ORE = CONFIGURED_FEATURES.register("celestial_bronze", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_CELESTIAL_BRONZE_ORES.get(), 5)));
    //Vein size

    public static void register(IEventBus eventbus) {
        CONFIGURED_FEATURES.register(eventbus);
    }
}
