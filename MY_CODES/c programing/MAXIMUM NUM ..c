//write a c program to find a maximum between two numbers.

#include<stdio.h>
int main()
{
	int x,y;
	printf("enter two number");
	scanf("%d%d",&x,&y);
	
	if(x>y){
		printf("%d is maximum",x);
	}
	if(y>x){
		printf("%d is maximum",y);
	}
	if(x==y){
		printf("Both are equal");
	}
	
	return 0;
}