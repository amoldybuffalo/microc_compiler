; Symbol table 
; name a type Type.FLOAT location 0x20000000
; name b type Type.FLOAT location 0x20000004
; name c type Type.FLOAT location 0x20000008
; name d type Type.FLOAT location 0x2000000c
; name prompt type Type.STRING location 0x10000000 value "Enter a number: "

.section .text
;Current temp: 
;IR Code: 
FIMM.S f0, 1.3
LA t0, 0x20000000
FSW f0, 0(t0)
FIMM.S f1, 2.5
LA t1, 0x20000004
FSW f1, 0(t1)
LA t2, 0x10000000
PUTS t2
GETF f2
LA t3, 0x20000008
FSW f2, 0(t3)
LA t6, 0x20000000
FLW f6, 0(t6)
LA t4, 0x20000004
FLW f3, 0(t4)
LA t5, 0x20000008
FLW f4, 0(t5)
FMUL.S f5, f3, f4
FADD.S f7, f6, f5
PUTF f7
LI t7, 0
HALT

.section .strings
0x10000000 "Enter a number: "
