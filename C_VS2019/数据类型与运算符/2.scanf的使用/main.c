#define _CRT_SECURE_NO_WARNINGS //���scanf���뱨������,�����һ��
#include <stdio.h>

//������	����	˵��	��Ŀ	�ļ�	��	��ֹ��ʾ״̬
//����	C4996	'scanf': This function or variable may be unsafe.Consider using scanf_s instead.To disable deprecation, use _CRT_SECURE_NO_WARNINGS.See online help for details.	2.scanf��ʹ��	D : \00_UnderGraduate - Code\HomeWork\C_VS2019\���������������\2.scanf��ʹ��\main.c	5

int main() {
	int a,b;
	scanf("%d%d", &a,&b);
	printf("a = %d, b = %d\n", a,b);
		
	return 0;	
}