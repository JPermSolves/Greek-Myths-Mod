package main.java.net.theelementguy.greekmyths.item.custom;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class CelestialBronzeSword extends MonsterHuntingSwordItem {

    public CelestialBronzeSword(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void appendHoverText(ItemStack p_41421_, Level p_41422_, List<Component> components, TooltipFlag p_41424_) {

        components.add(Component.literal("This sword once belonged to §kPerseus§r. It's history stretches to Greek times. While the sword does heavy damage, beware; it won't hurt anything less than pure monster.").withStyle(ChatFormatting.AQUA));

        super.appendHoverText(p_41421_, p_41422_, components, p_41424_);
    }
}
