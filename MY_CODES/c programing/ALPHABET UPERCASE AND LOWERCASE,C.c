// Write  a c program to check whether a character is uppercase and lowercase alphabet.

#include<stdio.h>
int main()
{
	char cha;
	printf("enter a character");
	scanf("%c",&cha);
	if(cha>='A'&&cha<='Z')
	{
		printf("%c is a uppercase alphabet",cha);
	}
	else if(cha>='a'&&cha<='z')
	{
		printf("%c is a lowercase alphabet",cha);
	}
	else{
		printf("%c is not an alphabet");
	}
	return 0;
}