#include<stdio.h>
void swap(int *a, int *b)
{
	int temp=*a;
	*a=*b;
	*b=temp;
}
void quickSort( int array[], int low, int high )
{
	if ( low < high ) 
	{
		int pivot = partition( array, low, high ); //finding pivot using partition function
		quickSort(array, low, pivot - 1);   // sort the left side of pivot
		quickSort(array, pivot + 1, high);  // sorting the right side of pivot
	}
}
int partition( int array[], int low, int high)
{
	int pivot = array[ high ],  i = low-1,j;	// pointing the pivot to the end of list
	for ( j = low ; j < high ; j++)		// i pointing to the 1st index
	{		
			if ( array[ j ] < pivot )   // to sort in ascending order
			//if ( array[ j ] > pivot )   // to sort in descending order
			{
					i++;				// if any element is more than pivot swap
					swap(&array[ j ] , &array[ i ]);	
			}
	}
			swap( &array[ i+1 ], &array[ high]);   // 
		return i+1;  // returning the pivot element index 
}
void display(int array[], int size)
{
	int i;
	for(i=0;i<size;printf("%d ",array[i++]));
}
void main()
{
	int array[]={10,5,2,44,1,2,4,72,1,24,1};
	int size = sizeof(array)/sizeof(array[0]);
	
	int i;
	printf("\n Before Sort : ");
	for(i=0;i<size;printf("%d ",array[i++]));
	
	quickSort(array,0,size-1);
	
	printf("\n Before Sort : ");
	
	display(array,size);
}
