!function(){"use strict";angular.module("onlineStore",["ngComponentRouter","ngResource","ngCookies"]).config(["$locationProvider",function(a){a.html5Mode(!0)}]).value("$routerRootComponent","onlineStore").component("onlineStore",{template:'<div><top-menu></top-menu><div class="container theme-showcase" role="main"><ng-outlet></ng-outlet></div><sign-in-dialog></sign-in-dialog></div>',$routeConfig:[{path:"/",name:"Welcome",component:"welcome",useAsDefault:!0},{path:"/category/:id",name:"OffersInCategories",component:"offersInCategories"},{path:"/offer/:id",name:"DetailOffer",component:"detailOffer"},{path:"/about",name:"About",component:"about"},{path:"/cart",name:"Cart",component:"cart"}]})}(),function(){"use strict";function a(a,e){var t=this;this.authorization=function(o){var n={login:o.login,password:o.password};a.save(n,function(a){a.isAuthorization===!0?($("#signInDialog").modal("hide"),e.put("user",n),t.authorizationMessage=""):t.authorizationMessage="Не удалось авторизоваться"})}}angular.module("onlineStore").component("signInDialog",{template:'<div class="modal fade" id="signInDialog" tabindex="-1" role="dialog" aria-hidden="true"><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button><h4 class="modal-title" id="myModalLabel">Войти в онлайн магазин</h4></div><div class="modal-body"><label>{{$ctrl.authorizationMessage}}</label> <input type="text" ng-model="user.login" title="login" class="form-control" placeholder="Username"> <input type="text" ng-model="user.password" title="password" class="form-control" placeholder="Password"></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button> <button type="button" class="btn btn-primary" ng-click="$ctrl.authorization(user)">Войти</button></div></div></div></div>',controller:["authorizationService","$cookieStore",a]})}(),function(){angular.module("onlineStore").factory("authorizationService",["$resource",function(a){return a("/rest/authorization",{},{})}])}(),function(){angular.module("onlineStore").factory("cartService",["$resource",function(a){return a("rest/cart",{},{})}])}(),function(){angular.module("onlineStore").factory("categoryService",["$resource",function(a){return a("rest/category/:idCategory",{},{})}])}(),function(){"use strict";angular.module("onlineStore").factory("offerService",["$resource",function(a){return a("rest/category/:idCategory/offer/:idOffer",{},{})}])}(),function(){"use strict";angular.module("onlineStore").component("about",{template:"<h2>О нас</h2><div>Тут должно быть описанно о нас :)</div>"})}(),function(){"use strict";function a(a){this.$routerOnActivate=function(e){this.categories=a.query({idCategory:e.params.id})}}angular.module("onlineStore").component("offersInCategories",{template:'<div class="row"><div class="col-sm-6 col-md-4" ng-repeat="category in $ctrl.categories"><div class="thumbnail"><img data-src="holder.js/300x200" alt="..."><div class="caption"><h3 align="center">{{category.name}}</h3><p>{{category.description}}</p></div></div></div></div>',controller:["offerService",a]})}(),function(){"use strict";function a(a,e){this.categories=a.query(),this.$onInit=function(){e.save({login:"vago",password:"123"},function(a){})}}angular.module("onlineStore").component("topMenu",{template:'<div class="navbar navbar-inverse navbar-fixed-top" role="navigation"><div class="container"><div class="navbar-header"><button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button> <a class="navbar-brand" ng-link="[\'Welcome\']">Интернет магазин</a></div><div class="navbar-collapse collapse"><div class="navbar-collapse collapse"><ul class="nav navbar-nav"><li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">Товары<b class="caret"></b></a><ul class="dropdown-menu"><li ng-repeat="category in $ctrl.categories"><a ng-link="[\'OffersInCategories\', {id:{{category.id}}}]">{{category.name}}</a></li></ul></li><li><a ng-link="[\'About\']">О нас</a></li></ul><ul class="nav navbar-nav" style="float:right"><li><a ng-link="[\'Cart\']">Корзина <span class="glyphicon glyphicon-shopping-cart"></span></a></li><li><a data-target="#signInDialog" data-toggle="modal">Войти <span class="glyphicon glyphicon-log-in"></span></a></li><li><a>Выйти <span class="glyphicon glyphicon-log-out"></span></a></li><li><a>Регистрация</a></li></ul></div></div></div></div>',controller:["categoryService","authorizationService",a]})}(),function(){angular.module("onlineStore").component("welcome",{template:'<h2 align="center">Добро пожаловать в онлайн магазин</h2><div id="carousel-example-generic" class="carousel slide" data-ride="carousel"><ol class="carousel-indicators"><li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li><li data-target="#carousel-example-generic" data-slide-to="1"></li><li data-target="#carousel-example-generic" data-slide-to="2"></li></ol><div class="carousel-inner"><div class="item active"></div></div><a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a></div>'})}(),function(){"use strict";function a(a){this.$routerOnActivate=function(e){this.offersInCart=a.query()}}angular.module("onlineStore").component("cart",{template:'<h2>Корзина</h2><div class="panel panel-default"><div class="panel-heading">Товары в корзине</div><table class="table"><tr ng-repeat="offer in $ctrl.offersInCart"><td>{{offer.id}}</td><td>{{offer.name}}</td></tr></table></div>',controller:["cartService",a]})}(),function(){"use strict";function a(a){this.$routerOnActivate=function(e){this.offerDetail=a.get({idOffer:e.params.idOffer})}}angular.module("onlineStore").component("detailOffer",{template:"<div>table offers {{$ctrl.offerDetail.id}}</div>",controller:["offerService",a]})}();
//# sourceMappingURL=application.js.map
