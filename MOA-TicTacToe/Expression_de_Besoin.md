
# *Besoin fonctionnel*

## Objectif

Obtenir un jeu de "morpion", qui peut se jouer à deux joueurs ou en solo contre l'ordinateur.

## Description

Le morpion est un jeu de réflexion se pratiquant à deux joueurs au tour par tour et dont le but est de créer, le premier, un alignement de son symbole, qui peut être soit une croix (X), soit par un zéro (0). <!-- un rond plutôt ! -->

### Nombre de joueurs

Au démarrage de l'application, l'utilisateur peut choisir s'il joue contre un autre joueur ou contre l'ordinateur.
  
### Pseudo

Avant chaque début de partie, les joueurs peuvent choisir un pseudo. Le pseudo du gagnant sera affiché en fin de partie.

### Grille

Le Tic-tac-toe se joue par défaut sur une grille carrée de 3×3 cases.

### Symbole

 Les deux types de symbole sont la croix (X) ou le zéro (0). Afin de faciliter l'utilisation, il sera attribué un symbole et une couleur à chaque joueur en début de partie.
 
### L'ordinateur (IA)

L'IA demandée utilisera l'algorithme Minimax de Von Neumann. Lorsque le joueur aura décidé de jouer contre l'IA, on lui demandera alors la valeur de p (profondeur de recherche de l'algorithme), sachant que p est proportionnel à la complexité du jeu.

### Déroulement d'une partie 

* Un des deux joueurs (ou l'unique joueur s'il veut jouer contre l'IA) lance l'application.
* Le joueur sélectionne le type de partie qu'il veut jouer (contre un adversaire physique ou contre l'IA).
    * Si le joueur a décidé de jouer contre l'IA on lui demande de rentrer la difficulté de l'IA (correspondant à la profondeur de l'algorithme de recherche)
* Un des deux joueurs rentre son pseudo et se voit affecter automatiquement un symbole
    * S'il a décidé de jouer contre l'IA la partie commence
    * Sinon le joueur 2 rentre lui aussi son pseudo et se voit affecter le symbole restant 
* La partie commence 
* Le joueur 1 pose son symbole puis c'est au tour du joueur 2 ou de l'IA.
  Il doit être affiché à l'écran la grille de jeu et le pseudo de la personne qui doit poser son symbole.
* Ainsi de suite jusqu'à ce que l'un des deux joueurs réussisse à aligner 3 symboles
    * Si aucun des deux joueurs ne réussit, cela fait une égalité et l'on propose alors aux joueurs de quitter ainsi ou de faire une nouvelle partie (sans avoir besoin de re-saisir les pseudos).
* Quand le jeu est terminé on propose aux joueurs de faire une nouvelle partie, de retourner au menu ou de quitter l'application.
    * Si le joueur joue contre l'IA, on lui propose de rejouer en gardant le même niveau de difficulté ou en l'augmentant.

Bonus :

C'est toujours l'utilisateur qui a la Croix qui débute la partie. Dans le cas d'une partie contre l'IA, le symbole est attribué de façon aléatoire entre l'humain et l'IA.

