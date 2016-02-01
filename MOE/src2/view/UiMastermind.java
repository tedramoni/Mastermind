package view;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import util.CombinaisonComparaison;
import model.Combinaison;
import model.EnumEvent;
import model.Ui;

/**
 * Classe pour afficher le menu à l'écran
 *
 */
public class UiMastermind extends Ui{

	protected OutputStream out;

	/**
	 * Constructeur sans paramètre
	 */
	public UiMastermind(){
		this.out = System.out;
	}

	/**
	 * Fonction pour afficher le menu à l'écran
	 */
	@Override
	public void display(EnumEvent event) throws IOException {

		switch (event) {
		case ChoicePartie:
			this.out.write(("	1 : Jouer contre un autre joueur\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	2 : Jouer contre l'ordinateur\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	3 : Jouer contre un ordinateur avec option Elephant\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	4 : Jouer contre un autre joueur avec option Elephant\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Welcome:
			this.out.write(("--- WELCOME --- \n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case AskCachotier:
			this.out.write(("--- Cachotier : Rentrez une combinaison : Bleu - B / Vert - V / Jaune - J / Rouge - R / Orange - O / Noir - N / Marron - M / Gris - G \n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case AskCombinaison:
			this.out.write(("--- Joueur 2 : Devinez la combinaison  ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("--- De type (RVVVB) Bleu - B / Vert - V / Jaune - J / Rouge - R / Orange - O / Noir - N / Marron - M / Gris - G \n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Quit:
			this.out.write(("--- QUIT ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Loose:
			this.out.write(("--- LOOSE ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Win:
			this.out.write(("--- WIN ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Rules:
			this.out.write(("--- RULES ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case InputError:
			this.out.write(("--- Erreur lors de la saisie - Recommencez svp ---\n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		default:
			break;

		}
	}

	/**
	 * Fonction pour afficher le resultat de la comparaison
	 * @param resultat resultat de la comparaison
	 * @throws IOException 
	 */
	public void displayResultComparaison(CombinaisonComparaison resultat) throws IOException {
		this.out.write(resultat.toString().getBytes(StandardCharsets.UTF_8));
		this.out.flush();
	}

	/**
	 * Fonction pour afficher l'historique de la partie
	 * @param history
	 * @throws IOException
	 */
	public void displayHistory(String history) throws IOException {

		this.out.write(history.getBytes(StandardCharsets.UTF_8));
		this.out.flush();
	}



}
