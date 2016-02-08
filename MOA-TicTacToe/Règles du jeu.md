#Règles du MasterMind

##Le but du MasterMind

Le but du jeu est de déterminer la combinaison secrète défini par le joueur adverse.

Le joueur qui doit trouver la combinaison secrète gagne dès lors qu’il y parvient en un maximum de 10 coups.

Le joueur qui a conçu la combinaison secrète remporte la manche quand son adversaire n’est pas parvenu a trouvé la combinaison en 10 coups.

##Commencer une partie de MasterMind

Pour commencer, il vous faut décider entre vous et votre adversaire lequel élabore la combinaison secrète. 

Le joueur ayant le rôle de cachotier élabore alors sa combinaison de couleur et la saisit dans la console, sans bien entendu la dévoiler à l’autre joueur.

Le second peut alors commencer à faire des propositions de combinaisons. Pour cela, il doit également saisir une combinaison de 5 lettres dans la console.

###Si la combinaison est incorrecte

A chaque proposition du joueur, l'ordinateur est donc chargé de répondre en utilisant des jetons de deux couleurs uniquement :

*    le blanc : "il existe un pion d'une couleur qui existe dans la combinaison, mais qui est mal placé"
*    le noir : "il existe un pion d'une couleur qui existe dans la combinaison et qui est bien placé"


Le joueur devant deviner la combinaison continue ainsi en proposant de nouvelles combinaisons, en prenant bien entendu en compte les indications des jetons noirs et blancs. Il a droit a 10 propositions pour déchiffrer le code.

###Si la combinaison est correcte

Le joueur ayant le rôle de devin a gagné.
