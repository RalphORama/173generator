package com.github.barteks2x.b173gen.oldgen;

import com.github.barteks2x.b173gen.ISimpleWorld;
import org.bukkit.Material;

import java.util.HashMap;

import static com.github.barteks2x.b173gen.oldgen.LightType.BLOCK;
import static org.bukkit.Material.AIR;
import static org.bukkit.Material.BEDROCK;
import static org.bukkit.Material.LEGACY_BED_BLOCK;
import static org.bukkit.Material.BOOKSHELF;
import static org.bukkit.Material.BREWING_STAND;
import static org.bukkit.Material.BRICK;
import static org.bukkit.Material.BRICK_STAIRS;
import static org.bukkit.Material.BROWN_MUSHROOM;
import static org.bukkit.Material.LEGACY_BURNING_FURNACE;
import static org.bukkit.Material.CACTUS;
import static org.bukkit.Material.LEGACY_CAKE_BLOCK;
import static org.bukkit.Material.CAULDRON;
import static org.bukkit.Material.CHEST;
import static org.bukkit.Material.CLAY;
import static org.bukkit.Material.COAL_ORE;
import static org.bukkit.Material.COBBLESTONE;
import static org.bukkit.Material.COBBLESTONE_STAIRS;
import static org.bukkit.Material.LEGACY_CROPS;
import static org.bukkit.Material.DEAD_BUSH;
import static org.bukkit.Material.DETECTOR_RAIL;
import static org.bukkit.Material.DIAMOND_BLOCK;
import static org.bukkit.Material.DIAMOND_ORE;
import static org.bukkit.Material.LEGACY_DIODE_BLOCK_OFF;
import static org.bukkit.Material.LEGACY_DIODE_BLOCK_ON;
import static org.bukkit.Material.DIRT;
import static org.bukkit.Material.DISPENSER;
import static org.bukkit.Material.LEGACY_DOUBLE_STEP;
import static org.bukkit.Material.DRAGON_EGG;
import static org.bukkit.Material.ENCHANTING_TABLE;
import static org.bukkit.Material.END_PORTAL;
import static org.bukkit.Material.END_PORTAL_FRAME;
import static org.bukkit.Material.END_STONE;
import static org.bukkit.Material.OAK_FENCE;
import static org.bukkit.Material.OAK_FENCE_GATE;
import static org.bukkit.Material.FIRE;
import static org.bukkit.Material.FURNACE;
import static org.bukkit.Material.GLASS;
import static org.bukkit.Material.LEGACY_GLOWING_REDSTONE_ORE;
import static org.bukkit.Material.GLOWSTONE;
import static org.bukkit.Material.GOLD_BLOCK;
import static org.bukkit.Material.GOLD_ORE;
import static org.bukkit.Material.GRASS_BLOCK;
import static org.bukkit.Material.GRAVEL;
import static org.bukkit.Material.BROWN_MUSHROOM_BLOCK;
import static org.bukkit.Material.RED_MUSHROOM_BLOCK;
import static org.bukkit.Material.ICE;
import static org.bukkit.Material.IRON_BLOCK;
import static org.bukkit.Material.LEGACY_IRON_DOOR_BLOCK;
import static org.bukkit.Material.LEGACY_IRON_FENCE;
import static org.bukkit.Material.IRON_ORE;
import static org.bukkit.Material.JACK_O_LANTERN;
import static org.bukkit.Material.JUKEBOX;
import static org.bukkit.Material.LADDER;
import static org.bukkit.Material.LAPIS_BLOCK;
import static org.bukkit.Material.LAPIS_ORE;
import static org.bukkit.Material.LAVA;
import static org.bukkit.Material.OAK_LEAVES;
import static org.bukkit.Material.LEVER;
import static org.bukkit.Material.OAK_LOG;
import static org.bukkit.Material.TALL_GRASS;
import static org.bukkit.Material.MELON;
import static org.bukkit.Material.MELON_STEM;
import static org.bukkit.Material.LEGACY_MOB_SPAWNER;
import static org.bukkit.Material.LEGACY_MONSTER_EGGS;
import static org.bukkit.Material.MOSSY_COBBLESTONE;
import static org.bukkit.Material.MYCELIUM;
import static org.bukkit.Material.NETHERRACK;
import static org.bukkit.Material.NETHER_BRICK;
import static org.bukkit.Material.NETHER_BRICK_STAIRS;
import static org.bukkit.Material.NETHER_BRICK_FENCE;
import static org.bukkit.Material.NETHER_WART;
import static org.bukkit.Material.NOTE_BLOCK;
import static org.bukkit.Material.OBSIDIAN;
import static org.bukkit.Material.LEGACY_PISTON_BASE;
import static org.bukkit.Material.LEGACY_PISTON_EXTENSION;
import static org.bukkit.Material.LEGACY_PISTON_MOVING_PIECE;
import static org.bukkit.Material.LEGACY_PISTON_STICKY_BASE;
import static org.bukkit.Material.NETHER_PORTAL;
import static org.bukkit.Material.POWERED_RAIL;
import static org.bukkit.Material.PUMPKIN;
import static org.bukkit.Material.PUMPKIN_STEM;
import static org.bukkit.Material.RAIL;
import static org.bukkit.Material.LEGACY_REDSTONE_LAMP_OFF;
import static org.bukkit.Material.LEGACY_REDSTONE_LAMP_ON;
import static org.bukkit.Material.REDSTONE_ORE;
import static org.bukkit.Material.LEGACY_REDSTONE_TORCH_OFF;
import static org.bukkit.Material.LEGACY_REDSTONE_TORCH_ON;
import static org.bukkit.Material.REDSTONE_WIRE;
import static org.bukkit.Material.RED_MUSHROOM;
import static org.bukkit.Material.POPPY;
import static org.bukkit.Material.SAND;
import static org.bukkit.Material.SANDSTONE;
import static org.bukkit.Material.OAK_SAPLING;
import static org.bukkit.Material.OAK_SIGN;
import static org.bukkit.Material.LEGACY_SMOOTH_BRICK;
import static org.bukkit.Material.LEGACY_SMOOTH_STAIRS;
import static org.bukkit.Material.SNOW;
import static org.bukkit.Material.SNOW_BLOCK;
import static org.bukkit.Material.LEGACY_SOIL;
import static org.bukkit.Material.SOUL_SAND;
import static org.bukkit.Material.SPONGE;
import static org.bukkit.Material.LEGACY_STATIONARY_LAVA;
import static org.bukkit.Material.LEGACY_STATIONARY_WATER;
import static org.bukkit.Material.LEGACY_STEP;
import static org.bukkit.Material.STONE;
import static org.bukkit.Material.STONE_BUTTON;
import static org.bukkit.Material.STONE_PRESSURE_PLATE;
import static org.bukkit.Material.SUGAR_CANE;
import static org.bukkit.Material.GLASS_PANE;
import static org.bukkit.Material.TNT;
import static org.bukkit.Material.TORCH;
import static org.bukkit.Material.OAK_TRAPDOOR;
import static org.bukkit.Material.VINE;
import static org.bukkit.Material.OAK_WALL_SIGN;
import static org.bukkit.Material.WATER;
import static org.bukkit.Material.LILY_PAD;
import static org.bukkit.Material.COBWEB;
import static org.bukkit.Material.OAK_WOOD;
import static org.bukkit.Material.OAK_DOOR;
import static org.bukkit.Material.OAK_PRESSURE_PLATE;
import static org.bukkit.Material.OAK_STAIRS;
import static org.bukkit.Material.WHITE_WOOL;
import static org.bukkit.Material.CRAFTING_TABLE;
import static org.bukkit.Material.DANDELION;

