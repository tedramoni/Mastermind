
import java.util.ArrayList;

import Converter.StringToCombinaison;
import Model.Color;
import Model.Combinaison;
import Model.Comparaison;
import org.junit.Assert;
import org.junit.Test;

public class TestsUnitaire {

	@Test
	public void TestStringToCombinaison() {
		String s = "rvvb";
		StringToCombinaison converteur = new StringToCombinaison(s);
		ArrayList<Color> a = new ArrayList<Color>();
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);

		Combinaison get = converteur.conversion();
		ArrayList<Color> b = get.getTabCombinaison();
		
		Assert.assertEquals(a,b);	
	}
	
	/*@Test --------------------------------------------TEST OK MAIS SCANNER ---------------------------
	public void TestSaisieCombinaison() {
		//ce qui a été saisi
		Model.Humain h = new Model.Humain();
		Model.Combinaison csaisie = h.getCombinaison();
		ArrayList<Model.Color> b = csaisie.getTabCombinaison();
		
		//ce qui a été donné "rvvb"
		ArrayList<Model.Color> a = new ArrayList<Model.Color>();
		a.add(0, Model.Color.Red);
		a.add(1, Model.Color.Green);
		a.add(2, Model.Color.Green);
		a.add(3, Model.Color.Blue);
		
		Assert.assertEquals(a,b);	
	}*/
	
	@Test
	public void TestComparaisonCouleurs(){
		ArrayList<Color> a = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		ArrayList<Color> b = new ArrayList<Color>(); 
		b.add(0, Color.Red);
		b.add(1, Color.Green);
		b.add(2, Color.Green);
		b.add(3, Color.Green);
		
		Combinaison secret = new Combinaison(a);
		Combinaison proposition  = new Combinaison(b);
		
		Comparaison resultat = new Comparaison(secret, proposition);
		System.out.println("Pions noir : bien placé bonne couleur " + resultat.getBlack() +"\n");
		System.out.println("Pions blanc pas bien placé mais bonne couleur " + resultat.getWhite() +"\n");

	}
	
	@Test
	public void TestAfficheHistorique(){
		ArrayList<Combinaison> tab = new ArrayList<Combinaison>();
		ArrayList<Color> a = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
				
		ArrayList<Color> b = new ArrayList<Color>(); 
		b.add(0, Color.Green);
		b.add(1, Color.Green);
		b.add(2, Color.Green);
		b.add(3, Color.Blue);
		
		ArrayList<Color> c = new ArrayList<Color>(); 
		c.add(0, Color.Red);
		c.add(1, Color.Blue);
		c.add(2, Color.Green);
		c.add(3, Color.Blue);
		
		ArrayList<Color> d = new ArrayList<Color>(); 
		d.add(0, Color.Red);
		d.add(1, Color.Green);
		d.add(2, Color.Red);
		d.add(3, Color.Red);
		
		tab.add(new Combinaison(a));
		tab.add(new Combinaison(b));
		tab.add(new Combinaison(c));
		tab.add(new Combinaison(d));
		
		int i = 1;
		for (Combinaison comb : tab) {
			System.out.print(i + " - "  );
			comb.afficherCombinaison();
			System.out.println();
			
		i++;
		}

	//	Model.Comparaison resultat = new Model.Comparaison(secret, proposition);
	//	System.out.println("Pions noir : bien placé bonne couleur " + resultat.getBlack() +"\n");
	//	System.out.println("Pions blanc pas bien placé  mais bonne couleur " + resultat.getWhite() +"\n");

	}

	/*@Test --------------------------------------------TEST OK MAIS SCANNER ---------------------------
	public void TestSaisieCombinaison() {
		//ce qui a été saisi
		Model.Humain h = new Model.Humain();
		int nb = h.getTryMax();

		//ce qui a été donné "9"
			
		Assert.assertEquals(9,nb);
	}*/

}
