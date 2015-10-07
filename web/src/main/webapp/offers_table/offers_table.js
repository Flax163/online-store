var onlineStore = angular.module('onlineStore', ['ngResource', 'ngRoute']);

/*onlineStore.config(['$routeProvider',
    function($routeProvider)
    {
        $routeProvider.when('/offers',
            {
                templateUrl: 'offers_table/offers_table.html',
                controller: 'loadCategoriesController'
            });
        $routeProvider.when('/test',
            {
                templateUrl: 'offers_table/test.html'
            });
    }
]);*/

onlineStore.factory('categoryFactory', ['$resource', function($resource){
        return $resource('online-store/categories', {}, {
            get: {method:'GET', isArray:true}
        });
    }]);

onlineStore.controller('loadCategoriesController', function($scope, categoryFactory)
{
    categoryFactory.get(function(data) {
        $scope.categories = data;
    });
    /*$scope.offers =
        [{"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0},
            {"id":null,"name":"test","description":"test","price":null,"stars":0}];*/
});