var onlineStore = angular.module('onlineStore', ['ngResource']);

onlineStore.factory('offerFactory', ['$resource', function($resource){
        return $resource('offers', {}, {
            get: {method:'GET', isArray:true}
        });
    }]);

onlineStore.controller('offerController', function($scope, offerFactory)
{
    offerFactory.get(function(data) {
        $scope.offers = data;
    });
});