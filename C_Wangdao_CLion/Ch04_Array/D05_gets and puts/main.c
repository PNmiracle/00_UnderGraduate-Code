#include <stdio.h>

int main() {
    char c[20];

    gets(c);// 一次读取一行, 读到'\n'就结束, 不匹配了
//    printf("%s\n", c);
    puts(c); //= printf("%s\n", c);

    return 0;
}
