var express = require('express');
var path = require('path');

var app = express();

app.use(express.static('dist'));

app.get('/test', function(req, res) {
    console.log('Test');
});

app.get('/', function(req, res) {
    res.sendfile('index.html');
});

app.listen(3000, function() {
    console.log('Server Start');
});