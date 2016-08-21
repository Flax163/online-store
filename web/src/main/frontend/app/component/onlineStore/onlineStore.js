(function () {
    'use strict';

    angular.module('onlineStore')
        .component('onlineStore', {
        templateUrl: 'onlineStore.html',
        $routeConfig: [
            {path: '/offers', name: 'tableOffers', component: 'tableOffers', useAsDefault: true},
            {path: '/offers/:id', name: 'detailOffer', component: 'detailOffer'}
        ]
    })
})();