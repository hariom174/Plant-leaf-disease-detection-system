//write a c program to calculate a bike's  average consumption from the given total distance (integer value) traveled (in km) and spent fuel 
//(in liter , float number -2 decimal point)?

#include<stdio.h>
int main()
{
	int distance;
	float fuel,result;
	printf("Enter a total distance km:");
	scanf("%d",&distance);
	printf("Enter a total fuel spent in liters:");
	scanf("%f",&fuel);
	result=distance/fuel;
	printf("Average consumption %.2f km/lt\n",result);
	return 0;
}