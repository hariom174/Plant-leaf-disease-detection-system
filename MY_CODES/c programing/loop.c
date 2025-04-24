#include<stdio.h>
int main()
{
	float a,b,c;
	float k;
	printf("Enter a value of a,b,c:");
	scanf("%f%f%f",&a,&b,&c);
	k=pow(-b,2)-4*a*c;
	   
	   do
	   {
	   	printf("Root=%f\n",-b/(2*a));
	   	k++;
	   }while(k==0);
	   do
	   {
	   	printf("Root1=%f\n",(-b+sqrt(-k))/(2*a));
	   	printf("Root2=%f\n",(-b-sqrt(-k))/(2*a));
	   	k++;
	   	k++;
	   }while(k>0);
	   do
	   {
	   
	   	printf("Root1=%f\n",-b/(2*a),sqrt(-k)/(2*a));
	   	printf("Root2=%f",-b/(2*a),sqrt(-k)/(2*a));
	   	k++;
	   }while(k>=0);
	   return 0;
}