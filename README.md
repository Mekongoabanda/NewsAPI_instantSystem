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

Le langage de programmation utilisé est **kotlin** (à 100%) comme exigé. La bibliothèque utilisée pour la gestion des **REST API** est **retrofit 2** car elle est non seulement l'une des plus populaire mais celle que je maîtrise le mieux. Bien évidemment pour la gestion des images j'ai opté pour Glide ( même si Picasso je l'utilise beaucoup). Glide car, il permet également la gestion des images animées. Concernant l'UX design j'ai été pour [**ADOBE XD**](https://www.adobe.com/fr/products/xd.html) car avant de développer il est plus convenable d'avoir une maquette de ce que l'on doit developper

### PLANNING DU TRAVAIL

 - Tout d'abord concevoir la **maquette/preview** (UX design), en me rapprochant le plus du code couleur du site. Commencé Mardi 20/09/2021 vers 8h30, terminé vers 10h : 
 
![enter image description here](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/adobe_xd.png?raw=true)

- Ensuite entre 10h et 12h j'ai conçu les différentes GUI (interface graphique) liées au vues, conformément au design fait avec Adobe XD. A savoir la vue principal ([main_activity.xml](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/app/src/main/res/layout/activity_main.xml)) et la vue qui se répète pour chaque article ([news_item.xml](https://github.com/Mekongoabanda/NewsAPI_instantSystem/blob/master/app/src/main/res/layout/news_item.xml)).
- Ensuite j'ai fait un tour sur le site [NEWS_API](https://newsapi.org), et testé des requêtes via **[POSTMAN](https://www.postman.com)** avant de les implémenter.
- Aucun travail entre 12h - 14H30
- Reprise à 14h30 et programmation Kotlin jusqu'à 18h. Version finale de l'application : 

![enter image description here](https://lh3.googleusercontent.com/zeZ85Rrn9pk-W8EoOb0-oFCaZ1VLrwPQ2k0h3u3Pf73jU38pnWOqs5bZbped8AboJ9O0U4Xprn60_zvtXT35BVbHZh7S7u8bNU3OFEjRjvOuV6PbzRS8dyUIer9ZyN1Mka6wSjXDn5EWJcZytyChpI-0F0cVNMz2wAfPLkXCRGcBwUO3iaMODOdTHdpzykzvReYXGBQqpAhmvAiPQiQtfCE9lEGWLtugjtTlQG8PzfJIg7yGpz4iBoWP1mZB7MVjEarB6NM0kP_D5lsNjVG35HeV_ehPMy5SST4PKAl49a2uo2xshXk6AJpj1IbKC45SQulkEL8p0t1zg-oV_ajLYLOWR3MfMS7JRixGQPu_BKkMwcRy-TnlzX4RgZN6ooFqHjuMJSicGV_JCxHVHt5I1SRYhFuVV-sdPNRmmIv-6tsLgxnG5rdTdIDP7xcbgeEnmwZM_YYxEs61A9mjV3jz4Lz-agz5UlAK4WIa42eaY0tBrky5ZKY29H0bCGZfg2bcqL5P18107qlYgTKyp_5QmXc78Of-lPhMpoj6fs3gehuAfXmLtDw5Ie3sueTIWoJ-vOMgX7_pswWREQosXbi49EBbW00eYL-_uPHxVGzEgTKNEG9CKMjN7JMO-rcbsN4A7zmKA4EX9soNZAVPzFCd9-A6l2Jwej_O3XjOdu88E9D5x93DeGSIRPtyuplHtP-UaGyDw4YV1Avcjqdtkad9fZjQHg=w383-h787-no?authuser=0)...........![enter image description here](https://lh3.googleusercontent.com/baIDEwqUbk5eKxqRhjztTJpsIpzzaFCdPUTCFIEsLw8EE-NgYymlOK4XA4VS0GrJiQtX5Q7WrerQ-PRtYrpgN0LQDqgjPOTADzxueeE-_heVI1bXnFEqR9A8tBxKJ-74GzDxCf0P71hoZlTEDrBeyJaSR6yWDHEhPD0HlYytSmDz8K9EngiEyvvfYxcyZ76ZUT9DNEtQ5V8CLEsRo3AGHMEkLN84IRRflhGUx5YJiQCW06hKJZq8mNUhtVrxaTSAA1K5kbbxnDT7vkN_np8BuyGizlgi7ZqoDztK1oXk4WMmpxBqAyTsTg4V3ObDpyGxNbLwgk0lpQx8rfnkU0TFlWsM6G-G5pr_IOwJpYRmJr_1Tb6QER2i5oCr9LKdqvPp07ttNKOgzueVbZ67ju5Tisve_hkD2M1ZHxyDzTQx3k1ulcuTy_fmCsUANwC08EzZXbTgoAbgAoud-M2Dd_TOCb1UgblY0xfBbcn83RGGptBl2xq_8E9lYHZxfeG4zjVwVYiSRP03kcEq2wUhx4_fpSHnk8lkHCHGf3tGkOMqRMHFXX3zSVbBlI1Ejnb3UHN-K7cbCrouLi4n2WDxfi8CRC2mM8C5l1YNnHD3JW15gZf_4Q8vCEdmvWtABjh9FWaGAKbPcMrzHeZMJ9MCtXTdqxtKX-BEy_-p-nJO_wBeGEjKVL6YGL5rff-AX0a5Y2QfetEmatxzWQN-SnXJc-jt-UK_ZQ=w383-h787-no?authuser=0)

 - Jeudi (21 octobre) j'ai repris le travail au soir pour le commit sur Github et faire quelques légères améliorations. le 22 octobre vers 4h du matin j'ai rédigé ce readme

### PROBLEME RENCONTRES

- J'ai voulu affiché la liste de tous les articles en français mais une erreur est retournée(https://newsapi.org/docs/endpoints/everything). Nous demandant d'indiquer  plutôt un des 04 types de paramètres suivants : q, qInTitle, sources, domains . Pourtant "language=fr" est aussi un paramètre que l'on peut indiquer. ce qui signifie qu'on peut juste à ce niveau indiquer en français des articles ayant été filtrées (soit par domaines, par sources, par mot clé, etc)
- Du coup, pour afficher tous les articles en français (top headline) sans filtre j'ai utilisé cette requête : https://newsapi.org/v2/top-headlines?language=fr&pageSize=50&apiKey=0bf5b909bced4b80ad1669e78754b254


## ⏱ Somme toute, j'ai réellement pris entre **7-8h de temps** pour effectuer ce travail (assez simple dans l'ensemble)
