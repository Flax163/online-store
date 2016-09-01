(function () {
    'use strict';

    function DetailOfferComponent(offerService) {
        this.$routerOnActivate = function(next) {
            this.offerDetail = offerService.get({idOffer: next.params.id});
        };
    }

    angular.module('onlineStore')
        .component('detailOffer', {
            templateUrl: 'detailOffer.html',
            controller: ['offerService', DetailOfferComponent]
        })
})();
