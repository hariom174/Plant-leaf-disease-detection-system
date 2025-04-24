//write a c program to integral quotiend and remainder of a division:

#include<stdio.h>
int main()
{
	long int n,d;
	div result;
	printf("Enter numerator:");
	scanf("%ld",&n);
	printf("Emter denominator:");
	scanf("%ld",&d);
	result=div(n,d);
	printf("quotient=%ld,remainder=%ld\n\n",result.quot,result.rem);
	return 0;
}