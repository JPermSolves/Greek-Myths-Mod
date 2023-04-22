package main.java.net.theelementguy.greekmyths.item.custom;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.functions.SetNameFunction;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class MonsterHuntingSwordItem extends SwordItem {

    public MonsterHuntingSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        
        //TODO Auto-generated constructor stub
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, Level p_41422_, List<Component> components, TooltipFlag p_41424_) {
        // TODO Auto-generated method stub

        components.add(Component.literal("This sword feels ancient. Looking down at the gleaming blade you know this sword with fight like no other. However, it does not hurt anything other than monster.").withStyle(ChatFormatting.DARK_AQUA).withStyle(ChatFormatting.BOLD));

        super.appendHoverText(p_41421_, p_41422_, components, p_41424_);
    }

    public boolean isMonsterHuntingSwordItem() {
        return true;
    }

}
