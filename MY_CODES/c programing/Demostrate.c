//program to demostrate arithmetic operator?

#include<stdio.h>
int main()
{
	int x,y,a,b,c,d,e;
	printf("enter x,y:");
	scanf("%d%d",&x,&y);
	
	a=x+y;
	b=x-y;
	c=x*y;
	d=x/y;
	e=x%y;
	printf("sum=%d\n",a);
	printf("different=%d\n",b);
	printf("product=%d\n",c);
	printf("Quotient=%d\n",d);
	printf("remainder=%d",e);
	
	return 0;
}