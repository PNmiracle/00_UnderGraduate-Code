#define _CRT_SECURE_NO_WARNINGS //解决scanf编译报错问题,必须第一行
#include <stdio.h>

//严重性	代码	说明	项目	文件	行	禁止显示状态
//错误	C4996	'scanf': This function or variable may be unsafe.Consider using scanf_s instead.To disable deprecation, use _CRT_SECURE_NO_WARNINGS.See online help for details.	2.scanf的使用	D : \00_UnderGraduate - Code\HomeWork\C_VS2019\数据类型与运算符\2.scanf的使用\main.c	5

int main() {
	int a,b;
	scanf("%d%d", &a,&b);
	printf("a = %d, b = %d\n", a,b);
		
	return 0;	
}