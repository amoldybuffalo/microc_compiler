; Symbol table GLOBAL
; Function: INT foo([INT])
; Function: INT main([])

; Symbol table main
; name a type INT location -4
; name b type INT location -8

; Symbol table foo
; name a type INT location 12

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
LI t1, 3
SW t1, -4(fp)
;;;; Call node processing here
LW t2, -4(fp)   ; check
SW t2, 0(sp)
ADDI sp, sp, -4
; arg processing complete here
ADDI sp, sp, -4
SW ra, 0(sp)
ADDI sp, sp, -4
JR func_foo
ADDI sp, sp, 4
LW ra, 0(sp)
ADDI sp, sp, 4
LW t3, 0(sp)
ADDI sp, sp, 4
SW t3, -8(fp)
LI t4, 0
SW t4, 8(fp)
J func_ret_main
func_ret_main:
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

func_foo:
SW fp, 0(sp)
MV fp, sp
ADDI sp, sp, -4
ADDI sp, sp, -0
SW t1, 0(sp)
ADDI sp, sp, -4
LW t1, 12(fp)
SW t1, 8(fp)
J func_ret_foo
func_ret_foo:
ADDI sp, sp, 4
LW t1, 0(sp)
MV sp, fp
LW fp, 0(fp)
RET



.section .strings
