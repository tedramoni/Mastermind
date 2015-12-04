# Spécifications Fonctionnelles

## Partie vs Manches

On ne considère pas que le jeu se joue en manche, parties etc. 
Par conséquent, on considère que le gagnant est la personne qui à réussit à aligner n symboles (n dépendant de la taille de la grille).

## Déroulement d'une partie 

* Un des deux joueurs (ou l'unique joueur s'il veut jouer contre l'IA) lance l'application.
* Le joueur sélectionne le type de partie qu'il veut joueur (contre un adversaire physique ou contre l'IA) et la taille de la grille
    * Si le joueur à décidé de jouer contre l'IA on lui demande de rentrer la difficulté de l'IA (correspondant à la profondeur de l'algorithme de recherche)
* Un des deux joueurs rentre son pseudo et se voit affecté automatiquement un symbole
    * S'il à décidé de joueur contre l'IA la partie commence
    * Sinon le joueur 2 rentre lui aussi son pseudo
* La partie commence 
* Le joueur 1 pose son symbole puis c'est au tour du joueur 2 ou de l'IA.
* Ainsi de suite jusqu'à ce que l'un des deux joeurs réussisse à aligner n symboles (n dépendant de la taille de la grille)
    * Si aucun des deux joueurs ne réussit çela fait un égalité et l'on propose alors aux joueurs de quitter ainsi ou de faire une nouvelle partie (sans avoir besoin de re-saisir les pseudos).
* Quand le jeu est terminé on propose aux joueurs de recommencer avec les mêmes personnes, contre d'autres personnes ou de quitter.
    * Si le joeur joue contre l'IA on lui propose de rejouer avec un niveau de difficulté plus important.
