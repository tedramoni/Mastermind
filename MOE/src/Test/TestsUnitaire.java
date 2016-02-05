package Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import controller.Mastermind;
import model.Combinaison;
import model.EnumColor;
import model.EnumGameState;
import model.IaMastermind;
import util.CombinaisonComparaison;
import util.StringToCombinaison;

public class TestsUnitaire {

	@Test
	public void TestStringToCombinaison() {

		String s = "rvvbb".toUpperCase();
		List<EnumColor> b = new ArrayList<EnumColor>();

		Combinaison comb = StringToCombinaison.getCombinaison(s);
		if(comb.getTabCombinaison()==null)
			b = null;
		else b=comb.getTabCombinaison();

		List<EnumColor> a = new ArrayList<EnumColor>();
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(4, EnumColor.Bleu);
		Assert.assertEquals(a,b);	
	}

	@Test
	public void TestIAGetCombinaison() {

		IaMastermind ia = new IaMastermind();
		Combinaison comb = ia.getCombinaison();
		Assert.assertEquals(5,comb.getNbColor());	
	}


	@Test
	public void TestBadStringToCombinaison() {

		String s = "1jjb";
		List<EnumColor> b = new ArrayList<EnumColor>();
		Combinaison comb = null;
		comb = StringToCombinaison.getCombinaison(s);

		if(comb==null)
			b = null;
		else b=comb.getTabCombinaison();

		List<EnumColor> a = new ArrayList<EnumColor>();
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(4, EnumColor.Bleu);
		Assert.assertEquals(null,b);	
	}


	@Test
	public void TestCombinaisonComparaisonCouleurs(){
		ArrayList<EnumColor> a = new ArrayList<EnumColor>(); 
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(4, EnumColor.Jaune);

		ArrayList<EnumColor> b = new ArrayList<EnumColor>(); 
		b.add(0, EnumColor.Rouge);
		b.add(1, EnumColor.Vert);
		b.add(2, EnumColor.Vert);
		b.add(3, EnumColor.Bleu);
		b.add(4, EnumColor.Jaune);

		Combinaison secret = new Combinaison(a);
		Combinaison proposition  = new Combinaison(b);

		CombinaisonComparaison comparaison = new CombinaisonComparaison(secret, proposition);
		Assert.assertEquals(5,comparaison.getNbNoirs());	
		Assert.assertEquals(0,comparaison.getNbBlancs());	
	}

	@Test
	public void TestTryCombinaison(){
		Mastermind m = new Mastermind();
		ArrayList<EnumColor> a = new ArrayList<EnumColor>(); 
		a.add(0, EnumColor.Rouge);
		a.add(1, EnumColor.Vert);
		a.add(2, EnumColor.Vert);
		a.add(3, EnumColor.Bleu);
		a.add(4, EnumColor.Jaune);
		m.setCombinaison(new Combinaison(a));

		List<EnumColor> b = new ArrayList<EnumColor>(); // bonne combinaison
		b.add(0, EnumColor.Rouge);
		b.add(1, EnumColor.Vert);
		b.add(2, EnumColor.Vert);
		b.add(3, EnumColor.Bleu);
		b.add(4, EnumColor.Jaune);
		Combinaison propositionOK = new Combinaison(b);

		List<EnumColor> c = new ArrayList<EnumColor>(); // mauvaise combinaison
		c.add(0, EnumColor.Rouge);
		c.add(1, EnumColor.Vert);
		c.add(2, EnumColor.Vert);
		c.add(3, EnumColor.Noir);
		c.add(4, EnumColor.Jaune);
		Combinaison propositionNOK = new Combinaison(c);

		@SuppressWarnings("unused")
		CombinaisonComparaison comparaison  = m.tryCombinaison(propositionOK);
		Assert.assertEquals(EnumGameState.Win, m.getState());	// bonne combinaison

		m = new Mastermind();
		m.setCombinaison(new Combinaison(a));
		comparaison = m.tryCombinaison(propositionNOK);
		Assert.assertNotEquals(EnumGameState.Win, m.getState());	// mauvaise combinaison

		//out of nombre d'essai
		for (int i = 0; i < 8; i++) 
			m.getTabTryCombinaison().add(propositionNOK);
		comparaison = m.tryCombinaison(propositionNOK);
		Assert.assertEquals(EnumGameState.Lost, m.getState());	// nombre d'essai dépassé

	}


	@SuppressWarnings("static-access")
	@Test
	public void TestGetEnumColorWithChar() {
		EnumColor a = null ;
		char bleu = 'B';
		char vert = 'V';
		char jaune ='J';
		char rouge = 'R';
		char orange = 'O';
		char noir = 'N';
		char marron = 'M';
		char gris = 'G';
		char testInexistant = 'z';

		Assert.assertEquals(EnumColor.Bleu,a.getEnumColorWithChar(bleu));	
		Assert.assertEquals(EnumColor.Vert,a.getEnumColorWithChar(vert));	
		Assert.assertEquals(EnumColor.Jaune,a.getEnumColorWithChar(jaune));	
		Assert.assertEquals(EnumColor.Rouge,a.getEnumColorWithChar(rouge));	
		Assert.assertEquals(EnumColor.Orange,a.getEnumColorWithChar(orange));	
		Assert.assertEquals(EnumColor.Noir,a.getEnumColorWithChar(noir));	
		Assert.assertEquals(EnumColor.Marron,a.getEnumColorWithChar(marron));	
		Assert.assertEquals(EnumColor.Gris,a.getEnumColorWithChar(gris));	
		Assert.assertEquals(null,a.getEnumColorWithChar(testInexistant));	

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


		//	Model.CombinaisonComparaison resultat = new Model.CombinaisonComparaison(secret, proposition);
		//	System.out.println("Pions noir : bien placé bonne couleur " + resultat.getBlack() +"\n");
		//	System.out.println("Pions blanc pas bien placé  mais bonne couleur " + resultat.getWhite() +"\n");

	}



}
