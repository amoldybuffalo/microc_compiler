; Symbol table GLOBAL
; name a type INT location 0x20000000
; name b type FLOAT location 0x20000004
; Function: INT main([])

; Symbol table main
; name c type INT location -4
; name d type FLOAT location -8

.section .text
;Current temp: null
;IR Code: 
MV fp, sp
JR func_main
HALT

func_main:
SW fp, 0(sp)
MV fp, sp
ADDI sp, sp, -4
ADDI sp, sp, -8
SW t1, 0(sp)
ADDI sp, sp, -4
SW t2, 0(sp)
ADDI sp, sp, -4
SW t3, 0(sp)
ADDI sp, sp, -4
SW t4, 0(sp)
ADDI sp, sp, -4
SW t5, 0(sp)
ADDI sp, sp, -4
SW t6, 0(sp)
ADDI sp, sp, -4
SW t7, 0(sp)
ADDI sp, sp, -4
SW t8, 0(sp)
ADDI sp, sp, -4
SW t9, 0(sp)
ADDI sp, sp, -4
FSW f1, 0(sp)
ADDI sp, sp, -4
FSW f2, 0(sp)
ADDI sp, sp, -4
FSW f3, 0(sp)
ADDI sp, sp, -4
FSW f4, 0(sp)
ADDI sp, sp, -4
LA t2, 0x20000000
LI t1, 2
SW t1, 0(t2)
LA t3, 0x20000004
FIMM.S f1, 3.0
FSW f1, 0(t3)
LA t4, 0x20000000
LW t5, 0(t4)
PUTI t5
LA t6, 0x20000004
FLW f2, 0(t6)
PUTF f2
LI t7, 4
SW t7, -4(fp)
FIMM.S f3, 5.0
FSW f3, -8(fp)
LW t8, -4(fp)
PUTI t8
FLW f4, -8(fp)
PUTF f4
LI t9, 0
SW t9, 8(fp)
J func_ret_main
func_ret_main:
ADDI sp, sp, 4
FLW f4, 0(sp)
ADDI sp, sp, 4
FLW f3, 0(sp)
ADDI sp, sp, 4
FLW f2, 0(sp)
ADDI sp, sp, 4
FLW f1, 0(sp)
ADDI sp, sp, 4
LW t9, 0(sp)
ADDI sp, sp, 4
LW t8, 0(sp)
ADDI sp, sp, 4
LW t7, 0(sp)
ADDI sp, sp, 4
LW t6, 0(sp)
ADDI sp, sp, 4
LW t5, 0(sp)
ADDI sp, sp, 4
LW t4, 0(sp)
ADDI sp, sp, 4
LW t3, 0(sp)
ADDI sp, sp, 4
LW t2, 0(sp)
ADDI sp, sp, 4
LW t1, 0(sp)
MV sp, fp
LW fp, 0(fp)
RET



.section .strings
