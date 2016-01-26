
public class CombinaisonComparaison {

	private int nbNoirs;
	private int nbBlancs;
	
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
				}
			}
		}
	}

	public int getNbNoirs() {
		return nbNoirs;
	}

	public void setNbNoirs(int nbNoirs) {
		this.nbNoirs = nbNoirs;
	}

	public int getNbBlancs() {
		return nbBlancs;
	}

	public void setNbBlancs(int nbBlancs) {
		this.nbBlancs = nbBlancs;
	}
	
}

