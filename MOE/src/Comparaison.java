

public class Comparaison {

	private int white = 0;
	private int black = 0;
	private int size;
	private int[] ColorIteration = new int[4];

	public Comparaison(Combinaison secret, Combinaison proposition){

		boolean isDifferent = false;
		this.setSize(secret.getNbColor());

		if(this.size == proposition.getNbColor()){

		
			
			/*Blue   0 
			  Red    1 
			  Yellow 2
			  Green  3
			 */

			// PREREQ :
			// On compte le nombre d'itération de chaque couleur et on stock dans un tableau de la taille du nombre de couleurs
			for(int i = 0; i  < this.size; i++)
			{
			
				if(secret.getColorIndex(i) == Color.Blue )// pour le bleu
					this.ColorIteration[0]++;
				else if(secret.getColorIndex(i) == Color.Red )// pour le rouge
					this.ColorIteration[1]++;
				else if(secret.getColorIndex(i) == Color.Yellow )// pour le jaune
					this.ColorIteration[2]++;
				else if(secret.getColorIndex(i) == Color.Green )// pour le vert
					this.ColorIteration[3]++;


			}
			/*System.out.println(this.ColorIteration[0]);
			System.out.println(this.ColorIteration[1]);
			System.out.println(this.ColorIteration[2]);
			System.out.println(this.ColorIteration[3]);*/

			// CHECK :
			// On compare les emplacements un a un :
			// SI couleur + position sont égales, un blanc ET on retire 1 du tableau de la taille
			// SINON SI couleur est présente (>0) dans le tableau ci dessus d'itérations de couleurs , un noir
			// SINON ni blanc ni noir.
			// ===> en tout 3 itérations de tableaux.

			for (int i = 0; i  < this.size; i++){
				//ValueToCompare = comb2.TabCombinaison.get(a).valueOf(a); // doit retourner l'int lié a la couleur
				//ValueRef ==  comb1.TabCombinaison.get(a).valueOf(a); // doit retourner l'int lié a la couleur
				int ValueToCompare = proposition.getColorIndex(i).getNumber();
				int ValueRef = secret.getColorIndex(i).getNumber();
				
				if (ValueToCompare == ValueRef)
				{
					black ++;
				}
				 else if (ColorIteration[ValueToCompare] > 0  ) 
				{
					white ++;
					ColorIteration[ValueToCompare] -- ; 
				}
			}	




		}

		/*	for ( int i = 0; i < size; i++ ){
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

		}*/
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
