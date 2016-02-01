package Test;
import java.util.ArrayList;
import java.util.List;

import model.Combinaison;
import model.EnumColor;

import org.junit.Assert;
import org.junit.Test;

import util.CombinaisonComparaison;
import util.StringToCombinaison;

public class TestsUnitaire {

	@Test
	public void TestStringToCombinaison() {
		
		String s = "rvvbb";
		List<EnumColor> b = new ArrayList<EnumColor>();
		Combinaison comb = StringToCombinaison.getCombinaison(s);
		b = comb.getTabCombinaison();
		
		List<EnumColor> a = new ArrayList<EnumColor>();
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(4, EnumColor.Bleu);



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
		a.add(0, Model.Color.Rouge);
		a.add(1, Model.Color.Vert);
		a.add(2, Model.Color.Vert);
		a.add(3, Model.Color.Bleu);

		Assert.assertEquals(a,b);	
	}*/

	@Test
	public void TestCombinaisonComparaisonCouleurs(){
		ArrayList<EnumColor> a = new ArrayList<EnumColor>(); 
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(3, EnumColor.Jaune);

		ArrayList<EnumColor> b = new ArrayList<EnumColor>(); 
		b.add(0, EnumColor.Rouge);
		b.add(1, EnumColor.Vert);
		b.add(2, EnumColor.Vert);
		b.add(3, EnumColor.Bleu);
		b.add(3, EnumColor.Jaune);

		Combinaison secret = new Combinaison(a);
		Combinaison proposition  = new Combinaison(b);

		CombinaisonComparaison comparaison = new CombinaisonComparaison(secret, proposition);
		Assert.assertEquals(5,comparaison.getNbNoirs());	
		Assert.assertEquals(0,comparaison.getNbBlancs());	


	}

	@Test
	public void TestAfficheHistorique(){
		ArrayList<Combinaison> tab = new ArrayList<Combinaison>();
		ArrayList<EnumColor> a = new ArrayList<EnumColor>(); 
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);

		ArrayList<EnumColor> b = new ArrayList<EnumColor>(); 
		b.add(0, EnumColor.Vert);
		b.add(1, EnumColor.Vert);
		b.add(2, EnumColor.Vert);
		b.add(3, EnumColor.Bleu);

		ArrayList<EnumColor> c = new ArrayList<EnumColor>(); 
		c.add(0, EnumColor.Rouge);
		c.add(1, EnumColor.Bleu);
		c.add(2, EnumColor.Vert);
		c.add(3, EnumColor.Bleu);

		ArrayList<EnumColor> d = new ArrayList<EnumColor>(); 
		d.add(0, EnumColor.Rouge);
		d.add(1, EnumColor.Vert);
		d.add(2, EnumColor.Rouge);
		d.add(3, EnumColor.Rouge);

		tab.add(new Combinaison(a));
		tab.add(new Combinaison(b));
		tab.add(new Combinaison(c));
		tab.add(new Combinaison(d));

		int i = 1;
		for (Combinaison comb : tab) {
			System.out.print(i + " - "  );
			comb.toString();
			System.out.println();

			i++;
		}

		//	Model.CombinaisonComparaison resultat = new Model.CombinaisonComparaison(secret, proposition);
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
