

public class Comparaison {

	private int white = 0;
	private int black = 0;
	private int size;

	public Comparaison(Combinaison secret, Combinaison proposition){

		boolean isDifferent = false;
		//verifier que size de com1 === size de comb2
		
		this.setSize(secret.getNbColor());
				
		/* Pour les boules bien placées  
		for(int i =0; i < comb1.getNbColor(); i ++){
			
			if(comb1.getColorIndex(i)==comb2.getColorIndex(i)){
				this.setBlack(this.getBlack() + 1);
			}
			
			for(int j= 0 ; j < comb2.getNbColor(); j++){
				comb1.getColorIndex(i);
			}
		}*/
		
		for ( int i = 0; i < size; i++ ){
			if( secret.getColorIndex(i) == proposition.getColorIndex(i) ){
				this.setBlack(this.getBlack() + 1);
			}else{
				for ( int j = 0; j <size; j++ ){
					if ( proposition.getColorIndex(i) == secret.getColorIndex(j) ){
	    				this.setWhite(this.getWhite() + 1);
						break;
					}
				}
			}
		}
		
	}

	public int[] indice(Combinaison secret, Combinaison proposition){
		
	    int[] resultat = {0, 0};
	
		for ( int i = 0; i < secret.getTabCombinaison().size(); i++ ){
			if( secret.getColorIndex(i) == proposition.getColorIndex(i) ){
				this.setBlack(this.getBlack() + 1);
			}else{
				for ( int j = 0; j < secret.getTabCombinaison().size(); j++ ){
					if ( proposition.getColorIndex(i) == secret.getColorIndex(j) ){
	    				this.setWhite(this.getWhite() + 1);
						break;
					}
				}
			}
		}
		resultat[0]=black;
		resultat[1]=white;
		
		return resultat;
	}

	public int getWhite() {
		return white;
	}

	public void setWhite(int white) {
		this.white = white;
	}

	public int getBlack() {
		return black;
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
