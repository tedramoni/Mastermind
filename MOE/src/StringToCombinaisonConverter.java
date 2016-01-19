import java.util.ArrayList;


public class StringToCombinaisonConverter {


	private String saisie;
	private ArrayList<Color> TabCombinaison;
	private Combinaison Comb;


	public StringToCombinaisonConverter(String s){
		this.saisie = s;
		this.TabCombinaison = new ArrayList<Color>();
	}
	
	public StringToCombinaisonConverter(Combinaison comb){
		this.Comb = comb;
	}

	public Combinaison conversion(){

	
		for(int i = 0; i < this.saisie.length(); i++){
			if(this.saisie.charAt(i)=='r' || this.saisie.charAt(i)=='R' )// pour le rouge
				this.TabCombinaison.add(i, Color.Red);
			else if(this.saisie.charAt(i)=='b' || this.saisie.charAt(i)=='B')//pour le bleu
				this.TabCombinaison.add(i, Color.Blue);
			else if(this.saisie.charAt(i)=='v' || this.saisie.charAt(i)=='V')//pour le vert
				this.TabCombinaison.add(i, Color.Green);
			else if(this.saisie.charAt(i)=='j' || this.saisie.charAt(i)=='J')//pour le jaune
				this.TabCombinaison.add(i, Color.Yellow);
		}

		return new Combinaison(this.TabCombinaison);

	}
	public String conversionCombToString(){
		ArrayListComb.getTabCombinaison()
		
	}
}
