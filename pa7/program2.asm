; count: 0(sp)
; n: 4(sp)
.section .text
ADDI sp, sp, -8
LI t0, 0
SW t0, 0(sp)


prompt_loop:
    LUI t0, 0x10000
    PUTS t0
    GETI t1
    LI t2, 0
    BGT t1, t2, save_n
    ; n not greater than zero. Try again.
    J prompt_loop 
    ; Put our result into our variable for now
save_n:
    SW t1, 4(sp)  


collatz:
    LW t0, 4(sp)
    LI t1, 2

    ; Check if we have n == 1
    LW t3, 4(sp)
    LI t4, 1
    BEQ t3, t4, collatz_success
    
; Check if n % 2 == 0
    DIV t3, t0, t1 
    MUL t3, t3, t1 
    SUB t3, t3, t0 
    LI t4, 0
    BNE t3, t4, odd 
    

even:
; n = n // 2 
    DIV t0, t0, t1
    SW t0, 4(sp)
    J finish_loop
odd:
    ; n = 3n+1
    LI t1, 3
    MUL t0, t0, t1
    ADDI t0, t0, 1 
    SW t0, 4(sp)

finish_loop:
    ;increment count
    LW t0, 0(sp)
    ADDI t0, t0, 1
    SW t0, 0(sp)


J collatz 

collatz_success:
; n
    LW t0, 4(sp) 
    LUI t1, 0x10001
    LUI t2, 0x10003
    PUTS t1
    PUTI t0
    PUTS t2
; count
    LW t0, 0(sp) 
    LUI t1, 0x10002
    LUI t2, 0x10003
    PUTS t1
    PUTI t0
    PUTS t2




HALT
.section .strings
    0x10000000 "Enter a value for n > 0:\n"
    0x10001000 "n: "
    0x10002000 "count: "
    0x10003000 "\n"

   