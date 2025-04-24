//write a c program to check whether a number is negative and positive or zero.

#include<stdio.h>
int main()
{
	int n;
	printf("enter any number:");
	scanf("%d",&n);
	
	if(n>0){
		printf("%d is a positive",n);
	}
	else if(n<0){
		printf("%d is a negative",n);
	}
	else{
		printf("Number is zero");
	}
	
	return 0;
}