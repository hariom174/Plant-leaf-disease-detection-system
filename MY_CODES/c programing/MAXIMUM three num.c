//write a c program that accepts three integers and find the maximum of three?

#include<stdio.h>
int main()
{
	int x,y,z,result,max;
	printf("Enter a max number:");
	scanf("%d%d%d",&x,&y,&z);
	result=(x+y+abs(x-y))/2;
	max=(x+y+abs(result-z))/2;
	printf("Maximum value of three number=%d",max);
	printf("\n");
	return 0;
}