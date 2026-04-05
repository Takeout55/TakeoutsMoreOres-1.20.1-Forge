package net.takeout.moreores.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.registries.ForgeRegistries;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.RAW_SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.ZIRCON_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ZIRCON_ORE);
        blockWithItem(ModBlocks.NETHER_ZIRCON_ORE);
        blockWithItem(ModBlocks.END_STONE_ZIRCON_ORE);
        blockWithItem(ModBlocks.ZIRCON_BLOCK);
        blockWithItem(ModBlocks.GASNITE_ORE);
        blockWithItem(ModBlocks.NETHER_GASNITE_ORE);
        blockWithItem(ModBlocks.REFINED_DIAMOND_BLOCK);
        blockWithItem(ModBlocks.EARIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_EARIUM_ORE);
        blockWithItem(ModBlocks.NETHER_EARIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_EARIUM_ORE);
        blockWithItem(ModBlocks.EARIUM_BLOCK);
        blockWithItem(ModBlocks.GLITCHITE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_GASNITE_ORE);
        blockWithItem(ModBlocks.END_STONE_GASNITE_ORE);
        blockWithItem(ModBlocks.OCARITE_BLOCK);
        blockWithItem(ModBlocks.CHEESIUM_BLOCK);
        blockWithItem(ModBlocks.GLITCHITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GLITCHITE_ORE);
        blockWithItem(ModBlocks.NETHER_GLITCHITE_ORE);
        blockWithItem(ModBlocks.END_STONE_GLITCHITE_ORE);
        blockWithItem(ModBlocks.THIMEITE_BLOCK);
        blockWithItem(ModBlocks.THIMEITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_THIMEITE_ORE);
        blockWithItem(ModBlocks.END_STONE_THIMEITE_ORE);
        blockWithItem(ModBlocks.NETHER_THIMEITE_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.END_STONE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.OCARITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_OCARITE_ORE);
        blockWithItem(ModBlocks.END_STONE_OCARITE_ORE);
        blockWithItem(ModBlocks.NETHER_OCARITE_ORE);
        blockWithItem(ModBlocks.CHEESIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CHEESIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_CHEESIUM_ORE);
        blockWithItem(ModBlocks.NETHER_CHEESIUM_ORE);
        blockWithItem(ModBlocks.PLUNGITE_BLOCK);
        blockWithItem(ModBlocks.PLUNGITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLUNGITE_ORE);
        blockWithItem(ModBlocks.END_STONE_PLUNGITE_ORE);
        blockWithItem(ModBlocks.NETHER_PLUNGITE_ORE);
        blockWithItem(ModBlocks.MULTIVERSIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MULTIVERSIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_MULTIVERSIUM_ORE);
        blockWithItem(ModBlocks.NETHER_MULTIVERSIUM_ORE);
        blockWithItem(ModBlocks.MULTIVERSIUM_BLOCK);
        blockWithItem(ModBlocks.FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.END_STONE_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.NETHER_FLAMING_TAKEITE_ORE);
        blockWithItem(ModBlocks.FLAMING_TAKEITE_BLOCK);
        blockWithItem(ModBlocks.FROZEN_TAKEITE_BLOCK);
        blockWithItem(ModBlocks.FROZEN_TAKEITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FROZEN_TAKEITE_ORE);
        blockWithItem(ModBlocks.END_STONE_FROZEN_TAKEITE_ORE);
        blockWithItem(ModBlocks.NETHER_FROZEN_TAKEITE_ORE);
        blockWithItem(ModBlocks.HOLONITE_BLOCK);
        blockWithItem(ModBlocks.HOLONITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_HOLONITE_ORE);
        blockWithItem(ModBlocks.END_STONE_HOLONITE_ORE);
        blockWithItem(ModBlocks.NETHER_HOLONITE_ORE);
        blockWithItem(ModBlocks.FOXTROGEN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FOXTROGEN_ORE);
        blockWithItem(ModBlocks.END_STONE_FOXTROGEN_ORE);
        blockWithItem(ModBlocks.NETHER_FOXTROGEN_ORE);
        blockWithItem(ModBlocks.FOXTROGEN_BLOCK);
        blockWithItem(ModBlocks.RIFTIUM_BLOCK);
        blockWithItem(ModBlocks.RIFTIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RIFTIUM_ORE);
        blockWithItem(ModBlocks.END_STONE_RIFTIUM_ORE);
        blockWithItem(ModBlocks.NETHER_RIFTIUM_ORE);


        stairsBlock(((StairBlock) ModBlocks.SAPPHIRE_STAIRS.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SAPPHIRE_SLAB.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SAPPHIRE_BUTTON.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SAPPHIRE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.SAPPHIRE_FENCE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SAPPHIRE_FENCE_GATE.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SAPPHIRE_WALL.get()), blockTexture(ModBlocks.SAPPHIRE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.SAPPHIRE_DOOR.get()), modLoc("block/sapphire_door_bottom"), modLoc("block/sapphire_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SAPPHIRE_TRAPDOOR.get()), modLoc("block/sapphire_trapdoor"), true, "cutout");


        stairsBlock(((StairBlock) ModBlocks.ZIRCON_STAIRS.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.ZIRCON_SLAB.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.ZIRCON_BUTTON.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ZIRCON_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.ZIRCON_FENCE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ZIRCON_FENCE_GATE.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.ZIRCON_WALL.get()), blockTexture(ModBlocks.ZIRCON_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.ZIRCON_DOOR.get()), modLoc("block/zircon_door_bottom"), modLoc("block/zircon_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ZIRCON_TRAPDOOR.get()), modLoc("block/zircon_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.REFINED_DIAMOND_STAIRS.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.REFINED_DIAMOND_SLAB.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.REFINED_DIAMOND_BUTTON.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.REFINED_DIAMOND_FENCE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.REFINED_DIAMOND_FENCE_GATE.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.REFINED_DIAMOND_WALL.get()), blockTexture(ModBlocks.REFINED_DIAMOND_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.REFINED_DIAMOND_DOOR.get()), modLoc("block/refined_diamond_door_bottom"), modLoc("block/refined_diamond_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.REFINED_DIAMOND_TRAPDOOR.get()), modLoc("block/refined_diamond_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.EARIUM_STAIRS.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.EARIUM_SLAB.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.EARIUM_BUTTON.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.EARIUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.EARIUM_FENCE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.EARIUM_FENCE_GATE.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.EARIUM_WALL.get()), blockTexture(ModBlocks.EARIUM_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.EARIUM_DOOR.get()), modLoc("block/earium_door_bottom"), modLoc("block/earium_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.EARIUM_TRAPDOOR.get()), modLoc("block/earium_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.GLITCHITE_STAIRS.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.GLITCHITE_SLAB.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GLITCHITE_BUTTON.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GLITCHITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.GLITCHITE_FENCE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GLITCHITE_FENCE_GATE.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.GLITCHITE_WALL.get()), blockTexture(ModBlocks.GLITCHITE_BLOCK.get()));
        // doorBlockWithRenderType(((DoorBlock) ModBlocks.GLITCHITE_DOOR.get()), modLoc("block/glitchite_door_bottom"), modLoc("block/glitchite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GLITCHITE_TRAPDOOR.get()), modLoc("block/glitchite_trapdoor"), true, "cutout");

        stairsBlock(((StairBlock) ModBlocks.CHEESIUM_STAIRS.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.CHEESIUM_SLAB.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CHEESIUM_BUTTON.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CHEESIUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.CHEESIUM_FENCE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CHEESIUM_FENCE_GATE.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.CHEESIUM_WALL.get()), blockTexture(ModBlocks.CHEESIUM_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CHEESIUM_DOOR.get()), modLoc("block/cheesium_door_bottom"), modLoc("block/cheesium_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CHEESIUM_TRAPDOOR.get()), modLoc("block/cheesium_trapdoor"), true, "cutout");

        fenceGateBlock(((FenceGateBlock) ModBlocks.NETHER_BRICK_FENCE_GATE.get()), blockTexture(Blocks.NETHER_BRICKS));
        slabBlock(((SlabBlock) ModBlocks.DIRT_SLAB.get()), blockTexture(Blocks.DIRT), blockTexture(Blocks.DIRT));
        stairsBlock(((StairBlock) ModBlocks.DIRT_STAIRS.get()), blockTexture(Blocks.DIRT));

        stairsBlock(((StairBlock) ModBlocks.THIMEITE_STAIRS.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.THIMEITE_SLAB.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.THIMEITE_BUTTON.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.THIMEITE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.THIMEITE_FENCE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.THIMEITE_FENCE_GATE.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.THIMEITE_WALL.get()), blockTexture(ModBlocks.THIMEITE_BLOCK.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.THIMEITE_DOOR.get()), modLoc("block/thimeite_door_bottom"), modLoc("block/thimeite_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.THIMEITE_TRAPDOOR.get()), modLoc("block/thimeite_trapdoor"), true, "cutout");

        simpleBlockWithItem(ModBlocks.REFINERY.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/refinery")));

        //Pine Wood
        logBlock(((RotatedPillarBlock) ModBlocks.PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PINE_WOOD.get()), blockTexture(ModBlocks.PINE_LOG.get()),blockTexture(ModBlocks.PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_LOG.get()), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                new ResourceLocation(MoreOres.MOD_ID, "block/stripped_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PINE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PINE_LOG.get()));

        blockItem(ModBlocks.PINE_LOG);
        blockItem(ModBlocks.PINE_WOOD);
        blockItem(ModBlocks.STRIPPED_PINE_LOG);
        blockItem(ModBlocks.STRIPPED_PINE_WOOD);
        blockWithItem(ModBlocks.PINE_PLANKS);
        leavesBlock(ModBlocks.PINE_LEAVES);

        signBlock(((StandingSignBlock) ModBlocks.PINE_SIGN.get()), ((WallSignBlock) ModBlocks.PINE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PINE_PLANKS.get()));
        hangingSignBlock(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PINE_PLANKS.get()));

        saplingBlock(ModBlocks.PINE_SAPLING);
        saplingBlock(ModBlocks.FADED_MAGNOLIA_SAPLING);
        saplingBlock(ModBlocks.INFERNAL_HYPHAE_SAPLING);

        stairsBlock(((StairBlock) ModBlocks.PINE_STAIRS.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PINE_SLAB.get()), blockTexture(ModBlocks.PINE_PLANKS.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PINE_BUTTON.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PINE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PINE_FENCE.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PINE_FENCE_GATE.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.PINE_WALL.get()), blockTexture(ModBlocks.PINE_PLANKS.get()));

        //Faded Magnolia Wood
        logBlock(((RotatedPillarBlock) ModBlocks.FADED_MAGNOLIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FADED_MAGNOLIA_WOOD.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_LOG.get()),blockTexture(ModBlocks.FADED_MAGNOLIA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get()), blockTexture(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get()),
                new ResourceLocation(MoreOres.MOD_ID, "block/stripped_faded_magnolia_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FADED_MAGNOLIA_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG.get()));

        blockItem(ModBlocks.FADED_MAGNOLIA_LOG);
        blockItem(ModBlocks.FADED_MAGNOLIA_WOOD);
        blockItem(ModBlocks.STRIPPED_FADED_MAGNOLIA_LOG);
        blockItem(ModBlocks.STRIPPED_FADED_MAGNOLIA_WOOD);
        blockWithItem(ModBlocks.FADED_MAGNOLIA_PLANKS);
        leavesBlock(ModBlocks.FADED_MAGNOLIA_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.FADED_MAGNOLIA_STAIRS.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FADED_MAGNOLIA_SLAB.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.FADED_MAGNOLIA_BUTTON.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FADED_MAGNOLIA_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.FADED_MAGNOLIA_FENCE.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FADED_MAGNOLIA_FENCE_GATE.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.FADED_MAGNOLIA_WALL.get()), blockTexture(ModBlocks.FADED_MAGNOLIA_PLANKS.get()));

        //Missing Wood
        logBlock(((RotatedPillarBlock) ModBlocks.MISSING_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.MISSING_WOOD.get()), blockTexture(ModBlocks.MISSING_LOG.get()),blockTexture(ModBlocks.MISSING_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MISSING_LOG.get()), blockTexture(ModBlocks.STRIPPED_MISSING_LOG.get()),
                new ResourceLocation(MoreOres.MOD_ID, "block/stripped_missing_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_MISSING_WOOD.get()), blockTexture(ModBlocks.STRIPPED_MISSING_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_MISSING_LOG.get()));

        blockItem(ModBlocks.MISSING_LOG);
        blockItem(ModBlocks.MISSING_WOOD);
        blockItem(ModBlocks.STRIPPED_MISSING_LOG);
        blockItem(ModBlocks.STRIPPED_MISSING_WOOD);
        blockWithItem(ModBlocks.MISSING_PLANKS);
        leavesBlock(ModBlocks.MISSING_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.MISSING_STAIRS.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.MISSING_SLAB.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.MISSING_BUTTON.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MISSING_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.MISSING_FENCE.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MISSING_FENCE_GATE.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.MISSING_WALL.get()), blockTexture(ModBlocks.MISSING_PLANKS.get()));

        //Infernal Hyphae Wood
        logBlock(((RotatedPillarBlock) ModBlocks.INFERNAL_HYPHAE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.INFERNAL_HYPHAE_WOOD.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_LOG.get()),blockTexture(ModBlocks.INFERNAL_HYPHAE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get()), blockTexture(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get()),
                new ResourceLocation(MoreOres.MOD_ID, "block/stripped_infernal_hyphae_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_INFERNAL_HYPHAE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG.get()));

        blockItem(ModBlocks.INFERNAL_HYPHAE_LOG);
        blockItem(ModBlocks.INFERNAL_HYPHAE_WOOD);
        blockItem(ModBlocks.STRIPPED_INFERNAL_HYPHAE_LOG);
        blockItem(ModBlocks.STRIPPED_INFERNAL_HYPHAE_WOOD);
        blockWithItem(ModBlocks.INFERNAL_HYPHAE_PLANKS);
        leavesBlock(ModBlocks.GRAVEL_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.INFERNAL_HYPHAE_STAIRS.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.INFERNAL_HYPHAE_SLAB.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.INFERNAL_HYPHAE_BUTTON.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.INFERNAL_HYPHAE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.INFERNAL_HYPHAE_FENCE.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.INFERNAL_HYPHAE_FENCE_GATE.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.INFERNAL_HYPHAE_WALL.get()), blockTexture(ModBlocks.INFERNAL_HYPHAE_PLANKS.get()));

        //Hollow Pine Wood
        logBlock(((RotatedPillarBlock) ModBlocks.HOLLOW_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HOLLOW_PINE_WOOD.get()), blockTexture(ModBlocks.HOLLOW_PINE_LOG.get()),blockTexture(ModBlocks.HOLLOW_PINE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get()), blockTexture(ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get()),
                new ResourceLocation(MoreOres.MOD_ID, "block/stripped_hollow_pine_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HOLLOW_PINE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_HOLLOW_PINE_LOG.get()));

        blockItem(ModBlocks.HOLLOW_PINE_LOG);
        blockItem(ModBlocks.HOLLOW_PINE_WOOD);
        blockItem(ModBlocks.STRIPPED_HOLLOW_PINE_LOG);
        blockItem(ModBlocks.STRIPPED_HOLLOW_PINE_WOOD);
        blockWithItem(ModBlocks.HOLLOW_PINE_PLANKS);
        leavesBlock(ModBlocks.HOLLOW_PINE_LEAVES);

        stairsBlock(((StairBlock) ModBlocks.HOLLOW_PINE_STAIRS.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.HOLLOW_PINE_SLAB.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.HOLLOW_PINE_BUTTON.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.HOLLOW_PINE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.HOLLOW_PINE_FENCE.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.HOLLOW_PINE_FENCE_GATE.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.HOLLOW_PINE_WALL.get()), blockTexture(ModBlocks.HOLLOW_PINE_PLANKS.get()));

    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }


    private String name(Block block) {
        return key(block).getPath();
    }
    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }


    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MoreOres.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
