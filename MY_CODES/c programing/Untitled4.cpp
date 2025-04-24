//program toi find biggest in three different numbers using Ternary operater ?

#include<stdio.h>
int main()
{
	int x,y,z,big;
	printf("Enter three big number:");
	scanf("%d %d %d",&x,&y,&z);
	
	big=x>y?(x>y?x:z):(y>z?y:z);
	printf("biggest number=%d",big);
return 0;
}