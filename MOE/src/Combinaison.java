import java.util.ArrayList;


public class Combinaison {

	private int NbColor;
	private ArrayList<Color> TabCombinaison;
	
	public Combinaison(ArrayList<Color> listColor){
		this.TabCombinaison = listColor;
		this.NbColor = listColor.size();
	}

	
	public boolean equals(Combinaison testedCombinaison){
		boolean isDifferent = false;
		
		for(int i = 0 ; i < this.TabCombinaison.size() ; i++){
			if(this.getColorIndex(i) != testedCombinaison.getColorIndex(i)){
				isDifferent = true;
			}
		}
		return isDifferent;
	}

	public Color getColorIndex(int index){
		return this.TabCombinaison.get(index);
	}
	
	public ArrayList<Color> getTabCombinaison(){
		return this.TabCombinaison;
	}
	
	public static Combinaison getRandomCombinaison(){
		return null;
	}

	public int getNbColor() {
		return NbColor;
	}

	public void setNbColor(int nbColor) {
		NbColor = nbColor;
	}
	
	public void afficherCombinaison(){
		for (Color color : this.getTabCombinaison()) {
			System.out.print(color.getColor());
		}
	}
}
