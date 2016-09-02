(function() {

    angular.module('onlineStore')
        .factory('categoryService', ['$resource',
            function($resource) {
                return $resource('rest/category', {}, {
                    query: {
                        method: 'GET',
                        isArray: true
                    }
                });
            }
        ])
})();