(function () {
    'use strict';

    function TopMenuComponent(categoryService, authorizationService, $cookies) {
        var ctrl = this;
        this.categories = categoryService.query();
        this.$onInit = function() {
            var userInCookies = $cookies.get('user');
            if (userInCookies !== undefined) {
                authorizationService.save(userInCookies, function (data) {
                    ctrl.isAuthorization = true;
                });
            }
        }
    }

    angular.module('onlineStore')
        .component('topMenu', {
            templateUrl: 'topMenu.html',
            controller: ['categoryService', 'authorizationService', '$cookies', TopMenuComponent]
        });
})();