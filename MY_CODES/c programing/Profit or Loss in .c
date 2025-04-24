// write a c program to calculate profit or loss?

#include<stdio.h>
int main()
{
	int sp,cp,amount;
	printf("Enter a cost price");
	scanf("%d",&sp);
	  printf("Enter a selling price");
	  scanf("%d",&cp);
	  
	if(sp>cp)
	{
		amount=sp-cp;
		printf("Profit=%d\n",amount);
	}
	else if(cp>sp)
	{
		amount=cp-sp;
		printf("Loss=%d\n",amount);
	}
	else{
		printf("Not profit and loss");
	}
	return 0;
}