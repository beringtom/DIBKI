package blocks.renderer;

import blocks.BlockInfo;
import lib.ModInfo;
import models.modelGreenEdgedTable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

/**
 * Created by admin on 16-03-2015.
 */

public class TileEntityGreenEdgedTableRenderer extends TileEntitySpecialRenderer {

    //The model of your block
    private final modelGreenEdgedTable model;
    private  static final ResourceLocation textures = (new ResourceLocation(ModInfo.TEXTURE_LOCATION + ":" + "textures/blocks/" + BlockInfo.GREENEDGEDTABLE_TEXTURE + ".png"));

    public TileEntityGreenEdgedTableRenderer() {
        this.model = new modelGreenEdgedTable();
    }

    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        GL11.glPushMatrix();
        GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //binding the textures
        this.bindTexture(textures);

        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        //A reference to your Model file. Again, very important.
        this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
