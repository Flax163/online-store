(function () {
    'use strict';

    angular.module('onlineStore', ['ngComponentRouter'])
        /*.config(function($locationProvider) {
            $locationProvider.html5Mode(true);
        })*/
        .value('$routerRootComponent', 'onlineStore')
        .component('onlineStore', {
            templateUrl: 'onlineStore.html',
            $routeConfig: [
                //{path: '/tableOffers', name: 'TableOffers', component: 'tableOffers', useAsDefault: true},
                {path: '/', name: 'DetailOffer', component: 'detailOffer', useAsDefault: true}
            ]
        })
        .component('detailOffer', {
        templateUrl: 'detailOffer.html',
        controller: DetailOfferComponent
        });

})();