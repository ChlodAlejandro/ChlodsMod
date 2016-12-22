package tk.chlodaidan.ChlodsMod.objects.armor.RandomArmor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Formal extends ItemArmor {

	public Formal(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == RArmor.FormalShirt) {
        	return "cdmd:textures/models/armor/FormalClothes1.png";
        }else if(stack.getItem() == RArmor.FormalPants){
        	return "cdmd:textures/models/armor/FormalClothes2.png";
        }else{
        	return null;
        }
    }

}
