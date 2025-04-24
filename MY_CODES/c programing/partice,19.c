#include<stdio.h>
int main()
{
	int x[100],i,n,p,e;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&x[i]);
	}
	printf("Enter the position to be modified:");
	scanf("%d",&p);
	
	printf("Enter new elements:");
	scanf("%d",&e);
	
	x[p-1]=e;
	for(i=0;i<n;i++)
	{
	      printf("%d\n",x[i]);
        }
	return 0;
}