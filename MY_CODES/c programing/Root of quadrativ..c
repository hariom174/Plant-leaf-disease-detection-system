//write a program to find roots of quadratic eqation?

#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,c;
	float k;
	printf("enter a,b,c:");
	scanf("%d%d%d",&a,&b,&c);
	
	k=pow(b,2)-4*a*c;
	if(k==0)
	{
		printf("root=%f\n",-b/(2*a));
	}
	else if(k>0)
	{
		printf("root1=%f\n",(-b+sqrt(k))/(2*a));
		printf("root2=%f\n",(-b-sqrt(k))/(2*a));
	}
	else{
		printf("root1=%f+i%f",-b/(2*a),sqrt(-k)/(2*a));
		printf("root2=%f-i%f",-b/(2*a),sqrt(-k)/(2*a));
	}
	return 0;
}