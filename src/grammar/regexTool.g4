grammar regexTool;

options {
    language = Java;
}

start:  imports namespace? statements;

imports
    :   'import' fname=QUOTE LINE_END imports #importLE
    |   'import' fname=QUOTE EOF #importFE
    |   comment LINE_END imports #importCommentLE
    |   comment EOF #importCommentFE
    |   LINE_END imports #importEmpty
    | #importEnd
    ;

namespace
    :   'namespace' name=IDENT LINE_END
    ;

comment
    :  '#' ~( '\r' | '\n' )*
    ;

statements
    :   statement LINE_END statements
    |   statement EOF
    |   LINE_END statements
    |   EOF
    ;

statement
    :   label_stmt
    |   capture_stmt
    |   comment
    |   build_stmt
    |   test_stmt
    |   func_stmt
    ;

label_stmt
    :   'label' name=IDENT '=' val=term term_list
    ;

capture_stmt
    :   'capture' name=IDENT '=' term term_list
    |   'capture[]' name=IDENT '=' term term_list
    ;

build_stmt
    :   'build' name=IDENT '=' label=variable flags=CONSTANT*
    ;

test_stmt
    :   'test' build=variable input=QUOTE #testQuote
    |   'test' build=variable input=CONSTANT #testConst
    ;

func_stmt
    :   'function' name=IDENT '(' params=param_list ')' '=' terms=term_list;

term_list
    :   term term_list
    |
    ;

func_call
    :   name=variable '(' args=arg_list ')';

term
    :   func=func_call #funcTerm
    |   QUOTE #quoteTerm
    |   var=variable #varTerm
    ;

variable
    :   IDENT #varIdent
    |   NS_IDENT #varNSIdent
    ;

param
    :   IDENT
    ;

arg_list
    :   val=term arg_list_tail #argHead
    | #argEmpty
    ;

arg_list_tail
    :  ',' val=term arg_list_tail #argListTail
    | #argListDone
    ;

param_list
    :   par=param param_list_tail
    |
    ;

param_list_tail
    :   ',' par=param param_list_tail
    |
    ;

QUOTE: ['"] (~['"\\\r\n] | '\\' .)* ['"];

IDENT: [a-zA-Z_$] [a-zA-Z0-9_$]*;

NS_IDENT: IDENT '.' IDENT;

WS
    :   [ \t]+ -> skip
    ;

LINE_END:  '\n';

CONSTANT: '@' [A-Z] [A-Z0-9_]*;