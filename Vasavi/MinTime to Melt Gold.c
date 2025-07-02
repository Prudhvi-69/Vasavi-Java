#include <stdio.h>
#include <math.h>
int minTea(int X, int Y) {
    int target = 2 * (X - Y);
    if (target <= 0) return 0; 
    int i = (int)ceil((-1 + sqrt(1 + 8.0 * target)) / 2);
    return i;
}
int main() {
    int T;
    scanf("%d", &T);
    while (T--) {
        int X, Y;
        scanf("%d %d", &X, &Y); 
        printf("%d\n", minTea(X, Y)); 
    }

    return 0;
}

