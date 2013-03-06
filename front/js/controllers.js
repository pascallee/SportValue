/**
 * Un controller AngularJS détermine le comportement d'une portion de page HTML.
 * Cette portion est délimitée par la présence de la directive ng-controller='usersController'
 * L'object $scope, associé à cette portion de page, permet de lier le model à la page HTML grâce
 * à la notation {{ }}.
 * De même, les fonctions du $scope peuvent être appelées par la page HTML (utilisation de ng-click)
 * @see http://docs.angularjs.org/guide/dev_guide.mvc.understanding_controller
 */
app.controller('usersController', function($scope, UsersService){

    // fetch users list
    UsersService.fetch().success(function(user){
        $scope.users = user;
    });

    // called when a user on the list is selected
    $scope.displayUserEditionForm = function(selectedUser){
        $scope.formLegend = "Edit a user"
        $scope.user = angular.copy(selectedUser);
        $scope.user.password = '';              // password field is always empty
        $scope.selectedId = selectedUser.id;    // highlight the selected user
    };


    // called when the 'New' button is clicked
    $scope.displayUserCreationForm = function(){
        resetForm();
    };

    // called when the 'Save' button is clicked
    $scope.saveUser = function(formUser){
        if(formUser.id != null) {
            UsersService.update(formUser.id, formUser).success(function(){
                updateUser($scope.users, formUser);
                resetForm();
            });
        } else {
            UsersService.save(formUser).success(function(){
                $scope.selectedId = formUser.id;
                $scope.users.push(formUser);
                resetForm();
            });
        }
    };

    // verify if both entered password match or not
    $scope.passwordNotMatched = function() {
        return $scope.user.password !== $scope.password2;
    };


    function resetForm(){
        $scope.formLegend = "Create a new user"
        $scope.user = {};
        $scope.password2 = '';
        $scope.userForm.$setPristine(); // reset the form state to a pristine state
    };

    function updateUser(USERS, formUser) {
        angular.forEach(USERS, function(user, key){
            if(user.id === formUser.id){
                angular.copy(formUser, user);
            }
        });
    }

});
