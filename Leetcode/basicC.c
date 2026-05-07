#include <stdio.h>
#include <stdlib.h>

int main(){

    //size of input array
    int n;
    printf("Enter the size of the array: ");
    // scanf is not validated: If the user enters non-integer input → your program can break.
    if (scanf("%d", &n) != 1) {
        printf("Invalid input. Please enter an integer.\n");
        return 1;
    }

    // constriants over input array size
    if (n<1 || n>1000){
        printf("Invalid size. Must be between 1 and 1000.\n");
        return 1;
    }

    //declaring the input array
    //int nums[n];

    // Allocate memory for nums
    int* nums = (int*)malloc(n * sizeof(int));

    // Memory allocation check: malloc can return NULL (rare, but important to handle).
    if (nums == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }


    // taking input for the array
    printf("Enter %d elements (1 to 1000):\n", n);

    for (int i=0; i<n; i++){
        //input elements
        if (scanf("%d", &nums[i]) != 1) {
            printf("❌ Invalid input at index %d.\n", i);
            free(nums);
            return 1;
        }

        // constraints over input elements of the array
        if(nums[i]<1 || nums[i]>1000){
            printf("Invalid input at index %d. Each element must be between 1 and 1000.\n", i);
            free(nums);
            return 1;
        }
    }

    // declaring the resulting array
    int *ans = (int *) malloc(2 * n * sizeof(int));

    // Memory allocation check: malloc can return NULL (rare, but important to handle).
    if (ans == NULL) {
        printf("Memory allocation failed.\n");
        free(nums);
        return 1;
    }


    // initializing the resulting array 
    for(int i=0; i<n;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
    }

    // printing the resulting array
    printf("Concatenated array:\n[");
    for(int i=0; i<2*n;i++){
        printf("%d", ans[i]);
        if (i != 2*n - 1) printf(", ");
    }
    printf("]\n");

    // free the allocated memory
    free(ans);
    free(nums);

    return 0;
}