package Reactioncraft.bookcase.common;

import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import static net.minecraftforge.common.ForgeDirection.*;

public class Blockbookshelfchest extends BlockContainer
{
	Icon textureTop;
	Icon textureFront;
	Icon textureSide;

    private final Random random = new Random();

    public Blockbookshelfchest(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(RCB.Reactioncraft);
    }
    
    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 0;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);
        this.unifyAdjacentChests(par1World, par2, par3, par4);
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);

        if (l == this.blockID)
        {
            this.unifyAdjacentChests(par1World, par2, par3, par4 - 1);
        }

        if (i1 == this.blockID)
        {
            this.unifyAdjacentChests(par1World, par2, par3, par4 + 1);
        }

        if (j1 == this.blockID)
        {
            this.unifyAdjacentChests(par1World, par2 - 1, par3, par4);
        }

        if (k1 == this.blockID)
        {
            this.unifyAdjacentChests(par1World, par2 + 1, par3, par4);
        }
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = par1World.getBlockId(par2, par3, par4 - 1);
        int i1 = par1World.getBlockId(par2, par3, par4 + 1);
        int j1 = par1World.getBlockId(par2 - 1, par3, par4);
        int k1 = par1World.getBlockId(par2 + 1, par3, par4);
        byte b0 = 0;
        int l1 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l1 == 0)
        {
            b0 = 2;
        }

        if (l1 == 1)
        {
            b0 = 5;
        }

        if (l1 == 2)
        {
            b0 = 3;
        }

        if (l1 == 3)
        {
            b0 = 4;
        }

        if (l != this.blockID && i1 != this.blockID && j1 != this.blockID && k1 != this.blockID)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
        }
        else
        {
            if ((l == this.blockID || i1 == this.blockID) && (b0 == 4 || b0 == 5))
            {
                if (l == this.blockID)
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4 - 1, b0, 3);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4 + 1, b0, 3);
                }

                par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
            }

            if ((j1 == this.blockID || k1 == this.blockID) && (b0 == 2 || b0 == 3))
            {
                if (j1 == this.blockID)
                {
                    par1World.setBlockMetadataWithNotify(par2 - 1, par3, par4, b0, 3);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2 + 1, par3, par4, b0, 3);
                }

                par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
            }
        }

        if (par6ItemStack.hasDisplayName())
        {
            ((TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4)).func_94043_a(par6ItemStack.getDisplayName());
        }
    }

    /**
     * Turns the adjacent chests to a double chest.
     */
    public void unifyAdjacentChests(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            int l = par1World.getBlockId(par2, par3, par4 - 1);
            int i1 = par1World.getBlockId(par2, par3, par4 + 1);
            int j1 = par1World.getBlockId(par2 - 1, par3, par4);
            int k1 = par1World.getBlockId(par2 + 1, par3, par4);
            boolean flag = true;
            int l1;
            int i2;
            boolean flag1;
            byte b0;
            int j2;

            if (l != this.blockID && i1 != this.blockID)
            {
                if (j1 != this.blockID && k1 != this.blockID)
                {
                    b0 = 3;

                    if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
                    {
                        b0 = 3;
                    }

                    if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
                    {
                        b0 = 2;
                    }

                    if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
                    {
                        b0 = 5;
                    }

                    if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
                    {
                        b0 = 4;
                    }
                }
                else
                {
                    l1 = par1World.getBlockId(j1 == this.blockID ? par2 - 1 : par2 + 1, par3, par4 - 1);
                    i2 = par1World.getBlockId(j1 == this.blockID ? par2 - 1 : par2 + 1, par3, par4 + 1);
                    b0 = 3;
                    flag1 = true;

                    if (j1 == this.blockID)
                    {
                        j2 = par1World.getBlockMetadata(par2 - 1, par3, par4);
                    }
                    else
                    {
                        j2 = par1World.getBlockMetadata(par2 + 1, par3, par4);
                    }

                    if (j2 == 2)
                    {
                        b0 = 2;
                    }

                    if ((Block.opaqueCubeLookup[l] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[i2])
                    {
                        b0 = 3;
                    }

                    if ((Block.opaqueCubeLookup[i1] || Block.opaqueCubeLookup[i2]) && !Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[l1])
                    {
                        b0 = 2;
                    }
                }
            }
            else
            {
                l1 = par1World.getBlockId(par2 - 1, par3, l == this.blockID ? par4 - 1 : par4 + 1);
                i2 = par1World.getBlockId(par2 + 1, par3, l == this.blockID ? par4 - 1 : par4 + 1);
                b0 = 5;
                flag1 = true;

                if (l == this.blockID)
                {
                    j2 = par1World.getBlockMetadata(par2, par3, par4 - 1);
                }
                else
                {
                    j2 = par1World.getBlockMetadata(par2, par3, par4 + 1);
                }

                if (j2 == 4)
                {
                    b0 = 4;
                }

                if ((Block.opaqueCubeLookup[j1] || Block.opaqueCubeLookup[l1]) && !Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[i2])
                {
                    b0 = 5;
                }

                if ((Block.opaqueCubeLookup[k1] || Block.opaqueCubeLookup[i2]) && !Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[l1])
                {
                    b0 = 4;
                }
            }

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 3);
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int l = 0;

        if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID)
        {
            ++l;
        }

        if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
        {
            ++l;
        }

        if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID)
        {
            ++l;
        }

        if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)
        {
            ++l;
        }

        return l > 1 ? false : (this.isThereANeighborChest(par1World, par2 - 1, par3, par4) ? false : (this.isThereANeighborChest(par1World, par2 + 1, par3, par4) ? false : (this.isThereANeighborChest(par1World, par2, par3, par4 - 1) ? false : !this.isThereANeighborChest(par1World, par2, par3, par4 + 1))));
    }

    /**
     * Checks the neighbor blocks to see if there is a chest there. Args: world, x, y, z
     */
    private boolean isThereANeighborChest(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockId(par2, par3, par4) != this.blockID ? false : (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID ? true : (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID ? true : (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID ? true : par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        TileEntityBookcaseChest TileEntityBookcaseChest = (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (TileEntityBookcaseChest != null)
        {
            TileEntityBookcaseChest.updateContainingBlockInfo();
        }
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        TileEntityBookcaseChest TileEntityBookcaseChest = (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (TileEntityBookcaseChest != null)
        {
            for (int j1 = 0; j1 < TileEntityBookcaseChest.getSizeInventory(); ++j1)
            {
                ItemStack itemstack = TileEntityBookcaseChest.getStackInSlot(j1);

                if (itemstack != null)
                {
                    float f = this.random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; par1World.spawnEntityInWorld(entityitem))
                    {
                        int k1 = this.random.nextInt(21) + 10;

                        if (k1 > itemstack.stackSize)
                        {
                            k1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= k1;
                        entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);

                        if (itemstack.hasTagCompound())
                        {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            par1World.func_96440_m(par2, par3, par4, par5);
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
        {
            return true;
        }
        else
        {
            IInventory iinventory = this.getInventory(par1World, par2, par3, par4);

            if (iinventory != null)
            {
            	par5EntityPlayer.displayGUIChest(iinventory);
            }

            return true;
        }
    }

    /**
     * Gets the inventory of the chest at the specified coords, accounting for blocks or ocelots on top of the chest,
     * and double chests.
     */
    public IInventory getInventory(World par1World, int par2, int par3, int par4)
    {
        Object object = (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4);

        if (object == null)
        {
            return null;
        }
        else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, DOWN))
        {
            return null;
        }
        else if (isOcelotBlockingChest(par1World, par2, par3, par4))
        {
            return null;
        }
        else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, DOWN) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, DOWN) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1)))
        {
            return null;
        }
        else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1)))
        {
            return null;
        }
        else
        {
            if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID)
            {
                object = new InventoryLargeChest("Large Bookcase Chest", (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2 - 1, par3, par4), (IInventory)object);
            }

            if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
            {
                object = new InventoryLargeChest("Large Bookcase Chest", (IInventory)object, (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2 + 1, par3, par4));
            }

            if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID)
            {
                object = new InventoryLargeChest("Large Bookcase Chest", (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4 - 1), (IInventory)object);
            }

            if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID)
            {
                object = new InventoryLargeChest("Large Bookcase Chest", (IInventory)object, (TileEntityBookcaseChest)par1World.getBlockTileEntity(par2, par3, par4 + 1));
            }

            return (IInventory)object;
        }
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        TileEntityBookcaseChest TileEntityBookcaseChest = new TileEntityBookcaseChest();
        return TileEntityBookcaseChest;
    }

    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (!this.canProvidePower())
        {
            return 0;
        }
        else
        {
            int i1 = ((TileEntityBookcaseChest)par1IBlockAccess.getBlockTileEntity(par2, par3, par4)).numUsingPlayers;
            return MathHelper.clamp_int(i1, 0, 15);
        }
    }

    /**
     * Returns true if the block is emitting direct/strong redstone power on the specified side. Args: World, X, Y, Z,
     * side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return par5 == 1 ? this.isProvidingWeakPower(par1IBlockAccess, par2, par3, par4, par5) : 0;
    }

    /**
     * Looks for a sitting ocelot within certain bounds. Such an ocelot is considered to be blocking access to the
     * chest.
     */
    public static boolean isOcelotBlockingChest(World par0World, int par1, int par2, int par3)
    {
        Iterator iterator = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().getAABB((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();
        EntityOcelot entityocelot;

        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }

            EntityOcelot entityocelot1 = (EntityOcelot)iterator.next();
            entityocelot = (EntityOcelot)entityocelot1;
        }
        while (!entityocelot.isSitting());

        return true;
    }

    /**
     * If this returns true, then comparators facing away from this block will use the value from
     * getComparatorInputOverride instead of the actual redstone signal strength.
     */
    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    /**
     * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
     * strength when this block inputs to a comparator.
     */
    public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory)par1World.getBlockTileEntity(par2, par3, par4));
    }
    
    @Override
	public Icon getIcon(int i, int j) 
    {
		// If no metadata is set, then this is an icon.
		if (j == 0 && i == 3)
			return textureFront;

		if (i == j)
			return textureFront;

		switch (i) 
		{
		case 0:return textureTop;
		case 1:return textureTop;
		case 2:return textureSide;
		case 3:return textureSide;
		case 4:return textureSide;
		case 5:return textureSide;
			
		default:return textureSide;
		}
	}
    
    @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    textureSide  = par1IconRegister.registerIcon("reactioncraft:IronBookcasedoorBlock_lower");
        textureTop   = par1IconRegister.registerIcon("reactioncraft:wood");
        textureFront = par1IconRegister.registerIcon("reactioncraft:IronBookcasedoorBlock_lower");
	}
    
    public int getEnchantPower(World world, int x, int y, int z)
    {
        return blockID == IntegratedBlocks.Bookcasechest.blockID ? 1 : 1;
    }
}
