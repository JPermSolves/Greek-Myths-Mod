package main.java.net.theelementguy.greekmyths.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MonsterHuntingSwordItem extends SwordItem {

    public MonsterHuntingSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean hurtEnemy(ItemStack item, LivingEntity hitEntity, LivingEntity hittingEntity) {
        hittingEntity.sendSystemMessage(Component.literal("This method is running."));

        if (hitEntity instanceof Enemy) {
            hitEntity.hurt(DamageSource.GENERIC, 25f);
            hittingEntity.sendSystemMessage(Component.literal("You hit an enemy!"));
        }

        return super.hurtEnemy(item, hitEntity, hittingEntity);
    }
    
}
