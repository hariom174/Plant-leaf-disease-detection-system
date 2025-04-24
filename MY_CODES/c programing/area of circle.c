//write a c program to computer the perimeter and area of a circle with a given radius?

#include<stdio.h>
int main()
{
	int radius;
	float area,perimeter;
	radius=6;
	perimeter=2*3.14*radius;
	printf("perimeter is circle=%f/n",perimeter);
	area=3.14*radius*radius;
	printf("area of circle=%f",area);
	return 0; 
}