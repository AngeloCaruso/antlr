const express = require('express');
const antlr4 = require('antlr4/index');
const CmasmasLexer = require('./antlr/CmasmasLexer');
const CmasmasParser = require('./antlr/CmasmasParser');
const ErrorListener = require('./ErrorListener').ErrorListener;
const path = require('path');
const morgan = require('morgan');

//Server init
const server = express();

//Settings
server.use(morgan('dev'));
server.use(express.urlencoded({extended:false}));
server.use(express.static(path.join(__dirname, '/public')));

//Routes
server.get('/', (req, res) => {
    res.sendFile('/index.html');
})
server.post('/antlr', (req, res) => {
    console.log(req.body.input)
    var errors = [];
    var input = req.body.input;
    var chars = new antlr4.InputStream(input);

    var lexer = new CmasmasLexer.CmasmasLexer(chars);
    var lexerListener = new ErrorListener(errors);
    lexer.removeErrorListeners();
    lexer.addErrorListener(lexerListener);

    var tokens  = new antlr4.CommonTokenStream(lexer);

    var parser = new CmasmasParser.CmasmasParser(tokens);
    var errorListener = new ErrorListener(errors);
    parser.removeErrorListeners();
    parser.addErrorListener(errorListener);
    var tree = parser.evaluar();

    console.log(errors)
    res.end(JSON.stringify(errors));
})
server.listen(3000, () => {
    console.log('server on port', 3000)
})