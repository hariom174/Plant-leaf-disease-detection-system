//write a c program to find roots of Bhaskara's formula from the given three floating number .Display a message if it is not possible to find the roots?

#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	float y,x1,x2;
	printf("Enter a ,b and c:");
	scanf("%d%d%d",&a,&b,&c);
	y=(b*b)-(4*a*c); //ax2-4ac=0
	x1=(-b+sqrt(y))/(2*a); //y value in x1
	x2=(-b-sqrt(y))/(2*a); //y value in x2
	
	if(y>0)
	{
		printf("x1=%if\n x2=%if\n",x1,x2);
	}
	else{
		printf("ROOTS DONEN'T EXIST!!!!!\n");
	}
	return 0;
}