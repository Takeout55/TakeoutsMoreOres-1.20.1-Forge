package net.takeout.moreores.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.takeout.moreores.MoreOres;

public class ModWoodTypes {
    public static final WoodType PINE = WoodType.register(new WoodType(MoreOres.MOD_ID + ":pine", BlockSetType.OAK));
    public static final WoodType FADED_MAGNOLIA = WoodType.register(new WoodType(MoreOres.MOD_ID + ":faded_magnolia", BlockSetType.OAK));
    public static final WoodType MISSING = WoodType.register(new WoodType(MoreOres.MOD_ID + ":missing", BlockSetType.OAK));
}
