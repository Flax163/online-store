(function () {
    'use strict';

    var app = angular.module('onlineStore', []);

    app.controller('InvoiceController', function () {
        this.qty = 4;
        this.cost = 2;
    });
})();