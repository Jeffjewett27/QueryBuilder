grammar regexTool;

options {
    language = Java;
}

start:  imports namespace? statements;

imports
    :   IMPORT_KEY fname=QUOTE LINE_END imports #importLE
    |   IMPORT_KEY fname=QUOTE EOF #importFE
    |   COMMENT LINE_END imports #importCommentLE
    |   COMMENT EOF #importCommentFE
    |   LINE_END imports #importEmpty
    |   #importEnd
    ;

namespace
    :   NAMESPACE_KEY name=IDENT LINE_END
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
    |   COMMENT
    |   build_stmt
    |   test_stmt
    |   func_stmt
    ;

label_stmt
    :   LABEL_KEY name=IDENT '=' val=term term_list
    ;

capture_stmt
    :   CAPTURE_KEY name=IDENT '=' term term_list #captureSingle
    |   CAPTURE_KEY '[]' name=IDENT '=' term term_list #captureArray
    ;

build_stmt
    :   BUILD_KEY name=IDENT '=' label=variable flags=CONSTANT*
    ;

test_stmt
    :   TEST_KEY build=variable input=QUOTE output=test_output #testQuote
    |   TEST_KEY build=variable input=CONSTANT output=test_output #testConst
    ;

test_output
    :   QUOTE
    |
    ;

func_stmt
    :   FUNCTION_KEY name=IDENT '(' params=param_list ')' '=' terms=term_list;

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

WS
    :   [ \t\r]+ -> skip
    ;

COMMENT
    :  '#' ~( '\r' | '\n' )*
    ;

LINE_END:  '\r'? '\n';

LABEL_KEY: 'label';

TEST_KEY: 'test';

BUILD_KEY: 'build';

CAPTURE_KEY: 'capture';

FUNCTION_KEY: 'function';

IMPORT_KEY: 'import';

NAMESPACE_KEY: 'namespace';

QUOTE: ['"] (~['"\\\r\n] | '\\' .)* ['"];

IDENT: [a-zA-Z_$] [a-zA-Z0-9_$]*;

NS_IDENT: IDENT '.' IDENT;

CONSTANT: '@' [A-Z] [A-Z0-9_]*;