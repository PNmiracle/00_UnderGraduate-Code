#include <stdio.h>

int main() {
    char c;
    while (scanf("%c", &c) != EOF) {
        if (c != '\n') {
//            c = c - 32;
            printf("%c", c - 32);
        } else {
            printf("\n");
        }
    }
}
