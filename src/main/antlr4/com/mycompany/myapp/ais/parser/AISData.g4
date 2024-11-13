grammar AISData;

file:  header row* EOF;

header: TEXT (',' TEXT)* '\r'? '\n';

row:
  mmsi ','
  dateTime ','
  lat ','
  lon ','
  sog ','
  cog ','
  heading ','
  vesselName ','
  imo? ','
  callSign? ','
  vesselType? ','
  status? ','
  length? ','
  width? ','
  draft? ','
  cargo? ','
  transceiverClass '\r'? '\n';

mmsi: NUMBER;
dateTime: DATETIME;
lat: FLOAT;
lon: FLOAT;
sog: FLOAT;
cog: FLOAT;
heading: FLOAT;
vesselName: TEXT;
imo: TEXT;
callSign: TEXT;
vesselType: NUMBER;
status: NUMBER;
length: NUMBER;
width: NUMBER;
draft: FLOAT;
cargo: NUMBER;
transceiverClass: LETTER;

SIGN: '-';
NUMBER: SIGN?[0-9]+;
FLOAT: NUMBER'.'NUMBER;

MMSINUMBER: DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT DIGIT;

DATETIME : DATE 'T' TIME ;
DATE : YEAR '-' MONTH '-' DAY ;
TIME : HOUR ':' MINUTE ':' SECOND ;

YEAR   : DIGIT DIGIT DIGIT DIGIT ;
MONTH  : DIGIT DIGIT ;
DAY    : DIGIT DIGIT ;
HOUR   : DIGIT DIGIT ;
MINUTE : DIGIT DIGIT ;
SECOND : DIGIT DIGIT ;

fragment DIGIT : [0-9] ;
LETTER: [a-zA-Z] ;

TEXT: [a-zA-Z0-9 '\-''_''.''!']+;

WS: [\t]+ -> skip;
