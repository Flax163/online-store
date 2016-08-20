(function() {
    'use strict';

    function LeftMenuController($scope) {
        $scope.name = 'ololo2';
    }

    angular.module('onlineStore').component('leftMenu', {
        templateUrl: 'leftMenu.html',
        controller: LeftMenuController
    });

})();