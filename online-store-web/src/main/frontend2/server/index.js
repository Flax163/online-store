var express = require('express');
var bodyParser = require("body-parser");
var webpack = require('webpack');
var webpackDevMiddleware = require('webpack-dev-middleware');
var webpackHotMiddleware = require('webpack-hot-middleware');
var webpackDevConfig = require("../config/webpack.dev.js");

var app = express();

app.use(bodyParser.json());

var compiler = webpack(webpackDevConfig);
app.use(webpackDevMiddleware(compiler, { noInfo: true, publicPath: '/'}));
app.use(webpackHotMiddleware(compiler));

app.post('/rest/authorization', function(req, res) {
        const login = req.body.login;
        const password = req.body.password;
        var token;
        if (login === 'vago' && password === '123') {
            token = 'any token';
        }
        if (token === undefined) {
            res.statusCode = 401;
            res.send();
        } else {
            res.send({token: token});
        }
});

app.post('/rest/verifyToken', function(req, res) {
    const token = req.body.token;
    if (token === 'any token') {
        res.send({token: 'any token2'});
    } else {
        res.statusCode = 401;
        res.send();
    }
});

app.get('/rest/category', function (req, res) {
    const catalogs = [{
        id: 1,
        name: 'category 1'
    },
        {
            id: 2,
            name: 'category 2'
        }];
    res.json(catalogs);
});

app.get('/rest/category/:idCategory/offer', function (req, res) {
    const offers = [
        {id: 1, name :'offer 1', description: 'description 1', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 2, name :'offer 2', description: 'description 2', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 3, name :'offer 3', description: 'description 3', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 4, name :'offer 4', description: 'description 4', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 5, name :'offer 5', description: 'description 5', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 6, name :'offer 6', description: 'description 6', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 7, name :'offer 7', description: 'description 7', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 8, name :'offer 8', description: 'description 8', pathImage: 'resources/images/placeholder_offer.png'},
        {id: 9, name :'offer 9', description: 'description 9', pathImage: 'resources/images/placeholder_offer.png'}];
    res.json(offers);
});

app.listen(8080, function () {
    console.log('Server Start port 8080');
});
