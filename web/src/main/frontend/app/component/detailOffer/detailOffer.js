(function () {
    'use strict';

    function DetailOfferComponent(offerService) {

        
    }

    angular.module('onlineStore')
        .component('detailOffer', {
            templateUrl: 'detailOffer.html',
            controller: ['offerService', DetailOfferComponent]
        })
})();
