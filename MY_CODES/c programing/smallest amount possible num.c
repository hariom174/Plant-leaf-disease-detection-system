//write a c program to read an amount and break the amount into smallest possible number of bank note?

#include<stdio.h>
int main()
{
	int amount,total;
	printf("Enter a amount:");
	scanf("%d",&amount);
	total=(int)amount/100;
	
	printf("There are:");

	printf("\n%d Note(s) of 100.00\n",total);
	
	amount=amount-(total*100);
	
	total=(int)amount/50;
	
	printf("%d Note(s) of 50.00\n",total);
	
	amount=amount-(total*50);
	
	total=(int)amount/20;
	
	printf("%d Note(s) of 20.00\n",total);
	
	amount=amount-(total*20);
	
	total=(int)amount/10;
	
	printf("%d Note(s) of 10.00\n",total);
	
	amount=amount-(total*10);
	
	total=(int)amount/5;
	
	printf("%d Note(s) of 5.00\n",total);
	
	amount=amount-(total*5);
	
	total=(int)amount/2; 
	
	printf("%d Note(s) of 2.00\n",total);
	
	amount=amount-(total*2);
	
	total=(int)amount/1;
	
	printf("%d Note(s) of 1.00",total);
	
	return 0;
}