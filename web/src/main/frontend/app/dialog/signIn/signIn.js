(function() {
    "use strict";

    angular.module('onlineStore')
        .directive("signInDialog", function()
        {
            return {
                restrict: 'E',
                templateUrl: 'signIn.html'
            }
        })
})();