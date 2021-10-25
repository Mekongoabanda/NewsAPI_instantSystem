# NEWS REST API
![enter image description here](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/news_api_logo.png?raw=true)

## OBJECTIF : 
**Développer une application** (volontairement simple dans le cadre de cet exercice) **qui permettra d’afficher l’ensemble des news en français**.
Vous pouvez accéder au site officiel ici -> [News API official site](https://newsapi.org)

## A FAIRE : 
-   **Voir l’ensemble des news**, avec au minimum le titre de la news et l’image associée à la news.   
-   En cliquant sur une news,  **voir le détail de cette news**  (le titre, l’image, la description et un lien vers la news complète).

## LIVRABLES : 
-   **Le code source**  de l’application (dans ce repository). Accès au fichier application --> [News_Api.apk](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/new_api.apk)
    
-   **Un document expliquant les choix**  (ce document) faits, problèmes non traités mais  identifiés et tout autre information utile pour apprécier ce travail.

## PRESENTATION DU TRAVAIL : 

### CHOIX DES TECHNOLOGIES : 

Le langage de programmation utilisé est **kotlin** (à 100%) comme exigé. La bibliothèque utilisée pour la gestion des **REST API** est **retrofit 2** car elle est non seulement l'une des plus populaire mais celle que je maîtrise le mieux. Bien évidemment pour la gestion des images j'ai opté pour Glide ( même si Picasso je l'utilise beaucoup). Glide car, il permet également la gestion des images animées. Concernant l'UX design j'ai été pour [**ADOBE XD**](https://www.adobe.com/fr/products/xd.html) car avant de développer il est plus convenable d'avoir une maquette de ce que l'on doit developper. 
Pour gérer mes tâches, j'ai utilisé comme outils de gestion de projet MeisterTask également basé sur de l'agilité, avec un tableau de style KANBAN : [MeisterTask Offical Site](https://www.meistertask.com/pages/fr/find-out-why/)


### PLANNING DU TRAVAIL

 - Tout d'abord concevoir la **maquette/preview** (UX design), en me rapprochant le plus du code couleur du site. Commencé Mardi 20/09/2021 vers 8h30, terminé vers 10h : 
 
![enter image description here](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/adobe_xd.png?raw=true)

- Ensuite entre 10h et 12h j'ai conçu les différentes GUI (interface graphique) liées au vues, conformément au design fait avec Adobe XD. A savoir la vue principal ([main_activity.xml](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/app/src/main/res/layout/activity_main.xml)) et la vue qui se répète pour chaque article ([news_item.xml](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/app/src/main/res/layout/news_item.xml)).
- Ensuite j'ai fait un tour sur le site [NEWS_API](https://newsapi.org), et testé des requêtes via **[POSTMAN](https://www.postman.com)** avant de les implémenter.
- Aucun travail entre 12h - 14H30
- Reprise à 14h30 et programmation Kotlin jusqu'à 18h. Version finale de l'application : 

![enter image description here](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/screen2.jpeg?raw=true)..............![enter image description here](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/screen1.jpeg?raw=true)

 - Jeudi (21 octobre) j'ai repris le travail au soir pour le commit sur Github et faire quelques légères améliorations. le 22 octobre vers 4h du matin j'ai rédigé ce readme

### PROBLEME RENCONTRES

- J'ai voulu afficher la liste de tous les articles en français mais une erreur est retournée(https://newsapi.org/docs/endpoints/everything). Nous demandant d'indiquer  plutôt un des 04 types de paramètres suivants : q, qInTitle, sources, domains . Pourtant "language=fr" est aussi un paramètre que l'on peut indiquer. ce qui signifie qu'on peut juste à ce niveau indiquer en français des articles ayant été filtrées (soit par domaines, par sources, par mot clé, etc) et donc pas TOUS les articles en français sans filtrage conformément à la documentation.
- Du coup, pour afficher tous les articles en français (top headline) sans filtre j'ai utilisé cette requête : https://newsapi.org/v2/top-headlines?language=fr&pageSize=50&apiKey=your_api_key . Par contre dans un vrai projet j'aurais signalé le soucis que j'ai rencontré que ce soit côté PO ou developpeur afin de trouver la solution ou la bonne information


## ⏱ Somme toute, j'ai réellement pris entre **7-8h de temps** pour effectuer ce travail (assez simple dans l'ensemble)
