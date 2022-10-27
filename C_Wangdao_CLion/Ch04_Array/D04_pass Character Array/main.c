 #include <stdio.h>

void print(char d[]) {
    int i = 0;
//    while (d[i] != '\0') {
    while (d[i]) {
        printf("%c", d[i]);
        i++;
    }
    printf("\n");
}

int main() {
    char c[10] = "hello";
    print(c);

    return 0;
}
