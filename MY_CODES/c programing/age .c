//program to check whether a person a eligible to vote or not?

#include<stdio.h>
int main()
{
	int age;
	printf("enter your age");
	scanf("%d",&age);
	
	if(age>=18){
		printf("you are abale to voting");
}
   else
   {
   printf("you are not abale to voting");
}
return 0;
}
