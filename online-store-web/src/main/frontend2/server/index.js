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
        res.send();
    } else {
        res.statusCode = 401;
        res.send();
    }
});

app.listen(8080, function () {
    console.log('Server Start port 8080');
});
