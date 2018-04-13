# Objectif du TP

Ecrire les tests unitaires en méthode BDD en utilisant le framework JGiven

## Présentation du Franework

Le framework JGiven est un framework relativement jeune qui a l'avantage de proposer une méthode purement programmatique pour structurer ses tests JUnits, en Java, selon l'approche BDD.

http://jgiven.org/userguide/

## Use-cases

> Quand une transaction est invalide, une exception est levée et la transaction n'est pas traitée

> Quand une transaction a déja été traitée; une exception est levée et la transaction est  traitée

> Quand le montant de la transaction est négatif et dépasse les fonds du compte, une exception est levée et la transaction  traitée

> Quand le montant d'une transaction est trop important; une exception est levée et la transaction est  traitée

> Quand le montant d'une transaction est trop faible; une exception est levée et la transaction est  traitée

> Quand la transaction est postérieure à la date actuelle une exception est levée; transaction est traitée

> Quand la transaction ne répond pas aux cas précédents; le montant est ajouté ou débité au compte; la transaction traitée.





