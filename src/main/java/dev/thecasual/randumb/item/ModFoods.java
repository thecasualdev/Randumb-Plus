package dev.thecasual.randumb.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties WEEBIX = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).alwaysEdible().build();
    public static final FoodProperties BOWL_OF_WEEBIX = new FoodProperties.Builder().nutrition(5).saturationModifier(10.0F).alwaysEdible().build();
}