public class MinecraftMethods {
    private static final HashMap<Material, Boolean> buildableMapping = new HashMap<Material, Boolean>(256);

    public static void init() {
        //buildable mapping, bukkit doesn't have Material.isBuildable() method
        //automatically generated, code:
        /*
         StringBuilder sb = new StringBuilder(1000);
         sb.append("\n");
         Class<?> clazz = Blocks.class;
         Field[] fields = clazz.getDeclaredFields();
         for(Field f : fields){
         try {
         net.minecraft.server.v1_7_R1.Block block = (net.minecraft.server.v1_7_R1.Block)f.get(null);
         sb.append("buildableMapping.put(").append(Material.getMaterial(net.minecraft.server.v1_7_R1.Block.b(block)).name()).append(", ").append(block.getMaterial().isBuildable()).append(");");
         sb.append("\n");
         } catch(IllegalArgumentException ex) {
         } catch(IllegalAccessException ex) {
         }

         }
         System.out.println(sb.toString());
         */
        buildableMapping.put(AIR, false);
        buildableMapping.put(BEDROCK, true);
        buildableMapping.put(LEGACY_BED_BLOCK, true);
        buildableMapping.put(BOOKSHELF, true);
        buildableMapping.put(BREWING_STAND, true);
        buildableMapping.put(BRICK, true);
        buildableMapping.put(BRICK_STAIRS, true);
        buildableMapping.put(BROWN_MUSHROOM, false);
        buildableMapping.put(LEGACY_BURNING_FURNACE, true);
        buildableMapping.put(CACTUS, true);
        buildableMapping.put(LEGACY_CAKE_BLOCK, true);
        buildableMapping.put(CAULDRON, true);
        buildableMapping.put(CHEST, true);
        buildableMapping.put(CLAY, true);
        buildableMapping.put(COAL_ORE, true);
        buildableMapping.put(COBBLESTONE, true);
        buildableMapping.put(COBBLESTONE_STAIRS, true);
        buildableMapping.put(LEGACY_CROPS, false);
        buildableMapping.put(DEAD_BUSH, false);
        buildableMapping.put(DETECTOR_RAIL, false);
        buildableMapping.put(DIAMOND_BLOCK, true);
        buildableMapping.put(DIAMOND_ORE, true);
        buildableMapping.put(LEGACY_DIODE_BLOCK_OFF, false);
        buildableMapping.put(LEGACY_DIODE_BLOCK_ON, false);
        buildableMapping.put(DIRT, true);
        buildableMapping.put(DISPENSER, true);
        buildableMapping.put(LEGACY_DOUBLE_STEP, true);
        buildableMapping.put(DRAGON_EGG, true);
        buildableMapping.put(ENCHANTING_TABLE, true);
        buildableMapping.put(END_PORTAL, false);
        buildableMapping.put(END_PORTAL_FRAME, true);
        buildableMapping.put(END_STONE, true);
        buildableMapping.put(OAK_FENCE, true);
        buildableMapping.put(OAK_FENCE_GATE, true);
        buildableMapping.put(FIRE, false);
        buildableMapping.put(FURNACE, true);
        buildableMapping.put(GLASS, true);
        buildableMapping.put(LEGACY_GLOWING_REDSTONE_ORE, true);
        buildableMapping.put(GLOWSTONE, true);
        buildableMapping.put(GOLD_BLOCK, true);
        buildableMapping.put(GOLD_ORE, true);
        buildableMapping.put(GRASS_BLOCK, true);
        buildableMapping.put(GRAVEL, true);
        buildableMapping.put(BROWN_MUSHROOM_BLOCK, true);
        buildableMapping.put(RED_MUSHROOM_BLOCK, true);
        buildableMapping.put(ICE, true);
        buildableMapping.put(IRON_BLOCK, true);
        buildableMapping.put(LEGACY_IRON_DOOR_BLOCK, true);
        buildableMapping.put(LEGACY_IRON_FENCE, true);
        buildableMapping.put(IRON_ORE, true);
        buildableMapping.put(JACK_O_LANTERN, true);
        buildableMapping.put(JUKEBOX, true);
        buildableMapping.put(LADDER, false);
        buildableMapping.put(LAPIS_BLOCK, true);
        buildableMapping.put(LAPIS_ORE, true);
        buildableMapping.put(LAVA, false);
        buildableMapping.put(OAK_LEAVES, true);
        buildableMapping.put(LEVER, false);
        buildableMapping.put(OAK_LOG, true);
        buildableMapping.put(TALL_GRASS, false);
        buildableMapping.put(MELON, true);
        buildableMapping.put(MELON_STEM, false);
        buildableMapping.put(LEGACY_MOB_SPAWNER, true);
        buildableMapping.put(LEGACY_MONSTER_EGGS, true);
        buildableMapping.put(MOSSY_COBBLESTONE, true);
        buildableMapping.put(MYCELIUM, true);
        buildableMapping.put(NETHERRACK, true);
        buildableMapping.put(NETHER_BRICK, true);
        buildableMapping.put(NETHER_BRICK_STAIRS, true);
        buildableMapping.put(NETHER_BRICK_FENCE, true);
        buildableMapping.put(NETHER_WART, false);
        buildableMapping.put(NOTE_BLOCK, true);
        buildableMapping.put(OBSIDIAN, true);
        buildableMapping.put(LEGACY_PISTON_BASE, true);
        buildableMapping.put(LEGACY_PISTON_EXTENSION, true);
        buildableMapping.put(LEGACY_PISTON_MOVING_PIECE, true);
        buildableMapping.put(LEGACY_PISTON_STICKY_BASE, true);
        buildableMapping.put(NETHER_PORTAL, false);
        buildableMapping.put(POWERED_RAIL, false);
        buildableMapping.put(PUMPKIN, true);
        buildableMapping.put(PUMPKIN_STEM, false);
        buildableMapping.put(RAIL, false);
        buildableMapping.put(LEGACY_REDSTONE_LAMP_OFF, true);
        buildableMapping.put(LEGACY_REDSTONE_LAMP_ON, true);
        buildableMapping.put(REDSTONE_ORE, true);
        buildableMapping.put(LEGACY_REDSTONE_TORCH_OFF, false);
        buildableMapping.put(LEGACY_REDSTONE_TORCH_ON, false);
        buildableMapping.put(REDSTONE_WIRE, false);
        buildableMapping.put(RED_MUSHROOM, false);
        buildableMapping.put(POPPY, false);
        buildableMapping.put(SAND, true);
        buildableMapping.put(SANDSTONE, true);
        buildableMapping.put(OAK_SAPLING, false);
        buildableMapping.put(OAK_SIGN, true);
        buildableMapping.put(LEGACY_SMOOTH_BRICK, true);
        buildableMapping.put(LEGACY_SMOOTH_STAIRS, true);
        buildableMapping.put(SNOW, false);
        buildableMapping.put(SNOW_BLOCK, true);
        buildableMapping.put(LEGACY_SOIL, true);
        buildableMapping.put(SOUL_SAND, true);
        buildableMapping.put(SPONGE, true);
        buildableMapping.put(LEGACY_STATIONARY_LAVA, false);
        buildableMapping.put(LEGACY_STATIONARY_WATER, false);
        buildableMapping.put(LEGACY_STEP, true);
        buildableMapping.put(STONE, true);
        buildableMapping.put(STONE_BUTTON, false);
        buildableMapping.put(STONE_PRESSURE_PLATE, true);
        buildableMapping.put(SUGAR_CANE, false);
        buildableMapping.put(GLASS_PANE, true);
        buildableMapping.put(TNT, true);
        buildableMapping.put(TORCH, false);
        buildableMapping.put(OAK_TRAPDOOR, true);
        buildableMapping.put(VINE, false);
        buildableMapping.put(OAK_WALL_SIGN, true);
        buildableMapping.put(WATER, false);
        buildableMapping.put(LILY_PAD, false);
        buildableMapping.put(COBWEB, true);
        buildableMapping.put(OAK_WOOD, true);
        buildableMapping.put(OAK_DOOR, true);
        buildableMapping.put(OAK_PRESSURE_PLATE, true);
        buildableMapping.put(OAK_STAIRS, true);
        buildableMapping.put(WHITE_WOOL, true);
        buildableMapping.put(CRAFTING_TABLE, true);
        buildableMapping.put(DANDELION, false);
    }

