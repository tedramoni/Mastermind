package model;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Combinaison qui repr�sente une combinaison
 * @author Alexis Colonna
 *
 */
public class Combinaison {
	private int NbColor;
	private List<EnumColor> TabCombinaison;
	
	/**
	 * Constructeur de combinaison � partir d'une liste
	 * @param listColor Une liste de couleur 
	 */
	public Combinaison(List<EnumColor> listColor){
		this.TabCombinaison = listColor;
		this.NbColor = listColor.size();
	}
	
	/**
	 * Constructeur de combinaison � partir d'une autre combinaison
	 * @param comb Une combinaison 
	 */
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

	/**
	 * R�cup�re la couleur � partir d'un index
	 * @param index L'index de la couleur � r�cup�rer
	 * @return La couleur plac� dans la liste � la position 'index'
	 */
	public EnumColor getColorIndex(int index){
		return this.TabCombinaison.get(index);
	}
	
	/**
	 * Permet de supprimer une couleur � partir de son index
	 * @param index L'index de la couleur � supprimer
	 * @return 
	 */
	public EnumColor removeColorIndex(int index){
		return this.TabCombinaison.remove(index);
	}
	
	/**
	 * 
	 * @return La combinaison
	 */
	public List<EnumColor> getTabCombinaison(){
		return this.TabCombinaison;
	}

	/**
	 * 
	 * @return La taille de la combinaison
	 */
	public int getNbColor() {
		return NbColor;
	}
	
	/**
	 * Permet de modifier la taille de la combinaison
	 * @param nbColor la taille souhait�e pour la combinaison
	 */
	public void setNbColor(int nbColor) {
		NbColor = nbColor;
	}
	
	/**
	 * To String de la combinaison
	 */
	public String toString(){
		String s = "";
		
		for (EnumColor enumColor : TabCombinaison) {
			s = s + " - "+ enumColor.getChar();
		}
		s = s + " - ";
		
		return s;
	}
	
	
	
}
