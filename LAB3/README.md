Lors de ma première exécution du rapport de couverture, j'ai obtenu des résultats moyens qui ne parvenaient pas à atteindre 100% pour la catégorie "Date". Voici les résultats initiaux :

![jacoco coverage report](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/7c90501d-3faf-4fff-86b2-41d8b7356902)
![default](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/e59b683e-9da9-43e9-b71f-5eaa5f38ac16)
![date](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/4591c716-5b19-4c34-987a-2dfeb83d2cfd)

Après cela, j'ai dû apporter des modifications au fichier Date.java et ajouter des tests. Les modifications les plus importantes ont été effectuées dans la méthode "private boolean isEndOfMonth()", qui a été réécrite. Après ces changements, les résultats étaient satisfaisants, même avec l'ajout de tests supplémentaires, et ont atteint une couverture de 100% pour la classe Date.

Voici les nouveaux résultats :
![covererage report result](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/c1be8787-6f60-4002-aef7-4a886dbc31ae)
![defualt result](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/d7272bc0-4ec6-42d7-9892-7db8f41538c5)
![date result](https://github.com/Abdelaziz64/seg3503_playground/assets/90732437/34678ffc-b4ef-4780-afdb-bb1d23547b08)
