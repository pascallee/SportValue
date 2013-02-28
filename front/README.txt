USE CASE 0 : ARRIVEE SUR L'APPLICATION
* ouvrir la page index.html dans un navigateur
        > la page s'affiche
        > la liste des utilisateurs est affichée dans un table à gauche
        > remarquez l'affichage d'un symbole ☑ dans le cas où l'utilisateur est admin
        > le formulaire est vide
        > le titre du formulaire est par défaut à 'Create a new user'



USE CASE 1 : MISE A JOUR D'UN UTILISATEUR
* sélectionner un utilisateur dans la liste
        > la ligne correspondante est surlignée
        > le formulaire est renseigné avec les infos correspondant à l'utilisateur
        > les champs 'Password' et 'Confirm Password' sont toujours vide au départ
        > le titre du formulaire est 'Edit a user'
        > aucune erreur n'apparaît visuellement dans le formulaire. En effet, la validation du formulaire commence
          dès que l'on a intéragi avec celui-ci pour éviter d'afficher au départ pleins d'erreurs dans l'IHM
        > le bouton 'Save' est désactivé car le formulaire est invalide
* Saisir une valeur pour le champ First Name
* Vider le champ First Name
        > le champ de saisie est marqué en rouge avec un message d'erreur. On signale que le champ est requis
* De même, le mail saisie doit être valide
* Les mots de passes doivent être identique pour être valides.
* Lorsque tous les champs sont valides, alors le formulaire passe à l'état valide.
        > Le bouton 'Save' devient actif
* cliquer sur le bouton Save
        > Le formulaire est réinitialisé (champ vidé, plus de message d'erreur)
        > L'édition a réussi (resélectionner l'utilisateur pour vérifier)





USE CASE 2 : CREATION D'UN UTILISATEUR
* cliquez sur le bouton 'New'
        > le formulaire est réinitialisé (champ vidé, plus de message d'erreur)
        > le titre du formulaire est 'Create a new user'
* les mêmes validations s'appliquent. Saisissez des valeurs valides pour rendre le formulaire valide et rendre
  actif le bouton 'Save'
* cliquer sur le bouton 'Save'
        > Le formulaire est réinitialisé (champ vidé, plus de message d'erreur)
        > La création a réussi. L'utilisateur créé est rajouté dans la liste de gauche.
        > La ligne correspondant à l'utilisateur créé est surligné.