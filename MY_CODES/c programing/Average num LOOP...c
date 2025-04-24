
//write a program in c to read 10 numbers from keyboard and find their sum and average?

#include<stdio.h>
int main()
{
   int i,n,sum=0;
   float averag;
   printf("enter a 10 average number");
   for(i=1;i<=10;i++)
   {
   	printf("Number-%d",i);
   	  scanf("%d",&n);
   	  sum +=n;
   }
   averag=sum/10.0;
   printf("The sum of %d\n",sum);
   printf("The  average of number=%f",averag);
   return 0;
}