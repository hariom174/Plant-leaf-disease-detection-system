#include<stdio.h>
int main()
{
	int i;
	printf("Enter the number:");
	scanf("%d",&i);
	if(i>=0)
	{
		printf("Positive number");
	}
	else
	{
		printf("Negative number:");
	}
	return 0;
}