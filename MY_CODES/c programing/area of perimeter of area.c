// Write a c program to computer the perimeter and area of a rectangle with a rectangle with a height of 7inch.and width of 5inches.

#include<stdio.h>
#include<math.h>
int main()
{
	int perimeter;
	int area;
	 int height=7;
	 int width=5;
	
	perimeter =2*(height+width);
	printf("perimeter of the area %d\n",height+width);
	
	area=height*width;
	printf("area of the rectangle %d",height*width);
	
	return 0;  
	
}