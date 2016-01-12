# Scénarios de tests 

## Scénario n° 1

**But :** Lancement de l'application

**Déroulement :** L'utilisateur lance l'application.

**Résultat attendu :** Une page d'accueil s'affiche, avec un choix de jeu contre un autre joueur ou l'IA.


## Scénario n° 2

**But :** Sélection du type de partie : contre un autre joueur

**Déroulement :** Au lancement de l'application, l'utilisateur choisit le type de partie : jouer contre un adversaire physique

**Résultat attendu :** Une fois le choix de l'adversaire validé, l'utilisateur arrive sur un écran permettant de rentrer les pseudos.


## Scénario n° 3

**But :** Sélection du type de partie : contre l'IA

**Déroulement :** L'utilisateur choisit le type de partie : jouer contre l'IA

**Résultat attendu :** Une fois le choix de l'adversaire validé, l'utilisateur arrive sur un écran permettant de choisir le niveau de difficulté de l'IA.


## Scénario n° 4

**But :** Choix des pseudos - deux joueurs

**Déroulement :** Après avoir choisi une partie à deux joueurs, les deux joueurs rentrent leurs pseudos à l'écran

**Résultat attendu :** Lorsque les deux pseudos sont rentrés, les symboles sont attribués aux joueurs, et la partie débute.


## Scénario n° 5

**But :** Choix d'un pseudo - un joueur

**Déroulement :** Après avoir choisi la difficulté de l'IA, le joueur rentre son pseudo à l'écran

**Résultat attendu :** Lorsque le pseudo est rentré, le joueur se voit attribuer un symbole, et la partie débute.


## Scénario n° 6

**But :** Un gain

**Déroulement :** Un joueur aligne 3 symboles

**Résultat attendu :** L'application doit notifier à ce joueur qu'il a gagné la partie, et afficher les choix décrits dans les spécifications fonctionnelles.


## Scénario n° 7

**But :** Un cas d'égalité

**Déroulement :** Les deux joueurs s'accordent pour faire une égalité

**Résultat attendu :** L'application notifie l'égalité, et afficher les choix décrits dans les spécifications fonctionnelles.


## Scénario n° 8

**But :** Fin de partie l'IA

**Déroulement :** Le joueur finit une partie contre l'IA

**Résultat attendu :** L'application notifie la victoire de l'IA, et propose au joueur soit d'augmenter la difficulté de la partie, soit de rejouter la partie, soit de quitter le jeu et de revenir au menu principal.


## Scénario n° 9

**But :** Une deuxième partie à deux joueurs

**Déroulement :** A la fin d'une partie, les deux joueurs décident de rejouer une partie

**Résultat attendu :** L'application relance une nouvelle partie en conservant les paramètres de départ (nombre de joueur(s), pseudo(s)).


## Scénario n° 10

**But :** Une deuxième partie contre l'IA - changement de la difficulté

**Déroulement :** A la fin d'une partie, le joueur décide de rejouer une partie en augmentant la difficulté de l'IA

**Résultat attendu :** L'application relance une partie en augmentant le niveau de difficulté de l'AI


## Scénario n° 11

**But :** Une deuxième partie contre l'IA - même niveau de difficulté

**Déroulement :** A la fin d'une partie, le joueur décide de rejouer une partie contre l'IA, avec le même niveau de difficulté

**Résultat attendu :** L'application relance une partie en conservant le même niveau de difficulté de l'IA


## Scénario n° 12

**But :** Fin de partie à deux joueurs - retour au menu principal

**Déroulement :** A la fin d'une partie, l'utilisateur souhaite quitter le jeu et revenir au menu principal

**Résultat attendu :** L'application retourne au menu principal


## Scénario n° 13

**But :** Fin de partie à deux joueurs - fermeture de l'application

**Déroulement :** A la fin d'une partie, l'utilisateur souhaite quitter l'application

**Résultat attendu :** L'application se ferme


## Scénario n° 14

**But :** Fin de partie contre l'IA - retour au menu principal

**Déroulement :** A la fin d'une partie, l'utilisateur souhaite quitter le jeu et revenir au menu principal

**Résultat attendu :** L'application retourne au menu principal


## Scénario n° 15

**But :** Fin de partie contre l'IA - fermeture de l'application

**Déroulement :** A la fin d'une partie, l'utilisateur souhaite quitter l'application

**Résultat attendu :** L'application se ferme
