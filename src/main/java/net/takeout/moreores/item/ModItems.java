package net.takeout.moreores.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreores.MoreOres;
import net.takeout.moreores.block.ModBlocks;
import net.takeout.moreores.entity.ModEntities;
import net.takeout.moreores.item.custom.FuelItem;
import net.takeout.moreores.item.custom.MetalDetectorItem;
import net.takeout.moreores.item.custom.ModArmorItem;
import net.takeout.moreores.item.custom.ModTridentItem;
import net.takeout.moreores.sounds.ModSounds;

import static net.minecraft.world.item.Items.registerItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreOres.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //Refined Diamond
    public static final RegistryObject<Item> REFINED_DIAMOND = ITEMS.register("refined_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_DIAMOND_SHARD = ITEMS.register("refined_diamond_shard",
            () -> new Item(new Item.Properties()));
    //Refined Diamond Armour
    public static final RegistryObject<Item> REFINED_DIAMOND_HELMET = ITEMS.register("refined_diamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_CHESTPLATE = ITEMS.register("refined_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_LEGGINGS = ITEMS.register("refined_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_BOOTS = ITEMS.register("refined_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Refined Diamond Tools
    public static final RegistryObject<Item> REFINED_DIAMOND_SWORD = ITEMS.register("refined_diamond_sword",
            () -> new SwordItem(ModToolTiers.REFINED_DIAMOND, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_PICKAXE = ITEMS.register("refined_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REFINED_DIAMOND, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_AXE = ITEMS.register("refined_diamond_axe",
            () -> new AxeItem(ModToolTiers.REFINED_DIAMOND, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_SHOVEL = ITEMS.register("refined_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.REFINED_DIAMOND, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> REFINED_DIAMOND_HOE = ITEMS.register("refined_diamond_hoe",
            () -> new HoeItem(ModToolTiers.REFINED_DIAMOND, -3, 0, new Item.Properties()));



    //Zircon
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));
    //Zircon Armour
    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Zircon Tools
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModToolTiers.ZIRCON, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ZIRCON, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ModToolTiers.ZIRCON, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModToolTiers.ZIRCON, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(ModToolTiers.ZIRCON, -2, 0, new Item.Properties()));



    //Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    //Sapphire Tools
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 5, -3.0f, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5f, 0, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, -2, 0, new Item.Properties()));

    //Sapphire Armour
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(500)));


    //Gasnite
    public static final RegistryObject<Item> GASNITE = ITEMS.register("gasnite",
            () -> new FuelItem(new Item.Properties(), 500));
    public static final RegistryObject<Item> NETHER_GASNITE = ITEMS.register("nether_gasnite",
            () -> new FuelItem(new Item.Properties(), 1000));


    //Earium
    public static final RegistryObject<Item> EARIUM = ITEMS.register("earium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EARIUM = ITEMS.register("raw_earium",
            () -> new Item(new Item.Properties()));


    //Rods
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ROD = ITEMS.register("uranium_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METASTONE_ROD = ITEMS.register("metastone_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_ROD = ITEMS.register("metal_rod",
            () -> new Item(new Item.Properties()));


    //Glitchite
     public static final RegistryObject<Item> GLITCHITE_INGOT = ITEMS.register("glitchite_ingot",
            () -> new Item(new Item.Properties()));
     //Glitchite Tools
    public static final RegistryObject<Item> GLITCHITE_SWORD = ITEMS.register("glitchite_sword",
            () -> new SwordItem(ModToolTiers.GLITCHITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_PICKAXE = ITEMS.register("glitchite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GLITCHITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_AXE = ITEMS.register("glitchite_axe",
            () -> new AxeItem(ModToolTiers.GLITCHITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_SHOVEL = ITEMS.register("glitchite_shovel",
            () -> new ShovelItem(ModToolTiers.GLITCHITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_HOE = ITEMS.register("glitchite_hoe",
            () -> new HoeItem(ModToolTiers.GLITCHITE, -1, 0, new Item.Properties()));

    //Glitchite Armour
    public static final RegistryObject<Item> GLITCHITE_HELMET = ITEMS.register("glitchite_helmet",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_CHESTPLATE = ITEMS.register("glitchite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_LEGGINGS = ITEMS.register("glitchite_leggings",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GLITCHITE_BOOTS = ITEMS.register("glitchite_boots",
            () -> new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Cheesium
    public static final RegistryObject<Item> CHEESIUM = ITEMS.register("cheesium",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> RAW_CHEESIUM = ITEMS.register("raw_cheesium",
            () -> new Item(new Item.Properties()));


    //Ocarite
    public static final RegistryObject<Item> OCARITE = ITEMS.register("ocarite",
            () -> new Item(new Item.Properties()));
    //Ocarite Armour
    public static final RegistryObject<Item> OCARITE_HELMET = ITEMS.register("ocarite_helmet",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_CHESTPLATE = ITEMS.register("ocarite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_LEGGINGS = ITEMS.register("ocarite_leggings",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_BOOTS = ITEMS.register("ocarite_boots",
            () -> new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Ocarite Tools
    public static final RegistryObject<Item> OCARITE_SWORD = ITEMS.register("ocarite_sword",
            () -> new SwordItem(ModToolTiers.OCARITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_PICKAXE = ITEMS.register("ocarite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OCARITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_AXE = ITEMS.register("ocarite_axe",
            () -> new AxeItem(ModToolTiers.OCARITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_SHOVEL = ITEMS.register("ocarite_shovel",
            () -> new ShovelItem(ModToolTiers.OCARITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> OCARITE_HOE = ITEMS.register("ocarite_hoe",
            () -> new HoeItem(ModToolTiers.OCARITE, -2, 0, new Item.Properties()));



    //Endite
    public static final RegistryObject<Item> RAW_ENDITE = ITEMS.register("raw_endite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDITE = ITEMS.register("endite",
            () -> new Item(new Item.Properties()));


    //Thimeite
    public static final RegistryObject<Item> THIMEITE = ITEMS.register("thimeite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THIMEITE = ITEMS.register("raw_thimeite",
            () -> new Item(new Item.Properties()));
    //Thimeite Tools
    public static final RegistryObject<Item> THIMEITE_SCYTHE = ITEMS.register("thimeite_scythe",
            () -> new SwordItem(ModToolTiers.THIMEITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_SWORD = ITEMS.register("thimeite_sword",
            () -> new SwordItem(ModToolTiers.THIMEITE, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_PICKAXE = ITEMS.register("thimeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.THIMEITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_AXE = ITEMS.register("thimeite_axe",
            () -> new AxeItem(ModToolTiers.THIMEITE, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_SHOVEL = ITEMS.register("thimeite_shovel",
            () -> new ShovelItem(ModToolTiers.THIMEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_HOE = ITEMS.register("thimeite_hoe",
            () -> new HoeItem(ModToolTiers.THIMEITE, -2, 0, new Item.Properties()));


    //Thimeite Armour
    public static final RegistryObject<Item> THIMEITE_HELMET = ITEMS.register("thimeite_helmet",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_CHESTPLATE = ITEMS.register("thimeite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_LEGGINGS = ITEMS.register("thimeite_leggings",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> THIMEITE_BOOTS = ITEMS.register("thimeite_boots",
            () -> new ArmorItem(ModArmorMaterials.THIMEITE, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Other Items
    public static final RegistryObject<Item> THIMEITE_MUSIC_DISC = ITEMS.register("thimeite_music_disc",
            () -> new RecordItem(6, ModSounds.GOLDEN_ODESSEY, new Item.Properties().stacksTo(1), 5820));
    public static final RegistryObject<Item> BAR_BRAWL_MUSIC_DISC = ITEMS.register("bar_brawl_music_disc",
            () -> new RecordItem(6, ModSounds.BAR_BRAWL, new Item.Properties().stacksTo(1), 2440));
    public static final RegistryObject<Item> VINYL_TEMPLATE = ITEMS.register("vinyl_template",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHINO_SPAWN_EGG = ITEMS.register("rhino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.RHINO, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> FOXTROGEN = ITEMS.register("foxtrogen",
            () -> new Item(new Item.Properties()));


    //Pinkite
    public static final RegistryObject<Item> PINKITE_INGOT = ITEMS.register("pinkite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PINKITE = ITEMS.register("raw_pinkite",
            () -> new Item(new Item.Properties()));


    //Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    //Ruby Armour
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Ruby Tools
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, -2, 0, new Item.Properties()));



    //Plungite
    public static final RegistryObject<Item> PLUNGITE = ITEMS.register("plungite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLUNGITE = ITEMS.register("raw_plungite",
            () -> new Item(new Item.Properties()));
    //Plungite Tools
    public static final RegistryObject<Item> PLUNGITE_SWORD = ITEMS.register("plungite_sword",
            () -> new SwordItem(ModToolTiers.PLUNGITE, 2, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_PICKAXE = ITEMS.register("plungite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLUNGITE, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_AXE = ITEMS.register("plungite_axe",
            () -> new AxeItem(ModToolTiers.PLUNGITE, 3, -3, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_SHOVEL = ITEMS.register("plungite_shovel",
            () -> new ShovelItem(ModToolTiers.PLUNGITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> PLUNGITE_HOE = ITEMS.register("plungite_hoe",
            () -> new HoeItem(ModToolTiers.PLUNGITE, -2, 0, new Item.Properties()));



    //Multiversium
    public static final RegistryObject<Item> MULTIVERSIUM_INGOT = ITEMS.register("multiversium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MULTIVERSIUM = ITEMS.register("raw_multiversium",
            () -> new Item(new Item.Properties()));
    //Multiversium Tools
    public static final RegistryObject<Item> MULTIVERSIUM_SWORD = ITEMS.register("multiversium_sword",
            () -> new SwordItem(ModToolTiers.MULTIVERSIUM, 3, -2.4f, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_PICKAXE = ITEMS.register("multiversium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MULTIVERSIUM, 1, -2.8f, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_AXE = ITEMS.register("multiversium_axe",
            () -> new AxeItem(ModToolTiers.MULTIVERSIUM, 5, -3, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_SHOVEL = ITEMS.register("multiversium_shovel",
            () -> new ShovelItem(ModToolTiers.MULTIVERSIUM, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_HOE = ITEMS.register("multiversium_hoe",
            () -> new HoeItem(ModToolTiers.MULTIVERSIUM, -2, 0, new Item.Properties()));

    //Multiversium Armour
    public static final RegistryObject<Item> MULTIVERSIUM_HELMET = ITEMS.register("multiversium_helmet",
            () -> new ArmorItem(ModArmorMaterials.MULTIVERSIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_CHESTPLATE = ITEMS.register("multiversium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MULTIVERSIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_LEGGINGS = ITEMS.register("multiversium_leggings",
            () -> new ArmorItem(ModArmorMaterials.MULTIVERSIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MULTIVERSIUM_BOOTS = ITEMS.register("multiversium_boots",
            () -> new ArmorItem(ModArmorMaterials.MULTIVERSIUM, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Flaming Takeite
    public static final RegistryObject<Item> FLAMING_TAKEITE_GEM = ITEMS.register("flaming_takeite_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAMING_TAKEITE = ITEMS.register("flaming_takeite",
            () -> new FuelItem(new Item.Properties(), 1500));
    //Flaming Takeite Tools
    public static final RegistryObject<Item> FLAMING_TAKEITE_SWORD = ITEMS.register("flaming_takeite_sword",
            () -> new SwordItem(ModToolTiers.FIRE_TAKEITE, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_PICKAXE = ITEMS.register("flaming_takeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FIRE_TAKEITE, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_AXE = ITEMS.register("flaming_takeite_axe",
            () -> new AxeItem(ModToolTiers.FIRE_TAKEITE, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_SHOVEL = ITEMS.register("flaming_takeite_shovel",
            () -> new ShovelItem(ModToolTiers.FIRE_TAKEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_HOE = ITEMS.register("flaming_takeite_hoe",
            () -> new HoeItem(ModToolTiers.FIRE_TAKEITE, -2, 0, new Item.Properties()));

    //Flaming Takeite Armour
    public static final RegistryObject<Item> FLAMING_TAKEITE_HELMET = ITEMS.register("flaming_takeite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_CHESTPLATE = ITEMS.register("flaming_takeite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_LEGGINGS = ITEMS.register("flaming_takeite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> FLAMING_TAKEITE_BOOTS = ITEMS.register("flaming_takeite_boots",
            () -> new ModArmorItem(ModArmorMaterials.FLAMETAKEITE, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Frozen Takeite
    public static final RegistryObject<Item> FROZEN_TAKEITE_GEM = ITEMS.register("frozen_takeite_gem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FROZEN_TAKEITE = ITEMS.register("frozen_takeite",
            () -> new Item(new Item.Properties()));
    //Frozen Takeite Armour
    public static final RegistryObject<Item> FROZEN_TAKEITE_HELMET = ITEMS.register("frozen_takeite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_CHESTPLATE = ITEMS.register("frozen_takeite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_LEGGINGS = ITEMS.register("frozen_takeite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_BOOTS = ITEMS.register("frozen_takeite_boots",
            () -> new ModArmorItem(ModArmorMaterials.ICETAKEITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Frozen Takeite Tools
    public static final RegistryObject<Item> FROZEN_TAKEITE_SWORD = ITEMS.register("frozen_takeite_sword",
            () -> new SwordItem(ModToolTiers.ICE_TAKEITE, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_PICKAXE = ITEMS.register("frozen_takeite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ICE_TAKEITE, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_AXE = ITEMS.register("frozen_takeite_axe",
            () -> new AxeItem(ModToolTiers.ICE_TAKEITE, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_SHOVEL = ITEMS.register("frozen_takeite_shovel",
            () -> new ShovelItem(ModToolTiers.ICE_TAKEITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> FROZEN_TAKEITE_HOE = ITEMS.register("frozen_takeite_hoe",
            () -> new HoeItem(ModToolTiers.ICE_TAKEITE, -2, 0, new Item.Properties()));



    //Holonite
    public static final RegistryObject<Item> HOLONITE = ITEMS.register("holonite",
            () -> new Item(new Item.Properties()));
    //Holonite Tools
    public static final RegistryObject<Item> HOLONITE_SWORD = ITEMS.register("holonite_sword",
            () -> new SwordItem(ModToolTiers.HOLONITE, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_PICKAXE = ITEMS.register("holonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HOLONITE, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_AXE = ITEMS.register("holonite_axe",
            () -> new AxeItem(ModToolTiers.HOLONITE, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_SHOVEL = ITEMS.register("holonite_shovel",
            () -> new ShovelItem(ModToolTiers.HOLONITE, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_HOE = ITEMS.register("holonite_hoe",
            () -> new HoeItem(ModToolTiers.HOLONITE, -2, 0, new Item.Properties()));

    //Holonite Armour
    public static final RegistryObject<Item> HOLONITE_HELMET = ITEMS.register("holonite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HOLONITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_CHESTPLATE = ITEMS.register("holonite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.HOLONITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_LEGGINGS = ITEMS.register("holonite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.HOLONITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> HOLONITE_BOOTS = ITEMS.register("holonite_boots",
            () -> new ModArmorItem(ModArmorMaterials.HOLONITE, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Riftium
    public static final RegistryObject<Item> RIFTIUM_SHARD = ITEMS.register("riftium_shard",
            () -> new Item(new Item.Properties()));
    //Riftium Tools
    public static final RegistryObject<Item> RIFTIUM_SWORD = ITEMS.register("riftium_sword",
            () -> new SwordItem(ModToolTiers.RIFTIUM, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_PICKAXE = ITEMS.register("riftium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RIFTIUM, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_AXE = ITEMS.register("riftium_axe",
            () -> new AxeItem(ModToolTiers.RIFTIUM, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_SHOVEL = ITEMS.register("riftium_shovel",
            () -> new ShovelItem(ModToolTiers.RIFTIUM, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_HOE = ITEMS.register("riftium_hoe",
            () -> new HoeItem(ModToolTiers.RIFTIUM, -2, 0, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_TRIDENT = ITEMS.register("riftium_trident",
            () -> new ModTridentItem(new Item.Properties()));

    //Riftium Armour
    public static final RegistryObject<Item> RIFTIUM_HELMET = ITEMS.register("riftium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RIFTIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_CHESTPLATE = ITEMS.register("riftium_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.RIFTIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_LEGGINGS = ITEMS.register("riftium_leggings",
            () -> new ModArmorItem(ModArmorMaterials.RIFTIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> RIFTIUM_BOOTS = ITEMS.register("riftium_boots",
            () -> new ModArmorItem(ModArmorMaterials.RIFTIUM, ArmorItem.Type.BOOTS, new Item.Properties()));



    //Uranium
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_URANIUM = ITEMS.register("refined_uranium",
            () -> new Item(new Item.Properties()));
    //Uranium Tools
    public static final RegistryObject<Item> URANIUM_SWORD = ITEMS.register("uranium_sword",
            () -> new SwordItem(ModToolTiers.URANIUM, 4, -2.2f, new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.URANIUM, 1, -2.7f, new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_AXE = ITEMS.register("uranium_axe",
            () -> new AxeItem(ModToolTiers.URANIUM, 6, -3, new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_SHOVEL = ITEMS.register("uranium_shovel",
            () -> new ShovelItem(ModToolTiers.URANIUM, 1.5f, -3, new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_HOE = ITEMS.register("uranium_hoe",
            () -> new HoeItem(ModToolTiers.URANIUM, -2, 0, new Item.Properties()));



    //Pine Signs
    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(ModBlocks.PINE_HANGING_SIGN.get(), ModBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
}
