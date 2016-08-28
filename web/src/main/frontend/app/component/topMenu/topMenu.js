(function () {
    'use strict';

    function TopMenuComponent($scope) {
        $scope.name = 'test';
    }

    angular.module('onlineStore')
        .component('topMenu', {
            templateUrl: 'topMenu.html',
            controller: TopMenuComponent
        });
})();