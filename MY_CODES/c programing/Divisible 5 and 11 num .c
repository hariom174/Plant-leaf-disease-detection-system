//write a c program to check whether a number is divisible by 5 and 11 or not.

#include<stdio.h>
int main()
{
	int num;
	printf("enter a divisible");
	scanf("%d",&num);
	
	if(num % 5==0&&num % 11==0){
		printf("Number is divisible 5 and 11");
	}
	else{
		printf("Number is not divisible 5 and 11");
		}
		return 0;
}