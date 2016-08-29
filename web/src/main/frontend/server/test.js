var express = require('express');
var app = express();

app.get('/test', function (request, response) {
    var someTestData = {
        someField: 'someValue',
        anotherField: 4
    };
response.json(someTestData);
});

app.listen(3000, function() {
    console.log('Server is listening at 3000!');
});