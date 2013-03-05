/**
 * Exemple simple d'utilisation d'un filtre angularJS.
 * Un filtre angularJs permet de formatter une donnée avant affichage
 * Ici par exemple, on souhaite affiché le symbole '☑' si un boolean est true
 * et '☐' sinon.
 * Ce filtre est utilisé ici : <td>{{user.admin | check}}</td>
 * Ainsi, le symbole correspondant est affiché en fonction de la valeur de user.isAdmin
 * au lieu de true ou false. Essayez d'enlever le filtre pour voir <td>{{user.isAdmin}}</td>
 */
app.filter('check', function(){
   return function(state) {
        return state === true ? '☑' : '☐';
   }
});