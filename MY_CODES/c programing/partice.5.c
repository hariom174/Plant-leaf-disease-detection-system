#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("Enter the number:");
	scanf("%d%d%d",&n1,&n2,&n3);
	if((n1<n2)&&(n2>n1))
	{
		printf("Number1 is a largest number:\n");
	}
	if((n2>n1)&&(n2>n1))
	{
		printf("Number2 is a largest number:\n");
	}
	if((n3>n1)&&(n3>n2))
	{
		printf("Number3 is a largest number:\n");
	}
	else 
	{
		printf("This is not a larger number:");
	}
	return 0;
}