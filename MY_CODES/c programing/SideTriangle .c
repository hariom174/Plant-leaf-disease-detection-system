//write a c program to input all 9side of a traingle and check whether traingle is valid or not?

#include<stdio.h>
int main()
{
	int side1,side2,side3;
	printf("Enter three side traingle number");
	scanf("%d%d%d",&side1,&side2,&side3);
	
	if((side1+side2)>side3&&(side1+side2)>side3&&(side1+side2)>side3)
	{
		printf("side of traingle is valid");
	}
	else{
		printf("Invalid");
	}
	return 0;
}
