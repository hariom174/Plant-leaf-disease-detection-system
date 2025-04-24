//Write a c program that caluculate the volume of a sphere:

#include<stdio.h>
int main()
{
	float radius,volume,pi=3.14;
	printf("Enter the radius of the sphere:");
	scanf("%f",&radius);
	volume=(4.0/3.0)*pi*radius*radius*radius;//sphere formula
	printf("The volume of a sphere:%f",volume);
	return 0;
}