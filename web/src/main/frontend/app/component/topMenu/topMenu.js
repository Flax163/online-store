(function () {
    'use strict';

    function TopMenuComponent(categoryService, authorizationService, $cookies, currentUser) {
        var ctrl = this;
        ctrl.currentUser = currentUser;
        this.categories = categoryService.query();
        this.$onInit = function() {
            var userInCookies = $cookies.get('user');
            if (userInCookies !== undefined) {
                authorizationService.save(userInCookies, function () {
                    ctrl.currentUser.authorization();
                });
            }
        };

        this.singOut = function() {
            ctrl.currentUser.notAuthorization();
            $cookies.remove('user', {});
        }
    }

    angular.module('onlineStore')
        .component('topMenu', {
            templateUrl: 'topMenu.html',
            controller: ['categoryService', 'authorizationService', '$cookies', 'currentUser', TopMenuComponent]
        });
})();