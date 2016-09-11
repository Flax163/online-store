(function() {
    "use strict";

    function SignInDialog(authorizationService) {

        this.authorization = function(user) {
            authorizationService.save({login: user.login, password: user.password}, function(data) {
                alert(data.isAuthorization);
            });
        };
    }

    angular.module('onlineStore')
        .component('signInDialog', {
            templateUrl: 'signIn.html',
            controller: ['authorizationService', SignInDialog]
        });
})();