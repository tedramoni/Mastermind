import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class TestsUnitaire {

	@Test
	public void TestStringToCombinaison() {
		String s = "rvvb";
		StringToCombinaisonConverter converteur = new StringToCombinaisonConverter(s);
		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);

		Combinaison get = converteur.conversion();
		ArrayList<Color> b = get.getTabCombinaison();
		
		Assert.assertEquals(a,b);	
	}
	
	@Test
	public void TestSaisieCombinaison() {
		//ce qui a été saisi
		HumainMastermindPlayer h = new HumainMastermindPlayer();
		Combinaison csaisie = h.getCombinaison();
		ArrayList<Color> b = csaisie.getTabCombinaison();
		
		//ce qui a été donné "rvvb"
		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		Assert.assertEquals(a,b);	
	}

}
