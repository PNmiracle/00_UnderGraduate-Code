#include <stdio.h>
//初始化字符数组时, 字符数组长度 要比 字符串长度多1,结束符, 让末尾自动赋值\0
int main() {
    char c[6] = {'h', 'e', 'l', 'l', 'o'};
    char d[5] = "how";
    printf("%s----%s\n", c, d);
    char e[20], f[20];
    scanf("%s%s", e, f);
    printf("%s-----%s\n", e, f);
}
