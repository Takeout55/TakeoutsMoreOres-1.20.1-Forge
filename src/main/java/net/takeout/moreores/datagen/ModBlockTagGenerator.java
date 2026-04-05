package net.takeout.moreores.datagen;

import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.END_STONE_ZIRCON_ORE.get(),
                        ModBlocks.NETHER_ZIRCON_ORE.get(),
                        ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get(),
                        ModBlocks.GLITCHITE_ORE.get(),
                        ModBlocks.NETHER_GLITCHITE_ORE.get(),
                        ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                        ModBlocks.ANCIENT_VOIDSTONE.get(),
                        ModBlocks.THIMEITE_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.OCARITE_ORE.get(),
                        ModBlocks.DEEPSLATE_OCARITE_ORE.get(),
                        ModBlocks.END_STONE_OCARITE_ORE.get(),
                        ModBlocks.NETHER_OCARITE_ORE.get(),
                        ModBlocks.CHEESIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_CHEESIUM_ORE.get(),
                        ModBlocks.END_STONE_CHEESIUM_ORE.get(),
                        ModBlocks.NETHER_THIMEITE_ORE.get(),
                        ModBlocks.END_STONE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_PLUNGITE_ORE.get(),
                        ModBlocks.NETHER_PLUNGITE_ORE.get(),
                        ModBlocks.END_STONE_PLUNGITE_ORE.get(),
                        ModBlocks.MULTIVERSIUM_ORE.get(),
                        ModBlocks.END_STONE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.NETHER_MULTIVERSIUM_ORE.get(),
                        ModBlocks.NETHER_CHEESIUM_ORE.get(),
                        ModBlocks.FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.NETHER_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.HOLONITE_ORE.get(),
                        ModBlocks.END_STONE_HOLONITE_ORE.get(),
                        ModBlocks.NETHER_HOLONITE_ORE.get(),
                        ModBlocks.DEEPSLATE_HOLONITE_ORE.get(),
                        ModBlocks.PLUNGITE_ORE.get(),
                        ModBlocks.FOXTROGEN_ORE.get(),
                        ModBlocks.DEEPSLATE_FOXTROGEN_ORE.get(),
                        ModBlocks.END_STONE_FOXTROGEN_ORE.get(),
                        ModBlocks.RIFTIUM_ORE.get(),
                        ModBlocks.END_STONE_RIFTIUM_ORE.get(),
                        ModBlocks.NETHER_RIFTIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_RIFTIUM_ORE.get(),
                        ModBlocks.NETHER_FOXTROGEN_ORE.get()
                    ).addTag(Tags.Blocks.ORES);



        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.END_STONE_ZIRCON_ORE.get(),
                        ModBlocks.NETHER_ZIRCON_ORE.get(),
                        ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.REFINED_DIAMOND_BLOCK.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get(),
                        ModBlocks.GLITCHITE_BLOCK.get(),
                        ModBlocks.OCARITE_BLOCK.get(),
                        ModBlocks.GLITCHITE_ORE.get(),
                        ModBlocks.NETHER_GLITCHITE_ORE.get(),
                        ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                        ModBlocks.ANCIENT_VOIDSTONE.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.THIMEITE_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.OCARITE_ORE.get(),
                        ModBlocks.DEEPSLATE_OCARITE_ORE.get(),
                        ModBlocks.END_STONE_OCARITE_ORE.get(),
                        ModBlocks.NETHER_OCARITE_ORE.get(),
                        ModBlocks.CHEESIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_CHEESIUM_ORE.get(),
                        ModBlocks.END_STONE_CHEESIUM_ORE.get(),
                        ModBlocks.NETHER_THIMEITE_ORE.get(),
                        ModBlocks.END_STONE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_PLUNGITE_ORE.get(),
                        ModBlocks.NETHER_PLUNGITE_ORE.get(),
                        ModBlocks.END_STONE_PLUNGITE_ORE.get(),
                        ModBlocks.MULTIVERSIUM_ORE.get(),
                        ModBlocks.END_STONE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.NETHER_MULTIVERSIUM_ORE.get(),
                        ModBlocks.EARIUM_BLOCK.get(),
                        ModBlocks.NETHER_CHEESIUM_ORE.get(),
                        ModBlocks.MULTIVERSIUM_BLOCK.get(),
                        ModBlocks.PLUNGITE_ORE.get(),
                        ModBlocks.CHEESIUM_BLOCK.get(),
                        ModBlocks.FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.NETHER_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_BLOCK.get(),
                        ModBlocks.FLAMING_TAKEITE_BLOCK.get(),
                        ModBlocks.HOLONITE_BLOCK.get(),
                        ModBlocks.HOLONITE_ORE.get(),
                        ModBlocks.END_STONE_HOLONITE_ORE.get(),
                        ModBlocks.NETHER_HOLONITE_ORE.get(),
                        ModBlocks.DEEPSLATE_HOLONITE_ORE.get(),
                        ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.FOXTROGEN_ORE.get(),
                        ModBlocks.DEEPSLATE_FOXTROGEN_ORE.get(),
                        ModBlocks.END_STONE_FOXTROGEN_ORE.get(),
                        ModBlocks.NETHER_FOXTROGEN_ORE.get(),
                        ModBlocks.FOXTROGEN_BLOCK.get(),
                        ModBlocks.RIFTIUM_ORE.get(),
                        ModBlocks.END_STONE_RIFTIUM_ORE.get(),
                        ModBlocks.NETHER_RIFTIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_RIFTIUM_ORE.get(),
                        ModBlocks.RIFTIUM_BLOCK.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.RAW_SAPPHIRE_BLOCK.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
                        ModBlocks.ZIRCON_ORE.get(),
                        ModBlocks.DEEPSLATE_ZIRCON_ORE.get(),
                        ModBlocks.END_STONE_ZIRCON_ORE.get(),
                        ModBlocks.NETHER_ZIRCON_ORE.get(),
                        ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.REFINED_DIAMOND_BLOCK.get(),
                        ModBlocks.EARIUM_ORE.get(),
                        ModBlocks.NETHER_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_EARIUM_ORE.get(),
                        ModBlocks.END_STONE_EARIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get(),
                        ModBlocks.GLITCHITE_BLOCK.get(),
                        ModBlocks.OCARITE_BLOCK.get(),
                        ModBlocks.GLITCHITE_ORE.get(),
                        ModBlocks.NETHER_GLITCHITE_ORE.get(),
                        ModBlocks.END_STONE_GLITCHITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GLITCHITE_ORE.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.THIMEITE_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.END_STONE_RUBY_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.OCARITE_ORE.get(),
                        ModBlocks.DEEPSLATE_OCARITE_ORE.get(),
                        ModBlocks.END_STONE_OCARITE_ORE.get(),
                        ModBlocks.NETHER_OCARITE_ORE.get(),
                        ModBlocks.CHEESIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_CHEESIUM_ORE.get(),
                        ModBlocks.END_STONE_CHEESIUM_ORE.get(),
                        ModBlocks.NETHER_THIMEITE_ORE.get(),
                        ModBlocks.END_STONE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_THIMEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_PLUNGITE_ORE.get(),
                        ModBlocks.NETHER_PLUNGITE_ORE.get(),
                        ModBlocks.END_STONE_PLUNGITE_ORE.get(),
                        ModBlocks.MULTIVERSIUM_ORE.get(),
                        ModBlocks.END_STONE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_MULTIVERSIUM_ORE.get(),
                        ModBlocks.NETHER_MULTIVERSIUM_ORE.get(),
                        ModBlocks.EARIUM_BLOCK.get(),
                        ModBlocks.NETHER_CHEESIUM_ORE.get(),
                        ModBlocks.MULTIVERSIUM_BLOCK.get(),
                        ModBlocks.PLUNGITE_ORE.get(),
                        ModBlocks.HOLONITE_BLOCK.get(),
                        ModBlocks.HOLONITE_ORE.get(),
                        ModBlocks.END_STONE_HOLONITE_ORE.get(),
                        ModBlocks.NETHER_HOLONITE_ORE.get(),
                        ModBlocks.DEEPSLATE_HOLONITE_ORE.get(),
                        ModBlocks.CHEESIUM_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.REFINED_DIAMOND_BLOCK.get(),
                        ModBlocks.FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.END_STONE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.NETHER_FROZEN_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_BLOCK.get(),
                        ModBlocks.FLAMING_TAKEITE_BLOCK.get(),
                        ModBlocks.ANCIENT_VOIDSTONE.get(),
                        ModBlocks.FOXTROGEN_BLOCK.get(),
                        ModBlocks.FOXTROGEN_ORE.get(),
                        ModBlocks.DEEPSLATE_FOXTROGEN_ORE.get(),
                        ModBlocks.END_STONE_FOXTROGEN_ORE.get(),
                        ModBlocks.NETHER_FOXTROGEN_ORE.get(),
                        ModBlocks.RIFTIUM_ORE.get(),
                        ModBlocks.END_STONE_RIFTIUM_ORE.get(),
                        ModBlocks.NETHER_RIFTIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_RIFTIUM_ORE.get(),
                        ModBlocks.RIFTIUM_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_SAPPHIRE_TOOL);

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GASNITE_ORE.get(),
                        ModBlocks.NETHER_GASNITE_ORE.get(),
                        ModBlocks.DEEPSLATE_GASNITE_ORE.get(),
                        ModBlocks.END_STONE_GASNITE_ORE.get());


        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get(),
                        ModBlocks.ZIRCON_FENCE.get(),
                        ModBlocks.REFINED_DIAMOND_FENCE.get(),
                        ModBlocks.CHEESIUM_FENCE.get(),
                        ModBlocks.EARIUM_FENCE.get(),
                        ModBlocks.GLITCHITE_FENCE.get(),
                        ModBlocks.THIMEITE_FENCE.get(),
                        ModBlocks.FADED_MAGNOLIA_FENCE.get(),
                        ModBlocks.MISSING_FENCE.get(),
                        ModBlocks.PINE_FENCE.get(),
                        ModBlocks.HOLLOW_PINE_FENCE.get(),
                        ModBlocks.INFERNAL_HYPHAE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get(),
                        ModBlocks.ZIRCON_FENCE_GATE.get(),
                        ModBlocks.NETHER_BRICK_FENCE_GATE.get(),
                        ModBlocks.REFINED_DIAMOND_FENCE_GATE.get(),
                        ModBlocks.CHEESIUM_FENCE_GATE.get(),
                        ModBlocks.EARIUM_FENCE_GATE.get(),
                        ModBlocks.GLITCHITE_FENCE_GATE.get(),
                        ModBlocks.THIMEITE_FENCE_GATE.get(),
                        ModBlocks.FADED_MAGNOLIA_FENCE_GATE.get(),
                        ModBlocks.MISSING_FENCE_GATE.get(),
                        ModBlocks.PINE_FENCE_GATE.get(),
                        ModBlocks.HOLLOW_PINE_FENCE_GATE.get(),
                        ModBlocks.INFERNAL_HYPHAE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get(),
                        ModBlocks.ZIRCON_WALL.get(),
                        ModBlocks.REFINED_DIAMOND_WALL.get(),
                        ModBlocks.CHEESIUM_WALL.get(),
                        ModBlocks.EARIUM_WALL.get(),
                        ModBlocks.GLITCHITE_WALL.get(),
                        ModBlocks.THIMEITE_WALL.get(),
                        ModBlocks.FADED_MAGNOLIA_WALL.get(),
                        ModBlocks.MISSING_WALL.get(),
                        ModBlocks.PINE_WALL.get(),
                        ModBlocks.HOLLOW_PINE_WALL.get(),
                        ModBlocks.INFERNAL_HYPHAE_WALL.get());


        this.tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.ZIRCON_BLOCK.get(),
                        ModBlocks.EARIUM_BLOCK.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.GLITCHITE_ORE.get(),
                        ModBlocks.REFINED_DIAMOND_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.OCARITE_BLOCK.get(),
                        ModBlocks.GLITCHITE_BLOCK.get(),
                        ModBlocks.FLAMING_TAKEITE_ORE.get(),
                        ModBlocks.FROZEN_TAKEITE_BLOCK.get(),
                        ModBlocks.THIMEITE_BLOCK.get(),
                        ModBlocks.HOLONITE_BLOCK.get(),
                        ModBlocks.FOXTROGEN_BLOCK.get(),
                        ModBlocks.RIFTIUM_BLOCK.get());

        this.tag(BlockTags.INFINIBURN_OVERWORLD)
                .add(ModBlocks.FLAMING_TAKEITE_BLOCK.get());

        this.tag(BlockTags.INFINIBURN_END)
                .add(ModBlocks.FLAMING_TAKEITE_BLOCK.get());

        this.tag(BlockTags.INFINIBURN_NETHER)
                .add(ModBlocks.FLAMING_TAKEITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.EARIUM_DOOR.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get())
                .add(ModBlocks.PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get())
                .add(ModBlocks.FADED_MAGNOLIA_LOG.get())
                .add(ModBlocks.FADED_MAGNOLIA_WOOD.get())
                .add(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get())
                .add(ModBlocks.STRIPPED_FADED_MAGNOLIA_WOOD.get())
                .add(ModBlocks.MISSING_LOG.get())
                .add(ModBlocks.MISSING_WOOD.get())
                .add(ModBlocks.STRIPPED_MISSING_LOG.get())
                .add(ModBlocks.STRIPPED_MISSING_WOOD.get())
                .add(ModBlocks.INFERNAL_HYPHAE_LOG.get())
                .add(ModBlocks.INFERNAL_HYPHAE_WOOD.get())
                .add(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get())
                .add(ModBlocks.STRIPPED_INFERNAL_HYPHAE_WOOD.get())
                .add(ModBlocks.HOLLOW_PINE_LOG.get())
                .add(ModBlocks.HOLLOW_PINE_WOOD.get())
                .add(ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get())
                .add(ModBlocks.STRIPPED_HOLLOW_PINE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get())
                .add(ModBlocks.FADED_MAGNOLIA_PLANKS.get())
                .add(ModBlocks.MISSING_PLANKS.get())
                .add(ModBlocks.INFERNAL_HYPHAE_PLANKS.get())
                .add(ModBlocks.HOLLOW_PINE_PLANKS.get());

        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.PINE_LEAVES.get())
                .add(ModBlocks.FADED_MAGNOLIA_LEAVES.get())
                .add(ModBlocks.MISSING_LEAVES.get())
                .add(ModBlocks.HOLLOW_PINE_LEAVES.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FADED_MAGNOLIA_WALL.get(),
                        ModBlocks.MISSING_WALL.get(),
                        ModBlocks.PINE_WALL.get(),
                        ModBlocks.HOLLOW_PINE_WALL.get(),
                        ModBlocks.INFERNAL_HYPHAE_WALL.get());
    }
}
