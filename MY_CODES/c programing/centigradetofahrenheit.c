//Write a program that convert centegrade to fahrenheit:

#include<stdio.h>
int main()
{
	float c,f;
	printf("Enter temperture in centegrade:");
	scanf("%f",&c);
	f=(1.8*c)+32;
	printf("Temperture in fahrenheit:%f",f);
	return 0;
}