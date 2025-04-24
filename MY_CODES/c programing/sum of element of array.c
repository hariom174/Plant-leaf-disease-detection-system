// write to find sum of the element of an array?

#include<stdio.h>
int main()
{
	int a[100];
	int i,n,sum=0;
	printf("enter a sum num:");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("sum of element %d",i);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		sum+=a[i];
	}
	return 0;
}