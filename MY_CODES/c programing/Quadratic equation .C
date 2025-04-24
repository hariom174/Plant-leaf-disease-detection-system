// write a c program to find a of a quadratic equation?

#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	float k;
	printf("Enter a,b,c:");
	scanf("%d%d%d",&a,&b,&c);
	k=pow(a,2)-4*a*c;
	if(k==0)
	{
		printf("Root=%d\n",-b/(2*a));
	}
	else if(k>0)
	{
		printf("Root1=%d\n",(-b+sqrt(k)/(2*a)));
		printf("Root2=%d\n"),(-b-sqrt(k)/(2*a));
	}
	else{
		printf("Root1=%d\n",-b/2*a,sqrt(-k)/(2*a));
		printf("Root2=%d",-b/2*a,sqrt(-k)/(2*a));
	}
	return 0;
 } 