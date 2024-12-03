package net.shieldprojects.shieldextracontent.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.shieldprojects.shieldextracontent.blocks.ModBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        oakRecipe(recipeOutput);
        spruceRecipe(recipeOutput);
        birchRecipe(recipeOutput);
        jungleRecipe(recipeOutput);
        acaciaRecipe(recipeOutput);
        darkOakRecipe(recipeOutput);
        mangroveRecipe(recipeOutput);
        cherryRecipe(recipeOutput);
        warpedRecipe(recipeOutput);
        crimsonRecipe(recipeOutput);

        whiteConcreteRecipe(recipeOutput);
        lightGrayConcreteRecipe(recipeOutput);
        grayConcreteRecipe(recipeOutput);
        blackConcreteRecipe(recipeOutput);
        brownConcreteRecipe(recipeOutput);
        redConcreteRecipe(recipeOutput);
        orangeConcreteRecipe(recipeOutput);
        yellowConcreteRecipe(recipeOutput);
        limeConcreteRecipe(recipeOutput);
        greenConcreteRecipe(recipeOutput);
        cyanConcreteRecipe(recipeOutput);
        lightBlueConcreteRecipe(recipeOutput);
        blueConcreteRecipe(recipeOutput);
        purpleConcreteRecipe(recipeOutput);
        magentaConcreteRecipe(recipeOutput);
        pinkConcreteRecipe(recipeOutput);
    }

    private void oakRecipe(@NotNull RecipeOutput recipeOutput) {
        // Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_STAIRS, 4)
                .define('X', Items.OAK_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_STAIRS, 4)
                .define('X', Items.OAK_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_oak_log", has(Items.OAK_LOG))
                .save(recipeOutput, "recipe_oak_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_OAK_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .save(recipeOutput, "recipe_oak_stripped_log_stairs");

        // Slabs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_SLAB, 6)
                .define('X', Items.OAK_WOOD)
                .pattern("XXX")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_SLAB, 6)
                .define('X', Items.OAK_LOG)
                .pattern("XXX")
                .unlockedBy("has_oak_log", has(Items.OAK_LOG))
                .save(recipeOutput, "recipe_oak_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_OAK_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .save(recipeOutput, "recipe_oak_stripped_log_slab");

        // Pressure Plate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.OAK_WOOD)
                .pattern("XX")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.OAK_LOG)
                .pattern("XX")
                .unlockedBy("has_oak_log", has(Items.OAK_LOG))
                .save(recipeOutput, "recipe_oak_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_OAK_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .save(recipeOutput, "recipe_oak_stripped_log_pressure_plate");

        // Button
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_BUTTON, 1)
                .requires(Items.OAK_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_OAK_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_BUTTON, 1)
                .requires(Items.OAK_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_oak_log", has(Items.OAK_LOG))
                .save(recipeOutput, "recipe_oak_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_OAK_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_oak_log", has(Items.STRIPPED_OAK_LOG))
                .save(recipeOutput, "recipe_oak_stripped_log_button");

        // Fence
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_FENCE, 3)
                .define('X', Items.OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_fence");

        // Fence Gate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_FENCE_GATE, 1)
                .define('X', Items.OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_fence_gate");

        // Wall
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANK_WALL, 6)
                .define('X', Items.OAK_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_oak_wood", has(Items.OAK_WOOD))
                .save(recipeOutput, "recipe_oak_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_WOOD_WALL, 6)
                .define('X', Items.OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_oak_wood", has(Items.STRIPPED_OAK_WOOD))
                .save(recipeOutput, "recipe_oak_stripped_wood_wall");
    }

    private void spruceRecipe(@NotNull RecipeOutput recipeOutput) {
        // Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_STAIRS, 4)
                .define('X', Items.SPRUCE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_STAIRS, 4)
                .define('X', Items.SPRUCE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_spruce_log", has(Items.SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_SPRUCE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_spruce_log", has(Items.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_stripped_log_stairs");

        // Slabs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_SLAB, 6)
                .define('X', Items.SPRUCE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_SLAB, 6)
                .define('X', Items.SPRUCE_LOG)
                .pattern("XXX")
                .unlockedBy("has_spruce_log", has(Items.SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_SPRUCE_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_spruce_log", has(Items.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_stripped_log_slab");

        // Pressure Plate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.SPRUCE_WOOD)
                .pattern("XX")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.SPRUCE_LOG)
                .pattern("XX")
                .unlockedBy("has_spruce_log", has(Items.SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_SPRUCE_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_spruce_log", has(Items.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_stripped_log_pressure_plate");

        // Button
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_BUTTON, 1)
                .requires(Items.SPRUCE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_SPRUCE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_BUTTON, 1)
                .requires(Items.SPRUCE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_spruce_log", has(Items.SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_SPRUCE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_spruce_log", has(Items.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput, "recipe_spruce_stripped_log_button");

        // Fence
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_FENCE, 3)
                .define('X', Items.SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_fence");

        // Fence Gate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_FENCE_GATE, 1)
                .define('X', Items.SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_fence_gate");

        // Wall
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANK_WALL, 6)
                .define('X', Items.SPRUCE_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput, "recipe_spruce_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_WOOD_WALL, 6)
                .define('X', Items.SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_spruce_wood", has(Items.SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_SPRUCE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_spruce_wood", has(Items.STRIPPED_SPRUCE_WOOD))
                .save(recipeOutput, "recipe_spruce_stripped_wood_wall");
    }

    private void birchRecipe(@NotNull RecipeOutput recipeOutput) {
        // Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_STAIRS, 4)
                .define('X', Items.BIRCH_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_STAIRS, 4)
                .define('X', Items.BIRCH_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_birch_log", has(Items.BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_BIRCH_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_birch_log", has(Items.STRIPPED_BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_stripped_log_stairs");

        // Slabs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_SLAB, 6)
                .define('X', Items.BIRCH_WOOD)
                .pattern("XXX")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_SLAB, 6)
                .define('X', Items.BIRCH_LOG)
                .pattern("XXX")
                .unlockedBy("has_birch_log", has(Items.BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_BIRCH_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_birch_log", has(Items.STRIPPED_BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_stripped_log_slab");

        // Pressure Plate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.BIRCH_WOOD)
                .pattern("XX")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.BIRCH_LOG)
                .pattern("XX")
                .unlockedBy("has_birch_log", has(Items.BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_BIRCH_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_birch_log", has(Items.STRIPPED_BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_stripped_log_pressure_plate");

        // Button
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_BUTTON, 1)
                .requires(Items.BIRCH_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_BIRCH_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_BUTTON, 1)
                .requires(Items.BIRCH_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_birch_log", has(Items.BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_BIRCH_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_birch_log", has(Items.STRIPPED_BIRCH_LOG))
                .save(recipeOutput, "recipe_birch_stripped_log_button");

        // Fence
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_FENCE, 3)
                .define('X', Items.BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_fence");

        // Fence Gate
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_FENCE_GATE, 1)
                .define('X', Items.BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_fence_gate");

        // Wall
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANK_WALL, 6)
                .define('X', Items.BIRCH_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput, "recipe_birch_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_WOOD_WALL, 6)
                .define('X', Items.BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_birch_wood", has(Items.BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_BIRCH_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_birch_wood", has(Items.STRIPPED_BIRCH_WOOD))
                .save(recipeOutput, "recipe_birch_stripped_wood_wall");
    }

    private void jungleRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_STAIRS, 4)
                .define('X', Items.JUNGLE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_STAIRS, 4)
                .define('X', Items.JUNGLE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_jungle_log", has(Items.JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_JUNGLE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_jungle_log", has(Items.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_stripped_log_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_SLAB, 6)
                .define('X', Items.JUNGLE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_SLAB, 6)
                .define('X', Items.JUNGLE_LOG)
                .pattern("XXX")
                .unlockedBy("has_jungle_log", has(Items.JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_JUNGLE_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_jungle_log", has(Items.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_stripped_log_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.JUNGLE_WOOD)
                .pattern("XX")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.JUNGLE_LOG)
                .pattern("XX")
                .unlockedBy("has_jungle_log", has(Items.JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_JUNGLE_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_jungle_log", has(Items.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_stripped_log_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_BUTTON, 1)
                .requires(Items.JUNGLE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_JUNGLE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_BUTTON, 1)
                .requires(Items.JUNGLE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_jungle_log", has(Items.JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_JUNGLE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_jungle_log", has(Items.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput, "recipe_jungle_stripped_log_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_FENCE, 3)
                .define('X', Items.JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_FENCE_GATE, 1)
                .define('X', Items.JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANK_WALL, 6)
                .define('X', Items.JUNGLE_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput, "recipe_jungle_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_WOOD_WALL, 6)
                .define('X', Items.JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_jungle_wood", has(Items.JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_JUNGLE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_jungle_wood", has(Items.STRIPPED_JUNGLE_WOOD))
                .save(recipeOutput, "recipe_jungle_stripped_wood_wall");
    }

    private void acaciaRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_STAIRS, 4)
                .define('X', Items.ACACIA_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_STAIRS, 4)
                .define('X', Items.ACACIA_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_acacia_log", has(Items.ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_ACACIA_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_acacia_log", has(Items.STRIPPED_ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_stripped_log_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_SLAB, 6)
                .define('X', Items.ACACIA_WOOD)
                .pattern("XXX")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_SLAB, 6)
                .define('X', Items.ACACIA_LOG)
                .pattern("XXX")
                .unlockedBy("has_acacia_log", has(Items.ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_ACACIA_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_acacia_log", has(Items.STRIPPED_ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_stripped_log_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.ACACIA_WOOD)
                .pattern("XX")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.ACACIA_LOG)
                .pattern("XX")
                .unlockedBy("has_acacia_log", has(Items.ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_ACACIA_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_acacia_log", has(Items.STRIPPED_ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_stripped_log_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_BUTTON, 1)
                .requires(Items.ACACIA_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_ACACIA_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_BUTTON, 1)
                .requires(Items.ACACIA_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_acacia_log", has(Items.ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_ACACIA_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_acacia_log", has(Items.STRIPPED_ACACIA_LOG))
                .save(recipeOutput, "recipe_acacia_stripped_log_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_FENCE, 3)
                .define('X', Items.ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_FENCE_GATE, 1)
                .define('X', Items.ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANK_WALL, 6)
                .define('X', Items.ACACIA_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_acacia_plank", has(Items.ACACIA_PLANKS))
                .save(recipeOutput, "recipe_acacia_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_WOOD_WALL, 6)
                .define('X', Items.ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_acacia_wood", has(Items.ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_ACACIA_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_acacia_wood", has(Items.STRIPPED_ACACIA_WOOD))
                .save(recipeOutput, "recipe_acacia_stripped_wood_wall");
    }

    private void darkOakRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_STAIRS, 4)
                .define('X', Items.DARK_OAK_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_STAIRS, 4)
                .define('X', Items.DARK_OAK_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_dark_oak_log", has(Items.DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_DARK_OAK_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_dark_oak_log", has(Items.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_stripped_log_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_SLAB, 6)
                .define('X', Items.DARK_OAK_WOOD)
                .pattern("XXX")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_SLAB, 6)
                .define('X', Items.DARK_OAK_LOG)
                .pattern("XXX")
                .unlockedBy("has_dark_oak_log", has(Items.DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_DARK_OAK_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_dark_oak_log", has(Items.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_stripped_log_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.DARK_OAK_WOOD)
                .pattern("XX")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.DARK_OAK_LOG)
                .pattern("XX")
                .unlockedBy("has_dark_oak_log", has(Items.DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_DARK_OAK_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_dark_oak_log", has(Items.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_stripped_log_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_BUTTON, 1)
                .requires(Items.DARK_OAK_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_DARK_OAK_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_BUTTON, 1)
                .requires(Items.DARK_OAK_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_dark_oak_log", has(Items.DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_DARK_OAK_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_dark_oak_log", has(Items.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput, "recipe_dark_oak_stripped_log_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_FENCE, 3)
                .define('X', Items.DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_FENCE_GATE, 1)
                .define('X', Items.DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANK_WALL, 6)
                .define('X', Items.DARK_OAK_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_dark_oak_plank", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput, "recipe_dark_oak_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_WOOD_WALL, 6)
                .define('X', Items.DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_dark_oak_wood", has(Items.DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_DARK_OAK_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_dark_oak_wood", has(Items.STRIPPED_DARK_OAK_WOOD))
                .save(recipeOutput, "recipe_dark_oak_stripped_wood_wall");
    }

    private void mangroveRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_STAIRS, 4)
                .define('X', Items.MANGROVE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_STAIRS, 4)
                .define('X', Items.MANGROVE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_mangrove_log", has(Items.MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_MANGROVE_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_mangrove_log", has(Items.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_stripped_log_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_SLAB, 6)
                .define('X', Items.MANGROVE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_SLAB, 6)
                .define('X', Items.MANGROVE_LOG)
                .pattern("XXX")
                .unlockedBy("has_mangrove_log", has(Items.MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_MANGROVE_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_mangrove_log", has(Items.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_stripped_log_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.MANGROVE_WOOD)
                .pattern("XX")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.MANGROVE_LOG)
                .pattern("XX")
                .unlockedBy("has_mangrove_log", has(Items.MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_MANGROVE_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_mangrove_log", has(Items.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_stripped_log_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_BUTTON, 1)
                .requires(Items.MANGROVE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_MANGROVE_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_BUTTON, 1)
                .requires(Items.MANGROVE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_mangrove_log", has(Items.MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_MANGROVE_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_mangrove_log", has(Items.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput, "recipe_mangrove_stripped_log_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_FENCE, 3)
                .define('X', Items.MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_FENCE_GATE, 1)
                .define('X', Items.MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANK_WALL, 6)
                .define('X', Items.MANGROVE_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_mangrove_plank", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput, "recipe_mangrove_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_WOOD_WALL, 6)
                .define('X', Items.MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_mangrove_wood", has(Items.MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_MANGROVE_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_mangrove_wood", has(Items.STRIPPED_MANGROVE_WOOD))
                .save(recipeOutput, "recipe_mangrove_stripped_wood_wall");
    }

    private void cherryRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_STAIRS, 4)
                .define('X', Items.CHERRY_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_STAIRS, 4)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_STAIRS, 4)
                .define('X', Items.CHERRY_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_cherry_log", has(Items.CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_log_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_LOG_STAIRS, 4)
                .define('X', Items.STRIPPED_CHERRY_LOG)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_cherry_log", has(Items.STRIPPED_CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_stripped_log_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_SLAB, 6)
                .define('X', Items.CHERRY_WOOD)
                .pattern("XXX")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_SLAB, 6)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .pattern("XXX")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_SLAB, 6)
                .define('X', Items.CHERRY_LOG)
                .pattern("XXX")
                .unlockedBy("has_cherry_log", has(Items.CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_log_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_LOG_SLAB, 6)
                .define('X', Items.STRIPPED_CHERRY_LOG)
                .pattern("XXX")
                .unlockedBy("has_stripped_cherry_log", has(Items.STRIPPED_CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_stripped_log_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.CHERRY_WOOD)
                .pattern("XX")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .pattern("XX")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.CHERRY_LOG)
                .pattern("XX")
                .unlockedBy("has_cherry_log", has(Items.CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_log_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_LOG_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_CHERRY_LOG)
                .pattern("XX")
                .unlockedBy("has_stripped_cherry_log", has(Items.STRIPPED_CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_stripped_log_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_BUTTON, 1)
                .requires(Items.CHERRY_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_BUTTON, 1)
                .requires(Items.STRIPPED_CHERRY_WOOD)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_BUTTON, 1)
                .requires(Items.CHERRY_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_cherry_log", has(Items.CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_log_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_LOG_BUTTON, 1)
                .requires(Items.STRIPPED_CHERRY_LOG)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_cherry_log", has(Items.STRIPPED_CHERRY_LOG))
                .save(recipeOutput, "recipe_cherry_stripped_log_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_FENCE, 3)
                .define('X', Items.CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_FENCE, 3)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_FENCE_GATE, 1)
                .define('X', Items.CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANK_WALL, 6)
                .define('X', Items.CHERRY_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_cherry_plank", has(Items.CHERRY_PLANKS))
                .save(recipeOutput, "recipe_cherry_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_WOOD_WALL, 6)
                .define('X', Items.CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_cherry_wood", has(Items.CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_wood_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_STRIPPED_WOOD_WALL, 6)
                .define('X', Items.STRIPPED_CHERRY_WOOD)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_cherry_wood", has(Items.STRIPPED_CHERRY_WOOD))
                .save(recipeOutput, "recipe_cherry_stripped_wood_wall");
    }

    private void warpedRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_STAIRS, 4)
                .define('X', Items.WARPED_HYPHAE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_STAIRS, 4)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STEM_STAIRS, 4)
                .define('X', Items.WARPED_STEM)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_warped_stem", has(Items.WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stem_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_STEM_STAIRS, 4)
                .define('X', Items.STRIPPED_WARPED_STEM)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_warped_stripped_stem", has(Items.STRIPPED_WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stripped_stem_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_SLAB, 6)
                .define('X', Items.WARPED_HYPHAE)
                .pattern("XXX")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_SLAB, 6)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .pattern("XXX")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STEM_SLAB, 6)
                .define('X', Items.WARPED_STEM)
                .pattern("XXX")
                .unlockedBy("has_warped_stem", has(Items.WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stem_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_STEM_SLAB, 6)
                .define('X', Items.STRIPPED_WARPED_STEM)
                .pattern("XXX")
                .unlockedBy("has_warped_stripped_stem", has(Items.STRIPPED_WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stripped_stem_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_PRESSURE_PLATE, 1)
                .define('X', Items.WARPED_HYPHAE)
                .pattern("XX")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .pattern("XX")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STEM_PRESSURE_PLATE, 1)
                .define('X', Items.WARPED_STEM)
                .pattern("XX")
                .unlockedBy("has_warped_stem", has(Items.WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stem_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_STEM_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_WARPED_STEM)
                .pattern("XX")
                .unlockedBy("has_warped_stripped_stem", has(Items.STRIPPED_WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stripped_stem_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_BUTTON, 1)
                .requires(Items.WARPED_HYPHAE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_BUTTON, 1)
                .requires(Items.STRIPPED_WARPED_HYPHAE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STEM_BUTTON, 1)
                .requires(Items.WARPED_STEM)
                .requires(Items.REDSTONE)
                .unlockedBy("has_warped_stem", has(Items.WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stem_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_STEM_BUTTON, 1)
                .requires(Items.STRIPPED_WARPED_STEM)
                .requires(Items.REDSTONE)
                .unlockedBy("has_warped_stripped_stem", has(Items.STRIPPED_WARPED_STEM))
                .save(recipeOutput, "recipe_warped_stripped_stem_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_FENCE, 3)
                .define('X', Items.WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE, 3)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_FENCE_GATE, 1)
                .define('X', Items.WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_PLANK_WALL, 6)
                .define('X', Items.WARPED_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_warped_plank", has(Items.WARPED_PLANKS))
                .save(recipeOutput, "recipe_warped_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_HYPHAE_WALL, 6)
                .define('X', Items.WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_warped_hyphae", has(Items.WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_hyphae_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STRIPPED_HYPHAE_WALL, 6)
                .define('X', Items.STRIPPED_WARPED_HYPHAE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_warped_stripped_hyphae", has(Items.STRIPPED_WARPED_HYPHAE))
                .save(recipeOutput, "recipe_warped_stripped_hyphae_wall");
    }

    private void crimsonRecipe(@NotNull RecipeOutput recipeOutput) {
        // Ступени
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_STAIRS, 4)
                .define('X', Items.CRIMSON_HYPHAE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_STAIRS, 4)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_STAIRS, 4)
                .define('X', Items.CRIMSON_STEM)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_crimson_stem", has(Items.CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stem_stairs");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_STEM_STAIRS, 4)
                .define('X', Items.STRIPPED_CRIMSON_STEM)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_stripped_crimson_stem", has(Items.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stripped_stem_stairs");

        // Плиты
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_SLAB, 6)
                .define('X', Items.CRIMSON_HYPHAE)
                .pattern("XXX")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_SLAB, 6)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .pattern("XXX")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_SLAB, 6)
                .define('X', Items.CRIMSON_STEM)
                .pattern("XXX")
                .unlockedBy("has_crimson_stem", has(Items.CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stem_slab");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_STEM_SLAB, 6)
                .define('X', Items.STRIPPED_CRIMSON_STEM)
                .pattern("XXX")
                .unlockedBy("has_stripped_crimson_stem", has(Items.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stripped_stem_slab");

        // Плита давления
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_PRESSURE_PLATE, 1)
                .define('X', Items.CRIMSON_HYPHAE)
                .pattern("XX")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .pattern("XX")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_PRESSURE_PLATE, 1)
                .define('X', Items.CRIMSON_STEM)
                .pattern("XX")
                .unlockedBy("has_crimson_stem", has(Items.CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stem_pressure_plate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_STEM_PRESSURE_PLATE, 1)
                .define('X', Items.STRIPPED_CRIMSON_STEM)
                .pattern("XX")
                .unlockedBy("has_stripped_crimson_stem", has(Items.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stripped_stem_pressure_plate");

        // Кнопка
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_BUTTON, 1)
                .requires(Items.CRIMSON_HYPHAE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_BUTTON, 1)
                .requires(Items.STRIPPED_CRIMSON_HYPHAE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_BUTTON, 1)
                .requires(Items.CRIMSON_STEM)
                .requires(Items.REDSTONE)
                .unlockedBy("has_crimson_stem", has(Items.CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stem_button");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_STEM_BUTTON, 1)
                .requires(Items.STRIPPED_CRIMSON_STEM)
                .requires(Items.REDSTONE)
                .unlockedBy("has_stripped_crimson_stem", has(Items.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput, "recipe_crimson_stripped_stem_button");

        // Забор
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_FENCE, 3)
                .define('X', Items.CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_fence");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE, 3)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("XYX")
                .pattern("XYX")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_fence");

        // Ворота
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_FENCE_GATE, 1)
                .define('X', Items.CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_fence_gate");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_FENCE_GATE, 1)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern("YXY")
                .pattern("YXY")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_fence_gate");

        // Стена
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANK_WALL, 6)
                .define('X', Items.CRIMSON_PLANKS)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput, "recipe_crimson_plank_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_HYPHAE_WALL, 6)
                .define('X', Items.CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_crimson_hyphae", has(Items.CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_hyphae_wall");
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STRIPPED_HYPHAE_WALL, 6)
                .define('X', Items.STRIPPED_CRIMSON_HYPHAE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_stripped_crimson_hyphae", has(Items.STRIPPED_CRIMSON_HYPHAE))
                .save(recipeOutput, "recipe_crimson_stripped_hyphae_wall");
    }

    private void whiteConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, 4)
                .define('X', Items.WHITE_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput, "recipe_white_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, 6)
                .define('X', Items.WHITE_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput, "recipe_white_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, 6)
                .define('X', Items.WHITE_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput, "recipe_white_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.WHITE_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput, "recipe_white_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_BUTTON, 1)
                .requires(Items.WHITE_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput, "recipe_white_concrete_button");
    }

    private void lightGrayConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, 4)
                .define('X', Items.LIGHT_GRAY_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(recipeOutput, "recipe_light_gray_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, 6)
                .define('X', Items.LIGHT_GRAY_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(recipeOutput, "recipe_light_gray_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, 6)
                .define('X', Items.LIGHT_GRAY_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(recipeOutput, "recipe_light_gray_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.LIGHT_GRAY_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(recipeOutput, "recipe_light_gray_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, 1)
                .requires(Items.LIGHT_GRAY_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_light_gray_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .save(recipeOutput, "recipe_light_gray_concrete_button");
    }

    private void grayConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, 4)
                .define('X', Items.GRAY_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput, "recipe_gray_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, 6)
                .define('X', Items.GRAY_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput, "recipe_gray_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, 6)
                .define('X', Items.GRAY_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput, "recipe_gray_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.GRAY_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput, "recipe_gray_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_BUTTON, 1)
                .requires(Items.GRAY_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput, "recipe_gray_concrete_button");
    }

    private void blackConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, 4)
                .define('X', Items.BLACK_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE))
                .save(recipeOutput, "recipe_black_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, 6)
                .define('X', Items.BLACK_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE))
                .save(recipeOutput, "recipe_black_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, 6)
                .define('X', Items.BLACK_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE))
                .save(recipeOutput, "recipe_black_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.BLACK_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE))
                .save(recipeOutput, "recipe_black_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_BUTTON, 1)
                .requires(Items.BLACK_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_black_concrete", has(Blocks.BLACK_CONCRETE))
                .save(recipeOutput, "recipe_black_concrete_button");
    }

    private void brownConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, 4)
                .define('X', Items.BROWN_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE))
                .save(recipeOutput, "recipe_brown_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, 6)
                .define('X', Items.BROWN_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE))
                .save(recipeOutput, "recipe_brown_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, 6)
                .define('X', Items.BROWN_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE))
                .save(recipeOutput, "recipe_brown_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.BROWN_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE))
                .save(recipeOutput, "recipe_brown_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_BUTTON, 1)
                .requires(Items.BROWN_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_brown_concrete", has(Blocks.BROWN_CONCRETE))
                .save(recipeOutput, "recipe_brown_concrete_button");
    }

    private void redConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, 4)
                .define('X', Items.RED_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .save(recipeOutput, "recipe_red_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, 6)
                .define('X', Items.RED_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .save(recipeOutput, "recipe_red_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, 6)
                .define('X', Items.RED_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .save(recipeOutput, "recipe_red_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.RED_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .save(recipeOutput, "recipe_red_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_BUTTON, 1)
                .requires(Items.RED_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_red_concrete", has(Blocks.RED_CONCRETE))
                .save(recipeOutput, "recipe_red_concrete_button");
    }

    private void orangeConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, 4)
                .define('X', Items.ORANGE_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .save(recipeOutput, "recipe_orange_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, 6)
                .define('X', Items.ORANGE_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .save(recipeOutput, "recipe_orange_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, 6)
                .define('X', Items.ORANGE_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .save(recipeOutput, "recipe_orange_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.ORANGE_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .save(recipeOutput, "recipe_orange_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_BUTTON, 1)
                .requires(Items.ORANGE_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_orange_concrete", has(Blocks.ORANGE_CONCRETE))
                .save(recipeOutput, "recipe_orange_concrete_button");
    }

    private void yellowConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, 4)
                .define('X', Items.YELLOW_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .save(recipeOutput, "recipe_yellow_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, 6)
                .define('X', Items.YELLOW_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .save(recipeOutput, "recipe_yellow_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, 6)
                .define('X', Items.YELLOW_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .save(recipeOutput, "recipe_yellow_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.YELLOW_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .save(recipeOutput, "recipe_yellow_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_BUTTON, 1)
                .requires(Items.YELLOW_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_yellow_concrete", has(Blocks.YELLOW_CONCRETE))
                .save(recipeOutput, "recipe_yellow_concrete_button");
    }

    private void limeConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, 4)
                .define('X', Items.LIME_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .save(recipeOutput, "recipe_lime_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, 6)
                .define('X', Items.LIME_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .save(recipeOutput, "recipe_lime_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, 6)
                .define('X', Items.LIME_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .save(recipeOutput, "recipe_lime_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.LIME_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .save(recipeOutput, "recipe_lime_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_BUTTON, 1)
                .requires(Items.LIME_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_lime_concrete", has(Blocks.LIME_CONCRETE))
                .save(recipeOutput, "recipe_lime_concrete_button");
    }

    private void greenConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, 4)
                .define('X', Items.GREEN_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE))
                .save(recipeOutput, "recipe_green_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, 6)
                .define('X', Items.GREEN_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE))
                .save(recipeOutput, "recipe_green_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, 6)
                .define('X', Items.GREEN_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE))
                .save(recipeOutput, "recipe_green_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.GREEN_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE))
                .save(recipeOutput, "recipe_green_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_BUTTON, 1)
                .requires(Items.GREEN_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_green_concrete", has(Blocks.GREEN_CONCRETE))
                .save(recipeOutput, "recipe_green_concrete_button");
    }

    private void cyanConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, 4)
                .define('X', Items.CYAN_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .save(recipeOutput, "recipe_cyan_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, 6)
                .define('X', Items.CYAN_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .save(recipeOutput, "recipe_cyan_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, 6)
                .define('X', Items.CYAN_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .save(recipeOutput, "recipe_cyan_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.CYAN_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .save(recipeOutput, "recipe_cyan_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_BUTTON, 1)
                .requires(Items.CYAN_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_cyan_concrete", has(Blocks.CYAN_CONCRETE))
                .save(recipeOutput, "recipe_cyan_concrete_button");
    }

    private void lightBlueConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, 4)
                .define('X', Items.LIGHT_BLUE_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(recipeOutput, "recipe_light_blue_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, 6)
                .define('X', Items.LIGHT_BLUE_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(recipeOutput, "recipe_light_blue_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, 6)
                .define('X', Items.LIGHT_BLUE_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(recipeOutput, "recipe_light_blue_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.LIGHT_BLUE_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(recipeOutput, "recipe_light_blue_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, 1)
                .requires(Items.LIGHT_BLUE_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_light_blue_concrete", has(Blocks.LIGHT_BLUE_CONCRETE))
                .save(recipeOutput, "recipe_light_blue_concrete_button");
    }

    private void blueConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, 4)
                .define('X', Items.BLUE_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(recipeOutput, "recipe_blue_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, 6)
                .define('X', Items.BLUE_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(recipeOutput, "recipe_blue_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, 6)
                .define('X', Items.BLUE_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(recipeOutput, "recipe_blue_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.BLUE_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(recipeOutput, "recipe_blue_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_BUTTON, 1)
                .requires(Items.BLUE_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_blue_concrete", has(Blocks.BLUE_CONCRETE))
                .save(recipeOutput, "recipe_blue_concrete_button");
    }

    private void purpleConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, 4)
                .define('X', Items.PURPLE_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE))
                .save(recipeOutput, "recipe_purple_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, 6)
                .define('X', Items.PURPLE_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE))
                .save(recipeOutput, "recipe_purple_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, 6)
                .define('X', Items.PURPLE_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE))
                .save(recipeOutput, "recipe_purple_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.PURPLE_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE))
                .save(recipeOutput, "recipe_purple_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_BUTTON, 1)
                .requires(Items.PURPLE_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_purple_concrete", has(Blocks.PURPLE_CONCRETE))
                .save(recipeOutput, "recipe_purple_concrete_button");
    }

    private void magentaConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, 4)
                .define('X', Items.MAGENTA_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .save(recipeOutput, "recipe_magenta_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, 6)
                .define('X', Items.MAGENTA_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .save(recipeOutput, "recipe_magenta_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, 6)
                .define('X', Items.MAGENTA_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .save(recipeOutput, "recipe_magenta_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.MAGENTA_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .save(recipeOutput, "recipe_magenta_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_BUTTON, 1)
                .requires(Items.MAGENTA_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_magenta_concrete", has(Blocks.MAGENTA_CONCRETE))
                .save(recipeOutput, "recipe_magenta_concrete_button");
    }

    private void pinkConcreteRecipe(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, 4)
                .define('X', Items.PINK_CONCRETE)
                .pattern("X  ")
                .pattern("XX ")
                .pattern("XXX")
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .save(recipeOutput, "recipe_pink_concrete_stairs");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, 6)
                .define('X', Items.PINK_CONCRETE)
                .pattern("XXX")
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .save(recipeOutput, "recipe_pink_concrete_slab");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, 6)
                .define('X', Items.PINK_CONCRETE)
                .define('Y', Items.STICK)
                .pattern(" Y ")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .save(recipeOutput, "recipe_pink_concrete_wall");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_PRESSURE_PLATE, 1)
                .define('X', Items.PINK_CONCRETE)
                .pattern("XX")
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .save(recipeOutput, "recipe_pink_concrete_pressure_plate");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_BUTTON, 1)
                .requires(Items.PINK_CONCRETE)
                .requires(Items.REDSTONE)
                .unlockedBy("has_pink_concrete", has(Blocks.PINK_CONCRETE))
                .save(recipeOutput, "recipe_pink_concrete_button");
    }
}
