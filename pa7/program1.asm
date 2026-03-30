; a: 0x10005000
; b: 0x10005004

.section .text
; Get a number for a
LUI t1, 0x10003 
PUTS t1
LA t2, 0x10005000 
GETI t3
SW t3, 0(t2)

; Get a number for b
LUI t1, 0x10004 
PUTS t1
LA t2, 0x10005004
GETI t3
SW t3, 0(t2)

LA t1, 0x10005000 
LW t2, 0(t1) ; Put the value of a in t2

LA t1, 0x10005004
LW t3, 0(t1) ; Put the value of b in t3

BLT t2, t3, a_less_than_b
BEQ t2, t3, a_equal_b

a_greater_than_b:
    LUI t1, 0x10002
    J print

a_less_than_b:
    LUI t1, 0x10000 
    J print

a_equal_b:
    LUI t1, 0x10001
    J print

print:
PUTS t1

HALT
.section .strings
    0x10000000 "a is less than b\n"
    0x10001000 "a is equal to b\n"
    0x10002000 "a is greater than b\n"
    0x10003000 "Enter the number a:\n"
    0x10004000 "Enter the number b:\n"