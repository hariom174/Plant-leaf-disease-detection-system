//write a c program to check whether is a year is leap year or not.

#include<stdio.h>
int main()
{
	int leap_year;
	printf("enter a year");
	scanf("%d",&leap_year);
	
	if(leap_year%400==0){
		printf("%d is a leap year\n",leap_year);
	}
	else if(leap_year%100==0){
		printf("%d is a leap year\n",leap_year);
	}
	else if(leap_year%4==0){
		printf("%d is a leap year\n",leap_year);
	}
	else{
		printf("It is a not leap_year");
	}
	return 0;
}