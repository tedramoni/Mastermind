package model;

import java.util.ArrayList;
import java.util.List;

import model.EnumColor;
import model.Combinaison;

public class IaMastermind extends PlayerMastermind {

	@Override
	public Combinaison getCombinaison() {
		List<EnumColor> listColor =  new ArrayList<EnumColor>();
		listColor.add(0, EnumColor.randomEnumColor());
		listColor.add(1, EnumColor.randomEnumColor());
		listColor.add(2, EnumColor.randomEnumColor());
		listColor.add(3, EnumColor.randomEnumColor());

		Combinaison secret = new Combinaison(listColor);
		return secret;
	}

}
