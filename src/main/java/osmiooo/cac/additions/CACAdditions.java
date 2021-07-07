package osmiooo.cac.additions;

import com.alphastudios.cavebiomeapi.core.api.CaveBiomeAPI;
import com.google.common.reflect.Reflection;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import osmiooo.cac.additions.block.IcyStoneBlock;
import osmiooo.cac.additions.world.biomes.BurntCavesBiome;
import osmiooo.cac.additions.world.biomes.IceCavesBiome;

public class CACAdditions implements ModInitializer {

	public static final Block Icy_Stone_BLOCK = Registry.register(Registry.BLOCK, new Identifier("cacadditions", "icy_stone"), new IcyStoneBlock());
	public static final BlockItem Icy_Stone_ITEM = Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_stone"),
			new BlockItem(Icy_Stone_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	public static final Block ICED_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_COBBLED_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f, 3.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block SNOWY_ICE_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 1.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(2f, 2f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICY_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block ICED_DEEPSLATE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f, 1.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(2f, 2f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_COBBLED_DEEPSLATE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5f, 3.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3f, 3f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_COAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_COPPER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_IRON_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_GOLD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_REDSTONE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_LAPIS_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_EMERALD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());
	public static final Block BURNT_DEEPSLATE_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());


	@Override
	public void onInitialize() {

		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_cobblestone"), ICY_COBBLESTONE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_cobblestone"), new BlockItem(ICY_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate"), ICED_DEEPSLATE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate"), new BlockItem(ICED_DEEPSLATE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_cobbled_deepslate"), ICED_COBBLED_DEEPSLATE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_cobbled_deepslate"), new BlockItem(ICED_COBBLED_DEEPSLATE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","snowy_ice_stone"), SNOWY_ICE_STONE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "snowy_ice_stone"), new BlockItem(SNOWY_ICE_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_coal_ore"), ICY_COAL_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_coal_ore"), new BlockItem(ICY_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_copper_ore"), ICY_COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_copper_ore"), new BlockItem(ICY_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_iron_ore"), ICY_IRON_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_iron_ore"), new BlockItem(ICY_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_gold_ore"), ICY_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_gold_ore"), new BlockItem(ICY_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_redstone_ore"), ICY_REDSTONE_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_redstone_ore"), new BlockItem(ICY_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_lapis_ore"), ICY_LAPIS_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_lapis_ore"), new BlockItem(ICY_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_emerald_ore"), ICY_EMERALD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_emerald_ore"), new BlockItem(ICY_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","icy_diamond_ore"), ICY_DIAMOND_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "icy_diamond_ore"), new BlockItem(ICY_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_coal_ore"), ICED_DEEPSLATE_COAL_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_coal_ore"), new BlockItem(ICED_DEEPSLATE_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_copper_ore"), ICED_DEEPSLATE_COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_copper_ore"), new BlockItem(ICED_DEEPSLATE_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_iron_ore"), ICED_DEEPSLATE_IRON_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_iron_ore"), new BlockItem(ICED_DEEPSLATE_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_gold_ore"), ICED_DEEPSLATE_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_gold_ore"), new BlockItem(ICED_DEEPSLATE_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_redstone_ore"), ICED_DEEPSLATE_REDSTONE_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_redstone_ore"), new BlockItem(ICED_DEEPSLATE_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_lapis_ore"), ICED_DEEPSLATE_LAPIS_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_lapis_ore"), new BlockItem(ICED_DEEPSLATE_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_emerald_ore"), ICED_DEEPSLATE_EMERALD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_emerald_ore"), new BlockItem(ICED_DEEPSLATE_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","iced_deepslate_diamond_ore"), ICED_DEEPSLATE_DIAMOND_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "iced_deepslate_diamond_ore"), new BlockItem(ICED_DEEPSLATE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_stone"), BURNT_STONE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_stone"), new BlockItem(BURNT_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_cobblestone"), BURNT_COBBLESTONE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_cobblestone"), new BlockItem(BURNT_COBBLESTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate"), BURNT_DEEPSLATE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate"), new BlockItem(BURNT_DEEPSLATE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_cobbled_deepslate"), BURNT_COBBLED_DEEPSLATE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_cobbled_deepslate"), new BlockItem(BURNT_COBBLED_DEEPSLATE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_coal_ore"), BURNT_COAL_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_coal_ore"), new BlockItem(BURNT_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_copper_ore"), BURNT_COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_copper_ore"), new BlockItem(BURNT_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_iron_ore"), BURNT_IRON_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_iron_ore"), new BlockItem(BURNT_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_gold_ore"), BURNT_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_gold_ore"), new BlockItem(BURNT_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_redstone_ore"), BURNT_REDSTONE_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_redstone_ore"), new BlockItem(BURNT_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_lapis_ore"), BURNT_LAPIS_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_lapis_ore"), new BlockItem(BURNT_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_emerald_ore"), BURNT_EMERALD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_emerald_ore"), new BlockItem(BURNT_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_diamond_ore"), BURNT_DIAMOND_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_diamond_ore"), new BlockItem(BURNT_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_coal_ore"), BURNT_DEEPSLATE_COAL_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_coal_ore"), new BlockItem(BURNT_DEEPSLATE_COAL_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_copper_ore"), BURNT_DEEPSLATE_COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_copper_ore"), new BlockItem(BURNT_DEEPSLATE_COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_iron_ore"), BURNT_DEEPSLATE_IRON_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_iron_ore"), new BlockItem(BURNT_DEEPSLATE_IRON_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_gold_ore"), BURNT_DEEPSLATE_GOLD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_gold_ore"), new BlockItem(BURNT_DEEPSLATE_GOLD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_redstone_ore"), BURNT_DEEPSLATE_REDSTONE_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_redstone_ore"), new BlockItem(BURNT_DEEPSLATE_REDSTONE_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_lapis_ore"), BURNT_DEEPSLATE_LAPIS_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_lapis_ore"), new BlockItem(BURNT_DEEPSLATE_LAPIS_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_emerald_ore"), BURNT_DEEPSLATE_EMERALD_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_emerald_ore"), new BlockItem(BURNT_DEEPSLATE_EMERALD_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("cacadditions","burnt_deepslate_diamond_ore"), BURNT_DEEPSLATE_DIAMOND_ORE);
		Registry.register(Registry.ITEM, new Identifier("cacadditions", "burnt_deepslate_diamond_ore"), new BlockItem(BURNT_DEEPSLATE_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Reflection.initialize(
			IceCavesBiome.class,
			BurntCavesBiome.class
		);

	}

	public static void addDefaultCaves() {
		CaveBiomeAPI.addCaveBiome(IceCavesBiome.ICE_CAVES, new Biome.MixedNoisePoint(-0.745F, -0.475F, -0.15F, -0.215F, 0.0F));
		CaveBiomeAPI.addCaveBiome(BurntCavesBiome.BURNT_CAVES, new Biome.MixedNoisePoint(-0.64F, -0.411F, -0.15F, - 0.15F, 0.0F));
	}
	
	static {
        addDefaultCaves();
    }
}