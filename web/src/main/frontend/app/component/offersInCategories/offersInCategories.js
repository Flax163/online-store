(function () {
    'use strict';

    function OffersInCategoriesComponent(offerService) {
        this.$routerOnActivate = function(next) {
            this.categories = offerService.query({idCategory: next.params.id});
        };
    }

    angular.module('onlineStore')
        .component('offersInCategories', {
            templateUrl: 'offersInCategories.html',
            controller: ['offerService', OffersInCategoriesComponent]
        })
})();