
package net.backinclassic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.backinclassic.BackInClassicModElements;

@BackInClassicModElements.ModElement.Tag
public class StoneSwordItem extends BackInClassicModElements.ModElement {
	@ObjectHolder("back_in_classic:stone_sword")
	public static final Item block = null;
	public StoneSwordItem(BackInClassicModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 128;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE));
			}
		}, 3, 16f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("stone_sword"));
	}
}
