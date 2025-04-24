//write a c program to input any character and check whether it is alphabet ,digit for special character?

#include<stdio.h>
int main()
{
	char ch;
	printf("enter a character");
	scanf("%d",&ch);
	if(ch>=97&&ch<=120)
	{
		printf("%c is a alphabet",ch);
	}
	else if(ch>=48&&ch<=57)
	{
		printf("%c is digit",ch);
	}
	else{
		printf("%c is a special digit",ch);
	}
	return 0;
}