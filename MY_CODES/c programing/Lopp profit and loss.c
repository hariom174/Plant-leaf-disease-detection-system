#include<stdio.h>
#include<math.h>
int main()
{
	int sp,cp,amount;
	printf("Enter a profit price:");
	scanf("%d",&sp);
	
	for(sp=0;sp>cp;++sp)
	{
	  amount=sp-cp;
	  printf("profit=%d\n",amount);
	}
	printf("Enter a selling price");
	scanf("%d",&cp);
	for(cp=0;cp>sp;++cp)
	{
		amount=cp-sp;
		printf("loss=%d\n",amount);
	}
	return 0;
}