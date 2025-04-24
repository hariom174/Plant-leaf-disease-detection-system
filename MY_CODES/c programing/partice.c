#include<stdio.h>
int main()
{
	int m,n;
	printf("Enter the number:");
	scanf("%d",&m);
	if(m>0)
        n=1;
        if(m<0)
        {
        	n=-1;
        	printf("The value of n:%d\n",n);
	}
	else if(m==0)
	{
		n=0;
		printf("The value of n:%d\n",n);
	}
	else 
	{
		printf("The value is not equal to:");
	}
	return 0;
}