package Reactioncraft.bookcase.common;

import java.util.Random;

import Reactioncraft.bookcase.RCBB;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;


public class WorldGenWizimLibary extends WorldGenerator
{
	private ItemStack book1 = new ItemStack(Item.writtenBook);
	private ItemStack book2 = new ItemStack(Item.writtenBook);
	private ItemStack book3 = new ItemStack(Item.writtenBook);
	private ItemStack book4 = new ItemStack(Item.writtenBook);
	private ItemStack book5 = new ItemStack(Item.writtenBook);
	private ItemStack book6 = new ItemStack(Item.writtenBook);
	private ItemStack book7 = new ItemStack(Item.writtenBook);
	private ItemStack book8 = new ItemStack(Item.writtenBook);


    public int[] GetValidSpawnBlocks()
    {
        return new int[] {Block.grass.blockID, 0};
    }

    public boolean LocationIsValidSpawn(World var1, int var2, int var3, int var4)
    {
        int var5 = 0;

        for (int var6 = var1.getBlockId(var2, var3, var4); var6 != 0; var6 = var1.getBlockId(var2, var3 + var5, var4))
        {
            ++var5;
        }

        if (var5 > 3)
        {
            return false;
        }
        else
        {
            var3 += var5 - 1;
            int var7 = var1.getBlockId(var2, var3, var4);
            int var8 = var1.getBlockId(var2, var3 + 1, var4);
            int var9 = var1.getBlockId(var2, var3 - 1, var4);
            int[] var10 = this.GetValidSpawnBlocks();
            int var11 = var10.length;

            for (int var12 = 0; var12 < var11; ++var12)
            {
                int var13 = var10[var12];

                if (var8 != 0)
                {
                    return false;
                }

                if (var7 == var13)
                {
                    return true;
                }

                if (var7 == Block.snow.blockID && var9 == var13)
                {
                    return true;
                }
            }

            return false;
        }
    }

    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        if (this.LocationIsValidSpawn(var1, var3, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 31, var4, var5) && this.LocationIsValidSpawn(var1, var3 + 31, var4, var5 + 26) && this.LocationIsValidSpawn(var1, var3, var4, var5 + 26))
        {
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 5, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 19, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 0, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 5, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 19, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 1, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 5, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 19, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 2, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 5, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 10, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 14, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 19, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 1, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 1, var5 + 11, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 1, var5 + 12, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 1, var5 + 13, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 1, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 5, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 6, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 7, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 8, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 9, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 15, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 16, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 17, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 18, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 3, var4 + 10, var5 + 19, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 5, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 6, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 8, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 10, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 11, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 12, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 13, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 14, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 16, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 18, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 19, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 5, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 6, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 7, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 8, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 9, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 10, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 11, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 12, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 13, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 14, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 15, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 16, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 17, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 18, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 19, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 7, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 9, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 11, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 12, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 13, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 15, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 17, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 5, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 6, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 7, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 8, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 9, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 15, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 16, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 17, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 18, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 3, var5 + 19, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 5, Block.stairsCobblestone.blockID, 4);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 6, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 7, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 8, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 9, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 15, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 16, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 17, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 6, var5 + 18, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 5, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 7, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 8, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 10, Block.stairsCobblestone.blockID, 4);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 11, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 12, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 13, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 14, Block.stairsCobblestone.blockID, 4);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 16, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 17, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 7, var5 + 19, Block.stairsCobblestone.blockID, 4);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 7, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 8, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 10, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 14, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 16, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 17, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 8, var5 + 19, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 7, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 8, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 16, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 17, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 9, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 4, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 5, Block.stoneDoubleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 7, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 8, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 10, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 11, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 12, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 13, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 14, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 16, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 17, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 19, Block.stoneDoubleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 10, var5 + 20, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 6, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 7, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 8, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 9, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 15, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 16, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 17, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 4, var4 + 11, var5 + 18, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 6, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 7, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 8, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 9, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 10, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 11, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 12, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 13, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 14, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 15, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 16, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 17, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 18, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 6, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 7, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 8, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 9, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 10, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 11, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 12, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 13, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 14, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 15, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 16, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 17, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 18, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 6, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 7, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 8, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 9, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 10, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 11, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 12, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 13, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 14, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 15, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 16, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 17, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 18, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 7, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 8, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 11, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 12, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 13, Block.stairsCobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 16, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 17, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 7, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 8, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 16, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 17, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 7, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 8, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 16, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 17, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 7, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 8, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 16, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 17, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 11, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 12, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 13, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 7, var5 + 20, Block.stairsCobblestone.blockID, 7);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 11, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 12, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 13, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 8, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 9, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 11, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 12, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 13, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 15, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 9, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 3, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 4, Block.stoneDoubleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 11, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 12, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 13, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 20, Block.stoneDoubleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 10, var5 + 21, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 5, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 6, Block.stoneDoubleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 10, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 11, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 12, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 13, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 14, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 5, var4 + 11, var5 + 19, Block.stoneSingleSlab.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 6, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 7, Block.stairsWoodOak.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 8, Block.stairsWoodOak.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 9, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 6, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 9, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 11, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 12, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 13, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 8, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 8, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 9, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 9, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 6, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 6, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 9, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 10, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 8, var5 + 12, Block.stairsWoodOak.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 7, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 14, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 15, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 16, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 17, Block.fenceGate.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 18, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 5, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 11, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 12, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 13, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 5, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 7, RCBB.Bookcasechest.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 8, RCBB.Bookcasechest.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 16, RCBB.Bookcasechest.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 17, RCBB.Bookcasechest.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 5, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 6, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 7, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 8, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 9, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 15, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 16, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 17, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 18, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 8, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 5, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 5, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 6, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 6, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 8, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 8, var5 + 12, Block.stairsWoodOak.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 8, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 9, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 9, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 7, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 8, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 9, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 10, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 9, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 5, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 6, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 7, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 10, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 5, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 5, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 6, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 7, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 8, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 9, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 10, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 11, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 14, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 15, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 16, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 17, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 18, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 5, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 16, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 19, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 4, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 5, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 6, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 7, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 18, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 19, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 20, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 5, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 6, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 7, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 8, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 9, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 15, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 16, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 17, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 18, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 19, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 11, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 8, var5 + 12, Block.stairsWoodOak.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 8, var5 + 19, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 12, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 4, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 20, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 5, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 5, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 6, var5 + 5, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 6, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 10, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 11, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 12, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 13, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 14, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 19, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 7, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 11, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 12, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 13, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 18, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 8, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 9, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 9, var5 + 5, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 9, var5 + 19, Block.fence.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 9, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 4, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 5, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 12, Block.web.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 19, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 20, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 5, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 6, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 7, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 8, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 9, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 10, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 11, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 12, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 13, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 14, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 15, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 16, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 17, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 18, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 19, Block.planks.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 13, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 0, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 1, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 2, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 3, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 6, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 7, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 8, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 9, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 10, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 11, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 12, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 13, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 14, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 15, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 16, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 17, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 18, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 21, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 22, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 23, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 24, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 25, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 0, var5 + 26, Block.grass.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 6, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 7, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 8, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 9, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 15, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 16, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 17, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 18, Block.planks.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 5, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 9, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 19, Block.wood.blockID, 1);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 20, Block.stairsCobblestone.blockID, 7);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 4, Block.stairsCobblestone.blockID, 2);
            var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 5, Block.cloth.blockID, 0);
            this.generate2(var1, var2, var3, var4, var5);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean generate2(World var1, Random var2, int var3, int var4, int var5)
    {
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 7, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 5, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 6, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 12, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 19, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 5, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 6, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 8, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 16, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 19, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 4, Block.stairsWoodOak.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 6, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 7, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 8, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 9, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 15, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 16, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 17, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 18, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 10, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 5, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 5, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 6, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 7, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 8, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 9, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 10, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 11, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 12, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 13, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 14, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 15, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 16, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 17, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 18, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 4, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 7, var5 + 20, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 8, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 8, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 9, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 9, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 10, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 10, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 15, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 20, Block.stairsCobblestone.blockID, 7);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 5, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 7, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 8, var5 + 5, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 8, var5 + 19, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 9, var5 + 5, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 9, var5 + 19, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 10, var5 + 4, Block.stairsWoodOak.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 10, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 10, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 6, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 7, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 8, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 9, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 5, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 5, var5 + 9, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 5, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 6, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 6, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 6, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 5, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 6, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 7, RCBB.Bookcasechest.blockID, 0);
        							
        
        TileEntityBookcaseChest chest2 = new TileEntityBookcaseChest();
        
        var1.setBlockTileEntity(var3 + 17, var4 + 9, var5 + 7, chest2);
        
        Random random = new Random();
       
        for(int slot = 0; slot < chest2.getSizeInventory(); slot++)
        {
               
                int num = random.nextInt(300);//change to higher than 30 once tested
               
                if (num == 1)
                {
                	
	                chest2.setInventorySlotContents(slot, book1);
	               	book1.stackTagCompound = new NBTTagCompound();
	                NBTTagList pages = new NBTTagList();
	                
	                pages.appendTag(new NBTTagString("", "The story of the wizim begins long ago, so long ago that it was around the begenning of the human race.\n" +
	                                                     "There were a certian group of individuals that caught the eye of the almighty Zeus.\n"  +
	                		                             "This tribe, at the time had no idea of the existance of the gods, much less a heritage of there own\n"));
	                
	                pages.appendTag(new NBTTagString("", "The tribe showed a great amount of knowledge, and various other traits that seemed out of place during there time\n"  +
	                                                     "Zues, wanting to further investigate them went to earth appearing as one of them.\n" +
	                                                     "He lived among them for 7 years, watching and trying to pinpoint what made them so special, though he couldn't find a signle clue\n"));
	                
	                pages.appendTag(new NBTTagString("", "Like as with many human women, Zeus found himself smitten with the humanly affection of love with one of the tribal women.\n" +
	                									 "Her name was Wiajzim, Like other humans he married her and with the blessing o the cheif Wakiakam, soon she bore a child.\n" +
	                									 "What struck Zeus oddly enough, was that his child showed even greater power than those before, and soon realised something was afoot.\n" +
	                									 "Farther off in another but still close galaxy reigned the god Neptune, who without informing the other Gods had also visited earth\n"));
	                
	                pages.appendTag(new NBTTagString("", "Where he had also by some coidence had taken pity on a feeble woman, that seemed near death.\n" +
	                									 "He saved her, though not without a price for his help. Before he left he impregnated her with his child.\n" +
	                									 "The child, a daughter who would  become the adopted princess of the feeble womans tribe the 'IZM'.\n"));
	                									 
	                pages.appendTag(new NBTTagString("", "In an attempt at peace the Cheiftan of the 'IZM' tribe offered his adopted princess to the Wakiakam Tribe's Grandson that would one day rule the tribe.\n" + 
	                									 "Soon once they reached the age of mating the Daughter of Neptune and the Son of Zeus married, and soon had a son.\n" +
	                									 "They Chose the name 'Wizim' for there son."));
	               
	                book1.stackTagCompound.setTag("pages", pages);
	                book1.stackTagCompound.setString("title", "Fragment of the Wizim History");
	                book1.stackTagCompound.setString("author", "The Wizim Historian");
                }
                
                if (num == 5)
                {
                	
                chest2.setInventorySlotContents(slot, book2);
               	book2.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
                
                pages.appendTag(new NBTTagString("", "The Above Newborn grandson of two gods only spurred the tribe onward, there might increasing beyond any who'd ever existed, more powerful than even Zeus himself.\n" +
                                                     "They began on a spree of invasions, pillaging those to weak to put up a resistance, and conquering the others and destroying there ways of life.\n"  +
                		                             "This lead to the other gods soon taking notice of the Dimigod race now lead by Wizim the grandson of Zeus and Neptune, who now call them selves the 'Wizim'.\n"));
                
                pages.appendTag(new NBTTagString("", "Especially Hera, Zeus's Goddess wife and also the Goddess of marriage. soon she learned of the marriage of Zues and Wiajzim.\n"  +
                                                     "Enraged by the marriage and the effect of the race Zues unintentionally created, she decended upon earth and went to the palace where the now very elderly woman,\n" +
                                                     "Wiajzim was staying and living the life of luxury as her grandson Wizim said she should live and Killed her in cold blood.\n"));
                
                pages.appendTag(new NBTTagString("", "Then she cursed her spirit to the underworld as further torture, before fleeing to the underworld her self to make a secrete contract with hades,\n" +
                									 "With the intention of ruining the race of the Wizim. In her haste to do this before Zeus noticed this as he was still at the time living among the Wizim\n" +
                									 "she signed the contract now known as the contract of Eros-gon. Giving Hades permission to start the fragmentation of the race.\n" +
                									 "Hera returned to Mount Olympus the home of the gods soon afterwords without anyone knowing she had ever left.\n"));
                
                pages.appendTag(new NBTTagString("", "Three days later Zues who was out with his grandson Wizim watching him lead the glorious armies of the wizim on there conquests, soon learned of Wijazim's Fate\n" +
                									 "He then rushed to the war camp across the temporary village created by the army during there break from the march and interupted the war meeting between Wizim and his Generals\n +" +
                									 "and informed him of his Grandmothers fate. He then ordered a hault to the conquests until the tribe wide mourning period was over."));
                									 
                pages.appendTag(new NBTTagString("", "Zeus who returned to the palace ahead of Wizim who had to reorganise the troops retreat, saw the body of his wife, and noticed that the weapon which killed her was not of mortal creation.\n" + 
                									 "Soon afterwords he had messenger take a later he wrote to Wizim saying that he must go on a trip alone to sort out his life and telling him that he will not be returning.\n" +
                									 "Zeus soon left his mortal form and returned to Mount Olympus.. where he resumed his duties as the most powerful God.. though still keeping slight watch over the Wizim."));
               
                book2.stackTagCompound.setTag("pages", pages);
                book2.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book2.stackTagCompound.setString("author", "The Wizim Historian");
 
                }
               
                if (num == 10)
                {
                	
                chest2.setInventorySlotContents(slot, book3);
               	book3.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
                
                pages.appendTag(new NBTTagString("", "Hades who waited a year after Zeus' departure finally decided to act with the powers granted to him through the contract of Eros-gon" +
                                                     "His plan was to divide the wizim into two species, to do so he impregnated a hunter woman of the Wizim.\n"  +
                		                             "The Woman whos name was lost to time, or is found in a book not found in our archives bore hades Quadruplets two sons and two daughters.\n"));
                
                pages.appendTag(new NBTTagString("", "The woman named her children after the contract that brought them to her as he was deemed unable to bear children at a young age."  +
                                                     "The Eragonians shortened to Eragonn soon grew old enough to work. The Daughters grew to be two of the most skilled Hunters in the tribe of the Wizim.\n" +
                                                     "The Sons grew to be two of the best combatants of the wizim tribes army.\n"));
                
                pages.appendTag(new NBTTagString("", "From four to eight, from eight to sixteen, the Eragonians numbers grew and they began to become noticibly different in height and showed more warrior like traits\n" +
                									 "The Eragonians whos numbers now equaled 30% of the Wizim Tribe which spanned a large territory with over a million or so citizens\n" +
                									 "The now Cheiftan of the Wizim tribe Wizim 3 Great Great Grandson of Wizim deemed the age of the Tribe over.\n" +
                									 "He then Proclaimed himself Emperor Wizim of the Imperial Wizim Empire.\n"));
                
                pages.appendTag(new NBTTagString("", "Now Eragonn great grandson of the first Eragonian son of Hades, proclaimed himself Viceroy Eragonn of Eragonians.\n" +
                									 "Thus causing the great 'Wizim Split' which lead to the caste system of Eragonians being categorized as lower 'Wizim' and not as pure as 'Wizim'.\n"));
                									 
                pages.appendTag(new NBTTagString("", "Emperor Wizim soon called for a metting with the self proclaimed Viceroy of the Eragonians in an attempt for peace.\n" + 
                									 "He called for the Eragonians to stand down and disban there self created government and follow traditional Wizim law.\n" +
                									 "Viceroy Eragonn said 'We will never disban' and thus Emperor Wizim left after saying 'war it will be'."));
               
                book3.stackTagCompound.setTag("pages", pages);
                book3.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book3.stackTagCompound.setString("author", "The Wizim Historian");
                }
               
                if (num == 15)
                {
                	
                chest2.setInventorySlotContents(slot, book4);
               	book4.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
               	
               	pages.appendTag(new NBTTagString("", "The shadow of war draws closer, the Pureblood Wizim start arming there troops for war," +
               										 "The Eragonians also started arming there troops for war, but with more advanced machinery.\n"  +
               										 "Four weeks after the declaration of war and two weeks after the arming of the troops the empire had been split.\n"));

               	pages.appendTag(new NBTTagString("", "The Side Loyal to the Ways of old, The Eragonian Side, and the Smallest Reformist side that was Neutral."  +
               										 "The Side Loyal to the ways of old wanted to rid the empire of those who didnt follow traditional wizim law.\n" +
               										 "The Eragonians wanted to reform the government to allow for equal treatment of the Eragonians.\n"));

               	pages.appendTag(new NBTTagString("", "While those two sides both locked in destruction of the other....there were those on both sides that wanted a united government\n" +
               										 "With a Wizim King and an Eragonian King Ruling the empire as equals and deciding for the fate of the entire empire for its benefit.\n" +
						 							 "Five weeks later after thousands of battles on both of the two major sides of the empire the armys of the wizim and eragonn both 500,000 strong,\n" +
               										 "Were Decimated town to only 200,000 in a three month period.\n"));

               	pages.appendTag(new NBTTagString("", "Now the Wizim Holding there side of the empire and the eragonians fighting for every inch they could get went for an end game battle to settle the score once and for all.\n" +
               										 "The Eragonians decided that taking the city of 'Wizim' would break the enemy morale to the point of surrender and they reorganised all of there troops to bee-line towards the capital city under wizim control.\n"));
						 
               	pages.appendTag(new NBTTagString("", "The Wizim noticing the Eragonians armys lack of pushing on there lines realised that they had changed course to hit with force at the capital.\n" + 
               										 "So they called there entire force to defend the city to the last man.\n" +
               										 "400,000 men on both side entered the battle no soldiers remained at the end of the battle.\n"));
               	
               	pages.appendTag(new NBTTagString("", "The Bloodiest battle in Wizim history was at the hands of the people of its own empire.\n" +
                      								 "The Gods Wittnessing the battle spared only two from the battle the son of Emperor Wizim, Wizim 4 and the son of Emperor Eragonn, Eragonn 4.\n"));
               	
            	pages.appendTag(new NBTTagString("", "The Gods Decided that the only way to prevent a reoccurence of what brought an end to the empire of the wizim was to wipe the memories of both survivors.\n" +
							 						 "The Gods also had a fail safe in mind to ensure it will never occur they froze them both in time to be thawed out together and become friends.\n"));

               	
               	book4.stackTagCompound.setTag("pages", pages);
                book4.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book4.stackTagCompound.setString("author", "The Wizim Historian");
                
                }
                
                if (num == 20)
                {
                	
                	chest2.setInventorySlotContents(slot, book5);
                   	book5.stackTagCompound = new NBTTagCompound();
                   	NBTTagList pages = new NBTTagList();
                   	
                   	pages.appendTag(new NBTTagString("", "Though the collapse of the empire of the Wizim was swift the Reformists Survied," +
                   										 "Though not much is known about the Reformists its rumored that they continued to live in a modified society as equals.\n"  +
                   										 "There Society is theorized to be a Utopian Society with Wizim and Eragonians working as one people.\n"));

                   	book5.stackTagCompound.setTag("pages", pages);
                    book5.stackTagCompound.setString("title", "Fragment of the Wizim History");
                    book5.stackTagCompound.setString("author", "The Wizim Historian");
 
                }
                
                if (num == 25)
                {
                				
                	chest2.setInventorySlotContents(slot, book6);
                	book6.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
               	
                	pages.appendTag(new NBTTagString("", "All those with wizim blood running through there veins shall follow Wizim Law." +
               										     "All Wizim shall defend one another until death.\n"  +
               										     "'=W='.\n"));

                	book6.stackTagCompound.setTag("pages", pages);
                	book6.stackTagCompound.setString("title", "Wizim Law");
                	book6.stackTagCompound.setString("author", "The Wizim Law Maker");
                
                }
                
                if (num == 30)
                {
                				
                	chest2.setInventorySlotContents(slot, book7);
                	book7.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
               	
                	pages.appendTag(new NBTTagString("", "The people of the empire are debating on how to continue with there now being divisions of the populus," +
               										     "The warrior sect, and the General Public.\n"  +
               										     "Society cant handle this sudden change, the government isnt doing enough to stop it before it gets out of hand.\n"));

                	book7.stackTagCompound.setTag("pages", pages);
                	book7.stackTagCompound.setString("title", "The Wizim Split");
                	book7.stackTagCompound.setString("author", "The Eragonian Historian");
            
                }
                
                if (num == 30)
                {
                				
                	chest2.setInventorySlotContents(slot, book8);
                	book8.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
                	
                	
                	pages.appendTag(new NBTTagString("", "The story of the wizim begins long ago, so long ago that it was around the begenning of the human race.\n" +
                										 "There were a certian group of individuals that caught the eye of the almighty Zeus.\n"  +
                										 "This tribe, at the time had no idea of the existance of the gods, much less a heritage of there own\n"));

                	pages.appendTag(new NBTTagString("", "The tribe showed a great amount of knowledge, and various other traits that seemed out of place during there time\n"  +
                										 "Zues, wanting to further investigate them went to earth appearing as one of them.\n" +
                										 "He lived among them for 7 years, watching and trying to pinpoint what made them so special, though he couldn't find a signle clue\n"));

                	pages.appendTag(new NBTTagString("", "Like as with many human women, Zeus found himself smitten with the humanly affection of love with one of the tribal women.\n" +
                										 "Her name was Wiajzim, Like other humans he married her and with the blessing o the cheif Wakiakam, soon she bore a child.\n" +
                										 "What struck Zeus oddly enough, was that his child showed even greater power than those before, and soon realised something was afoot.\n" +
                										 "Farther off in another but still close galaxy reigned the god Neptune, who without informing the other Gods had also visited earth\n"));

                	pages.appendTag(new NBTTagString("", "Where he had also by some coidence had taken pity on a feeble woman, that seemed near death.\n" +
                										 "He saved her, though not without a price for his help. Before he left he impregnated her with his child.\n" +
                										 "The child, a daughter who would  become the adopted princess of the feeble womans tribe the 'IZM'.\n"));
							 
                	pages.appendTag(new NBTTagString("", "In an attempt at peace the Cheiftan of the 'IZM' tribe offered his adopted princess to the Wakiakam Tribe's Grandson that would one day rule the tribe.\n" + 
							 							 "Soon once they reached the age of mating the Daughter of Neptune and the Son of Zeus married, and soon had a son.\n" +
                										 "They Chose the name 'Wizim' for there son."));
                	
                	pages.appendTag(new NBTTagString("", "The Above Newborn grandson of two gods only spurred the tribe onward, there might increasing beyond any who'd ever existed, more powerful than even Zeus himself.\n" +
                             							 "They began on a spree of invasions, pillaging those to weak to put up a resistance, and conquering the others and destroying there ways of life.\n"  +
                										 "This lead to the other gods soon taking notice of the Dimigod race now lead by Wizim the grandson of Zeus and Neptune, who now call them selves the 'Wizim'.\n"));

                	pages.appendTag(new NBTTagString("", "Especially Hera, Zeus's Goddess wife and also the Goddess of marriage. soon she learned of the marriage of Zues and Wiajzim.\n"  +
                										 "Enraged by the marriage and the effect of the race Zues unintentionally created, she decended upon earth and went to the palace where the now very elderly woman,\n" +
                										 "Wiajzim was staying and living the life of luxury as her grandson Wizim said she should live and Killed her in cold blood.\n"));

                	pages.appendTag(new NBTTagString("", "Then she cursed her spirit to the underworld as further torture, before fleeing to the underworld her self to make a secrete contract with hades,\n" +
                										 "With the intention of ruining the race of the Wizim. In her haste to do this before Zeus noticed this as he was still at the time living among the Wizim\n" +
                										 "she signed the contract now known as the contract of Eros-gon. Giving Hades permission to start the fragmentation of the race.\n" +
							 							 "Hera returned to Mount Olympus the home of the gods soon afterwords without anyone knowing she had ever left.\n"));

                	pages.appendTag(new NBTTagString("", "Three days later Zues who was out with his grandson Wizim watching him lead the glorious armies of the wizim on there conquests, soon learned of Wijazim's Fate\n" +
                										 "He then rushed to the war camp across the temporary village created by the army during there break from the march and interupted the war meeting between Wizim and his Generals\n +" +
                										 "and informed him of his Grandmothers fate. He then ordered a hault to the conquests until the tribe wide mourning period was over."));
							 
                	pages.appendTag(new NBTTagString("", "Zeus who returned to the palace ahead of Wizim who had to reorganise the troops retreat, saw the body of his wife, and noticed that the weapon which killed her was not of mortal creation.\n" + 
                										 "Soon afterwords he had messenger take a later he wrote to Wizim saying that he must go on a trip alone to sort out his life and telling him that he will not be returning.\n" +
                					   					 "Zeus soon left his mortal form and returned to Mount Olympus.. where he resumed his duties as the most powerful God.. though still keeping slight watch over the Wizim."));
                	
                	pages.appendTag(new NBTTagString("", "Hades who waited a year after Zeus' departure finally decided to act with the powers granted to him through the contract of Eros-gon" +
                            							 "His plan was to divide the wizim into two species, to do so he impregnated a hunter woman of the Wizim.\n"  +
                            							 "The Woman whos name was lost to time, or is found in a book not found in our archives bore hades Quadruplets two sons and two daughters.\n"));

                	pages.appendTag(new NBTTagString("", "The woman named her children after the contract that brought them to her as he was deemed unable to bear children at a young age."  +
                            						     "The Eragonians shortened to Eragonn soon grew old enough to work. The Daughters grew to be two of the most skilled Hunters in the tribe of the Wizim.\n" +
                            							 "The Sons grew to be two of the best combatants of the wizim tribes army.\n"));

                	pages.appendTag(new NBTTagString("", "From four to eight, from eight to sixteen, the Eragonians numbers grew and they began to become noticibly different in height and showed more warrior like traits\n" +
                										 "The Eragonians whos numbers now equaled 30% of the Wizim Tribe which spanned a large territory with over a million or so citizens\n" +
                										 "The now Cheiftan of the Wizim tribe Wizim 3 Great Great Grandson of Wizim deemed the age of the Tribe over.\n" +
                										 "He then Proclaimed himself Emperor Wizim of the Imperial Wizim Empire.\n"));

                	pages.appendTag(new NBTTagString("", "Now Eragonn great grandson of the first Eragonian son of Hades, proclaimed himself Viceroy Eragonn of Eragonians.\n" +
							 							 "Thus causing the great 'Wizim Split' which lead to the caste system of Eragonians being categorized as lower 'Wizim' and not as pure as 'Wizim'.\n"));
							 
                	pages.appendTag(new NBTTagString("", "Emperor Wizim soon called for a metting with the self proclaimed Viceroy of the Eragonians in an attempt for peace.\n" + 
                										 "He called for the Eragonians to stand down and disban there self created government and follow traditional Wizim law.\n" +
                										 "Viceroy Eragonn said 'We will never disban' and thus Emperor Wizim left after saying 'war it will be'."));

                	
                	pages.appendTag(new NBTTagString("", "The shadow of war draws closer, the Pureblood Wizim start arming there troops for war," +
                										 "The Eragonians also started arming there troops for war, but with more advanced machinery.\n"  +
                										 "Four weeks after the declaration of war and two weeks after the arming of the troops the empire had been split.\n"));

                	pages.appendTag(new NBTTagString("", "The Side Loyal to the Ways of old, The Eragonian Side, and the Smallest Reformist side that was Neutral."  +
								                         "The Side Loyal to the ways of old wanted to rid the empire of those who didnt follow traditional wizim law.\n" +
                										 "The Eragonians wanted to reform the government to allow for equal treatment of the Eragonians.\n"));

					pages.appendTag(new NBTTagString("", "While those two sides both locked in destruction of the other....there were those on both sides that wanted a united government\n" +
													     "With a Wizim King and an Eragonian King Ruling the empire as equals and deciding for the fate of the entire empire for its benefit.\n" +
								 						 "Five weeks later after thousands of battles on both of the two major sides of the empire the armys of the wizim and eragonn both 500,000 strong,\n" +
								 						 "Were Decimated town to only 200,000 in a three month period.\n"));

					pages.appendTag(new NBTTagString("", "Now the Wizim Holding there side of the empire and the eragonians fighting for every inch they could get went for an end game battle to settle the score once and for all.\n" +
														 "The Eragonians decided that taking the city of 'Wizim' would break the enemy morale to the point of surrender and they reorganised all of there troops to bee-line towards the capital city under wizim control.\n"));

					pages.appendTag(new NBTTagString("", "The Wizim noticing the Eragonians armys lack of pushing on there lines realised that they had changed course to hit with force at the capital.\n" + 
														 "So they called there entire force to defend the city to the last man.\n" +
														 "400,000 men on both side entered the battle no soldiers remained at the end of the battle.\n"));

					pages.appendTag(new NBTTagString("", "The Bloodiest battle in Wizim history was at the hands of the people of its own empire.\n" +
								 						 "The Gods Wittnessing the battle spared only two from the battle the son of Emperor Wizim, Wizim 4 and the son of Emperor Eragonn, Eragonn 4.\n"));

					pages.appendTag(new NBTTagString("", "The Gods Decided that the only way to prevent a reoccurence of what brought an end to the empire of the wizim was to wipe the memories of both survivors.\n" +
	 						 							 "The Gods also had a fail safe in mind to ensure it will never occur they froze them both in time to be thawed out together and become friends.\n"));

                	
                	book8.stackTagCompound.setTag("pages", pages);
                	book8.stackTagCompound.setString("title", "The Complete History of The Wizim");
                	book8.stackTagCompound.setString("author", "The Reformist Historian");
                
                }
       
        }
        
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 8, RCBB.Bookcasechest.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 16, RCBB.Bookcasechest.blockID, 0);
        
 TileEntityBookcaseChest chest3 = new TileEntityBookcaseChest();
        
        var1.setBlockTileEntity(var3 + 17, var4 + 9, var5 + 16, chest3);
        
        Random random1 = new Random();
       
        for(int slot = 0; slot < chest2.getSizeInventory(); slot++)
        {
               
                int num = random.nextInt(300);//change to higher than 30 once tested
               
                if (num == 1)
                {
                	
	                chest3.setInventorySlotContents(slot, book1);
	               	book1.stackTagCompound = new NBTTagCompound();
	                NBTTagList pages = new NBTTagList();
	                
	                pages.appendTag(new NBTTagString("", "The story of the wizim begins long ago, so long ago that it was around the begenning of the human race.\n" +
	                                                     "There were a certian group of individuals that caught the eye of the almighty Zeus.\n"  +
	                		                             "This tribe, at the time had no idea of the existance of the gods, much less a heritage of there own\n"));
	                
	                pages.appendTag(new NBTTagString("", "The tribe showed a great amount of knowledge, and various other traits that seemed out of place during there time\n"  +
	                                                     "Zues, wanting to further investigate them went to earth appearing as one of them.\n" +
	                                                     "He lived among them for 7 years, watching and trying to pinpoint what made them so special, though he couldn't find a signle clue\n"));
	                
	                pages.appendTag(new NBTTagString("", "Like as with many human women, Zeus found himself smitten with the humanly affection of love with one of the tribal women.\n" +
	                									 "Her name was Wiajzim, Like other humans he married her and with the blessing o the cheif Wakiakam, soon she bore a child.\n" +
	                									 "What struck Zeus oddly enough, was that his child showed even greater power than those before, and soon realised something was afoot.\n" +
	                									 "Farther off in another but still close galaxy reigned the god Neptune, who without informing the other Gods had also visited earth\n"));
	                
	                pages.appendTag(new NBTTagString("", "Where he had also by some coidence had taken pity on a feeble woman, that seemed near death.\n" +
	                									 "He saved her, though not without a price for his help. Before he left he impregnated her with his child.\n" +
	                									 "The child, a daughter who would  become the adopted princess of the feeble womans tribe the 'IZM'.\n"));
	                									 
	                pages.appendTag(new NBTTagString("", "In an attempt at peace the Cheiftan of the 'IZM' tribe offered his adopted princess to the Wakiakam Tribe's Grandson that would one day rule the tribe.\n" + 
	                									 "Soon once they reached the age of mating the Daughter of Neptune and the Son of Zeus married, and soon had a son.\n" +
	                									 "They Chose the name 'Wizim' for there son."));
	               
	                book1.stackTagCompound.setTag("pages", pages);
	                book1.stackTagCompound.setString("title", "Fragment of the Wizim History");
	                book1.stackTagCompound.setString("author", "The Wizim Historian");
                }
                
                if (num == 5)
                {
                	
                chest3.setInventorySlotContents(slot, book2);
               	book2.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
                
                pages.appendTag(new NBTTagString("", "The Above Newborn grandson of two gods only spurred the tribe onward, there might increasing beyond any who'd ever existed, more powerful than even Zeus himself.\n" +
                                                     "They began on a spree of invasions, pillaging those to weak to put up a resistance, and conquering the others and destroying there ways of life.\n"  +
                		                             "This lead to the other gods soon taking notice of the Dimigod race now lead by Wizim the grandson of Zeus and Neptune, who now call them selves the 'Wizim'.\n"));
                
                pages.appendTag(new NBTTagString("", "Especially Hera, Zeus's Goddess wife and also the Goddess of marriage. soon she learned of the marriage of Zues and Wiajzim.\n"  +
                                                     "Enraged by the marriage and the effect of the race Zues unintentionally created, she decended upon earth and went to the palace where the now very elderly woman,\n" +
                                                     "Wiajzim was staying and living the life of luxury as her grandson Wizim said she should live and Killed her in cold blood.\n"));
                
                pages.appendTag(new NBTTagString("", "Then she cursed her spirit to the underworld as further torture, before fleeing to the underworld her self to make a secrete contract with hades,\n" +
                									 "With the intention of ruining the race of the Wizim. In her haste to do this before Zeus noticed this as he was still at the time living among the Wizim\n" +
                									 "she signed the contract now known as the contract of Eros-gon. Giving Hades permission to start the fragmentation of the race.\n" +
                									 "Hera returned to Mount Olympus the home of the gods soon afterwords without anyone knowing she had ever left.\n"));
                
                pages.appendTag(new NBTTagString("", "Three days later Zues who was out with his grandson Wizim watching him lead the glorious armies of the wizim on there conquests, soon learned of Wijazim's Fate\n" +
                									 "He then rushed to the war camp across the temporary village created by the army during there break from the march and interupted the war meeting between Wizim and his Generals\n +" +
                									 "and informed him of his Grandmothers fate. He then ordered a hault to the conquests until the tribe wide mourning period was over."));
                									 
                pages.appendTag(new NBTTagString("", "Zeus who returned to the palace ahead of Wizim who had to reorganise the troops retreat, saw the body of his wife, and noticed that the weapon which killed her was not of mortal creation.\n" + 
                									 "Soon afterwords he had messenger take a later he wrote to Wizim saying that he must go on a trip alone to sort out his life and telling him that he will not be returning.\n" +
                									 "Zeus soon left his mortal form and returned to Mount Olympus.. where he resumed his duties as the most powerful God.. though still keeping slight watch over the Wizim."));
               
                book2.stackTagCompound.setTag("pages", pages);
                book2.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book2.stackTagCompound.setString("author", "The Wizim Historian");
 
                }
               
                if (num == 10)
                {
                	
                chest3.setInventorySlotContents(slot, book3);
               	book3.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
                
                pages.appendTag(new NBTTagString("", "Hades who waited a year after Zeus' departure finally decided to act with the powers granted to him through the contract of Eros-gon" +
                                                     "His plan was to divide the wizim into two species, to do so he impregnated a hunter woman of the Wizim.\n"  +
                		                             "The Woman whos name was lost to time, or is found in a book not found in our archives bore hades Quadruplets two sons and two daughters.\n"));
                
                pages.appendTag(new NBTTagString("", "The woman named her children after the contract that brought them to her as he was deemed unable to bear children at a young age."  +
                                                     "The Eragonians shortened to Eragonn soon grew old enough to work. The Daughters grew to be two of the most skilled Hunters in the tribe of the Wizim.\n" +
                                                     "The Sons grew to be two of the best combatants of the wizim tribes army.\n"));
                
                pages.appendTag(new NBTTagString("", "From four to eight, from eight to sixteen, the Eragonians numbers grew and they began to become noticibly different in height and showed more warrior like traits\n" +
                									 "The Eragonians whos numbers now equaled 30% of the Wizim Tribe which spanned a large territory with over a million or so citizens\n" +
                									 "The now Cheiftan of the Wizim tribe Wizim 3 Great Great Grandson of Wizim deemed the age of the Tribe over.\n" +
                									 "He then Proclaimed himself Emperor Wizim of the Imperial Wizim Empire.\n"));
                
                pages.appendTag(new NBTTagString("", "Now Eragonn great grandson of the first Eragonian son of Hades, proclaimed himself Viceroy Eragonn of Eragonians.\n" +
                									 "Thus causing the great 'Wizim Split' which lead to the caste system of Eragonians being categorized as lower 'Wizim' and not as pure as 'Wizim'.\n"));
                									 
                pages.appendTag(new NBTTagString("", "Emperor Wizim soon called for a metting with the self proclaimed Viceroy of the Eragonians in an attempt for peace.\n" + 
                									 "He called for the Eragonians to stand down and disban there self created government and follow traditional Wizim law.\n" +
                									 "Viceroy Eragonn said 'We will never disban' and thus Emperor Wizim left after saying 'war it will be'."));
               
                book3.stackTagCompound.setTag("pages", pages);
                book3.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book3.stackTagCompound.setString("author", "The Wizim Historian");
                }
               
                if (num == 15)
                {
                	
                chest3.setInventorySlotContents(slot, book4);
               	book4.stackTagCompound = new NBTTagCompound();
               	NBTTagList pages = new NBTTagList();
               	
               	pages.appendTag(new NBTTagString("", "The shadow of war draws closer, the Pureblood Wizim start arming there troops for war," +
               										 "The Eragonians also started arming there troops for war, but with more advanced machinery.\n"  +
               										 "Four weeks after the declaration of war and two weeks after the arming of the troops the empire had been split.\n"));

               	pages.appendTag(new NBTTagString("", "The Side Loyal to the Ways of old, The Eragonian Side, and the Smallest Reformist side that was Neutral."  +
               										 "The Side Loyal to the ways of old wanted to rid the empire of those who didnt follow traditional wizim law.\n" +
               										 "The Eragonians wanted to reform the government to allow for equal treatment of the Eragonians.\n"));

               	pages.appendTag(new NBTTagString("", "While those two sides both locked in destruction of the other....there were those on both sides that wanted a united government\n" +
               										 "With a Wizim King and an Eragonian King Ruling the empire as equals and deciding for the fate of the entire empire for its benefit.\n" +
						 							 "Five weeks later after thousands of battles on both of the two major sides of the empire the armys of the wizim and eragonn both 500,000 strong,\n" +
               										 "Were Decimated town to only 200,000 in a three month period.\n"));

               	pages.appendTag(new NBTTagString("", "Now the Wizim Holding there side of the empire and the eragonians fighting for every inch they could get went for an end game battle to settle the score once and for all.\n" +
               										 "The Eragonians decided that taking the city of 'Wizim' would break the enemy morale to the point of surrender and they reorganised all of there troops to bee-line towards the capital city under wizim control.\n"));
						 
               	pages.appendTag(new NBTTagString("", "The Wizim noticing the Eragonians armys lack of pushing on there lines realised that they had changed course to hit with force at the capital.\n" + 
               										 "So they called there entire force to defend the city to the last man.\n" +
               										 "400,000 men on both side entered the battle no soldiers remained at the end of the battle.\n"));
               	
               	pages.appendTag(new NBTTagString("", "The Bloodiest battle in Wizim history was at the hands of the people of its own empire.\n" +
                      								 "The Gods Wittnessing the battle spared only two from the battle the son of Emperor Wizim, Wizim 4 and the son of Emperor Eragonn, Eragonn 4.\n"));
               	
            	pages.appendTag(new NBTTagString("", "The Gods Decided that the only way to prevent a reoccurence of what brought an end to the empire of the wizim was to wipe the memories of both survivors.\n" +
							 						 "The Gods also had a fail safe in mind to ensure it will never occur they froze them both in time to be thawed out together and become friends.\n"));

               	
               	book4.stackTagCompound.setTag("pages", pages);
                book4.stackTagCompound.setString("title", "Fragment of the Wizim History");
                book4.stackTagCompound.setString("author", "The Wizim Historian");
                
                }
                
                if (num == 20)
                {
                	
                	chest3.setInventorySlotContents(slot, book5);
                   	book5.stackTagCompound = new NBTTagCompound();
                   	NBTTagList pages = new NBTTagList();
                   	
                   	pages.appendTag(new NBTTagString("", "Though the collapse of the empire of the Wizim was swift the Reformists Survied," +
                   										 "Though not much is known about the Reformists its rumored that they continued to live in a modified society as equals.\n"  +
                   										 "There Society is theorized to be a Utopian Society with Wizim and Eragonians working as one people.\n"));

                   	book5.stackTagCompound.setTag("pages", pages);
                    book5.stackTagCompound.setString("title", "Fragment of the Wizim History");
                    book5.stackTagCompound.setString("author", "The Wizim Historian");
 
                }
                
                if (num == 25)
                {
                				
                	chest3.setInventorySlotContents(slot, book6);
                	book6.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
               	
                	pages.appendTag(new NBTTagString("", "All those with wizim blood running through there veins shall follow Wizim Law." +
               										     "All Wizim shall defend one another until death.\n"  +
               										     "'=W='.\n"));

                	book6.stackTagCompound.setTag("pages", pages);
                	book6.stackTagCompound.setString("title", "Wizim Law");
                	book6.stackTagCompound.setString("author", "The Wizim Law Maker");
                
                }
                
                if (num == 30)
                {
                				
                	chest3.setInventorySlotContents(slot, book7);
                	book7.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
               	
                	pages.appendTag(new NBTTagString("", "The people of the empire are debating on how to continue with there now being divisions of the populus," +
               										     "The warrior sect, and the General Public.\n"  +
               										     "Society cant handle this sudden change, the government isnt doing enough to stop it before it gets out of hand.\n"));

                	book7.stackTagCompound.setTag("pages", pages);
                	book7.stackTagCompound.setString("title", "The Wizim Split");
                	book7.stackTagCompound.setString("author", "The Eragonian Historian");
            
                }
                
                if (num == 30)
                {
                				
                	chest3.setInventorySlotContents(slot, book8);
                	book8.stackTagCompound = new NBTTagCompound();
                	NBTTagList pages = new NBTTagList();
                	
                	
                	pages.appendTag(new NBTTagString("", "The story of the wizim begins long ago, so long ago that it was around the begenning of the human race.\n" +
                										 "There were a certian group of individuals that caught the eye of the almighty Zeus.\n"  +
                										 "This tribe, at the time had no idea of the existance of the gods, much less a heritage of there own\n"));

                	pages.appendTag(new NBTTagString("", "The tribe showed a great amount of knowledge, and various other traits that seemed out of place during there time\n"  +
                										 "Zues, wanting to further investigate them went to earth appearing as one of them.\n" +
                										 "He lived among them for 7 years, watching and trying to pinpoint what made them so special, though he couldn't find a signle clue\n"));

                	pages.appendTag(new NBTTagString("", "Like as with many human women, Zeus found himself smitten with the humanly affection of love with one of the tribal women.\n" +
                										 "Her name was Wiajzim, Like other humans he married her and with the blessing o the cheif Wakiakam, soon she bore a child.\n" +
                										 "What struck Zeus oddly enough, was that his child showed even greater power than those before, and soon realised something was afoot.\n" +
                										 "Farther off in another but still close galaxy reigned the god Neptune, who without informing the other Gods had also visited earth\n"));

                	pages.appendTag(new NBTTagString("", "Where he had also by some coidence had taken pity on a feeble woman, that seemed near death.\n" +
                										 "He saved her, though not without a price for his help. Before he left he impregnated her with his child.\n" +
                										 "The child, a daughter who would  become the adopted princess of the feeble womans tribe the 'IZM'.\n"));
							 
                	pages.appendTag(new NBTTagString("", "In an attempt at peace the Cheiftan of the 'IZM' tribe offered his adopted princess to the Wakiakam Tribe's Grandson that would one day rule the tribe.\n" + 
							 							 "Soon once they reached the age of mating the Daughter of Neptune and the Son of Zeus married, and soon had a son.\n" +
                										 "They Chose the name 'Wizim' for there son."));
                	
                	pages.appendTag(new NBTTagString("", "The Above Newborn grandson of two gods only spurred the tribe onward, there might increasing beyond any who'd ever existed, more powerful than even Zeus himself.\n" +
                             							 "They began on a spree of invasions, pillaging those to weak to put up a resistance, and conquering the others and destroying there ways of life.\n"  +
                										 "This lead to the other gods soon taking notice of the Dimigod race now lead by Wizim the grandson of Zeus and Neptune, who now call them selves the 'Wizim'.\n"));

                	pages.appendTag(new NBTTagString("", "Especially Hera, Zeus's Goddess wife and also the Goddess of marriage. soon she learned of the marriage of Zues and Wiajzim.\n"  +
                										 "Enraged by the marriage and the effect of the race Zues unintentionally created, she decended upon earth and went to the palace where the now very elderly woman,\n" +
                										 "Wiajzim was staying and living the life of luxury as her grandson Wizim said she should live and Killed her in cold blood.\n"));

                	pages.appendTag(new NBTTagString("", "Then she cursed her spirit to the underworld as further torture, before fleeing to the underworld her self to make a secrete contract with hades,\n" +
                										 "With the intention of ruining the race of the Wizim. In her haste to do this before Zeus noticed this as he was still at the time living among the Wizim\n" +
                										 "she signed the contract now known as the contract of Eros-gon. Giving Hades permission to start the fragmentation of the race.\n" +
							 							 "Hera returned to Mount Olympus the home of the gods soon afterwords without anyone knowing she had ever left.\n"));

                	pages.appendTag(new NBTTagString("", "Three days later Zues who was out with his grandson Wizim watching him lead the glorious armies of the wizim on there conquests, soon learned of Wijazim's Fate\n" +
                										 "He then rushed to the war camp across the temporary village created by the army during there break from the march and interupted the war meeting between Wizim and his Generals\n +" +
                										 "and informed him of his Grandmothers fate. He then ordered a hault to the conquests until the tribe wide mourning period was over."));
							 
                	pages.appendTag(new NBTTagString("", "Zeus who returned to the palace ahead of Wizim who had to reorganise the troops retreat, saw the body of his wife, and noticed that the weapon which killed her was not of mortal creation.\n" + 
                										 "Soon afterwords he had messenger take a later he wrote to Wizim saying that he must go on a trip alone to sort out his life and telling him that he will not be returning.\n" +
                					   					 "Zeus soon left his mortal form and returned to Mount Olympus.. where he resumed his duties as the most powerful God.. though still keeping slight watch over the Wizim."));
                	
                	pages.appendTag(new NBTTagString("", "Hades who waited a year after Zeus' departure finally decided to act with the powers granted to him through the contract of Eros-gon" +
                            							 "His plan was to divide the wizim into two species, to do so he impregnated a hunter woman of the Wizim.\n"  +
                            							 "The Woman whos name was lost to time, or is found in a book not found in our archives bore hades Quadruplets two sons and two daughters.\n"));

                	pages.appendTag(new NBTTagString("", "The woman named her children after the contract that brought them to her as he was deemed unable to bear children at a young age."  +
                            						     "The Eragonians shortened to Eragonn soon grew old enough to work. The Daughters grew to be two of the most skilled Hunters in the tribe of the Wizim.\n" +
                            							 "The Sons grew to be two of the best combatants of the wizim tribes army.\n"));

                	pages.appendTag(new NBTTagString("", "From four to eight, from eight to sixteen, the Eragonians numbers grew and they began to become noticibly different in height and showed more warrior like traits\n" +
                										 "The Eragonians whos numbers now equaled 30% of the Wizim Tribe which spanned a large territory with over a million or so citizens\n" +
                										 "The now Cheiftan of the Wizim tribe Wizim 3 Great Great Grandson of Wizim deemed the age of the Tribe over.\n" +
                										 "He then Proclaimed himself Emperor Wizim of the Imperial Wizim Empire.\n"));

                	pages.appendTag(new NBTTagString("", "Now Eragonn great grandson of the first Eragonian son of Hades, proclaimed himself Viceroy Eragonn of Eragonians.\n" +
							 							 "Thus causing the great 'Wizim Split' which lead to the caste system of Eragonians being categorized as lower 'Wizim' and not as pure as 'Wizim'.\n"));
							 
                	pages.appendTag(new NBTTagString("", "Emperor Wizim soon called for a metting with the self proclaimed Viceroy of the Eragonians in an attempt for peace.\n" + 
                										 "He called for the Eragonians to stand down and disban there self created government and follow traditional Wizim law.\n" +
                										 "Viceroy Eragonn said 'We will never disban' and thus Emperor Wizim left after saying 'war it will be'."));

                	
                	pages.appendTag(new NBTTagString("", "The shadow of war draws closer, the Pureblood Wizim start arming there troops for war," +
                										 "The Eragonians also started arming there troops for war, but with more advanced machinery.\n"  +
                										 "Four weeks after the declaration of war and two weeks after the arming of the troops the empire had been split.\n"));

                	pages.appendTag(new NBTTagString("", "The Side Loyal to the Ways of old, The Eragonian Side, and the Smallest Reformist side that was Neutral."  +
								                         "The Side Loyal to the ways of old wanted to rid the empire of those who didnt follow traditional wizim law.\n" +
                										 "The Eragonians wanted to reform the government to allow for equal treatment of the Eragonians.\n"));

					pages.appendTag(new NBTTagString("", "While those two sides both locked in destruction of the other....there were those on both sides that wanted a united government\n" +
													     "With a Wizim King and an Eragonian King Ruling the empire as equals and deciding for the fate of the entire empire for its benefit.\n" +
								 						 "Five weeks later after thousands of battles on both of the two major sides of the empire the armys of the wizim and eragonn both 500,000 strong,\n" +
								 						 "Were Decimated town to only 200,000 in a three month period.\n"));

					pages.appendTag(new NBTTagString("", "Now the Wizim Holding there side of the empire and the eragonians fighting for every inch they could get went for an end game battle to settle the score once and for all.\n" +
														 "The Eragonians decided that taking the city of 'Wizim' would break the enemy morale to the point of surrender and they reorganised all of there troops to bee-line towards the capital city under wizim control.\n"));

					pages.appendTag(new NBTTagString("", "The Wizim noticing the Eragonians armys lack of pushing on there lines realised that they had changed course to hit with force at the capital.\n" + 
														 "So they called there entire force to defend the city to the last man.\n" +
														 "400,000 men on both side entered the battle no soldiers remained at the end of the battle.\n"));

					pages.appendTag(new NBTTagString("", "The Bloodiest battle in Wizim history was at the hands of the people of its own empire.\n" +
								 						 "The Gods Wittnessing the battle spared only two from the battle the son of Emperor Wizim, Wizim 4 and the son of Emperor Eragonn, Eragonn 4.\n"));

					pages.appendTag(new NBTTagString("", "The Gods Decided that the only way to prevent a reoccurence of what brought an end to the empire of the wizim was to wipe the memories of both survivors.\n" +
	 						 							 "The Gods also had a fail safe in mind to ensure it will never occur they froze them both in time to be thawed out together and become friends.\n"));

                	
                	book8.stackTagCompound.setTag("pages", pages);
                	book8.stackTagCompound.setString("title", "The Complete History of The Wizim");
                	book8.stackTagCompound.setString("author", "The Reformist Historian");
                
                }
       
        }
        
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 17, RCBB.Bookcasechest.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 19, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 5, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 7, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 8, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 9, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 15, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 16, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 17, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 19, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 11, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 12, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 13, Block.cloth.blockID, 13);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 4, var5 + 6, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 5, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 5, var5 + 7, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 5, var5 + 8, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 5, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 8, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 10, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 14, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 15, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 16, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 17, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 9, var5 + 4, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 9, var5 + 20, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 19, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 10, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 14, Block.glowStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 7, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 9, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 7, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 9, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 7, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 10, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 11, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 13, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 14, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 4, var5 + 10, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 4, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 4, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 5, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 5, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 5, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 5, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 5, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 10, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 12, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 7, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 10, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 16, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 17, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 18, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 8, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 9, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 9, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 5, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 19, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 13, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 5, var5 + 10, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 5, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 5, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 11, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 7, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 10, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 13, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 14, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 16, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 17, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 18, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 10, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 5, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 5, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 5, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 5, var5 + 12, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 5, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 6, var5 + 4, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 6, var5 + 5, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 6, var5 + 10, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 6, var5 + 19, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 6, var5 + 20, Block.stoneSingleSlab.blockID, 10);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 10, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 14, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 16, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 17, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 18, Block.stairsWoodOak.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 8, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 9, var5 + 4, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 9, var5 + 20, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 23, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 6, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 9, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 6, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 7, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 8, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 9, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 16, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 17, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 5, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 6, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 7, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 8, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 9, RCBB.bookcasemeta.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 10, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 15, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 16, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 17, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 18, Block.bookShelf.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 6, var5 + 20, Block.stairsCobblestone.blockID, 7);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 5, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 11, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 13, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 19, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 7, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 10, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 11, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 12, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 13, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 14, Block.fence.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 8, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 9, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 9, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 3, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 4, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 5, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 15, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 17, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 19, Block.web.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 20, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 10, var5 + 21, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 4, Block.stairsWoodOak.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 5, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 6, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 7, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 8, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 9, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 10, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 11, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 12, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 13, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 14, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 15, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 16, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 17, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 18, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 19, Block.planks.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 11, var5 + 20, Block.stairsWoodOak.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 5, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 6, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 7, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 8, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 9, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 10, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 11, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 12, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 13, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 14, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 15, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 16, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 17, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 18, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 19, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 6, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 7, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 8, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 9, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 10, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 11, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 12, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 13, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 14, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 15, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 16, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 17, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 18, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 1, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 6, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 7, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 8, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 9, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 10, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 11, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 12, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 13, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 14, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 15, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 16, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 17, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 18, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 2, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 4, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 7, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 8, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 10, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 16, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 17, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 3, var5 + 20, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 7, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 8, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 10, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 16, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 17, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 4, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 5, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 4, Block.stairsCobblestone.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 6, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 7, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 8, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 9, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 10, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 12, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 14, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 15, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 16, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 17, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 18, Block.planks.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 6, var5 + 20, Block.stairsCobblestone.blockID, 7);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 4, Block.stairsCobblestone.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 7, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 8, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 10, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 11, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 12, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 13, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 16, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 17, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 7, var5 + 20, Block.stairsCobblestone.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 7, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 8, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 10, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 11, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 12, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 13, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 14, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 16, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 17, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 8, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 7, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 8, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 10, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 11, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 12, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 13, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 14, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 16, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 17, Block.cloth.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 9, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 3, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 4, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 5, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 6, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 7, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 8, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 9, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 10, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 11, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 12, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 13, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 14, Block.thinGlass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 15, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 16, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 17, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 18, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 19, Block.wood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 20, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 10, var5 + 21, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 5, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 6, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 7, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 8, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 9, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 10, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 11, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 12, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 13, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 14, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 15, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 16, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 17, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 18, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 25, var4 + 11, var5 + 19, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 4, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 6, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 8, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 10, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 12, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 14, Block.dirt.blockID, 0);
        this.generate3(var1, var2, var3, var4, var5);
        return true;
    }

    public boolean generate3(World var1, Random var2, int var3, int var4, int var5)
    {
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 16, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 18, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 20, Block.dirt.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 4, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 5, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 6, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 7, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 8, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 9, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 10, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 11, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 12, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 13, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 14, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 15, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 16, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 17, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 18, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 19, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 1, var5 + 20, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 5, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 7, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 9, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 11, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 13, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 15, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 17, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 19, Block.cobblestone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 5, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 6, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 7, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 8, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 9, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 10, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 11, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 12, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 13, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 14, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 15, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 16, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 17, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 18, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 3, var5 + 19, Block.stoneSingleSlab.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 5, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 6, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 7, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 8, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 9, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 10, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 11, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 12, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 13, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 14, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 15, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 16, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 17, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 18, Block.stoneDoubleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 6, var5 + 19, Block.stairsCobblestone.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 7, var5 + 5, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 7, var5 + 11, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 7, var5 + 13, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 7, var5 + 19, Block.stairsCobblestone.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 4, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 5, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 6, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 7, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 8, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 9, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 15, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 16, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 17, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 18, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 19, Block.stairsWoodOak.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 10, var5 + 20, Block.stoneSingleSlab.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 27, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 28, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 29, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 30, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 0, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 1, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 2, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 3, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 4, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 5, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 6, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 7, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 8, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 9, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 10, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 11, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 12, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 13, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 14, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 15, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 16, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 17, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 18, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 19, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 20, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 21, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 22, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 23, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 24, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 25, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 31, var4 + 0, var5 + 26, Block.grass.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 6, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 8, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 16, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 4, var4 + 2, var5 + 18, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 11, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 4, var5 + 13, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 11, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 5, var5 + 13, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 11, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 5, var4 + 6, var5 + 13, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 4, var5 + 12, Block.doorWood.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 6, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 9, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 5, var5 + 12, Block.doorWood.blockID, 8);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 15, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 6, var5 + 18, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 9, var5 + 10, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 6, var4 + 9, var5 + 14, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 7, var4 + 5, var5 + 14, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 14, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 15, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 16, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 5, var5 + 18, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 8, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 12, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 8, var4 + 9, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 9, var4 + 9, var5 + 19, Block.torchWood.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 9, var4 + 10, var5 + 5, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 6, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 10, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 11, var4 + 8, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 11, var4 + 9, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 5, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 12, var4 + 10, var5 + 19, Block.trapdoor.blockID, 6);
        var1.setBlockMetadataWithNotify(var3 + 13, var4 + 9, var5 + 12, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 6, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 13, var4 + 10, var5 + 18, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 6, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 8, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 14, var4 + 9, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 6, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 16, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 8, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 9, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 6, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 17, var4 + 10, var5 + 18, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 10, Block.trapdoor.blockID, 5);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 5, Block.trapdoor.blockID, 7);
        var1.setBlockMetadataWithNotify(var3 + 18, var4 + 10, var5 + 19, Block.trapdoor.blockID, 7);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 4, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 6, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 5, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 11, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 12, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 20, var4 + 6, var5 + 14, Block.trapdoor.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 9, var5 + 5, Block.torchWood.blockID, 3);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 9, var5 + 7, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 21, var4 + 9, var5 + 19, Block.torchWood.blockID, 4);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 9, var5 + 16, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 9, var5 + 17, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 22, var4 + 9, var5 + 18, Block.pressurePlateStone.blockID, 0);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 2, var5 + 4, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 2, var5 + 20, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 9, var5 + 9, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 24, var4 + 9, var5 + 15, Block.torchWood.blockID, 2);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 6, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 8, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 10, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 12, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 14, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 16, Block.torchWood.blockID, 1);
        var1.setBlockMetadataWithNotify(var3 + 26, var4 + 2, var5 + 18, Block.torchWood.blockID, 1);
        return true;
    }
}
