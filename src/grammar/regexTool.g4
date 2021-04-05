grammar regexTool;

options {
    language = Java;
}

start:  imports namespace? statements;

imports
    :   'import' QUOTE LINE_END  {System.out.println("import");} imports
    |   'import' QUOTE EOF
    |   comment LINE_END  {System.out.println("import comment");} imports
    |   comment EOF
    |   LINE_END imports
    | {System.out.println("import end");}
    ;

namespace
    :   'namespace' IDENT LINE_END {System.out.println("namespace");}
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
    :   'label' IDENT '=' term term_list
    ;

capture_stmt
    :   'capture' IDENT '=' term term_list
    |   'capture[]' IDENT '=' term term_list
    ;

build_stmt
    :   'build' IDENT '=' variable CONSTANT*
    ;

test_stmt
    :   'test' variable QUOTE
    |   'test' variable CONSTANT
    ;

func_stmt
    :   'function' IDENT '(' param_list ')' '=' term_list;

term_list
    :   term term_list
    |
    ;

func_call
    :   variable '(' arg_list ')';

term
    :   func_call
    |   QUOTE
    |   variable
    ;

variable
    :   IDENT
    |   NS_IDENT
    ;

param
    :   IDENT
    ;

arg_list
    :   term arg_list_tail
    |
    ;

arg_list_tail
    :   ',' term arg_list_tail
    |
    ;

param_list
    :   param param_list_tail
    |
    ;

param_list_tail
    :   ',' param param_list_tail
    |
    ;

QUOTE: '\'' (~['\\\r\n] | '\\' .)* '\'';

IDENT: [a-zA-Z_$] [a-zA-Z0-9_$]*;

NS_IDENT: IDENT '.' IDENT;

WS
    :   [ \t]+ -> skip
    ;

LINE_END:  '\n';

CONSTANT: '@' [A-Z] [A-Z0-9_]*;