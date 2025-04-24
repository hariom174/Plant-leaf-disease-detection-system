#include<stdio.h>
int main()
{
	int x,y,op;
	printf("enter a number(+,-,*,/)");
	scanf("%c",&op);
	
	printf("enter two number:");
	scanf("%d %d",&x,&y);
	
	do{
		printf("sum=%d\n",x+y);
		x--;
		}while(x==y);
	return 0;
}