The SOLID examples from this folder are a fork from the excellent project ["SOLID Github Repository"](https://github.com/mikeknep/SOLID "SOLID Github Repository").

## Translation

 Toute classe doit avoir une seule responsabilité. Il ne devrait jamais avoir plus d'une raisoin pour laquelle une classe doit changer.
 
Cet example s'inspire du jeu de Tic Tac Toe. La classe fournit un plateau de jeu, qui fait ce qu'est censé faire un plateau de jeu. Stocker les valeurs, retourner les cases du plateau et afficher le plateau à l'écran. Mais en pratique, cette classe fait trop de chose.

L'objectif de cet exercice est de séparer les actions (stockage, affichage) dans des composants séparés. 
 
## Original text
 
 Every class should have a single responsibility. There should never be more than one reason for a class to change.

This example is derived from my Tic Tac Toe game. The bad example provides a generic Board class that does board-related things--it stores the values of spots on the board, returns the board's rows, and prints the board out to the screen. This approach reminds me of models in many Rails apps. On the surface, everything seems legitimately related to a real-world Board object, but the Single Responsibility Principle tells us that this class is actually handling far too many responsibilities.

Consider the Board class in the "good" example. The only thing it is responsible for is knowing the values of its spots. It is entirely unconcerned with how those spots are being manipulated per the rules of Tic Tac Toe (rows, columns, diagonals) or displayed to the user (in a console, on the web, etc.). The BoardShaper and BoardPresenter classes are similarly focused on specific tasks. They are also only passed attributes they need; for example, BoardShaper objects are initialized with only a size (they don't need the whole board).

