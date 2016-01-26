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


public class UiMastermind extends Ui{

	protected OutputStream out;

	public UiMastermind(){
		this.out = System.out;
	}

	@Override
	public void display(EnumEvent event) throws IOException {

		switch (event) {
		case ChoicePartie:
			this.out.write(("	1 : Jouer contre un autre joueur").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	2 : Jouer contre l'ordinateur").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	3 : Jouer contre un autre joueur avec option Elephant").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("	4 : Jouer contre un ordinateur avec option Elephant").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
		case Welcome:
			this.out.write(("--- WELCOME --- \n").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			this.out.write(("--- Cachotier : Rentrez une combinaison  ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case AskCombinaison:
			this.out.write(("--- Joueur 2 : Devinez la combinaison  ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Quit:
			this.out.write(("--- QUIT ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Loose:
			this.out.write(("--- LOOSE ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Win:
			this.out.write(("--- WIN ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case Rules:
			this.out.write(("--- RULES ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		case InputError:
			this.out.write(("--- Veuillez ressaisir votre combinaison  ---").getBytes(StandardCharsets.UTF_8));
			this.out.flush();
			break;
		default:
			break;

		}
	}

	public void displayResultComparaison(CombinaisonComparaison resultat) throws IOException {
		this.out.write(resultat.toString().getBytes(StandardCharsets.UTF_8));
		this.out.flush();
	}
	
	public void displayHistory(String history) throws IOException {

		this.out.write(history.getBytes(StandardCharsets.UTF_8));
		this.out.flush();
	}



}