    public static boolean isLiquid(Material m) {
        return m.toString().toLowerCase().contains("water") || m.toString().toLowerCase().contains("lava");
    }

//    public static int World_getlightValue(ISimpleWorld w, int x, int y, int z, LightType type) {
//        return type == BLOCK ?
//                w.getBlockLight(x, y, z) :
//                w.getSkyLight(x, y, z);
//    }

    public static boolean Block_canPlace(Material block, ISimpleWorld w, int x, int y, int z) {
        if (!w.isEmpty(x, y, z)) {
            return false;
        }

        Material below = w.getType(x, y - 1, z);

        if (block == DANDELION || block == POPPY) {
            return below == DIRT || below == GRASS_BLOCK || below == LEGACY_SOIL;
        }
        if (block == DEAD_BUSH) {
            return below == SAND;
        }
        if (block == PUMPKIN) {
            return below != AIR;
        }
        if (block == TALL_GRASS) {
            return below == DIRT || below == GRASS_BLOCK;
        }
        if (block == BROWN_MUSHROOM || block == RED_MUSHROOM) {
            int light = Math.max(w.getBlockLight(x, y, z), w.getSkyLight(x, y, z));
            return (below == DIRT || below == GRASS_BLOCK) && light < 13;
        }
        if (block == SUGAR_CANE) {
            Material x0z1 = w.getType(x, y - 1, z + 1);
            Material x0z_1 = w.getType(x, y - 1, z - 1);
            Material x1z0 = w.getType(x + 1, y - 1, z);
            Material x_1z0 = w.getType(x - 1, y - 1, z);
            return below == SUGAR_CANE
                    || ((below == DIRT || below == GRASS_BLOCK || below == SAND)
                    && (isLiquid(x1z0) || isLiquid(x_1z0) || isLiquid(x0z1) || isLiquid(x0z_1)));
        }
        throw new IllegalArgumentException(block.name());
    }

    public static boolean Material_isBuildable(ISimpleWorld w, int x, int y, int z) {
        Boolean s = buildableMapping.get(w.getType(x, y, z));
        return s == null ? false : s;
    }

    private MinecraftMethods() {
        throw new IllegalStateException();
    }
}
