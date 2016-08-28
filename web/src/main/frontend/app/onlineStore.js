(function () {
    'use strict';

    angular.module('onlineStore', ['ngComponentRouter'])
        .config(function($locationProvider) {
            $locationProvider.html5Mode(true);
        })
        .value('$routerRootComponent', 'onlineStore')
        .component('onlineStore', {
            templateUrl: 'onlineStore.html',
            $routeConfig: [
                {path: '/', name: 'Welcome', component: 'welcome', useAsDefault: true},
                {path: '/category/:id', name: 'OffersInCategories', component: 'offersInCategories'},
                {path: '/offer/:id', name: 'DetailOffer', component: 'detailOffer'},
                {path: '/about', name: 'About', component: 'about'}
            ]
        })
})();