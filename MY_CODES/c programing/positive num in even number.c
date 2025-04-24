//write a c program that accepted 4 integer p,q,r,s from the user where q,r and s are postive and p is even .If q is greater than r and s is greater than 
//p and if the sum of r and s is grater than the sum of p and q print "correct value", otherwise print wrong value ?

#include<stdio.h>
int main()
{
	int p,q,r,s;
	printf("Enter a postive num:");
	scanf("%d%d%d%d",&p,&q,&r,&s);
	
	if((q>r)&&(s>p)&&((r+s)>(p+q))&&(p%2==0))
	{
		printf("correct value");
	}
	else{
		printf("wrong value");
	}
	return 0;
}