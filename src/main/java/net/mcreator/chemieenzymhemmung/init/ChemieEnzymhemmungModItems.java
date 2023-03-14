
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemieenzymhemmung.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.chemieenzymhemmung.item.WasserMitZuckerItem;
import net.mcreator.chemieenzymhemmung.item.VodkaItem;
import net.mcreator.chemieenzymhemmung.item.BecksPilsItem;
import net.mcreator.chemieenzymhemmung.ChemieEnzymhemmungMod;

public class ChemieEnzymhemmungModItems {
	public static Item VODKA;
	public static Item BECKS_PILS;
	public static Item WASSER_MIT_ZUCKER;

	public static void load() {
		VODKA = Registry.register(Registry.ITEM, new ResourceLocation(ChemieEnzymhemmungMod.MODID, "vodka"), new VodkaItem());
		BECKS_PILS = Registry.register(Registry.ITEM, new ResourceLocation(ChemieEnzymhemmungMod.MODID, "becks_pils"), new BecksPilsItem());
		WASSER_MIT_ZUCKER = Registry.register(Registry.ITEM, new ResourceLocation(ChemieEnzymhemmungMod.MODID, "wasser_mit_zucker"), new WasserMitZuckerItem());
	}
}
