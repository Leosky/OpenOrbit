# Structure stratégique
## Carte planétaire
Les cartes planétaire sont composée d'un rectangle de taille (<x>,<y>) composé de cases dont les extrémités gauche et droite sont reliées afin de former un monde 'bouée'.

Les cases sont hexagonales et chaqu'unes contient un certain nombre de slots distincts disponnibles pour les armées, les flottes et les convois.

### Armée
Un nombre limité d'unité militaire peut occuper une même case. (TODO: Déterminer la limite)
Lors d'un combat au sol, elle seront les première engagée.

### Convois
Les convois sont l'équivalent économique d'une unité militaire. Ils sont composé d'unités ayant des roles spécifique non-combattant, comme la logistique, le marchandage, la diplomatie, la migration etc.
Comme pour les armées, les convois sont limité en nombre (TODO: Déterminer la limite).
Lors d'un combat au sol, elle seront engagée en même temps, mais seront des cibles secondaire (elle ne seront pas attaquées si un unité militaire est attaquable).

### Flotte
Les unités spatiales occupe un espace réservé et elles peuvent s'empiler avec les unités militaires ou les convois, mais leur nombre ne peut dépaser une limite imposée (TODO: Déterminer la limite).
Lors des combats, celles qui disposes d'armement adapté au combat en atmosphère s'ajoutent à l'armée présente, celles qui ne sont pas adapté au combat au sol restent en retrait mais sont toujours vulnérables aux attaques anti-aériennes et spatiales rapprochées (mais seront des cibles secondaires).


## Unité
### Caractéristiques
#### Etat
PV

#### Approvisionnement
L'approvisionnement représente l'état du matériel ainsi que son approvisionnement en carburant. L'effet de la dégradataion de cet état est différent selon le type d'unité et leurs moyen de déplacement.

Une unité d'infanterie pourra toujours se déplacer et combattre mais sera incapable d'utiliser les armes utilisant des munitions et sera affamée en plus d'autres malus au moral et une dégradation progressive de l'état structurel. Dans une autre mesure, une unité aérienne tombant à cours d'approvisionnement sera simplement détruite.

### Armes
#### Protée descriptive
Corps-à-corps (ex. dans une tranchée)
Rapproché (ex. échange de tir dans un bloc de maison)
Longue portée (ex. d'un coté à l'autre d'un parc)
Indirecte (tout ce qui exède la portée visuelle).

#### Type de projectile
* Lame
* Balle
* Torpille
* Obus anti-infanterie
* Obus anti-blindé
* Missile S-S
* Obus anti-aérien
* Obus d'artillerie

#### Type d'arme
* Projectile physique (ex: lames, balles, obus, bombes, missile)
* Energétique (ex: laser, plasma, etc.)

#### Type d'unité
* Biologique
* Légègre
* Blindée
* Basse altitude
* Haute altitude
* Navale
* Spatiale