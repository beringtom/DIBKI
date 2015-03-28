package blocks;

import blocks.tileEntities.TileEntityGreenEdgedTable;
import blocks.tileEntities.TileEntityInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by beringtom on 04-03-14.
 */

public class blocks {

    public static Block greenEdgeTable;


	public static void init() {

        greenEdgeTable = new GreenEdgedTableBlock(Material.wood);

        GameRegistry.registerBlock(greenEdgeTable, BlockInfo.GREENEDGEDTABLE_KEY);

	}

	public static void addNames() {

        LanguageRegistry.addName(greenEdgeTable, BlockInfo.GREENEDGEDTABLE_NAME);

	}

	public static void registerTileEntities()
	{
        GameRegistry.registerTileEntity(TileEntityGreenEdgedTable.class, "tileEntityGreenEdgedTable");

    }
}
