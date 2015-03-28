package lib;

import blocks.GreenEdgedTableBlock;
import blocks.blocks;
import blocks.renderer.ItemRenderGreenEdgedTable;
import blocks.renderer.TileEntityGreenEdgedTableRenderer;
import blocks.tileEntities.TileEntityGreenEdgedTable;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by beringtom on 05-03-14.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void initSounds() {
        //init sounds
    }

    @Override
    public void initRenderers() {

        TileEntitySpecialRenderer render = new TileEntityGreenEdgedTableRenderer();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGreenEdgedTable.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(blocks.greenEdgeTable), new ItemRenderGreenEdgedTable(render, new TileEntityGreenEdgedTable()));

    }

}
