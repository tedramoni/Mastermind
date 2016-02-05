package util;
import java.util.ArrayList;
import java.util.List;

import model.Combinaison;
import model.EnumColor;

/**
 * 
 * Class qui transforme une chaîne de caractère en une combinaison de couleurs
 *
 */
public class StringToCombinaison {
	
	public final static Combinaison getCombinaison(String s){
		
		List<EnumColor> listColor=  new ArrayList<EnumColor>();
		EnumColor c = null;
		
		for(int i = 0; i < s.length() ; i++){
			c = EnumColor.getEnumColorWithChar(s.charAt(i));
			if(c == null)
				return null;
			else
				listColor.add(c);
		}
		
		Combinaison com = new Combinaison(listColor);
		return com;
		
	}

}
