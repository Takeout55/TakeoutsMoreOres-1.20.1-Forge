package net.takeout.moreores.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreOres.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MORE_ORES_BLOCKS = CREATIVE_MODE_TABS.register("more_ores_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REFINED_DIAMOND_BLOCK.get()))
                    .title(Component.translatable("creativetab.more_ores_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        //Blocks
                        pOutput.accept(ModBlocks.REFINERY.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BLOCK.get());
                        pOutput.accept(ModBlocks.FLAMING_TAKEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.FROZEN_TAKEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ZIRCON_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.GLITCHITE_BLOCK.get());
                        pOutput.accept(ModBlocks.EARIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.CHEESIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.OCARITE_BLOCK.get());
                        pOutput.accept(ModBlocks.THIMEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.PLUNGITE_BLOCK.get());
                        pOutput.accept(ModBlocks.MULTIVERSIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.HOLONITE_BLOCK.get());
                        pOutput.accept(ModBlocks.FOXTROGEN_BLOCK.get());
                        pOutput.accept(ModBlocks.RIFTIUM_BLOCK.get());
                        //Wood Blocks
                        pOutput.accept(ModBlocks.PINE_PLANKS.get());
                        pOutput.accept(ModBlocks.PINE_LOG.get());
                        pOutput.accept(ModBlocks.PINE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_WOOD.get());
                        pOutput.accept(ModBlocks.PINE_LEAVES.get());
                        pOutput.accept(ModItems.PINE_SIGN.get());
                        pOutput.accept(ModItems.PINE_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.PINE_SAPLING.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_PLANKS.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_LOG.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_FADED_MAGNOLIA_WOOD.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_LEAVES.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_SAPLING.get());
                        pOutput.accept(ModBlocks.MISSING_PLANKS.get());
                        pOutput.accept(ModBlocks.MISSING_LOG.get());
                        pOutput.accept(ModBlocks.MISSING_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_MISSING_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_MISSING_WOOD.get());
                        pOutput.accept(ModBlocks.MISSING_LEAVES.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_PLANKS.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_LOG.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_INFERNAL_HYPHAE_WOOD.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_SAPLING.get());
                        pOutput.accept(ModBlocks.GRAVEL_LEAVES.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_PLANKS.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_HOLLOW_PINE_WOOD.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_LEAVES.get());
                        //Ores
                        pOutput.accept(ModBlocks.ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.ANCIENT_VOIDSTONE.get());
                        pOutput.accept(ModBlocks.THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_ORE.get());
                        pOutput.accept(ModBlocks.PLUNGITE_ORE.get());
                        pOutput.accept(ModBlocks.MULTIVERSIUM_ORE.get());
                        pOutput.accept(ModBlocks.FLAMING_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.FROZEN_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.HOLONITE_ORE.get());
                        pOutput.accept(ModBlocks.FOXTROGEN_ORE.get());
                        pOutput.accept(ModBlocks.RIFTIUM_ORE.get());
                        //Deepslate Ores
                        pOutput.accept(ModBlocks.DEEPSLATE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CHEESIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLUNGITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MULTIVERSIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HOLONITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FOXTROGEN_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RIFTIUM_ORE.get());
                        //Nether Ores
                        pOutput.accept(ModBlocks.NETHER_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_CHEESIUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_PLUNGITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_MULTIVERSIUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_FLAMING_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_FROZEN_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_HOLONITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_FOXTROGEN_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RIFTIUM_ORE.get());
                        //End Ores
                        pOutput.accept(ModBlocks.END_STONE_ZIRCON_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_EARIUM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_GASNITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_GLITCHITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_THIMEITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_OCARITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_CHEESIUM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_PLUNGITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_MULTIVERSIUM_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_FLAMING_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_FROZEN_TAKEITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_HOLONITE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_FOXTROGEN_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_RIFTIUM_ORE.get());
                        //Block Types
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.ZIRCON_STAIRS.get());
                        pOutput.accept(ModBlocks.ZIRCON_SLAB.get());
                        pOutput.accept(ModBlocks.ZIRCON_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_DOOR.get());
                        pOutput.accept(ModBlocks.ZIRCON_BUTTON.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ZIRCON_FENCE.get());
                        pOutput.accept(ModBlocks.ZIRCON_WALL.get());
                        pOutput.accept(ModBlocks.ZIRCON_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.REFINED_DIAMOND_STAIRS.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_SLAB.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_DOOR.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_BUTTON.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_FENCE.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_WALL.get());
                        pOutput.accept(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.GLITCHITE_STAIRS.get());
                        pOutput.accept(ModBlocks.GLITCHITE_SLAB.get());
                        pOutput.accept(ModBlocks.GLITCHITE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.GLITCHITE_BUTTON.get());
                        pOutput.accept(ModBlocks.GLITCHITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_FENCE.get());
                        pOutput.accept(ModBlocks.GLITCHITE_WALL.get());
                        pOutput.accept(ModBlocks.GLITCHITE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.EARIUM_STAIRS.get());
                        pOutput.accept(ModBlocks.EARIUM_SLAB.get());
                        pOutput.accept(ModBlocks.EARIUM_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.EARIUM_DOOR.get());
                        pOutput.accept(ModBlocks.EARIUM_BUTTON.get());
                        pOutput.accept(ModBlocks.EARIUM_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.EARIUM_FENCE.get());
                        pOutput.accept(ModBlocks.EARIUM_WALL.get());
                        pOutput.accept(ModBlocks.EARIUM_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.CHEESIUM_STAIRS.get());
                        pOutput.accept(ModBlocks.CHEESIUM_SLAB.get());
                        pOutput.accept(ModBlocks.CHEESIUM_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.CHEESIUM_DOOR.get());
                        pOutput.accept(ModBlocks.CHEESIUM_BUTTON.get());
                        pOutput.accept(ModBlocks.CHEESIUM_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_FENCE.get());
                        pOutput.accept(ModBlocks.CHEESIUM_WALL.get());
                        pOutput.accept(ModBlocks.CHEESIUM_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.THIMEITE_STAIRS.get());
                        pOutput.accept(ModBlocks.THIMEITE_SLAB.get());
                        pOutput.accept(ModBlocks.THIMEITE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.THIMEITE_DOOR.get());
                        pOutput.accept(ModBlocks.THIMEITE_BUTTON.get());
                        pOutput.accept(ModBlocks.THIMEITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.THIMEITE_FENCE.get());
                        pOutput.accept(ModBlocks.THIMEITE_WALL.get());

                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_STAIRS.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_SLAB.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_BUTTON.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_FENCE.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_WALL.get());
                        pOutput.accept(ModBlocks.FADED_MAGNOLIA_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.MISSING_STAIRS.get());
                        pOutput.accept(ModBlocks.MISSING_SLAB.get());
                        pOutput.accept(ModBlocks.MISSING_BUTTON.get());
                        pOutput.accept(ModBlocks.MISSING_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.MISSING_FENCE.get());
                        pOutput.accept(ModBlocks.MISSING_WALL.get());
                        pOutput.accept(ModBlocks.MISSING_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_STAIRS.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_SLAB.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_BUTTON.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_FENCE.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_WALL.get());
                        pOutput.accept(ModBlocks.INFERNAL_HYPHAE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.PINE_STAIRS.get());
                        pOutput.accept(ModBlocks.PINE_SLAB.get());
                        pOutput.accept(ModBlocks.PINE_BUTTON.get());
                        pOutput.accept(ModBlocks.PINE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.PINE_FENCE.get());
                        pOutput.accept(ModBlocks.PINE_WALL.get());
                        pOutput.accept(ModBlocks.PINE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.HOLLOW_PINE_STAIRS.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_SLAB.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_BUTTON.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_FENCE.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_WALL.get());
                        pOutput.accept(ModBlocks.HOLLOW_PINE_PRESSURE_PLATE.get());
                        //Other Blocktypes
                        pOutput.accept(ModBlocks.NETHER_BRICK_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.DIRT_SLAB.get());
                        pOutput.accept(ModBlocks.DIRT_STAIRS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MORE_ORES_ITEMS = CREATIVE_MODE_TABS.register("more_ores_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REFINED_DIAMOND.get()))
                    .title(Component.translatable("creativetab.more_ores_items"))
                    .displayItems((pParameters, pOutput) -> {
                        //Other Items
                        pOutput.accept(ModItems.METAL_ROD.get());
                        pOutput.accept(ModItems.URANIUM_ROD.get());
                        pOutput.accept(ModItems.OBSIDIAN_STICK.get());
                        pOutput.accept(ModItems.METASTONE_ROD.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());
                        pOutput.accept(ModItems.RIFTIUM_TRIDENT.get());
                        //Ore Items
                        pOutput.accept(ModItems.FLAMING_TAKEITE_GEM.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_GEM.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SHARD.get());
                        pOutput.accept(ModItems.ZIRCON.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.GASNITE.get());
                        pOutput.accept(ModItems.NETHER_GASNITE.get());
                        pOutput.accept(ModItems.EARIUM.get());
                        pOutput.accept(ModItems.CHEESIUM.get());
                        pOutput.accept(ModItems.GLITCHITE_INGOT.get());
                        pOutput.accept(ModItems.OCARITE.get());
                        pOutput.accept(ModItems.ENDITE.get());
                        pOutput.accept(ModItems.THIMEITE.get());
                        pOutput.accept(ModItems.PINKITE_INGOT.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.PLUNGITE.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_INGOT.get());
                        pOutput.accept(ModItems.REFINED_URANIUM.get());
                        pOutput.accept(ModItems.HOLONITE.get());
                        pOutput.accept(ModItems.FOXTROGEN.get());
                        pOutput.accept(ModBlocks.FOXTROGEN_DUST.get());
                        pOutput.accept(ModItems.RIFTIUM_SHARD.get());
                        //Raw Items
                        pOutput.accept(ModItems.RAW_ZIRCON.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_EARIUM.get());
                        pOutput.accept(ModItems.RAW_PINKITE.get());
                        pOutput.accept(ModItems.RAW_CHEESIUM.get());
                        pOutput.accept(ModItems.RAW_ENDITE.get());
                        pOutput.accept(ModItems.RAW_RUBY.get());
                        pOutput.accept(ModItems.RAW_PLUNGITE.get());
                        pOutput.accept(ModItems.RAW_THIMEITE.get());
                        pOutput.accept(ModItems.RAW_MULTIVERSIUM.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE.get());
                        pOutput.accept(ModItems.RAW_URANIUM.get());
                        //Music Items
                        pOutput.accept(ModItems.VINYL_TEMPLATE.get());
                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());
                        pOutput.accept(ModItems.THIMEITE_MUSIC_DISC.get());
                        //Tools
                        pOutput.accept(ModItems.FLAMING_TAKEITE_SWORD.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_PICKAXE.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_AXE.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_SHOVEL.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_HOE.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_SWORD.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_PICKAXE.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_AXE.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_SHOVEL.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.GLITCHITE_SWORD.get());
                        pOutput.accept(ModItems.GLITCHITE_PICKAXE.get());
                        pOutput.accept(ModItems.GLITCHITE_AXE.get());
                        pOutput.accept(ModItems.GLITCHITE_SHOVEL.get());
                        pOutput.accept(ModItems.GLITCHITE_HOE.get());
                        pOutput.accept(ModItems.THIMEITE_SCYTHE.get());
                        pOutput.accept(ModItems.THIMEITE_SWORD.get());
                        pOutput.accept(ModItems.THIMEITE_PICKAXE.get());
                        pOutput.accept(ModItems.THIMEITE_AXE.get());
                        pOutput.accept(ModItems.THIMEITE_SHOVEL.get());
                        pOutput.accept(ModItems.THIMEITE_HOE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SWORD.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_PICKAXE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_AXE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_SHOVEL.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_HOE.get());
                        pOutput.accept(ModItems.PLUNGITE_SWORD.get());
                        pOutput.accept(ModItems.PLUNGITE_PICKAXE.get());
                        pOutput.accept(ModItems.PLUNGITE_AXE.get());
                        pOutput.accept(ModItems.PLUNGITE_SHOVEL.get());
                        pOutput.accept(ModItems.PLUNGITE_HOE.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_SWORD.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_PICKAXE.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_AXE.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_SHOVEL.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_HOE.get());
                        pOutput.accept(ModItems.RUBY_SWORD.get());
                        pOutput.accept(ModItems.RUBY_PICKAXE.get());
                        pOutput.accept(ModItems.RUBY_AXE.get());
                        pOutput.accept(ModItems.RUBY_SHOVEL.get());
                        pOutput.accept(ModItems.RUBY_HOE.get());
                        pOutput.accept(ModItems.ZIRCON_SWORD.get());
                        pOutput.accept(ModItems.ZIRCON_PICKAXE.get());
                        pOutput.accept(ModItems.ZIRCON_AXE.get());
                        pOutput.accept(ModItems.ZIRCON_SHOVEL.get());
                        pOutput.accept(ModItems.ZIRCON_HOE.get());
                        pOutput.accept(ModItems.OCARITE_SWORD.get());
                        pOutput.accept(ModItems.OCARITE_PICKAXE.get());
                        pOutput.accept(ModItems.OCARITE_AXE.get());
                        pOutput.accept(ModItems.OCARITE_SHOVEL.get());
                        pOutput.accept(ModItems.OCARITE_HOE.get());
                        pOutput.accept(ModItems.HOLONITE_SWORD.get());
                        pOutput.accept(ModItems.HOLONITE_PICKAXE.get());
                        pOutput.accept(ModItems.HOLONITE_AXE.get());
                        pOutput.accept(ModItems.HOLONITE_SHOVEL.get());
                        pOutput.accept(ModItems.HOLONITE_HOE.get());
                        pOutput.accept(ModItems.RIFTIUM_SWORD.get());
                        pOutput.accept(ModItems.RIFTIUM_PICKAXE.get());
                        pOutput.accept(ModItems.RIFTIUM_AXE.get());
                        pOutput.accept(ModItems.RIFTIUM_SHOVEL.get());
                        pOutput.accept(ModItems.RIFTIUM_HOE.get());
                        pOutput.accept(ModItems.URANIUM_SWORD.get());
                        pOutput.accept(ModItems.URANIUM_PICKAXE.get());
                        pOutput.accept(ModItems.URANIUM_AXE.get());
                        pOutput.accept(ModItems.URANIUM_SHOVEL.get());
                        pOutput.accept(ModItems.URANIUM_HOE.get());
                        //Armour
                        pOutput.accept(ModItems.FLAMING_TAKEITE_HELMET.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_LEGGINGS.get());
                        pOutput.accept(ModItems.FLAMING_TAKEITE_BOOTS.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_HELMET.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_LEGGINGS.get());
                        pOutput.accept(ModItems.FROZEN_TAKEITE_BOOTS.get());
                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_HELMET.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_CHESTPLATE.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_LEGGINGS.get());
                        pOutput.accept(ModItems.REFINED_DIAMOND_BOOTS.get());
                        pOutput.accept(ModItems.GLITCHITE_HELMET.get());
                        pOutput.accept(ModItems.GLITCHITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.GLITCHITE_LEGGINGS.get());
                        pOutput.accept(ModItems.GLITCHITE_BOOTS.get());
                        pOutput.accept(ModItems.OCARITE_HELMET.get());
                        pOutput.accept(ModItems.OCARITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.OCARITE_LEGGINGS.get());
                        pOutput.accept(ModItems.OCARITE_BOOTS.get());
                        pOutput.accept(ModItems.ZIRCON_HELMET.get());
                        pOutput.accept(ModItems.ZIRCON_CHESTPLATE.get());
                        pOutput.accept(ModItems.ZIRCON_LEGGINGS.get());
                        pOutput.accept(ModItems.ZIRCON_BOOTS.get());
                        pOutput.accept(ModItems.RUBY_HELMET.get());
                        pOutput.accept(ModItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUBY_LEGGINGS.get());
                        pOutput.accept(ModItems.RUBY_BOOTS.get());
                        pOutput.accept(ModItems.THIMEITE_HELMET.get());
                        pOutput.accept(ModItems.THIMEITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.THIMEITE_LEGGINGS.get());
                        pOutput.accept(ModItems.THIMEITE_BOOTS.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_HELMET.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.MULTIVERSIUM_BOOTS.get());
                        pOutput.accept(ModItems.HOLONITE_HELMET.get());
                        pOutput.accept(ModItems.HOLONITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.HOLONITE_LEGGINGS.get());
                        pOutput.accept(ModItems.HOLONITE_BOOTS.get());
                        pOutput.accept(ModItems.RIFTIUM_HELMET.get());
                        pOutput.accept(ModItems.RIFTIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.RIFTIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.RIFTIUM_BOOTS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
