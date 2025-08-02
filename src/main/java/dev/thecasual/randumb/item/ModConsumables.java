package dev.thecasual.randumb.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModConsumables {

    public static final Consumable WEETBIX = defaultFood()
            .consumeSeconds(2f)
            .sound(SoundEvents.ITEM_BREAK)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(
                                            MobEffects.BLINDNESS,
                                            1200, 2, false, false, false
                                    ),
                                    new MobEffectInstance(
                                            MobEffects.NAUSEA,
                                            1000, 2, false, false, false
                                    ),
                                    new MobEffectInstance(
                                            MobEffects.INSTANT_DAMAGE,
                                            10, 1,false, false, false
                                    )
                            )
                    )
            )
            .build();

    public static final Consumable BOWL_OF_WEETBIX = defaultFood()
            .consumeSeconds(1.8f)
            .sound(SoundEvents.NOTE_BLOCK_DIDGERIDOO)
            .onConsume(
                    new ApplyStatusEffectsConsumeEffect(
                            List.of(
                                    new MobEffectInstance(
                                            MobEffects.DOLPHINS_GRACE,
                                            3000, 3, false, false, false
                                    ),
                                    new MobEffectInstance(
                                            MobEffects.HEALTH_BOOST,
                                            3000, 4, false, false, false
                                    ),
                                    new MobEffectInstance(
                                            MobEffects.SPEED,
                                            3000, 2, false, false,false
                                    ),
                                    new MobEffectInstance(
                                            MobEffects.JUMP_BOOST,
                                            3000, 4, false, false, false
                                    )
                            )
                    )
            )
            .build();

    // Templates for default food & drink struct
    public static Consumable.Builder defaultFood() {
        return Consumable.builder().consumeSeconds(1.6F).animation(ItemUseAnimation.EAT).sound(SoundEvents.GENERIC_EAT).hasConsumeParticles(true);
    }
    public static Consumable.Builder defaultDrink() {
        return Consumable.builder().consumeSeconds(1.6f).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).hasConsumeParticles(true);
    }
}