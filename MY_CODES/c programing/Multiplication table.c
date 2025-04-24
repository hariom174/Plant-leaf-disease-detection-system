//write to program a print multiple num?

#include<stdio.h>
#include<math.h>
int main()
{
	int i,n;
	printf("Enter n ");
	scanf("%d",&n);
	
	for(i=0;i<=10;i++)
	{
		printf("%d*%d=%d\n",n,i,n*i);
	}
	return 0;
}