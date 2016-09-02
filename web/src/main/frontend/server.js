var express = require('express');

var app = express();

app.use(express.static('dist'));

app.get('/rest/category', function (req, res) {
    var catalogs = [{
        id: 1,
        name: 'category 1'
    },
    {
        id: 2,
        name: 'category 2'
    }];
    res.json(catalogs);
});

app.get('/rest/offer/:idOffer', function (req, res) {
    var requestIdOffer = req.params.idOffer;
    var offer = {
        id: requestIdOffer,
        name: 'offer ' + requestIdOffer
    };
    res.json(offer);
});

app.get('/', function (req, res) {
    res.sendfile('index.html');
});

app.listen(3000, function () {
    console.log('Server Start');
});