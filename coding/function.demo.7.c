#include<stdio.h>
int primeornot(int);//function declaration 
int main()
{
    int n1,prime;
    printf("Function:Convert a prime number:");
    printf("-----------------------------------\n\n");
    printf("Enter the number:");
    scanf("%d",&n1);
    prime=primeornot(n1);
    if(prime==1)
        printf("It is prime number:%d\n",n1);
    else
        printf("It is a not a prime number:%d",n1);
    return 0;
}
int primeornot(int n1)
{
    int i=2;
    while(i<=n1/2)
    {
        if(n1%i==0)
        return 0;
        else
        i++;
    }
    return 1;
}