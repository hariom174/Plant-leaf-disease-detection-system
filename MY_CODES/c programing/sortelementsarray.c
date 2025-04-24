//write a c program to sort the elements of an array:

#include<stdio.h>
  
  int comparetor(const void * x,const void * y)
  {
  	return (*(int*)x-*(int*)y);
  }
int main()
{
	int x[100];
	int i,n;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array elements:");
	for(i=0;i<n;i++)
	{
		printf("elements -%d:",i);
		scanf("%d",&x[i]);
	}
	qsort(x,n,sizeof(int),comparetor);
	for(i=0;i<n;i++)
	{
		printf("%d",x[i]);
	}
	
	return 0;
}