(function() {

    angular.module('onlineStore')
        .factory('authorizationService', ['$resource',
            function($resource) {
                return $resource('/rest/authorization', {}, {});
        }])
})();