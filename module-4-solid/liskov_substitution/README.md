## Exercise / Liskov Substitution

This exercise is quoting a famous OOP problem using geometry shapes.

The mother class Shape is providing several useful methods however the designer forgot that each shape is coming with specific features.
The developer relied on the **instanceof** statement, a good sign of a code smell where the Liskov Substitution is not respected.

Removes the **instanceof** statements and try to fix the design.

