.486
DATA SEGMENT USE16
BUF DB 'ABCDEFGHIJKLMBVCDECDECDCDABCDEFG'
COUNT EQU $-BUF
DATA ENDS

CODE SEGMENT USE16
ASSUME CS:CODE,DS:DATA

BEG:
	MOV AX,DATA
	MOV DS,AX
	
	MOV BL,0  
	MOV SI,0
	MOV CX,COUNT
AGA:
	CMP BUF[SI],42H
	JB LAST   
	CMP BUF[SI],45H
	JA LAST 
	INC BL
LAST:
	INC SI
	LOOP AGA
	MOV CX,8
M2:
	
	TEST BL,80H
	JNZ M3
	MOV DL,'0'
	MOV AH,02H
	INT 21H
	JMP M4
M3:
	MOV DL,'1'
	MOV AH,02H
	INT 21H
M4:
	SHL BL,1
	LOOP M2
	
	MOV AH,4CH
	INT 21H
CODE ENDS
	END BEG
