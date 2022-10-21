#include <stdio.h>
//http://oj.lgwenda.com/problem/6
/*输入一个整型数，判断是否是对称数，如果是，输出yes，否则输出no，不用考虑这个整型数过大，int类型存不下，不用考虑负值；

例如 12321是对称数，输出yes，124421是对称数，输出yes，1231不是对称数，输出no*/
int main() {
    int a, b = 0, dup;
    scanf("%d", &a);
    dup = a;
    while (a) {
        b = b * 10 + a % 10;
        a /= 10;
    }
    if (dup == b) {
        printf("yes\n");
    } else {
        printf("no\n");
    }
    return 0;
}

