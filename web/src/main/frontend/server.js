var express = require('express');
var path = require('path');

var app = express();

app.use(express.static('dist'));

app.get('/catalogs', function (req, res) {
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

app.get('/', function (req, res) {
    res.sendfile('index.html');
});

app.listen(3000, function () {
    console.log('Server Start');
});