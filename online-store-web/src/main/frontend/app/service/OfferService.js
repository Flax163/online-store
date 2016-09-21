(function() {
    'use strict';

    angular.module('onlineStore')
        .factory('offerService', ['$resource',
            function($resource) {
                return $resource('rest/category/:idCategory/offer/:idOffer', {}, {});
            }
        ])

})();