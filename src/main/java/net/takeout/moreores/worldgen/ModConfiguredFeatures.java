package net.takeout.moreores.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    //Overworld Ore Keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZIRCON_ORE_KEY = registerKey("zircon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLITCHITE_ORE_KEY = registerKey("glitchite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EARIUM_ORE_KEY = registerKey("earium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GASNITE_ORE_KEY = registerKey("gasnite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OCARITE_ORE_KEY = registerKey("ocarite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FROZEN_TAKEITE_ORE_KEY = registerKey("frozen_takeite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_HOLONITE_ORE_KEY = registerKey("holonite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLUNGITE_ORE_KEY = registerKey("plungite_ore");

    //Nether Ore Keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZIRCON_ORE_KEY = registerKey("netherrack_zircon_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_THIMEITE_ORE_KEY = registerKey("nether_thimeite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GLITCHITE_ORE_KEY = registerKey("nether_glitchite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GASNITE_ORE_KEY = registerKey("nether_gasnite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLAMING_TAKEITE_ORE_KEY = registerKey("nether_flaming_takeite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_HOLONITE_ORE_KEY = registerKey("nether_holonite_ore");

    // End Ore Keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_ENDITE_ORE_KEY = registerKey("end_stone_endite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CHEESIUM_ORE_KEY = registerKey("end_stone_cheesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_MULTIVERSIUM_ORE_KEY = registerKey("end_stone_multiversium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_FROZEN_TAKEITE_ORE_KEY = registerKey("end_stone_frozen_takeite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_FOXTROGEN_ORE_KEY = registerKey("end_stone_foxtrogen_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_RIFTIUM_ORE_KEY = registerKey("end_stone_riftium_ore");

    //Tree Keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNOLIA_KEY = registerKey("magnolia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INFERNAL_KEY = registerKey("infernal");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        //Overworld Ore Lists
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldZirconOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ZIRCON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ZIRCON_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldGlitchiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GLITCHITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_GLITCHITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldEariumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.EARIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_EARIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldGasniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GASNITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_GASNITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldOcariteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.OCARITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_OCARITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldFrozenTakeiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.FROZEN_TAKEITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldHoloniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.HOLONITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_HOLONITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPlungiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PLUNGITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_PLUNGITE_ORE.get().defaultBlockState()));

        //Overworld Ore Registration
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 4));
        register(context, OVERWORLD_ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZirconOres, 4));
        register(context, OVERWORLD_GLITCHITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGlitchiteOres, 4));
        register(context, OVERWORLD_EARIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldEariumOres, 4));
        register(context, OVERWORLD_GASNITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGasniteOres, 4));
        register(context, OVERWORLD_OCARITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOcariteOres, 4));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 4));
        register(context, OVERWORLD_FROZEN_TAKEITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFrozenTakeiteOres, 4));
        register(context, OVERWORLD_HOLONITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldHoloniteOres, 4));
        register(context, OVERWORLD_PLUNGITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlungiteOres, 4));

        //Nether Ore Registration
        register(context, NETHER_THIMEITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_THIMEITE_ORE.get().defaultBlockState(),  5));

        register(context, NETHER_ZIRCON_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_ZIRCON_ORE.get().defaultBlockState(),  5));

        register(context, NETHER_GLITCHITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_GLITCHITE_ORE.get().defaultBlockState(),  5));

        register(context, NETHER_GASNITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_GASNITE_ORE.get().defaultBlockState(),  5));

        register(context, NETHER_FLAMING_TAKEITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get().defaultBlockState(),  5));

        register(context, NETHER_HOLONITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_HOLONITE_ORE.get().defaultBlockState(),  5));

        //End Ore Registration
        register(context, END_STONE_CHEESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_CHEESIUM_ORE.get().defaultBlockState(),  5));

        register(context, END_STONE_MULTIVERSIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_MULTIVERSIUM_ORE.get().defaultBlockState(),  9));

        register(context, END_STONE_ENDITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.ANCIENT_VOIDSTONE.get().defaultBlockState(),  5));

        register(context, END_STONE_FROZEN_TAKEITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_FROZEN_TAKEITE_ORE.get().defaultBlockState(),  9));

        register(context, END_STONE_FOXTROGEN_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_FOXTROGEN_ORE.get().defaultBlockState(), 9));

        register(context, END_STONE_RIFTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                ModBlocks.END_STONE_RIFTIUM_ORE.get().defaultBlockState(),9));

                //Tree Registration
        register(context, PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PINE_LOG.get()),
                new StraightTrunkPlacer(5,4,3),
                BlockStateProvider.simple(ModBlocks.PINE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());

        register(context, MAGNOLIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FADED_MAGNOLIA_LOG.get()),
                new StraightTrunkPlacer(5,4,3),
                BlockStateProvider.simple(ModBlocks.FADED_MAGNOLIA_LEAVES.get()),
                new SpruceFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2),ConstantInt.of(3)),
                new TwoLayersFeatureSize(1,0,2)).build());

        register(context, INFERNAL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.INFERNAL_HYPHAE_LOG.get()),
                new StraightTrunkPlacer(5,4,3),
                BlockStateProvider.simple(ModBlocks.GRAVEL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2),3),
                new TwoLayersFeatureSize(1,0,2)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MoreOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

