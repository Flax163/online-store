(function() {
    'use strict';

    angular.module('onlineStore')
        .factory('offerService', ['$resource',
            function($resource) {
                return $resource('rest/offer/:idOffer', {}, {
                    query: {
                        method: 'GET',
                        isArray: false
                    }
                });
            }
        ])

})();