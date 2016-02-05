package util;
import model.Combinaison;

/**
 * 
 * Classe qui permet de comparer deux combinaisons
 *
 */
public class CombinaisonComparaison {

	private int nbNoirs;
	private int nbBlancs;
	
	/**
	 * Constructeur avec param�tre
	 * @param com1 premi�re combinaison
	 * @param com2 deuxi�me combinaison
	 */
	public CombinaisonComparaison(Combinaison com1 , Combinaison com2){
		
		for(int i = 0; i < com1.getTabCombinaison().size(); i++){
			
			if(com1.getColorIndex(i) == com2.getColorIndex(i)){
				this.setNbNoirs(this.getNbNoirs() + 1);
				com1.removeColorIndex(i);
				com2.removeColorIndex(i);
				i--;
			}
		}
		
		for(int i = 0; i < com1.getTabCombinaison().size(); i++){
			
			for(int j = 0; j < com2.getTabCombinaison().size() ; j++){
				
				if(com1.getColorIndex(i) == com2.getColorIndex(j)){
					this.setNbBlancs(this.getNbBlancs() + 1);
					com1.removeColorIndex(i);
					com2.removeColorIndex(j);
					i--;
					j--;
					
					break;
					
				}
			}
		}
	}

	/**
	 * Recup�re le nombre de jetons noirs
	 * @return nombre de jetons noirs
	 */
	public int getNbNoirs() {
		return nbNoirs;
	}

	/**
	 * Permet de d�finir le nombre de jetons noirs 
	 * @param nbNoirs nombre de jetons noirs
	 */
	public void setNbNoirs(int nbNoirs) {
		this.nbNoirs = nbNoirs;
	}

	/**
	 *  R�cup�re le nombre de jetons blancs
	 * @return nombre de jetons blancs
	 */
	public int getNbBlancs() {
		return nbBlancs;
	}

	/**
	 * Permet de d�finir le nombre de jetons blancs
	 * @param nbBlancs nombre de jetons blancs
	 */
	public void setNbBlancs(int nbBlancs) {
		this.nbBlancs = nbBlancs;
	}
	
	/**
	 * M�thode toString red�finie pour afficher le nombre de jetons blancs et le nombre de jetons noirs
	 */
	public String toString(){
		return "Noirs : " + this.getNbNoirs() + "  Blancs : " + this.getNbBlancs() + "\n" ;
	}
}

