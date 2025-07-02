//#include <stdio.h>
//
//int power(int x, unsigned n) {
//    if (x == 0 && n == 0) {
//        printf("Error: 0^0 is undefined.\n");
//        return -1; // Indicate an error
//    }
//	unsigned i;
//    int pow = 1;
//    for (i = 0; i < n; i++) {
//        pow = pow * x;
//    }
//    return pow;
//}
//
//int main(void) {
//    int x = -2;
//    unsigned n = 10;
//    int result = power(x, n);
//    if (result != -1) {
//        printf("pow(%d, %u) = %d\n", x, n, result);
//    }
//    return 0;
//}

#include <stdio.h>

int power(int x, unsigned n) {
    int pow = 1;
    unsigned i;
    for (i = 0; i < n; i++) {
        pow = pow * x;
    }
    return pow;
}

int main(void) {
    int x = -2;
    unsigned n = 10;
    printf("pow(%d, %u) = %d\n", x, n, power(x, n));
    return 0;
}
