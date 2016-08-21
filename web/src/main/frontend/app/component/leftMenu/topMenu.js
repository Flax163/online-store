(function () {
    'use strict';

    function TopMenuController($scope) {
        $scope.name = 'test';
    }

    angular.module('onlineStore').component('topMenu', {
        templateUrl: 'topMenu.html',
        controller: TopMenuController
    });
})();