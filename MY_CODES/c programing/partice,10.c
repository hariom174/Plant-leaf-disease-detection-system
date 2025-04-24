#include<stdio.h>
int main()
{
	int arr1[100],arr2[100],arr3[100];
	int n,duplication=1,ctr=0;
	int i,j;
	printf("Enter no of elements:");
	scanf("%d",&n);
	printf("Enter x-array of elements:");
	
	for(i=0;i<n;i++)
        {
                scanf("%d",&arr1[i]);
	}
	for(i=0;i<n;i++)
	{
		arr2[i]=arr1[i];
		arr3[i]=0;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(arr1[i]==arr2[j])
			{
				arr3[j]=duplication;
				duplication++;
			}
		}
		duplication=1;
	}
	for(i=0;i<n;i++)
	{
		if(arr3[i]==2)
		{
			ctr++;
		}
		printf("Total number of duplication elements in the array:%d\n",ctr);
	}
	return 0;
}