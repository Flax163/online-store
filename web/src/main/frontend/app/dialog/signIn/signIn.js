(function() {
    "use strict";

    function SignInDialog(authorizationService, $cookieStore, metadataUser) {
        var ctrl = this;
        this.authorization = function(user, rememberUser) {
            var authData = {login: user.login, password: user.password};
            authorizationService.save(authData, function(data) {
                ctrl.authorizationMessage = '';
                metadataUser.authorization();
                $('#signInDialog').modal("hide");
                if (rememberUser) {
                    $cookieStore.put('token', {token: data.token});
                }
            }, function(data) {
                ctrl.authorizationMessage = 'Не удалось авторизоваться';
            });
        };
    }

    angular.module('onlineStore')
        .component('signInDialog', {
            templateUrl: 'signIn.html',
            controller: ['authorizationService', 'metadataUser', '$cookieStore', SignInDialog]
        });
})();