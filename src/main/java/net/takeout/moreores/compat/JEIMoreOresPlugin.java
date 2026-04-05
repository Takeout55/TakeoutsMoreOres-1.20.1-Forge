package net.takeout.moreores.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.recipe.RefineryRecipe;
import net.takeout.moreores.screen.RefineryScreen;

import java.util.List;

@JeiPlugin
public class JEIMoreOresPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MoreOres.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new RefineryCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<RefineryRecipe> refineryRecipes = recipeManager.getAllRecipesFor(RefineryRecipe.Type.INSTANCE);
        registration.addRecipes(RefineryCategory.REFINERY_TYPE, refineryRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RefineryScreen.class, 60, 30, 20,30,
                RefineryCategory.REFINERY_TYPE);
    }
}
