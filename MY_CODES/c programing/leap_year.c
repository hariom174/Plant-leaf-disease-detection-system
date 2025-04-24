#include<stdio.h>
int main()
{
	int leap_year;
	printf("Enter the number");
	scanf("%d",&leap_year);
	if((leap_year%400)==0)
	{
		printf("%d is a leap_year",leap_year);
	}
	else if((leap_year%100)==0)
	{
		printf("%d is a not leap_year",leap_year);
	}
	else if((leap_year%4)==0)
	{
		printf("%d is a leap_year",leap_year);
	}
	else
	{
		printf("%d is a not leap_year",leap_year);
	}
	return 0;
}