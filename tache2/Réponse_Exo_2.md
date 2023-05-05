# Exercice 2 - Référence, *comparaison d'objets*
- Exécutez le code dans la classe `Exo2a.java`.
  Ajouter dans `Orange` une méthode ayant pour signature
```Java
public boolean equals(Orange o);
```
pour que l'execution du main ci-dessus soit plus naturel.
- Puis exécutez le code dans la classe `Exo2b.java`.
  Le comportement du code ci-dessus correspond-t-il à vos attentes ?
- ```Pas exactement car certaine origine passe en null donc font planter le programme```
- Pourquoi ?
- ```Je pense que les ajouts ne récupère pas forcement toute les informations lié au fruit donc ne possede pas d'origine```
- Que doit-on modifier ?
- ```il suffit d'ajouter une verification d'origine du fuit pour savoir d'ou il vient et si rien n'est trouvé et mettre un petit advertisement``` 
- Utiliser l'annotation @Override pour vérifier.