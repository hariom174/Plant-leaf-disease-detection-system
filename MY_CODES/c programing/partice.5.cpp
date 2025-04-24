#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("Enter the number:");
	scanf("%d%d%d",&n1,&n2.&n3);
	if(n1<n2)
	{
		printf("%d\n",n1);
	}
	else if(n2>n3)
	{
		printf("%d\n",n2);
	}
	else if(n3>n1)
	{
		printf("%d\n",n3);
	}
	else 
	{
		printf("This is not a larger number:");
	}
	return 0;
}