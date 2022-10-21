#include <stdio.h>

int main() {
    int i;
    char c;
    float f;
    int ret;
    ret = scanf("%d %c%f", &i, &c, &f);
    printf("i = %d, c = %c, f = %f\n", i, c, f);
    return 0;
}
