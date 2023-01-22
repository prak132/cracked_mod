package net.prak.crackedmod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class DiceItem extends Item {
    public DiceItem(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            // inside ayo
            outputRandomNumber(user);
            // cool-down
            user.getItemCooldownManager().set(this, 30);
        }

        return super.use(world, user, hand);
    }
    private void outputRandomNumber(PlayerEntity player) {
        player.sendMessage(Text.literal("You rolled a " + getRandomNumber()));
    }

    private  int getRandomNumber() {
        return Random.createLocal().nextInt(6);
    }
}
