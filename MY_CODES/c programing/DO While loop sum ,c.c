#include<stdio.h>
int main()
{
	int i=0,sum=0,n=10;
	do{
		sum=sum+i;
		++i;
	}while(i<=n);
	printf("The 10 natural num=%d\n",sum);
	return 0;
}