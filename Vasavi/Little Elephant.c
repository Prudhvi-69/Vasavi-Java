#include <stdio.h>

// Function to count total inversions
int countInversions(int arr[], int n) {
    int inv_count = 0;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                inv_count++;
            }
        }
    }
    return inv_count;
}

// Function to count local inversions
int countLocalInversions(int arr[], int n) {
    int local_inv_count = 0;
    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            local_inv_count++;
        }
    }
    return local_inv_count;
}

int main() {
    int T;
    scanf("%d", &T);
    while (T--) {
        int N;
        scanf("%d", &N);
        int A[N];
        for (int i = 0; i < N; i++) {
            scanf("%d", &A[i]);
        }
        
        int totalInversions = countInversions(A, N);
        int localInversions = countLocalInversions(A, N);
        
        if (totalInversions == localInversions) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }
    return 0;
}
