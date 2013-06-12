package Reactioncraft.machines.common;

import java.util.*;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class Crafting6X6
{
    private static final Crafting6X6 instance = new Crafting6X6();
    private List recipes;
    private InventoryCrafting inventorycrafting;
    public static final Crafting6X6 getInstance()
    {
        return instance;
    }
    private Crafting6X6()
    {
        recipes = new ArrayList();
    }
    void addRecipe(ItemStack itemstack, Object aobj[])
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if (aobj[i] instanceof String[])
        {
            String as[] = (String[])aobj[i++];
            for (int l = 0; l < as.length; l++)
            {
                String s2 = as[l];
                k++;
                j = s2.length();
                s = (new StringBuilder()).append(s).append(s2).toString();
            }
        }
        else
        {
            while (aobj[i] instanceof String)
            {
                String s1 = (String)aobj[i++];
                k++;
                j = s1.length();
                s = (new StringBuilder()).append(s).append(s1).toString();
            }
        }
        HashMap hashmap = new HashMap();
        for (; i < aobj.length; i += 2)
        {
            Character character = (Character)aobj[i];
            ItemStack itemstack1 = null;
            if (aobj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)aobj[i + 1]);
            }
            else if (aobj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)aobj[i + 1], 1, -1);
            }
            else if (aobj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)aobj[i + 1];
            }
            hashmap.put(character, itemstack1);
        }
        ItemStack aitemstack[] = new ItemStack[j * k];
        for (int i1 = 0; i1 < j * k; i1++)
        {
            char c = s.charAt(i1);
            if (hashmap.containsKey(Character.valueOf(c)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }
        recipes.add(new ShapedRecipes6X6(j, k, aitemstack, itemstack));
    }
    
    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
        {
            Item item = Item.itemsList[itemstack.itemID];
            int k = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int l = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int i1 = k + l + item.getMaxDamage() * 5 / 100;
            int j1 = item.getMaxDamage() - i1;

            if (j1 < 0)
            {
                j1 = 0;
            }

            return new ItemStack(itemstack.itemID, 1, j1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }
    
    public ItemStack findMatchingRecipe()
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        for (int j = 0; j < inventorycrafting.getSizeInventory(); j++)
        {
            ItemStack itemstack2 = inventorycrafting.getStackInSlot(j);
            if (itemstack2 == null)
            {
                continue;
            }
            if (i == 0)
            {
                itemstack = itemstack2;
            }
            if (i == 1)
            {
                itemstack1 = itemstack2;
            }
            i++;
        }
        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
        {
            Item item = Item.itemsList[itemstack.itemID];
            int l = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int i1 = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int j1 = l + i1 + (item.getMaxDamage() * 10) / 100;
            int k1 = item.getMaxDamage() - j1;
            if (k1 < 0)
            {
                k1 = 0;
            }
            return new ItemStack(itemstack.itemID, 1, k1);
        }
        for (int k = 0; k < recipes.size(); k++)
        {
            IRecipe irecipe = (IRecipe)recipes.get(k);
            if (irecipe.matches(inventorycrafting, null))
            {
                return irecipe.getCraftingResult(inventorycrafting);
            }
        }
        return null;
    }
}