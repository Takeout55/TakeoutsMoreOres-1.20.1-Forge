package net.takeout.moreores.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    //Overworld Ore Keys
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> ZIRCON_ORE_PLACED_KEY = registerKey("zircon_ore_placed");
    public static final ResourceKey<PlacedFeature> GLITCHITE_ORE_PLACED_KEY = registerKey("glitchite_ore_placed");
    public static final ResourceKey<PlacedFeature> EARIUM_ORE_PLACED_KEY = registerKey("earium_ore_placed");
    public static final ResourceKey<PlacedFeature> GASNITE_ORE_PLACED_KEY = registerKey("gasnite_ore_placed");
    public static final ResourceKey<PlacedFeature> OCARITE_ORE_PLACED_KEY = registerKey("ocarite_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> PLUNGITE_ORE_PLACED_KEY = registerKey("plungite_ore_placed");
    public static final ResourceKey<PlacedFeature> FROZEN_TAKEITE_ORE_PLACED_KEY = registerKey("frozen_takeite_ore_placed");
    public static final ResourceKey<PlacedFeature> HOLONITE_ORE_PLACED_KEY = registerKey("holonite_ore_placed");

    //Nether Ore Keys
    public static final ResourceKey<PlacedFeature> NETHER_ZIRCON_ORE_PLACED_KEY = registerKey("nether_zircon_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_THIMEITE_ORE_PLACED_KEY = registerKey("nether_thimeite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GLITCHITE_ORE_PLACED_KEY = registerKey("nether_glitchite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GASNITE_ORE_PLACED_KEY = registerKey("nether_gasnite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_FLAMING_TAKEITE_ORE_PLACED_KEY = registerKey("nether_flaming_takeite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_HOLONITE_ORE_PLACED_KEY = registerKey("nether_holonite_ore_placed");

    //End Ore Keys
    public static final ResourceKey<PlacedFeature> END_ENDITE_ORE_PLACED_KEY = registerKey("end_endite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_CHEESIUM_ORE_PLACED_KEY = registerKey("end_cheesium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_MULTIVERSIUM_ORE_PLACED_KEY = registerKey("end_multiversium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_FROZEN_TAKEITE_ORE_PLACED_KEY = registerKey("end_frozen_takeite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_FOXTROGEN_ORE_PLACED_KEY = registerKey("end_foxtrogen_ore_placed");
    public static final ResourceKey<PlacedFeature> END_RIFTIUM_ORE_PLACED_KEY = registerKey("end_riftium_ore_placed");

    //Tree Keys
    public static final ResourceKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");
    public static final ResourceKey<PlacedFeature> MAGNOLIA_PLACED_KEY = registerKey("magnolia_placed");
    public static final ResourceKey<PlacedFeature> INFERNAL_PLACED_KEY = registerKey("infernal_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Overworld Ores
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, ZIRCON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ZIRCON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, GLITCHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GLITCHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, EARIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_EARIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, GASNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_GASNITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, OCARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_OCARITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, FROZEN_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_FROZEN_TAKEITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(80), VerticalAnchor.absolute(320))));

        register(context, HOLONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_HOLONITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        register(context, PLUNGITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLUNGITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(64))));

        //Nether Ores
        register(context, NETHER_ZIRCON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ZIRCON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        register(context, NETHER_THIMEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_THIMEITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        register(context, NETHER_GLITCHITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GLITCHITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        register(context, NETHER_GASNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GASNITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        register(context, NETHER_FLAMING_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_FLAMING_TAKEITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        register(context, NETHER_HOLONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_HOLONITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(114))));

        //End ores
        register(context, END_CHEESIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_CHEESIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(50))));

        register(context, END_ENDITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_ENDITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(50))));

        register(context, END_MULTIVERSIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_MULTIVERSIUM_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        register(context, END_FROZEN_TAKEITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_FROZEN_TAKEITE_ORE_KEY),
                ModOrePlacement.rareOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        register(context, END_FOXTROGEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_FOXTROGEN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        register(context, END_RIFTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_STONE_RIFTIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(70))));

        // Trees
        register(context, PINE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2,0.1f,1), ModBlocks.PINE_SAPLING.get()));

        register(context, MAGNOLIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGNOLIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1,0.000001f,0), ModBlocks.FADED_MAGNOLIA_SAPLING.get()));

        register(context, INFERNAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.INFERNAL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1,0.000001f,0), ModBlocks.INFERNAL_HYPHAE_SAPLING.get()));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MoreOres.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
