// write a c program to convert a string to a long integer:

#include<stdio.h>
int main()
{
	char buffer[]="2016 40a0b0-11011101001101111001100*5abff";
	char *ptr_end; 
	long int i1,i2,i3,i4;
	
	i1=strtol (buffer,&ptr_end,10);
	i2=strtol (ptr_end,&ptr_end,16);
	i3=strtol (ptr_end,&ptr_end,2);
	i4=strtol (ptr_end,&ptr_end,0);
	
	printf("IN decimals:%ld:%ld:%ld:%ld",i1,i2,i3,i4);
	return 0;
}