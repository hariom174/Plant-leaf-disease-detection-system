#include<stdio.h>
int checkArmstrong(int n1);
int checkPerfect(int n1);
int main()
{
	int n1;
	printf("Function:Convert a armostrong no and perfect no:\n");
	printf("\n------------------------------------------------\n");
	printf("Enter the number:");
	scanf("%d",&n1);
	//calls the checkArmstrong()
	if(checkArmstrong(n1))
	{
		printf("It is a armstrong number:%d\n",n1);
	}
	else
	{
		printf("It is not a armstrong number:%d\n",n1);
	}
	//calls the checkperfect()
	if(checkPerfect(n1))
	{
		printf("It is a perfect number:%d\n",n1);
	}
	else
	{
		printf("It is not a perfect number:%d",n1);
	}
	return 0;
}
//check whether a three digits number is Armstrong number or not.
//An Armstrong number is an n-digit number that is equal.
//to the sum of the n-th powers of its digits.
int checkArmstrong(int n1)
{
	int ld,sum=0,num;
	num=n1;
	while(num!=0)
	{
		ld=num%10;//find the last digit of the number
		sum+=ld*ld*ld;//calculate the cube number of the last digit adds to sum
		num=num/10;
	}
	return (n1==sum);
}
//check whether the number is perfect number or not.
//a perfect number is a positive integer that is equal to.
//the sum of postive division excluding the number itself.
int checkPerfect(int n1)
{
	int i,sum,num;
	sum=0;
	num=n1;
	for(i=1;i<num;i++)
	{
		/* If i is a division of n1 */
		if(num%i==0)
		{
			sum+=i;
		}
	}
	return (n1==sum);
}