// write a c program to find the sum of first 10 natural number?

#include<stdio.h>
int main()
{
	int i, sum=0;
	printf("enter a sum natural number:");
	scanf("%d",&sum);
	for(i=1;i<=10;i++)
	{
		printf("%d",i);
		sum=sum+i;
	}
	printf("The sum is=%d\n",sum);
	return 0;
}