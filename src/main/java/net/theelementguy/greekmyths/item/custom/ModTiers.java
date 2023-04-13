package main.java.net.theelementguy.greekmyths.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.theelementguy.greekmyths.item.ModItems;

public class ModTiers {
    public static final ForgeTier CELESTIAL_BRONZE = new ForgeTier(2, 1400, 6, -1, 20, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.CELESTIAL_BRONZE_INGOT.get()));
}
