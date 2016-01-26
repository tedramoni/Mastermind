import java.util.ArrayList;
import java.util.List;


public class StringToCombinaison {
	
	public static final Combinaison getCombinaison(String s){
		
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
