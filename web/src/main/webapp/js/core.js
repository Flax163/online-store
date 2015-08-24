var offerService = angular.module('offerService', ['ngResource']);

offerService.factory('Offer', ['$resource',
    function($resource){
        return $resource('offers', {}, {
            query: {method:'GET', isArray:true}
        });
    }]);

var phonecatControllers = angular.module('phonecatControllers', []);

phonecatControllers.controller('OffersListCtrl', ['$scope', '$routeParams', 'Offer'], function($scope, $routeParams, Phone) {
    $scope.offers = Offer.get(function(offer) {
        $scope.offers = offers.images[0];
    }));

function OffersListCtrl($scope, Offer)
{

}