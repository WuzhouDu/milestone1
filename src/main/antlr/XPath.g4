grammar XPath;

@header {
	package main.antlr;
}

xq:
	Var																									# XqVar
	| STRING																							# XqString
	| ap																								# XqAp
	| L_PAREN xq R_PAREN																				# XqParenthesized
	| xq ',' xq																							# XqComma
	| xq SLASH rp																						# XqSlash
	| xq DOUBLE_SLASH rp																				# XqDoubleSlash
	| '<' open = tagName '>' '{' xq '}' '</' close = tagName '>' { $open.text.equals($close.text) }?	
		# XqTag
	| forClause letClause whereClause returnClause	# XqFLWR
	| forceLetClause xq								# XqForceLet;

forClause: FOR varBinding (',' varBinding)*;
letClause: (LET letBinding (',' letBinding)*)?;
forceLetClause: LET letBinding (',' letBinding)*;
whereClause: (WHERE cond)?;
returnClause: RETURN xq;
varBinding: Var IN xq;
letBinding: Var ':=' xq;
Var: '$' ID;
FOR: 'for';
LET: 'let';
WHERE: 'where';
RETURN: 'return';
IN: 'in';
SATISFIES: 'satisfies';
AND: 'and';
OR: 'or';
NOT: 'not';
EMPTY: 'empty';
SOME: 'some';
EQ: 'eq';
IS: 'is';

cond:
	xq '=' xq										# condEqSign
	| xq EQ xq										# condEQ
	| xq '==' xq									# condDoubleEqual
	| xq IS xq										# condIs
	| EMPTY L_PAREN xq R_PAREN						# condEmpty
	| SOME varInXQ (',' varInXQ)* SATISFIES cond	# condSome
	| L_PAREN cond R_PAREN							# condParenthesized
	| cond AND cond									# condAND
	| cond OR cond									# condOR
	| NOT cond										# condNOT;

varInXQ: Var IN xq;

ap:
	DOC L_PAREN FILENAME R_PAREN SLASH rp			# AbsolutePathSlash
	| DOC L_PAREN FILENAME R_PAREN DOUBLE_SLASH rp	# AbsolutePathDoubleSlash;

rp:
	tagName					# TagName_
	| '*'					# Wildcard
	| '.'					# Current
	| '..'					# Parent
	| 'text()'				# Text
	| '@' attName			# Attribute
	| L_PAREN rp R_PAREN	# ParenthesizedRP
	| rp SLASH rp			# PathSlash
	| rp DOUBLE_SLASH rp	# PathDoubleSlash
	| rp '[' f ']'			# PathFilter
	| rp ',' rp				# PathComma;

f:
	rp					# FilterRP
	| rp '=' rp			# FilterEqual
	| rp 'eq' rp		# FilterEq
	| rp '==' rp		# FilterDoubleEqual
	| rp 'is' rp		# FilterIs
	| rp '=' STRING		# FilterStringConstant
	| L_PAREN f R_PAREN	# ParenthesizedFilter
	| f 'and' f			# FilterAnd
	| f 'or' f			# FilterOr
	| 'not' f			# FilterNot;

tagName: ID;
attName: ID;

DOC: 'doc' | 'document';
L_PAREN: '(';
R_PAREN: ')';
SLASH: '/';
DOUBLE_SLASH: '//';
FILENAME: '"' [a-zA-Z0-9_-]+ '.' [a-zA-Z0-9]+ '"';
STRING: '"' (~["\\] | '\\' .)* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_-]*;
WS: [ \t\r\n]+ -> skip;