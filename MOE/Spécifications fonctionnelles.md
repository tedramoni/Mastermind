
# *Spécifications fonctionnelles*

Ce document vise à décrire en détail chacune des fonctions de l'application Mastermind.

## Rôle du cachotier

Le cachotier pourra soit être joué par un ordinateur, soit par un humain.

Si le cachotier est un joueur, son seul rôle sera de définir le code secret de 5 couleurs.
De plus, à chaque proposition du joueur, c'est donc l'ordinateur qui sera chargé de répondre.


## Lot couleur

Le jeu utilisera un lot de 8 couleurs, listées ci-dessous:
* Bleu
* Vert
* Jaune
* Rouge
* Orange
* Noir
* Marron
* Gris

Chaque couleur sera representée en console par sa première lettre (B pour bleu, V pour vert, etc.).

## Nombre de tentatives maximales

Le nombre de tentatives maximales sera demandé à l'utilisateur après qu'il ait choisi sur son type de jeu sur l'interface d'accueil.

## Définition du code secret

Après validation du nombre de tentatives maximales, il sera demandé au cachotier de définir un code secret de 5 couleurs.
Ce code secret devra se présenter sous la forme de 5 lettres, qui correspondent au lot de couleur défini dans l'application.
Exemple : BORGG pour Bleu - Orange - Rouge - Gris - Gris.
Ce code sera stocké dans l'application sous la forme d'un tableau d'énumération.

## Réponse du cachotier

A chaque proposition du joueur, l'ordinateur est donc chargé de répondre en utilisant des jetons de deux couleurs uniquement :
- le blanc : "il existe un pion d'une couleur qui existe dans la combinaison, mais qui est mal placé"
- le noir : "il existe un pion d'une couleur qui existe dans la combinaison et qui est bien placé"

Si aucune des couleurs proposées ne se trouvent dans la proposition du cachotier, alors aucun jeton n'est affiché.
Dans le cas contraire, donnons un exemple :
La proposition du cachotier est : BORGG pour Bleu - Orange - Rouge - Gris - Gris.
La première proposition du joueur est  : RVBJM pour Bleu - Vert - Gris - Jaune - Marron.
On constate que le Bleu est bien placé, et que le Gris existe mais est mal placé, la réponse de l'ordinateur sera donc un jeton blanc et un jeton noir.

## Déroulement d'une partie

L'utilisateur arrive sur l'interface d'accueil et décide de jouer contre un ordinateur ou contre un adversaire, auquel cas il passera la main au cachotier (joueur ou ordinateur) qui sera chargé de définir une combinaison de 5 couleurs.

Une fois le choix de la combinaison faite, l'utilisateur doit pouvoir choisir le nombre de tentatives maximales qui lui sont autorisées. Ensuite, la partie débute :
L'utilisateur fait une première proposition, à laquelle le cachotier répond en plaçant des jetons noirs et blancs si besoin est.
Et ainsi de suite jusqu'à la fin de la partie, qui se termine lorsque le nombre de tentatives maximales est atteint, ou que l'utilisateur a trouvé la bonne combinaison (l'ordinateur a donc placé cinq jetons noirs).

A la fin de la partie, le joueur revient sur l'interface d'accueil.
