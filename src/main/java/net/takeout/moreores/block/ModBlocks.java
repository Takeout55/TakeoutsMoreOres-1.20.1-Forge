package net.takeout.moreores.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
//import net.takeout.moreores.block.custom.RefineryBlock;
import net.takeout.moreores.block.custom.*;
import net.takeout.moreores.item.ModItems;
import net.takeout.moreores.util.ModWoodTypes;
import net.takeout.moreores.worldgen.tree.InfernalTreeGrower;
import net.takeout.moreores.worldgen.tree.MagnoliaTreeGrower;
import net.takeout.moreores.worldgen.tree.PineTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOres.MOD_ID);
    //Zircon
    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_ZIRCON_ORE = registerBlock("nether_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_ZIRCON_ORE = registerBlock("end_stone_zircon_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    //Sapphire
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

    //Sapphire BlockTypes
    public static final RegistryObject<Block> SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak()));
    public static final RegistryObject<Block> SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.AMETHYST).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak()));
    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> SAPPHIRE_WALL = registerBlock("sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).instabreak()));
    public static final RegistryObject<Block> SAPPHIRE_DOOR = registerBlock("sapphire_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion().instabreak(), BlockSetType.IRON));
    public static final RegistryObject<Block> SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion().instabreak(), BlockSetType.IRON));

    //Zircon BlockTypes
    public static final RegistryObject<Block> ZIRCON_STAIRS = registerBlock("zircon_stairs",
            () -> new StairBlock(() -> ModBlocks.ZIRCON_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> ZIRCON_SLAB = registerBlock("zircon_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> ZIRCON_BUTTON = registerBlock("zircon_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> ZIRCON_PRESSURE_PLATE = registerBlock("zircon_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> ZIRCON_FENCE = registerBlock("zircon_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> ZIRCON_FENCE_GATE = registerBlock("zircon_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> ZIRCON_WALL = registerBlock("zircon_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> ZIRCON_DOOR = registerBlock("zircon_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));
    public static final RegistryObject<Block> ZIRCON_TRAPDOOR = registerBlock("zircon_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));

    //Refined Diamond
    public static final RegistryObject<Block> REFINED_DIAMOND_BLOCK = registerBlock("refined_diamond_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()));
    //Refined Diamond BlockTypes
    public static final RegistryObject<Block> REFINED_DIAMOND_STAIRS = registerBlock("refined_diamond_stairs",
            () -> new StairBlock(() -> ModBlocks.REFINED_DIAMOND_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak()));
    public static final RegistryObject<Block> REFINED_DIAMOND_SLAB = registerBlock("refined_diamond_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak()));
    public static final RegistryObject<Block> REFINED_DIAMOND_BUTTON = registerBlock("refined_diamond_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> REFINED_DIAMOND_PRESSURE_PLATE = registerBlock("refined_diamond_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> REFINED_DIAMOND_FENCE = registerBlock("refined_diamond_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak()));
    public static final RegistryObject<Block> REFINED_DIAMOND_FENCE_GATE = registerBlock("refined_diamond_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> REFINED_DIAMOND_WALL = registerBlock("refined_diamond_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).instabreak()));
    public static final RegistryObject<Block> REFINED_DIAMOND_DOOR = registerBlock("refined_diamond_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));
    public static final RegistryObject<Block> REFINED_DIAMOND_TRAPDOOR = registerBlock("refined_diamond_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));


    //Earium
    public static final RegistryObject<Block> DEEPSLATE_EARIUM_ORE = registerBlock("deepslate_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> END_STONE_EARIUM_ORE = registerBlock("end_stone_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> NETHER_EARIUM_ORE = registerBlock("nether_earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE)));
    public static final RegistryObject<Block> EARIUM_BLOCK = registerBlock("earium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.COPPER)));
    public static final RegistryObject<Block> EARIUM_ORE = registerBlock("earium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    //Gasnite
     public static final RegistryObject<Block> DEEPSLATE_GASNITE_ORE = registerBlock("deepslate_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
     public static final RegistryObject<Block> END_STONE_GASNITE_ORE = registerBlock("end_stone_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> GASNITE_ORE = registerBlock("gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_GASNITE_ORE = registerBlock("nether_gasnite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));

     //Earium BlockTypes
     public static final RegistryObject<Block> EARIUM_STAIRS = registerBlock("earium_stairs",
            () -> new StairBlock(() -> ModBlocks.EARIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> EARIUM_SLAB = registerBlock("earium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> EARIUM_BUTTON = registerBlock("earium_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> EARIUM_PRESSURE_PLATE = registerBlock("earium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> EARIUM_FENCE = registerBlock("earium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> EARIUM_FENCE_GATE = registerBlock("earium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> EARIUM_WALL = registerBlock("earium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> EARIUM_DOOR = registerBlock("earium_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.OAK));
    public static final RegistryObject<Block> EARIUM_TRAPDOOR = registerBlock("earium_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.OAK));

    //Cheesium
    public static final RegistryObject<Block> CHEESIUM_BLOCK = registerBlock("cheesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHEESIUM_ORE = registerBlock("cheesium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.CHEESIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_CHEESIUM_ORE = registerBlock("deepslate_cheesium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.CHEESIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_CHEESIUM_ORE = registerBlock("nether_cheesium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.CHEESIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_CHEESIUM_ORE = registerBlock("end_stone_cheesium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.CHEESIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    //Cheesium BlockTypes
    public static final RegistryObject<Block> CHEESIUM_STAIRS = registerBlock("cheesium_stairs",
            () -> new StairBlock(() -> ModBlocks.CHEESIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> CHEESIUM_SLAB = registerBlock("cheesium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> CHEESIUM_BUTTON = registerBlock("cheesium_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> CHEESIUM_PRESSURE_PLATE = registerBlock("cheesium_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak(),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> CHEESIUM_FENCE = registerBlock("cheesium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> CHEESIUM_FENCE_GATE = registerBlock("cheesium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> CHEESIUM_WALL = registerBlock("cheesium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> CHEESIUM_DOOR = registerBlock("cheesium_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).noOcclusion().instabreak(), BlockSetType.OAK));
    public static final RegistryObject<Block> CHEESIUM_TRAPDOOR = registerBlock("cheesium_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.OAK));

    //Endite
    public static final RegistryObject<Block> ANCIENT_VOIDSTONE = registerBlock("ancient_voidstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));

    //Glitchite
    public static final RegistryObject<Block> DEEPSLATE_GLITCHITE_ORE = registerBlock("deepslate_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_GLITCHITE_ORE = registerBlock("end_stone_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_GLITCHITE_ORE = registerBlock("nether_glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GLITCHITE_BLOCK = registerBlock("glitchite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> GLITCHITE_ORE = registerBlock("glitchite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    //Glitchite BlockTypes
    public static final RegistryObject<Block> GLITCHITE_STAIRS = registerBlock("glitchite_stairs",
            () -> new StairBlock(() -> ModBlocks.GLITCHITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> GLITCHITE_SLAB = registerBlock("glitchite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> GLITCHITE_BUTTON = registerBlock("glitchite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> GLITCHITE_PRESSURE_PLATE = registerBlock("glitchite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> GLITCHITE_FENCE = registerBlock("glitchite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> GLITCHITE_FENCE_GATE = registerBlock("glitchite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> GLITCHITE_WALL = registerBlock("glitchite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> GLITCHITE_DOOR = registerBlock("glitchite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));
    public static final RegistryObject<Block> GLITCHITE_TRAPDOOR = registerBlock("glitchite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.SPRUCE));



    //Other Block Types
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> DIRT_STAIRS = registerBlock("dirt_stairs",
            () -> new StairBlock(Blocks.DIRT.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).instabreak(), SoundEvents.NETHER_BRICKS_PLACE, SoundEvents.NETHER_BRICKS_BREAK));

    //Thimeite
    public static final RegistryObject<Block> THIMEITE_BLOCK = registerBlock("thimeite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> THIMEITE_ORE = registerBlock("thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_THIMEITE_ORE = registerBlock("deepslate_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_THIMEITE_ORE = registerBlock("nether_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_THIMEITE_ORE = registerBlock("end_stone_thimeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    //Thimeite Block Types
    public static final RegistryObject<Block> THIMEITE_STAIRS = registerBlock("thimeite_stairs",
            () -> new StairBlock(() -> ModBlocks.CHEESIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> THIMEITE_SLAB = registerBlock("thimeite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).instabreak()));
    public static final RegistryObject<Block> THIMEITE_BUTTON = registerBlock("thimeite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).instabreak(),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> THIMEITE_PRESSURE_PLATE = registerBlock("thimeite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> THIMEITE_FENCE = registerBlock("thimeite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> THIMEITE_FENCE_GATE = registerBlock("thimeite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak(), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> THIMEITE_WALL = registerBlock("thimeite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).instabreak()));
    public static final RegistryObject<Block> THIMEITE_DOOR = registerBlock("thimeite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));
    public static final RegistryObject<Block> THIMEITE_TRAPDOOR = registerBlock("thimeite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().instabreak(), BlockSetType.IRON));

    //Ruby
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    //Ocarite
    public static final RegistryObject<Block> OCARITE_ORE = registerBlock("ocarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_OCARITE_ORE = registerBlock("deepslate_ocarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_OCARITE_ORE = registerBlock("nether_ocarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_OCARITE_ORE = registerBlock("end_stone_ocarite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OCARITE_BLOCK = registerBlock("ocarite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()));

    //Plungite
    public static final RegistryObject<Block> PLUNGITE_ORE = registerBlock("plungite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PLUNGITE_BLOCK = registerBlock("plungite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_PLUNGITE_ORE = registerBlock("deepslate_plungite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PLUNGITE_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_PLUNGITE_ORE = registerBlock("nether_plungite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PLUNGITE_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_PLUNGITE_ORE = registerBlock("end_stone_plungite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PLUNGITE_BLOCK.get()).requiresCorrectToolForDrops()));

    //Multiversium
    public static final RegistryObject<Block> MULTIVERSIUM_BLOCK = registerBlock("multiversium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MULTIVERSIUM_ORE = registerBlock("multiversium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_MULTIVERSIUM_ORE = registerBlock("deepslate_multiversium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MULTIVERSIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_MULTIVERSIUM_ORE = registerBlock("nether_multiversium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MULTIVERSIUM_BLOCK.get()).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_MULTIVERSIUM_ORE = registerBlock("end_stone_multiversium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MULTIVERSIUM_BLOCK.get()).requiresCorrectToolForDrops()));

    //Flaming Takeite
    public static final RegistryObject<Block> FLAMING_TAKEITE_BLOCK = registerBlock("flaming_takeite_block",
            () -> new MagmaBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FLAMING_TAKEITE_ORE = registerBlock("flaming_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_FLAMING_TAKEITE_ORE = registerBlock("deepslate_flaming_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_FLAMING_TAKEITE_ORE = registerBlock("nether_flaming_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_FLAMING_TAKEITE_ORE = registerBlock("end_stone_flaming_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    //Frozen Takeite
    public static final RegistryObject<Block> FROZEN_TAKEITE_ORE = registerBlock("frozen_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_FROZEN_TAKEITE_ORE = registerBlock("deepslate_frozen_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_FROZEN_TAKEITE_ORE = registerBlock("nether_frozen_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_FROZEN_TAKEITE_ORE = registerBlock("end_stone_frozen_takeite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FROZEN_TAKEITE_BLOCK = registerBlock("frozen_takeite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).requiresCorrectToolForDrops().friction(0.98f).sound(SoundType.NETHERITE_BLOCK)));


    //Holonite
    public static final RegistryObject<Block> HOLONITE_ORE = registerBlock("holonite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_HOLONITE_ORE = registerBlock("deepslate_holonite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_HOLONITE_ORE = registerBlock("nether_holonite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_HOLONITE_ORE = registerBlock("end_stone_holonite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> HOLONITE_BLOCK = registerBlock("holonite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    //Foxtrogen
    public static final RegistryObject<Block> FOXTROGEN_DUST = registerBlock("foxtrogen_dust",
            () -> new FoxtrogenDust(BlockBehaviour.Properties.copy(Blocks.REDSTONE_WIRE).noCollission().instabreak()));
    public static final RegistryObject<Block> FOXTROGEN_ORE = registerBlock("foxtrogen_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_FOXTROGEN_ORE = registerBlock("deepslate_foxtrogen_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_FOXTROGEN_ORE = registerBlock("nether_foxtrogen_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_FOXTROGEN_ORE = registerBlock("end_stone_foxtrogen_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FOXTROGEN_BLOCK = registerBlock("foxtrogen_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()));

    //Block Entities
    public static final RegistryObject<Block> REFINERY = registerBlock("refinery_block",
            () -> new RefineryBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().noOcclusion()));

    //Riftium
    public static final RegistryObject<Block> RIFTIUM_BLOCK = registerBlock("riftium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RIFTIUM_ORE = registerBlock("riftium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_RIFTIUM_ORE = registerBlock("deepslate_riftium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_RIFTIUM_ORE = registerBlock("nether_riftium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_RIFTIUM_ORE = registerBlock("end_stone_riftium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops()));

    //FADED MAGNOLIA
    public static final RegistryObject<Block> FADED_MAGNOLIA_LOG = registerBlock("faded_magnolia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> FADED_MAGNOLIA_WOOD = registerBlock("faded_magnolia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FADED_MAGNOLIA_LOG = registerBlock("stripped_faded_magnolia_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FADED_MAGNOLIA_WOOD = registerBlock("stripped_faded_magnolia_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> FADED_MAGNOLIA_PLANKS = registerBlock("faded_magnolia_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FADED_MAGNOLIA_LEAVES = registerBlock("faded_magnolia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> FADED_MAGNOLIA_SAPLING = registerBlock("faded_magnolia_sapling",
            () -> new ModSaplingBlock(new MagnoliaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    //Faded Magnolia Block Types
    public static final RegistryObject<Block> FADED_MAGNOLIA_STAIRS = registerBlock("faded_magnolia_stairs",
            () -> new StairBlock(() -> ModBlocks.FADED_MAGNOLIA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).instabreak()));

    public static final RegistryObject<Block> FADED_MAGNOLIA_SLAB = registerBlock("faded_magnolia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).instabreak()));

    public static final RegistryObject<Block> FADED_MAGNOLIA_BUTTON = registerBlock("faded_magnolia_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> FADED_MAGNOLIA_PRESSURE_PLATE = registerBlock("faded_magnolia_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> FADED_MAGNOLIA_FENCE = registerBlock("faded_magnolia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> FADED_MAGNOLIA_FENCE_GATE = registerBlock("faded_magnolia_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> FADED_MAGNOLIA_WALL = registerBlock("faded_magnolia_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    //MISSING
    public static final RegistryObject<Block> MISSING_LOG = registerBlock("missing_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> MISSING_WOOD = registerBlock("missing_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MISSING_LOG = registerBlock("stripped_missing_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MISSING_WOOD = registerBlock("stripped_missing_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> MISSING_PLANKS = registerBlock("missing_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MISSING_LEAVES = registerBlock("missing_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    //Missing Block Types
    public static final RegistryObject<Block> MISSING_STAIRS = registerBlock("missing_stairs",
            () -> new StairBlock(() -> ModBlocks.MISSING_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).instabreak()));

    public static final RegistryObject<Block> MISSING_SLAB = registerBlock("missing_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).instabreak()));

    public static final RegistryObject<Block> MISSING_BUTTON = registerBlock("missing_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> MISSING_PRESSURE_PLATE = registerBlock("missing_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> MISSING_FENCE = registerBlock("missing_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> MISSING_FENCE_GATE = registerBlock("missing_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> MISSING_WALL = registerBlock("missing_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    //INFERNAL HYPHAE
    public static final RegistryObject<Block> INFERNAL_HYPHAE_LOG = registerBlock("infernal_hyphae_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> INFERNAL_HYPHAE_WOOD = registerBlock("infernal_hyphae_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_INFERNAL_HYPHAE_LOG = registerBlock("stripped_infernal_hyphae_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_INFERNAL_HYPHAE_WOOD = registerBlock("stripped_infernal_hyphae_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> INFERNAL_HYPHAE_PLANKS = registerBlock("infernal_hyphae_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> GRAVEL_LEAVES = registerBlock("gravel_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> INFERNAL_HYPHAE_SAPLING = registerBlock("infernal_hyphae_sapling",
            () -> new ModSaplingBlock(new InfernalTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    //Faded Magnolia Block Types
    public static final RegistryObject<Block> INFERNAL_HYPHAE_STAIRS = registerBlock("infernal_hyphae_stairs",
            () -> new StairBlock(() -> ModBlocks.INFERNAL_HYPHAE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).instabreak()));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_SLAB = registerBlock("infernal_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).instabreak()));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_BUTTON = registerBlock("infernal_hyphae_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_PRESSURE_PLATE = registerBlock("infernal_hyphae_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_FENCE = registerBlock("infernal_hyphae_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_FENCE_GATE = registerBlock("infernal_hyphae_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> INFERNAL_HYPHAE_WALL = registerBlock("infernal_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    //Hollow Pine
    public static final RegistryObject<Block> HOLLOW_PINE_LOG = registerBlock("hollow_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> HOLLOW_PINE_WOOD = registerBlock("hollow_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HOLLOW_PINE_LOG = registerBlock("stripped_hollow_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HOLLOW_PINE_WOOD = registerBlock("stripped_hollow_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> HOLLOW_PINE_PLANKS = registerBlock("hollow_pine_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> HOLLOW_PINE_LEAVES = registerBlock("hollow_pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    //Hollow Pine Block Types
    public static final RegistryObject<Block> HOLLOW_PINE_STAIRS = registerBlock("hollow_pine_stairs",
            () -> new StairBlock(() -> ModBlocks.HOLLOW_PINE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).instabreak()));

    public static final RegistryObject<Block> HOLLOW_PINE_SLAB = registerBlock("hollow_pine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).instabreak()));

    public static final RegistryObject<Block> HOLLOW_PINE_BUTTON = registerBlock("hollow_pine_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> HOLLOW_PINE_PRESSURE_PLATE = registerBlock("hollow_pine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> HOLLOW_PINE_FENCE = registerBlock("hollow_pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> HOLLOW_PINE_FENCE_GATE = registerBlock("hollow_pine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> HOLLOW_PINE_WALL = registerBlock("hollow_pine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));

    //PINE
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            () -> new ModPlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling",
            () -> new SaplingBlock(new PineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    //Pine Signs
    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_HANGING_SIGN = BLOCKS.register("pine_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_HANGING_SIGN = BLOCKS.register("pine_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.PINE));
    //Pine Block Types
    public static final RegistryObject<Block> PINE_STAIRS = registerBlock("pine_stairs",
            () -> new StairBlock(() -> ModBlocks.PINE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).instabreak()));

    public static final RegistryObject<Block> PINE_SLAB = registerBlock("pine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).instabreak()));

    public static final RegistryObject<Block> PINE_BUTTON = registerBlock("pine_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),
                    BlockSetType.OAK, 10, true));

    public static final RegistryObject<Block> PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> PINE_FENCE = registerBlock("pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> PINE_FENCE_GATE = registerBlock("pine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PINE_WALL = registerBlock("pine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL)));
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
       return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
       BLOCKS.register(eventBus);
    }

}
