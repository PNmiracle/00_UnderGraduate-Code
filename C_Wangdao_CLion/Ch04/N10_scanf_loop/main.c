#include <stdio.h>

int main() {
    int i;
//    EOF
//#define EOF	      (-1)
    /*可用于反复*/
    int ret;
//    while (rewind(stdin), (ret = scanf("%d", &i)) != EOF) {
    while ((ret = scanf("%d", &i)) != EOF) {

        printf("i = %d\n", i);
    }
    return 0;
}
