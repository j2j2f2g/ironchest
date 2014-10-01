/*******************************************************************************
 * Copyright (c) 2012 cpw.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors:
 *     cpw - initial API and implementation
 ******************************************************************************/
package cpw.mods.ironchest;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemIronChest extends ItemBlock 
{
    public ItemIronChest(Block block)
    {
        super(block);
        
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return IronChestType.validateMeta(meta);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        return "tile.ironchest:" + IronChestType.values()[itemstack.getMetadata()].name();
    }
}
