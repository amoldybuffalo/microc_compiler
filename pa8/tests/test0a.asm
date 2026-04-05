; Symbol table 
; name cur type Type.INT location 0x20000000
; name test type Type.STRING location 0x10000000 value "Hello World\n"

.section .text
;Current temp: 
;IR Code: 
LI t0, 0
HALT

.section .strings
0x10000000 "Hello World\n"
