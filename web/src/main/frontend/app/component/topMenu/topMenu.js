(function () {
    'use strict';

    function TopMenuComponent(categoryService, metadataUser, $cookies) {
        var ctrl = this;
        ctrl.metadataUser = metadataUser;
        this.categories = categoryService.query();

        this.singOut = function() {
            ctrl.metadataUser.notAuthorization();
            $cookies.remove('token', {});
        }
    }

    angular.module('onlineStore')
        .component('topMenu', {
            templateUrl: 'topMenu.html',
            controller: ['categoryService', 'metadataUser', '$cookies', TopMenuComponent]
        });
})();