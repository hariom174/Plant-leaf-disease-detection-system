//program to print numbers from 1to4?

#include<stdio.h>
int main()
{
	int i,n;
	printf("Enter n");
	scanf("%d",&n);
	
	for(i=n;i>=1;i--)
	{
		printf("%d\n",i);
	}
	return 0;
}