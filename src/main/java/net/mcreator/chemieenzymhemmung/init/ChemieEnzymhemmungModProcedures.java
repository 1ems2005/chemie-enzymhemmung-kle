
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemieenzymhemmung.init;

import net.mcreator.chemieenzymhemmung.procedures.WasserMitZuckerPlayerFinishesUsingItemProcedure;
import net.mcreator.chemieenzymhemmung.procedures.VodkaPlayerFinishesUsingItemProcedure;
import net.mcreator.chemieenzymhemmung.procedures.BecksPilsPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ChemieEnzymhemmungModProcedures {
	public static void load() {
		new VodkaPlayerFinishesUsingItemProcedure();
		new BecksPilsPlayerFinishesUsingItemProcedure();
		new WasserMitZuckerPlayerFinishesUsingItemProcedure();
	}
}
