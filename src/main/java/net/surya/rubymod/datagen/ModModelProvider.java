package net.surya.rubymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.block.custom.CornCropBlock;
import net.surya.rubymod.block.custom.TomatoCropBlock;
import net.surya.rubymod.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ruby_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        ruby_pool.stairs(ModBlocks.RUBY_STAIRS);
        ruby_pool.wall(ModBlocks.RUBY_WALL);
        ruby_pool.fence(ModBlocks.RUBY_FENCE);
        ruby_pool.fenceGate(ModBlocks.RUBY_FENCE_GATE);
        ruby_pool.slab(ModBlocks.RUBY_SLAB);
        ruby_pool.button(ModBlocks.RUBY_BUTTON);
        ruby_pool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.RUBY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);

        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE,
                0, 1, 2, 3, 4, 5, 6, 7, 8);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA, ModBlocks.POTTED_DAHLIA,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleState(ModBlocks.GEM_POLISHING_STATION);

        blockStateModelGenerator.registerLog(ModBlocks.HAZELNUT_LOG).log(ModBlocks.HAZELNUT_LOG).wood(ModBlocks.HAZELNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_HAZELNUT_LOG).log(ModBlocks.STRIPPED_HAZELNUT_LOG).wood(ModBlocks.STRIPPED_HAZELNUT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HAZELNUT_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HAZELNUT_PLANKS);
        blockStateModelGenerator.registerTintableCross(ModBlocks.HAZELNUT_SAPLING, BlockStateModelGenerator.TintType.TINTED);

//        BlockStateModelGenerator.BlockTexturePool hazelnut_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HAZELNUT_PLANKS);
//        hazelnut_pool.family(ModBlocks.HAZELNUT_FAMILY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.COAL_BRIQUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);

        itemModelGenerator.register(ModItems.KAIKAIKITAN_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.PORCUPINE_SPAWN_EGG, new Model(
                Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

        itemModelGenerator.register(ModItems.HAZELNUT_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAZELNUT_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.DICE, Models.GENERATED);

//      itemModelGenerator.register(ModItems.HANGING_HAZELNUT_SIGN, Models.GENERATED);
    }
}
