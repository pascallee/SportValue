/**
 * Ceci est le point d'entrée de l'application.
 * Ici, nous initialisons un module nommé 'app'
 * Dans la page HTML, on utilise la direction ng-app='app'
 * pour dire à AngularJS quelle portion de la page HTML il doit être actif.
 * De manière générale, on le met sur la balise <html>
 *
 * Dans une application où la navigation est gérée coté client, nous trouverons
 * dans ce fichier, également la définition des routes, cad, dire à l'application
 * quelle template charger avec quel controleur pour tel URL
 * @see http://docs.angularjs.org/api/ng.$routeProvider
 */
var app = angular.module('app', []);

