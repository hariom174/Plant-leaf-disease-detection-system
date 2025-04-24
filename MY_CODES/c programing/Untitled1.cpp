#include<stdio.h>
#include<math.h>
int main()
{
	float k;
	k=sqrt(100);
	printf("squareroot100=%f\n",k);
	
	k=pow(2,3);
	printf("2 power 3=%f\n",k);
	printf("5 power 3=%f\n",pow(5,3));
	
	printf("sin90=%f\n",sin((90*3.14)/180));
	k=cos((0*3.14)/180);
	printf("cos0=%f\n",k);
	
	k=tan((45*3.14)/180);
	printf("tan45=%f",k);
	return 0;
}
