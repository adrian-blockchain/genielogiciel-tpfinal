
Q: Ecrire ce que chaque des binômes a fait sur le projet.
Elo Landrot s'est occupé de la création et de la gestion du package TaxPackage. Ce dernier contient des classes et une interface (TaxInterface) pour le calcul des taxes sur les produits. Elo a également mis en place les différentes stratégies de taxes : RegularTax, ReducedTax, ImportedTax et MultipleTaxes.

Adrian Kinsey, quant à lui, a travaillé sur le reste du projet. Il a notamment créé la classe Product qui représente un produit avec son nom, son prix et sa taxe. Adrian a également mis en œuvre la classe Invoice qui représente une facture et gère la liste des produits ainsi que le calcul du total des taxes et du prix total.

Q: Lister et expliquer les choix des concepts vus en cours (en 4 parties : Clean Code, Functional Programming style, TDD, Design Pattern)
Clean Code : Le code est structuré et clair. Les noms de variables et de méthodes sont explicites, ce qui facilite la compréhension du code. La séparation en plusieurs classes et méthodes respecte le principe de responsabilité unique.

Functional Programming Style : On utilise des fonctions de première classe comme map et reduce pour effectuer des calculs sur les listes. L'usage de ces fonctions évite la nécessité de boucles explicites, rendant le code plus lisible et plus concis.

TDD (Test Driven Development) : Des tests ont été écrits avant l'implémentation des fonctions dans la classe Invoice. Ces tests vérifient le calcul correct du total des taxes et du prix total.

Design Pattern : On utilise ici le pattern Stratégie pour le calcul des taxes. L'interface TaxInterface définit une méthode calculateTax que chaque classe de taxe implémente à sa manière. Cela permet d'avoir un code flexible et extensible, on peut ajouter de nouvelles stratégies de taxes sans modifier le code existant.

Q: Comment auriez-vous pu encore davantage perfectionner votre code ?
Pour perfectionner davantage notre code, nous aurions pu ajouter davantage de tests pour couvrir tous les scénarios possibles. Nous aurions également pu envisager d'utiliser des exceptions pour gérer les cas d'erreurs. Par ailleurs, pour améliorer la lisibilité, nous aurions pu extraire certaines portions de code dans des méthodes séparées. Enfin, nous aurions pu utiliser d'autres design patterns pour rendre notre code encore plus flexible et maintenable. Par exemple, le pattern Factory pour la création des produits pourrait être une option.