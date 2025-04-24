//write a c program to a find maximum between three numbers.

#include<stdio.h>
int main()
{
	int x,y,z;
	printf("enter three number");
	scanf("%d%d%d",&x,&y,&z);
	
	if(x>y&&x>z){
		printf("%d is maximum",x);
	}
	else if(y>x&&y>z){
		printf("%d is maximum",y);
	}
	else if(z>x&&z>y){
		printf("%d is maximum",z);
	}
	else{
		printf("maximum three number are equal");
	}
	return 0;
}