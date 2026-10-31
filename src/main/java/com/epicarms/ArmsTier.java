package com.epicarms;

import java.util.function.Supplier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ArmsTier implements Tier {
    EPIC(3500, 8.0F, 0.0F, 3, 22, () -> Ingredient.of(Items.NETHERITE_INGOT));

    private final int uses;
    private final float speed;
    private final float damage;
    private final int level;
    private final int enchant;
    private final Supplier<Ingredient> repair;

    ArmsTier(int uses, float speed, float damage, int level, int enchant, Supplier<Ingredient> repair) {
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
        this.enchant = enchant;
        this.repair = repair;
    }

    @Override public int getUses() { return uses; }
    @Override public float getSpeed() { return speed; }
    @Override public float getAttackDamageBonus() { return damage; }
    @Override public int getLevel() { return level; }
    @Override public int getEnchantmentValue() { return enchant; }
    @Override public Ingredient getRepairIngredient() { return repair.get(); }
}
