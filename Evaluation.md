# Evaluation

Note globale : 14/20

> Projet efficace dans l'ensemble. L'essentiel est là pour que le projet fonctionne mais il n'y a pas d'IoC, peu de tests. Bonne identification des problèmes rencontrés mais des solutions non écrites : saurez-vous toujours faire face à ces problèmes sereinement à l'avenir ? Groupe dynamique et sympathique ensemble comme individuellement, du coup, pas de personnalisation des notes.

Antoine : 14/20
Alex : 14/20
Alexis : 14/20
Ted : 14/20
Whitney : 14/20
Maxime : 14/20

## Démonstration

* La présentation de l'équipe est importante. Tout le monde vous connait certes, mais vous avez des rôles qui diffèrent
* Bonne gestion du temps et présentation intégrale des fonctionnalités.

## Git

* Un utilisateur qui commit en tant que *unknown*
* Commentaires de commit diversifiés, c'est bien
* Début d'utilisation des branches, bon point
* Rédaction d'un `.gitignore` *homemade*. Bien mais penser à utiliser des templates qui gèrent peut-être plus de cas sur de plus gros projets
* Pourquoi ne pas avoir mis un *gitignore* global plutôt que dans chaque répertoire ? Penser aux *wildcard*, e.g. `*.class`
* Une *pull-request* toujours ouverte ainsi que deux *issues*
* Travail centré sur les lundis et mardi après-midi visiblement avec quelques travaux le vendredi après-midi également
* Pourquoi avoir commité le MOE.jar ? GitHub ne doit contenir que du code, c'est le Nexus qui contient vos binaires

## Code

* Inutile de rappeler le nom "Mastermind" dans chaque nom de classe, utilisez plutôt le nom des packages
* L'IoC vous aurait bien servi dans la méthode `MastermindManager#init`. Juste en *autowirant* un `Game` sur un `GameManager`, inutile de rendre le comportement dépendant du Mastermind ensuite
* Quelques méthodes un peu longues auraient méritées un découpage plus fin
* Pourquoi ajouter les éléments un à un avec leur position en dur dans `IaMastermind` ? Une liste est ordonnée par définition, l'ordre n'a pas d'importance étant donné que c'est du *random* et une boucle d'insertion aurait évité tous ces nombres magiques
* Bien d'avoir centralisé tous les affichages dans une classe, bien moche certes, mais au moins il n'y en a qu'une !

## Tests

* Une seule classe de tests qui teste beaucoup de concepts différents. Il faut faire une classe de test par classe
* Nommez vos variables plutôt que d'ajouter un commentaire de fin de ligne qui explique son contenu (e.g. ligne 105)
* Peu de tests au regards de la taille du code, tout n'est pas testé

## Documentation

* Bien d'avoir fait un embryon de spécifications du jeu
* Expression de besoin claire et concise et cahier de recettes précis : objectif, scénario, résultat. C'est efficace
* Pas ou peu de fautes d'orthographe (enfin rien qui ne saute aux yeux), c'est très bien

## Rapport

* Intéressant, on apprend beaucoup de choses. Bien d'avoir mis un trombi, c'est plus facile pour moi :)
* Attention à ne pas faire de *l'over-engineering* en voulant optimiser dès le départ quelque chose qui n'en aura pas forcément besoin. D'abord faire, proprement évidemment, quelque chose qui fonctionne et ensuite le refactorer (grace aux tests) pour améliorer les performances si besoin
* Comme d'autres groupes, le problème a été la communication à 6 (c'était volontaire de ma part, ça fait partie de la mise en situation, il n'y a pas que le code qui prime pour réussir un projet) en revanche vous ne dites pas concrètement ce que vous avez fait pour y rémédier
* Sur l'ampleur du projet, là encore, les projets sont assez simples et peuvent être bouclés en une bonne grosse après-midi de travail. L'idée ici était de mettre en place une certaine qualité de code et donc les outils qui vont avec. Ne pas avoir pris ces outils car le projet était modeste est dommage. Justement, tester les outils sur un petit périmètre (par exemple Spring) évite d'avoir à le faire sur de gros projets à l'avenir
* Java a été choisi pour sa portabilité et sa popularité. Si je laisse le choix de chaque langage, je peux me retrouver à corriger un langage que je ne connais pas, ou un framework d'IoC que je ne connais pas / n'existe pas
* Rapport qui rempli le contrat donné, un peu léger mais tout y est