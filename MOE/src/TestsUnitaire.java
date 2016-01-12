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
		//ce qui a �t� saisi
		HumainMastermindPlayer h = new HumainMastermindPlayer();
		Combinaison csaisie = h.getCombinaison();
		ArrayList<Color> b = csaisie.getTabCombinaison();
		
		//ce qui a �t� donn� "rvvb"
		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		Assert.assertEquals(a,b);	
	}
	
	@Test
	public void TestComparaisonCouleurs(){
		ArrayList<Color> a = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		ArrayList<Color> b = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Green);
		
		Combinaison secret = new Combinaison(a);
		Combinaison proposition  = new Combinaison(b);
		
		Comparaison resultat = new Comparaison(secret, proposition);
		System.out.println("Pions noir" + resultat.getBlack() +"\n");
		System.out.println("Pions blanc" + resultat.getWhite() +"\n");

	}

}
