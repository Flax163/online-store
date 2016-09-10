(function () {
    'use strict';
    function CartComponent(cartService) {
        this.$routerOnActivate = function(next) {
            this.offersInCart = cartService.query();
        };
    }

    angular.module('onlineStore')
        .component('cart', {
            templateUrl: 'cart.html',
            controller: ['cartService', CartComponent]
        })
})();