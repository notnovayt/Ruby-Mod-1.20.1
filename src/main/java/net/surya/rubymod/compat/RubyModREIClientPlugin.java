package net.surya.rubymod.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.surya.rubymod.block.ModBlocks;
import net.surya.rubymod.recipe.GemPolishingRecipe;
import net.surya.rubymod.screen.GemPolishingScreen;

public class RubyModREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new GemPolishingCategory());

        registry.addWorkstations(GemPolishingCategory.GEM_POLISHING, EntryStacks.of(ModBlocks.GEM_POLISHING_STATION));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(GemPolishingRecipe.class, GemPolishingRecipe.Type.INSTANCE,
                GemPolishingDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), GemPolishingScreen.class,
                GemPolishingCategory.GEM_POLISHING);
    }
}
