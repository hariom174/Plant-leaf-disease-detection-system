#include<stdio.h>
int main()
{
	int age;
	printf("Enter a number:");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("Car drive");
	}
	else
	{
		printf("Not drive:");
	}
	return 0;
}