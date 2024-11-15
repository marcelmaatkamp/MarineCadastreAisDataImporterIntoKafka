grammar AISData;

// Parser Rules
file: header row* EOF;

header: HEADER_TEXT NEWLINE;

row:
    mmsi COMMA
    dateTime COMMA
    lat COMMA
    lon COMMA
    sog COMMA
    cog COMMA
    heading COMMA
    vesselName? COMMA
    imo? COMMA
    callSign? COMMA
    vesselType? COMMA
    status? COMMA
    length? COMMA
    width? COMMA
    draft? COMMA
    cargo? COMMA
    transceiverClass NEWLINE;

mmsi: NUMBER;
dateTime: DATETIME;
lat: FLOAT;
lon: FLOAT;
sog: FLOAT;
cog: FLOAT;
heading: FLOAT;
vesselName: STRING_FIELD | NUMBER;
imo: IMO_NUMBER;
callSign: STRING_FIELD | NUMBER;
vesselType: NUMBER;
status: NUMBER;
length: NUMBER;
width: NUMBER;
draft: FLOAT;
cargo: NUMBER;
transceiverClass: LETTER;

// Lexer Rules
HEADER_TEXT: 'MMSI,BaseDateTime,LAT,LON,SOG,COG,Heading,VesselName,IMO,CallSign,VesselType,Status,Length,Width,Draft,Cargo,TransceiverClass';
COMMA: ',';
NEWLINE: '\r'? '\n';

IMO_NUMBER: 'IMO' NUMBER;
DATETIME: DATE 'T' TIME;
FLOAT: '-'? [0-9]+ '.' [0-9]+;
NUMBER: [0-9]+;
STRING_FIELD: ~[,\r\n]+;
LETTER: [A-Z];

fragment DATE: YEAR '-' MONTH '-' DAY;
fragment TIME: HOUR ':' MINUTE ':' SECOND;
fragment YEAR: DIGIT DIGIT DIGIT DIGIT;
fragment MONTH: DIGIT DIGIT;
fragment DAY: DIGIT DIGIT;
fragment HOUR: DIGIT DIGIT;
fragment MINUTE: DIGIT DIGIT;
fragment SECOND: DIGIT DIGIT;
fragment DIGIT: [0-9];

WS: [ \t]+ -> skip;