#include<stdio.h>
int main()
{
	int height;
	printf("Enter the number:");
	scanf("%d",&height);
	if(height<150)
	{
		printf("Why you smallest:\n");
	}
	else if((height>=150)&&(height>135))
	{
		printf("Why is average:");
	}
	else if(height>=135)
	{
		printf("Why is tall:");
	}
	else
	{
		printf("Abnormal height:\n");
	}
	return 0;
}