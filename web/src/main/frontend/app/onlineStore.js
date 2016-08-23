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
                {path: '/', name: 'TableOffers', component: 'tableOffers'},
                {path: '/offer', name: 'DetailOffer', component: 'detailOffer'}
            ]
        })
})();