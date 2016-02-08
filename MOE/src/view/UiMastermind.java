package view;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import util.CombinaisonComparaison;
import model.EnumEvent;
import model.Ui;

/**
 * Classe pour afficher le menu � l'�cran
 */
public class UiMastermind extends Ui {

    protected OutputStream out;

    /**
     * Constructeur sans param�tre
     */
    public UiMastermind() {
        this.out = System.out;
    }

    /**
     * Fonction pour afficher le menu � l'�cran
     */
    @Override
    public void display(EnumEvent event) throws IOException {

        switch (event) {
            case ChoicePartie:
                this.out.write(("	1 : Jouer contre un autre joueur\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("	2 : Jouer contre l'ordinateur\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("	3 : Jouer contre un autre joueur avec option Elephant\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("	4 : Jouer contre un ordinateur avec option Elephant\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("	5 : Afficher les regles\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("	6 : Quitter le jeu\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case Welcome:
                this.out.write(("------------------ WELCOME -------------------- \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case AskCachotier:
                this.out.write(("----------------- Cachotier -------------------- \n" +
                        "Rentrez une combinaison : Bleu - B / Vert - V / Jaune - J / Rouge - R / Orange - O / Noir - N / Marron - M / Gris - G \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case AskCombinaison:
                this.out.write(("------------------ Joueur 2 ------------------ \n --- Devinez la combinaison \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("--- De type (RVVVB) Bleu - B / Vert - V / Jaune - J / Rouge - R / Orange - O / Noir - N / Marron - M / Gris - G \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case Quit:
                this.out.write(("------------ QUIT ---------\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case Loose:
                this.out.write(("--------- LOOSE ---------\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("Appuyer sur ENTREE pour acceder au menu ! \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case Win:
                this.out.write(("--------- WIN ---------\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("Appuyer sur ENTREE pour acceder au menu ! \n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                break;
            case Rules:
                this.out.write(("--- RULES ---\n").getBytes(StandardCharsets.UTF_8));
                this.out.flush();
                this.out.write(("Le but du MasterMind\n\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le but du jeu est de determiner la combinaison secrete defini par le joueur adverse.\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le joueur qui doit trouver la combinaison secrete gagne des lors qu'il y parvient en un maximum de 10 coups.\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le joueur qui a concu la combinaison secrete remporte la manche quand son adversaire n'est pas parvenu a trouve la combinaison en 10 coups.\n\n").getBytes(StandardCharsets.UTF_8));
                this.out.write(("Commencer une partie de MasterMind\n\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Pour commencer, il vous faut decider entre vous et votre adversaire lequel elabore la combinaison secrete.\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le joueur ayant le role de cachotier elabore alors sa combinaison de couleur et la saisit dans la console, sans bien entendu la devoiler a l'autre joueur.\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le second peut alors commencer a faire des propositions de combinaisons. Pour cela, il doit egalement saisir une combinaison de 5 lettres dans la console.\n\n").getBytes(StandardCharsets.UTF_8));
                this.out.write(("Si la combinaison est incorrecte\n\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("A chaque proposition du joueur, l'ordinateur est donc charge de repondre en utilisant des jetons de deux couleurs uniquement :\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("\tle blanc : il existe un pion d'une couleur qui existe dans la combinaison, mais qui est mal place\n").getBytes(StandardCharsets.UTF_8));
                this.out.write(("\tle noir : il existe un pion d'une couleur qui existe dans la combinaison et qui est bien place\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le joueur devant deviner la combinaison continue ainsi en proposant de nouvelles combinaisons, en prenant bien entendu en compte les indications des jetons noirs et blancs. Il a droit a 10 propositions pour dechiffrer le code.\n\n").getBytes(StandardCharsets.UTF_8));
                this.out.write(("Si la combinaison est correcte\n\n").getBytes(StandardCharsets.UTF_8));

                this.out.write(("Le joueur ayant le role de devin a gagne.\n\n\n").getBytes(StandardCharsets.UTF_8));
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
     *
     * @param resultat resultat de la comparaison
     * @throws IOException
     */
    public void displayResultComparaison(CombinaisonComparaison resultat) throws IOException {
        this.out.write(resultat.toString().getBytes(StandardCharsets.UTF_8));
        this.out.flush();
    }

    /**
     * Fonction pour afficher l'historique de la partie
     *
     * @param history
     * @throws IOException
     */
    public void displayHistory(String history) throws IOException {

        this.out.write(history.getBytes(StandardCharsets.UTF_8));
        this.out.flush();
    }

    /**
     * Fonction pour clear la console
     *
     * @throws IOException, InterruptedException
     */
    public void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    /**
     * Fonction pour afficher le nombre de coups restants
     *
     * @param int tryLeft
     * @throws IOException
     */
    public void displayTryLeft(int tryLeft) throws IOException {

        this.out.write(("Nombre de coups restants : " + tryLeft + "\n").getBytes(StandardCharsets.UTF_8));
        this.out.flush();
    }

}
