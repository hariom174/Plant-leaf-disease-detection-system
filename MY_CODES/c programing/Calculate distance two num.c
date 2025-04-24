//write a c program to calculate the distance between the two points?

#include<stdio.h>
int main()
{
	float X1,Y1,X2,Y2,gdistance;
	printf("Enter a distance:");
	scanf("%f%f%f%f",&X1,&Y1,&X2,&Y2);
	gdistance=((X2-X1)*(X2-X1))+((Y2-Y1)*(Y2-Y1));
	printf("Between two number%.4f",sqrt(gdistance));
	return 0;
}