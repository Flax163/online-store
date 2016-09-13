(function() {
    'use strict';

    angular.module('onlineStore')
        .factory('currentUser', function() {
            var currentUser = {};
            var isAuthorization = false;
            currentUser.isAuthorization = function () {
                return isAuthorization;
            };
            currentUser.authorization = function () {
                isAuthorization = true;
            };
            currentUser.notAuthorization = function () {
                isAuthorization = false;
            };
            return currentUser;
        })
})();