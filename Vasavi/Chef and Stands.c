#include <stdio.h>
int fun(int X,int Y)
{
    int her=0;
        for(int cel=1; 2*cel<=X && cel<=Y ; cel++)
	        her++;
	  return her;
}
int main() {
	// your code goes here
	
	int T;
	scanf("%d",&T);
	while(T--)
	{
	    int X,Y;
	    scanf("%d%d",&X,&Y);
	    int result = fun(X,Y);
	    printf("Result : %d\n",result);
	}
}


