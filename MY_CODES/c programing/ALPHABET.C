//write a c program to check whether a character is alphabet or not.

#include<stdio.h>
int main()
{
	char ch;
	printf("enter a character");
	scanf("%d",&ch);
	
	if(ch>='a'&&ch<='z'){
		printf("character a alphabet");
	}
	else{
		printf("character is not a alphabet");
	}
	return 0;
}