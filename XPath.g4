grammar XPath;

ap:
	DOC L_PAREN FILENAME R_PAREN SLASH rp 		# AbsolutePathSlash
	| DOC L_PAREN FILENAME R_PAREN DOUBLE_SLASH rp 	# AbsolutePathDoubleSlash;

rp:
	tagName			# TagName_
	| '*'			# Wildcard
	| '.'			# Current
	| '..'			# Parent
	| 'text()'		# Text
	| '@' attName	# Attribute
	| L_PAREN rp R_PAREN	# ParenthesizedRP
	| rp SLASH rp		# PathSlash
	| rp DOUBLE_SLASH rp	# PathDoubleSlash
	| rp '[' f ']'	# PathFilter
	| rp ',' rp		# PathComma;

f:
	rp						# FilterRP
	| rp '=' rp				# FilterEqual
	| rp 'eq' rp			# FilterEq
	| rp '==' rp			# FilterDoubleEqual
	| rp 'is' rp			# FilterIs
	| rp '=' STRING	# FilterStringConstant
	| L_PAREN f R_PAREN				# ParenthesizedFilter
	| f 'and' f				# FilterAnd
	| f 'or' f				# FilterOr
	| 'not' f				# FilterNot;



tagName: ID;
attName: ID;

DOC: 'doc';
L_PAREN: '(';
R_PAREN: ')';
SLASH: '/';
DOUBLE_SLASH: '//';
FILENAME: '"' [a-zA-Z0-9_-]+ '.' [a-zA-Z0-9]+ '"';
STRING: '"' (~["\\] | '\\' .)* '"';
ID: [a-zA-Z_] [a-zA-Z0-9_-]*;
WS: [ \t\r\n]+ -> skip;