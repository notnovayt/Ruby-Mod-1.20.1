package net.surya.rubymod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.item.ModItems;
import net.surya.rubymod.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.TOMATO, 7),
                            7, 5, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.TOMATO_SEEDS, 1),
                            2, 7, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GOLD_INGOT, 16),
                            new ItemStack(Items.DIAMOND, 12),
                            new ItemStack(ModItems.CORN_SEEDS, 1),
                            2, 7, 0.075f));
                });


        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 32),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.BANE_OF_ARTHROPODS, 2)),
                            3, 12, 0.075f));
                });


        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            1, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY, 5),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1),
                            6, 12, 0.075f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CORN, 12),
                            new ItemStack(ModBlocks.SOUND_BLOCK, 1),
                            2, 12, 0.075f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.RUBY, 1),
                            2, 7, 0.075f));
                });

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RAW_RUBY, 1),
                            new ItemStack(ModItems.COAL_BRIQUETTE, 1),
                            3, 12, 0.075f));
                });
    }
}