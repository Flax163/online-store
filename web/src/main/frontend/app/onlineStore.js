(function () {
    'use strict';

    function OnlineStoreComponent($cookies, authorizationService, metadataUser) {
        this.$onInit = function() {
            var token = $cookies.get('token');
            if (token !== undefined) {
                authorizationService.save(token, function () {
                    metadataUser.authorization();
                });
            }
        };
    }

    angular.module('onlineStore', ['ngComponentRouter', 'ngResource', 'ngCookies'])
        .config(function($locationProvider) {
            $locationProvider.html5Mode(true);
        })
        .value('$routerRootComponent', 'onlineStore')
        .component('onlineStore', {
            templateUrl: 'onlineStore.html',
            controller: ['$cookies', 'authorizationService', 'metadataUser', OnlineStoreComponent],
            $routeConfig: [
                {path: '/', name: 'Welcome', component: 'welcome', useAsDefault: true},
                {path: '/category/:id', name: 'OffersInCategories', component: 'offersInCategories'},
                {path: '/offer/:id', name: 'DetailOffer', component: 'detailOffer'},
                {path: '/about', name: 'About', component: 'about'},
                {path: '/cart', name:'Cart', component: 'cart'}
            ]
        })
})();