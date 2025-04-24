#include<stdio.h>
int main()
{
	int n1,n2;
	printf("Enter the number:");
	scanf("%d%d",&n1,&n2);
	if(n1==n2)
	{
		printf("Number1 and Number2 is equal to\n");
	}
	else
	{
		printf("Number1 and Number2 is not equal to:");
	}
	return 0;
}