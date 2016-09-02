(function () {
    'use strict';

    function TopMenuComponent(categoryService) {
        this.categories = categoryService.query();
    }

    angular.module('onlineStore')
        .component('topMenu', {
            templateUrl: 'topMenu.html',
            controller: ['categoryService', TopMenuComponent]
        });
})();