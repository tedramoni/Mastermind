
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
	
	/*@Test --------------------------------------------TEST OK MAIS SCANNER ---------------------------
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
		System.out.println("Pions noir : bien plac� bonne couleur " + resultat.getBlack() +"\n");
		System.out.println("Pions blanc pas bien plac� mais bonne couleur " + resultat.getWhite() +"\n");

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
		a.add(0, Color.Green);
		a.add(1, Color.Green);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		ArrayList<Color> c = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Blue);
		a.add(2, Color.Green);
		a.add(3, Color.Blue);
		
		ArrayList<Color> d = new ArrayList<Color>(); 
		a.add(0, Color.Red);
		a.add(1, Color.Green);
		a.add(2, Color.Red);
		a.add(3, Color.Red);
		
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
	//	Comparaison resultat = new Comparaison(secret, proposition);
	//	System.out.println("Pions noir : bien plac� bonne couleur " + resultat.getBlack() +"\n");
	//	System.out.println("Pions blanc pas bien plac� mais bonne couleur " + resultat.getWhite() +"\n");

	}

	/*@Test --------------------------------------------TEST OK MAIS SCANNER ---------------------------
	public void TestSaisieCombinaison() {
		//ce qui a �t� saisi
		HumainMastermindPlayer h = new HumainMastermindPlayer();
		int nb = h.getTryMax();

		//ce qui a �t� donn� "9"
			
		Assert.assertEquals(9,nb);
	}*/

}
