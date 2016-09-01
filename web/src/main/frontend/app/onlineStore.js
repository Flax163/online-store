(function () {
    'use strict';

    angular.module('onlineStore', ['ngComponentRouter', 'ngResource'])
        .config(function($locationProvider) {
            $locationProvider.html5Mode(true);
        })
        .value('$routerRootComponent', 'onlineStore')
        .component('onlineStore', {
            templateUrl: 'onlineStore.html',
            $routeConfig: [
                {path: '/', name: 'Welcome', component: 'welcome', useAsDefault: true},
                {path: '/category', name: 'OffersInCategories', component: 'offersInCategories'},
                {path: '/offer/:id', name: 'DetailOffer', component: 'detailOffer'},
                {path: '/about', name: 'About', component: 'about'}
            ]
        })
})();