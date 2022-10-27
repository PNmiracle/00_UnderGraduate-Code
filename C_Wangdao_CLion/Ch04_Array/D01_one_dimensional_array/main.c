#include <stdio.h>

#define N 10

//传的只是数组的起始地址, 所以数组长度传递不过去
void myPrint(int arr[], int len) {
//    sizeof(arr) = sizeof(int)
    arr[4] = 400000;
    for (int i = 0; i < len; ++i) {
        printf("a[%d] = %d\n", i, arr[i]);
    }
}


int main() {
    int j = 10;
    int a[5] = {1, 2, 3, 4, 5};
    int i = 3;
    /*访问越界, 访问了不属于自己的空间*/

    a[6] = 20;
    a[7] = 21;
    a[8] = 22;
    printf("j = %d\n", j);
    printf("I = %d\n", i);

    myPrint(a, 5);
    return 0;

}
