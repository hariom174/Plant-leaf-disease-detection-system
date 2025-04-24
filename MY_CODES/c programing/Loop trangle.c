#include<stdio.h>
int main()
{
	int angle1,angle2,angle3,sum;
	printf("Enter three traingle number");
	scanf("%d%d%d",&angle1,&angle2,&angle3);
	
	for(sum=0;sum==180;sum--){
		sum=angle1+angle2+angle3;
	}
	if(angle1>0&&angle2>0&&angle3>0)
	{
		printf("traingle is valid");
	}
	else{
		printf("traingle is invalid");
	}
	return 0;
}