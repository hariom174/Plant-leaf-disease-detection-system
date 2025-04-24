//write a c program to input angle of a triangle and check whether triangle is valid or not?

#include<stdio.h>
int main()
{
	int angle1,angle2,angle3,sum;
	printf("Enter three triangle number:");
	scanf("%d%d%d",&angle1,&angle2,&angle3);
	sum=angle1+angle2+angle3;
	
	if(sum==180&& angle1>0&& angle2>0&& angle3>0)
	{
		printf("Traingle is valid");
	}
	else{
		printf("Triangle is invalid");
	}
	return 0;
	}