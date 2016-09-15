var express = require('express');
var bodyParser = require("body-parser");

var app = express();

app.use(express.static('dist'));
app.use(bodyParser.json());

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

app.get('/rest/cart', function (req, res) {

    const offers = [{
        id: 10,
        name: 'offer in cart 10'
    },
    {
        id: 11,
        name: 'offer in cart 11'
    }];
    res.json(offers);
});

app.get('/rest/category/:idCategory/offer/:idOffer', function (req, res) {
    const requestIdOffer = req.params.idOffer;
    const offer = {
        id: requestIdOffer,
        name: 'offer ' + requestIdOffer
    };
    res.json(offer);
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

app.post('/rest/authorization', function(req, res) {
    if (req.body.token === undefined) {
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
    }
    else {
        if (req.body.token == 'any token')
        {
            res.send({token: req.body.token});
        }
    }
});

app.get('/', function (req, res) {
    res.sendfile('index.html');
});

app.listen(3000, function () {
    console.log('Server Start');
});