package juniebyte.javadungeons.content;

import net.minecraft.tag.Tag;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import juniebyte.javadungeons.JavaDungeons;

public class Tags {

    public static Tag<Block> PLANTABLE;
    public static Tag<Block> DESERT_PLANTABLE;

    public static void init() {
        PLANTABLE = TagRegistry.block(new Identifier(JavaDungeons.MOD_ID, "plantable"));
        DESERT_PLANTABLE = TagRegistry.block(new Identifier(JavaDungeons.MOD_ID, "desert_plantable"));
    }
}