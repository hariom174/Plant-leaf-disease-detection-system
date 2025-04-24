//write a c program to convert a given integer (in second) to hours,minutes and second?

#include<stdio.h>
int main()
{
	int sec,hou,min,s;
	printf("Enter a seconds:");
	 scanf("%d",&sec);
	 hou=(sec/3600);
	 
	 min=(sec-(3600*hou))/60;
	 
	 s=(sec-(3600*hou)-(min*60));
	 
	 printf("H:M:S - %d%d%d\n",hou,min,sec);
	 return 0;
}