; Symbol table GLOBAL
; name a type INT location 0x20000000
; Function: INT main([])

; Symbol table main
; name b type INT location -4

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
ADDI sp, sp, -4
SW t1, 0(sp)
ADDI sp, sp, -4
LI t1, 0
SW t1, 8(fp)
J func_ret_main
func_ret_main:
ADDI sp, sp, 4
LW t1, 0(sp)
MV sp, fp
LW fp, 0(fp)
RET



.section .strings
