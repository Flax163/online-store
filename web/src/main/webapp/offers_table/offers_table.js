var onlineStore = angular.module('onlineStore', ['ngResource', 'ngRoute']);

onlineStore.config(['$routeProvider',
    function($routeProvider)
    {
        $routeProvider.when('/offers',
            {
                templateUrl: 'offers_table/offers_table.html',
                controller: 'offerController'
            });
        $routeProvider.when('/test',
            {
                templateUrl: 'offers_table/test.html'
            });
    }
]);

onlineStore.factory('offerFactory', ['$resource', function($resource){
        return $resource('offers', {}, {
            get: {method:'GET', isArray:true}
        });
    }]);

onlineStore.controller('offerController', function($scope, offerFactory)
{
   /* offerFactory.get(function(data) {
        //$scope.offers = data;
    });*/
    $scope.offers =
        [{"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0}];
});