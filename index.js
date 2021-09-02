var express = require('express');
var app = express();
var bodyParser = require('body-parser');
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.json());
const server = require('http').createServer();
var http = require('http').Server(app);
const config = require("./data.json");

var message;


app.get("/getall", function(req, res) {
    //this is a callback function
    console.log("Getall called");
    const fs = require("fs");
    fs.readFile("./data.json", "utf8", (err, jsonString) => {
        if (err) {
            console.log("File read failed:", err);
            res.send("Not Working");
            return;
        }
        console.log("File data:", jsonString);
        res.send(jsonString);
    });
})

app.post("/postall", function(req, res) {
    //this is a callback function
    console.log("Postall called");
    const fs = require("fs");
    fs.readFile("./data.json", "utf8", (err, jsonString) => {
        if (err) {
            console.log("File read failed:", err);
            res.send("Not Working");
            return;
        }
        console.log("File data:", jsonString);
        console.log(jsonString);
        //res.end(req.body);
    });
    const { a } = req.body;
    console.log("one");
    console.log(req.body.a);
    console.log("two");
    console.log(typeof(a));
    res.end(toString(jsonString));
    //res.end(JSON.stringify(req.body.a));
})

app.post('/json', function(request, response) {
    let myJson = request.body; // your JSON
    let myValue = request.body.myKey; // a value from your JSON
    response.send(myValue); // echo the result back
});

app.post('/eval', function(request, response) {
    //let myJson = request.body; // your JSON
    let result = eval(request.body.eval);
    console.log(result);
    //let myValue = request.body.myKey; // a value from your JSON
    response.end(result.toString()); // echo the result back
});


http.listen(8080, function() {
    console.log('listening on localhost:8080');
});