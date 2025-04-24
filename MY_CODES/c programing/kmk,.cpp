//write a program to find the maximum amd minimum elements in an array. 

#include<stdio.h>
int main()
{
	int x[100],i,n;
	int max,min;
	printf("Enter no of elements:");
	scanf("%d",&n);
	
	printf("%d is a x-array of elements \n",n);
	for(i=0;i<n;i++)
	{
		printf("%d elements is \n",i);
	      scanf("%d",&x[i]);
        }
         max=x[0];
         min=x[0];
                  
		  for(i=0;i<n;i++)
		  {
		  	if(x[i>max])
			{
				max=x[i];
			}
			  if(x[i]<min)
			  {
			  	min=x[i];
			  }
		   } 
		   printf("Maximum elements is:%d\n",max);
		   printf("Minimum elements is:%d\n",min);
	return 0;
}