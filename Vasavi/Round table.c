#include <stdio.h>
#include <stdlib.h>

int min_distance(int A, int B, int M) {
    int direct = abs(A - B);
    int circular = M - direct;
    return direct < circular ? direct : circular;
}

int main() {
    int T;
    scanf("%d", &T);
    while (T--) {
        int A, B, M;
        scanf("%d %d %d", &A, &B, &M);
        printf("%d\n", min_distance(A, B, M));
    }
    return 0;
}

