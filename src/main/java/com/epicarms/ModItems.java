package com.epicarms;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicArms.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicArms.MODID);

    // SwordItem(tier, damage, attackSpeedModifier, properties); damage shown in-game = value + 1
    public static final RegistryObject<Item> DRAGON_FANG_GREATSWORD = weapon("dragon_fang_greatsword", 10, -3.0F);
    public static final RegistryObject<Item> SHADOW_TACHI = weapon("shadow_tachi", 7, -2.4F);
    public static final RegistryObject<Item> STORM_LANCE = weapon("storm_lance", 8, -2.8F);
    public static final RegistryObject<Item> CRIMSON_KATANA = weapon("crimson_katana", 6, -2.0F);
    public static final RegistryObject<Item> TITAN_KNUCKLES = weapon("titan_knuckles", 5, -1.0F);
    public static final RegistryObject<Item> BLAZING_GAUNTLETS = weapon("blazing_gauntlets", 6, -1.2F);

    private static RegistryObject<Item> weapon(String name, int damage, float speed) {
        return ITEMS.register(name, () ->
                new SwordItem(ArmsTier.EPIC, damage, speed, new Item.Properties().fireResistant()));
    }

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("epic_arms", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.epicarms"))
                    .icon(() -> new ItemStack(DRAGON_FANG_GREATSWORD.get()))
                    .displayItems((params, out) -> ITEMS.getEntries().forEach(i -> out.accept(i.get())))
                    .build());
}
