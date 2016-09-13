(function() {
    "use strict";

    function SignInDialog(authorizationService, $cookieStore, currentUser) {
        var ctrl = this;
        this.authorization = function(user, rememberUser) {
            var authData = {login: user.login, password: user.password};
            authorizationService.save(authData, function(data) {
                if (data.isAuthorization === true)
                {
                    if (rememberUser) {
                        $cookieStore.put('user', authData);
                    }
                    ctrl.authorizationMessage = '';
                    currentUser.authorization();
                    $('#signInDialog').modal("hide");
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
            controller: ['authorizationService', '$cookieStore', 'currentUser', SignInDialog]
        });
})();