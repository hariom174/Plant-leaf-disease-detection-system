// write a c program to generate a random number:

#include<stdio.h>
int main()
{
	int num,var;
	srand(time(NULL));
	num=rand()%10+1;
	do{
		printf("Guess the number(1+10)");
		scanf("%d",&var);
		if(num>var)
		 printf("The number is higher\n");
	}while(num!=var);
	printf("That is correct!\n\n");
	
	return 0;
}