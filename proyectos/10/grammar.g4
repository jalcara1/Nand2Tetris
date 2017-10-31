//Define a grammar for Jack Language
grammar Jack;
//Lexical elements:
//The Jack language include five types of terminal elements(tokens)
keyword :   'class'|'constructor'|'function'|'method'|'field'|'static'
    |'var'|'int'|'char'|'boolean'|'void'|'true'|'false'|'null'|'this'
    |'let'|'do'|'if'|'else'|'while'|'return' ;
symbol  :   '{'|'}'|'('|')'|'['|']'|'.'|','|';'|'+'|'-'|'*'|'/'|'&'|'|'
    |'<'|'>'|'='|'~' ;
integerConstant :   '0'|('1'..'9')('0'..'9')* ;
StringConstant  :   '"'(~('"'|'\n'|'\r'))*'"'|'"' ~'"' '"' ;
identifier  :   ;
//Program structure:
//A Jack Program is a collection of classes, each appearing in a separate file.
//The compilation unit is a class. A class is a sequence of tokens strucured
//according to the following context free syntax:
class   :   'class' className '{' classVarDec* subroutineDec* '}' ;
classVarDec :   ('static'|'field') type varName (','varName)* ';' ;
type    :   'int'|'char'|'boolean'|className ;
subroutineDec   :   ('constructor'|'funtion'|'method') ('void'|type)subroutineName
        '('parameterList')'subroutineBody ;
parameterList   :   ((type varName)(','type varName)*)? ;
subroutineBody  :   '{'varDec* statements'}' ;
varDec  :   'var' type varName (',' varName)* ';' ;
className   : identifier ;
subroutineName  :identifier ;
varName :identifier ;
//Statements:
statements  :   statement* ;
statement  :   letStatement|ifStatement|whileStatement|doStatement|returnStatement ;
letStatement    :   'let' varName ('['expression']')?'='expression';' ;
ifStatement :   'if' '(' expression ')' '{' statements '}' ('else''{'statements'}')? ;
whileStatement  :   'while' '(' expression ')' '{' statements '}' ;
doStatement :   'do' subroutineCall ';' ;
ReturnStatement :   'return' expression? ';' ;
//Expressions:
expression  :   term (op term)* ;
term    :   integerConstant|stringConstant|keywordConstant|varName
    |varName '[' expression ']'|subroutineCall|'('expression')'|unaryOp term ;
subroutineCall  :   subroutineName '(' expressionList ')'|(className|varName)'.'subroutineName'('expressionList')' ;
op  :   '+'|'-'|'*'|'/'|'&'|'|'|'<'|'>'|'=' ;
unaryOp :   '-'|'*' ;
KeyworkConstant : 'true'|'false'|'null'|'this' ;
