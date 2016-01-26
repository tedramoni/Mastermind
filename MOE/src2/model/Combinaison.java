package model;
import java.util.ArrayList;
import java.util.List;


public class Combinaison {
	private int NbColor;
	private List<EnumColor> TabCombinaison;
	
	public Combinaison(List<EnumColor> listColor){
		this.TabCombinaison = listColor;
		this.NbColor = listColor.size();
	}

	public Combinaison(Combinaison comb){
		this.TabCombinaison = new ArrayList<EnumColor>();
		for (EnumColor EnumColor : comb.getTabCombinaison()) {
			this.TabCombinaison.add(EnumColor);
		}
		
		this.NbColor = this.TabCombinaison.size();
	}
	

	
	/*
	public boolean equals(Combinaison testedCombinaison){
		boolean isDifferent = false;
		
		for(int i = 0 ; i < this.TabCombinaison.size() ; i++){
			if(this.getEnumColorIndex(i) != testedCombinaison.getEnumColorIndex(i)){
				isDifferent = true;
			}
		}
		return isDifferent;
	}*/

	public EnumColor getColorIndex(int index){
		return this.TabCombinaison.get(index);
	}
	
	public EnumColor removeColorIndex(int index){
		return this.TabCombinaison.remove(index);
	}
	
	public List<EnumColor> getTabCombinaison(){
		return this.TabCombinaison;
	}

	public int getNbColor() {
		return NbColor;
	}

	public void setNbColor(int nbColor) {
		NbColor = nbColor;
	}
	
	public String toString(){
		String s = "";
		
		for (EnumColor enumColor : TabCombinaison) {
			s = s + " - "+ enumColor.getChar();
		}
		s = s + " - ";
		
		return s;
	}
	
	
	
}
