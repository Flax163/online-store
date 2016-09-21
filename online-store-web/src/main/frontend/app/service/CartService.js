(function() {

    angular.module('onlineStore')
        .factory('cartService', ['$resource',
            function($resource) {
                return $resource('rest/cart', {}, {});
            }
        ])
})();