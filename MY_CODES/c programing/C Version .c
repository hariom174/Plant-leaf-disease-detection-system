//write a c program to get the c version you are using.

#include<stdio.h>
int main()
{
	char first_name[10];
	char second_name[10];
	printf("Enter a first_name\n");
	scanf("%s",&first_name);
	printf("Entera second_name\n");
	scanf("%s",&second_name);
	printf("The name of the  person %s %s",first_name,second_name);
	return 0;
}