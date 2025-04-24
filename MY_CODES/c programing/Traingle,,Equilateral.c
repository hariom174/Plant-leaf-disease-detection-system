//write a c program to check whether the traingle is equilateral,isosceles or scalene traingle?

#include<stdio.h>
int main()
{
	int side1,side2,side3;
	printf("enter a value of traingle");
	scanf("%d%d%d",&side1,&side2,&side3);
	  
	  if(side1==side2||side2==side3)
	  {
	  	printf("Equilateral triangle");
	  }
	  else if(side1==side2||side1==side3)
	  {
	  	printf("Isosceles traingle");
	  }
	  else{
	  	printf("Scalene traingle");
	  }
	  return 0;
	}