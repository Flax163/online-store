!function(){"use strict";angular.module("onlineStore",["ngComponentRouter","ngResource"]).config(["$locationProvider",function(e){e.html5Mode(!0)}]).value("$routerRootComponent","onlineStore").component("onlineStore",{template:'<div><top-menu></top-menu><div class="container theme-showcase" role="main"><ng-outlet></ng-outlet></div><sign-in-dialog></sign-in-dialog></div>',$routeConfig:[{path:"/",name:"Welcome",component:"welcome",useAsDefault:!0},{path:"/category/:id",name:"OffersInCategories",component:"offersInCategories"},{path:"/offer/:id",name:"DetailOffer",component:"detailOffer"},{path:"/about",name:"About",component:"about"},{path:"/cart",name:"Cart",component:"cart"}]})}(),function(){"use strict";function e(e){this.authorization=function(a,t){e.save({login:a,password:t},function(e){alert(e.isAuthorization)})}}angular.module("onlineStore").component("signInDialog",{template:'<div class="modal fade" id="signInDialog" tabindex="-1" role="dialog" aria-hidden="true"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title" id="myModalLabel">Войти в онлайн магазин</h4></div><div class="modal-body"><input type="text" id="login" title="login"> <input type="text" id="password" title="password"></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button> <button type="button" class="btn btn-primary" ng-click="$ctrl.authorization(\'q\', \'123\')">Войти</button></div></div></div></div>',controller:["authorizationService",e]})}(),function(){angular.module("onlineStore").factory("authorizationService",["$resource",function(e){return e("/rest/authorization",{},{})}])}(),function(){angular.module("onlineStore").factory("cartService",["$resource",function(e){return e("rest/cart",{},{})}])}(),function(){angular.module("onlineStore").factory("categoryService",["$resource",function(e){return e("rest/category/:idCategory",{},{})}])}(),function(){"use strict";angular.module("onlineStore").factory("offerService",["$resource",function(e){return e("rest/category/:idCategory/offer/:idOffer",{},{})}])}(),function(){"use strict";function e(e){this.$routerOnActivate=function(a){this.categories=e.query({idCategory:a.params.id})}}angular.module("onlineStore").component("offersInCategories",{template:'<div class="row"><div class="col-sm-6 col-md-4" ng-repeat="category in $ctrl.categories"><div class="thumbnail"><img data-src="holder.js/300x200" alt="..."><div class="caption"><h3 align="center">{{category.name}}</h3><p>{{category.description}}</p></div></div></div></div>',controller:["offerService",e]})}(),function(){"use strict";function e(e){this.$routerOnActivate=function(a){this.offersInCart=e.query()}}angular.module("onlineStore").component("cart",{template:'<h2>Корзина</h2><div class="panel panel-default"><div class="panel-heading">Товары в корзине</div><table class="table"><tr ng-repeat="offer in $ctrl.offersInCart"><td>{{offer.id}}</td><td>{{offer.name}}</td></tr></table></div>',controller:["cartService",e]})}(),function(){"use strict";angular.module("onlineStore").component("about",{template:"<h2>О нас</h2><div>Тут должно быть описанно о нас :)</div>"})}(),function(){"use strict";function e(e){this.categories=e.query()}angular.module("onlineStore").component("topMenu",{template:'<div class="navbar navbar-inverse navbar-fixed-top" role="navigation"><div class="container"><div class="navbar-header"><button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button> <a class="navbar-brand" ng-link="[\'Welcome\']">Интернет магазин</a></div><div class="navbar-collapse collapse"><div class="navbar-collapse collapse"><ul class="nav navbar-nav"><li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">Товары<b class="caret"></b></a><ul class="dropdown-menu"><li ng-repeat="category in $ctrl.categories"><a ng-link="[\'OffersInCategories\', {id:{{category.id}}}]">{{category.name}}</a></li></ul></li><li><a ng-link="[\'About\']">О нас</a></li></ul><ul class="nav navbar-nav" style="float:right"><li><a ng-link="[\'Cart\']">Корзина <span class="glyphicon glyphicon-shopping-cart"></span></a></li><li><a data-toggle="modal" data-target="#signInDialog">Войти <span class="glyphicon glyphicon-log-in"></span></a></li><li><a>Регистрация</a></li></ul></div></div></div></div>',controller:["categoryService",e]})}(),function(){"use strict";function e(e){this.$routerOnActivate=function(a){this.offerDetail=e.get({idOffer:a.params.idOffer})}}angular.module("onlineStore").component("detailOffer",{template:"<div>table offers {{$ctrl.offerDetail.id}}</div>",controller:["offerService",e]})}(),function(){angular.module("onlineStore").component("welcome",{template:'<h2 align="center">Добро пожаловать в онлайн магазин</h2><div id="carousel-example-generic" class="carousel slide" data-ride="carousel"><ol class="carousel-indicators"><li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li><li data-target="#carousel-example-generic" data-slide-to="1"></li><li data-target="#carousel-example-generic" data-slide-to="2"></li></ol><div class="carousel-inner"><div class="item active"></div></div><a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a></div>'})}();
//# sourceMappingURL=application.js.map
