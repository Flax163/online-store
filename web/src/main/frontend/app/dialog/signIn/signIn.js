(function() {
    "use strict";

    function SignInDialog(authorizationService, $cookieStore) {
        var ctrl = this;
        this.authorization = function(user) {
            var authData = {login: user.login, password: user.password};
            authorizationService.save(authData, function(data) {
                if (data.isAuthorization === true)
                {
                    $('#signInDialog').modal("hide");
                    $cookieStore.put('user', authData);
                    ctrl.authorizationMessage = '';
                }
                else
                {
                    ctrl.authorizationMessage = 'Не удалось авторизоваться';
                }
            });
        };
    }

    angular.module('onlineStore')
        .component('signInDialog', {
            templateUrl: 'signIn.html',
            controller: ['authorizationService', '$cookieStore', SignInDialog]
        });
})();