package net.surya.rubymod.compat;

import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.surya.rubymod.RubyMod;
import net.surya.rubymod.block.ModBlocks;
import me.shedaniel.math.Rectangle;

import java.awt.Point;
import java.util.List;
import java.util.LinkedList;

public class GemPolishingCategory implements DisplayCategory<BasicDisplay> {
    public static final Identifier TEXTURE =
            new Identifier(RubyMod.MOD_ID, "textures/gui/gem_polishing_station_gui.png");
    public static final CategoryIdentifier<GemPolishingDisplay> GEM_POLISHING =
            CategoryIdentifier.of(RubyMod.MOD_ID, "gem_polishing");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return GEM_POLISHING;
    }

    @Override
    public Text getTitle() {
        return Text.literal("Gem Polishing Station");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.GEM_POLISHING_STATION.asItem().getDefaultStack());
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new me.shedaniel.math.Point(startPoint.x + 80, startPoint.y + 11))
                .entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new me.shedaniel.math.Point(startPoint.x + 80, startPoint.y + 59))
                .markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }
}
