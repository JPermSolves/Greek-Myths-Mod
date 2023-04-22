package main.java.net.theelementguy.greekmyths.util;

import main.java.net.theelementguy.greekmyths.GreekMythsMod;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> MONSTER_HUNTING_SWORD_ITEM = tag("monster_hunting_sword_item");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(GreekMythsMod.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
