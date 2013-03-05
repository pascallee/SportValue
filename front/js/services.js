/**
 * Exemple d'utilisation d'un service AngularJS
 * Un service angularJs permet de définir une liste de tâche spécifique. Ce service est automatiquement
 * géré par le système d'injection de dépendance d'AngularJS.
 * Ainsi, vous pouvez injecter ce service dans le controller et l'utiliser (voir controllers.js)
 * Ici, nous avons un service permettant de récupérer la liste des utilisateurs, d'en créer et d'en mettre à jour.
 * Ici les données sont mockées.
 * Bien sur, dans une vraie application, ces données proviennent d'un serveur
 * Pour cela, injecter le service $http pour effectuer des appels XHR
 * @see http://docs.angularjs.org/api/ng.$http
 * Utilisation : UsersService.fetch() et UsersService.save()
 */
app.service('UsersService', function($http){

    var API_URI = '/server/service/users/'    // à remplacer à l'url de l'API Web
    

    return {
        fetch : function(){
            return $http.get(API_URI);
        },
        save : function(formUser){
            return $http.post(API_URI, formUser)
        },
        update : function(id, user){
            return $http.put(API_URI + id, user);
        }

    }

});
