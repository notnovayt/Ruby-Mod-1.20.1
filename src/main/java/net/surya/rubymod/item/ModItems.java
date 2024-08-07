package net.surya.rubymod.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.entity.ModBoats;
import net.surya.rubymod.entity.ModEntities;
import net.surya.rubymod.item.custom.DiceItem;
import net.surya.rubymod.item.custom.MetalDetectorItem;
import net.surya.rubymod.item.custom.ModArmorItem;
import net.surya.rubymod.item.custom.ModFoodComponents;
import net.surya.rubymod.sound.ModSounds;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings()
            .food(ModFoodComponents.TOMATO)));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 3, 1f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings()));

    public static final Item KAIKAIKITAN_MUSIC_DISC = registerItem("kaikaikitan_music_disc",
            new MusicDiscItem(7, ModSounds.KAIKAIKITAN, new FabricItemSettings().maxCount(1), 223));

    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE,0xa86518, 0x3b260f, new FabricItemSettings()));

    public static final Item HAZELNUT_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.HAZELNUT_BOAT_ID,
            ModBoats.HAZELNUT_BOAT_KEY, false);
    public static final Item HAZELNUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.HAZELNUT_CHEST_BOAT_ID,
            ModBoats.HAZELNUT_BOAT_KEY, true);

    public static final Item DICE = registerItem("dice",
            new DiceItem(new FabricItemSettings()));

//    public static final Item HAZELNUT_SIGN = registerItem("hazelnut_sign",
//            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_HAZELNUT_SIGN, ModBlocks.WALL_HAZELNUT_SIGN));
//    public static final Item HANGING_HAZELNUT_SIGN = registerItem("hazelnut_hanging_sign",
//            new HangingSignItem(ModBlocks.HANGING_HAZELNUT_SIGN, ModBlocks.WALL_HANGING_HAZELNUT_SIGN, new FabricItemSettings().maxCount(16)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RubyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyMod.LOGGER.info("Registering Mod Items for " + RubyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
