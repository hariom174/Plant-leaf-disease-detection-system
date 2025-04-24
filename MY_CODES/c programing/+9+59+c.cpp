#include<stdio.h>
int main()
{
	int num1,num2;
	printf("enter num1 and num2 are equal");
	scanf("%d %d",&num1,&num2);
	if(num1==num2){
		printf("num1 and num2 are equal %d",num1);
	}
	else{
		printf("num1 and num2 are not equal %d", num2);
	}
	return 0;
}