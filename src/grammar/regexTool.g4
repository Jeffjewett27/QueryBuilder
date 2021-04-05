grammar regexTool;

options {
    language = Java;
}

start:  imports statements;

imports
    :   'import' QUOTE LINE_END imports
    |   comment LINE_END imports
    |;

comment
    :  '#' ~( '\r' | '\n' )*;

statements
    :   statement LINE_END statements
    |   statement EOF
    |   LINE_END statements
    |   EOF;

statement
    :   label_stmt
    |   capture_stmt
    |   comment
    |   build_stmt;

label_stmt
    :   'label' IDENT '=' term_list;

capture_stmt
    :   'capture' IDENT '=' term_list
    |   'capture[]' IDENT '=' term_list;

build_stmt
    :   'build' IDENT;

term_list
    :   term term_list
    |;

func_call
    :   IDENT '(' comma_list ')';

term
    :   func_call
    |   QUOTE
    |   IDENT;

comma_list
    :   term comma_list_tail
    |;

comma_list_tail
    :   ',' term comma_list_tail
    |;

QUOTE: '\'' (~['\\\r\n] | '\\' .)* '\'';

IDENT: [a-zA-Z_$] [a-zA-Z0-9_$]*;

WS
    :   [ \t]+ -> skip
    ;

LINE_END:   [\r\n]+;