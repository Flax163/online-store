(function() {
    'use strict';

    angular.module('onlineStore')
        .factory('metadataUser', function() {
            var metadataUser = {};
            var isAuthorization = false;
            var tokenUser;
            metadataUser.isAuthorization = function () {
                return isAuthorization;
            };
            metadataUser.authorization = function () {
                isAuthorization = true;
            };
            metadataUser.notAuthorization = function () {
                isAuthorization = false;
            };
            metadataUser.setToken = function (token) {
                tokenUser = token;
            };
            metadataUser.getToken = function () {
                return tokenUser;
            };
            return metadataUser;
        })
})();