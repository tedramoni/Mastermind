

public class Comparaison {

	private int white = 0;
	private int black = 0;
	private int size;

	public Comparaison(Combinaison comb1, Combinaison comb2){

		boolean isDifferent = false;
		//verifier que size de com1 === size de comb2
		
		this.setSize(comb1.getNbColor());
				
		/* Pour les boules bien placées  */
		for(int i =0; i < comb1.getNbColor(); i ++){
			
			if(comb1.getColorIndex(i)==comb2.getColorIndex(i)){
				this.setBlack(this.getBlack() + 1);
			}
			
			for(int j= 0 ; j < comb2.getNbColor(); j++){
				comb1.getColorIndex(i);
			}
		}
		
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
