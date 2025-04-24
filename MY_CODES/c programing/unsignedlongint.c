// write a c program to convert a string to an unsigned long integer:

#include<stdio.h>
int main()
{
	char buffer[123];
	unsigned long ul;
	printf("Enter an unsigend number:");
	fgets(buffer,123,stdin);
	
	ul=strtoul(buffer,NULL,0);
	printf("Convert a string :%lu\n",ul);
	
	return 0;
} 