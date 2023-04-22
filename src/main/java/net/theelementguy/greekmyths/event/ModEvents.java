package main.java.net.theelementguy.greekmyths.event;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.theelementguy.greekmyths.item.ModItems;
import main.java.net.theelementguy.greekmyths.GreekMythsMod;
import main.java.net.theelementguy.greekmyths.util.ModTags;
import net.minecraft.client.multiplayer.chat.LoggedChatMessage.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingVisibilityEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = GreekMythsMod.MOD_ID)
    public class ForgeEvents {
        @SubscribeEvent
        public static void onPlayerAttackEntity(AttackEntityEvent event) {
            ItemStack item = event.getEntity().getItemInHand(InteractionHand.MAIN_HAND);
            if (item.is(ModTags.Items.MONSTER_HUNTING_SWORD_ITEM) && !(event.getTarget() instanceof Enemy)) {
                //event.getEntity().sendSystemMessage(Component.literal("Something should be happening, but alas."));
                event.setCanceled(true);
            }
        }
    }
}
