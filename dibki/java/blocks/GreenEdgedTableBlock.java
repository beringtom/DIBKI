package blocks;

import blocks.tileEntities.TileEntityGreenEdgedTable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dibki.DIBKI;
import lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by beringtom on 15-03-2015.
 */

public class GreenEdgedTableBlock extends BlockContainer {

    public GreenEdgedTableBlock(Material material) {
        super(material);
        this.setHardness(2.0f);
        this.setStepSound(Block.soundTypeWood);
        this.setBlockName(BlockInfo.GREENEDGEDTABLE_UNLOCALIZED_NAME);
        this.setCreativeTab(DIBKI.dibkiTab);
        this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
    }


    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityGreenEdgedTable();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register){
       register.registerIcon(ModInfo.TEXTURE_LOCATION+ ":" + BlockInfo.GREENEDGEDTABLE_TEXTURE);
    }
}
