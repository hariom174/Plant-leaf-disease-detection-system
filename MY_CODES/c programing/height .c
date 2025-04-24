//write a c program to accept the height of a person in centimeter and categorize the person according to their height?
#include<stdio.h>
int main()
{
	
	float PerHeight;
	printf("enter the height of the person (in centimeter)");
	scanf("%d",&PerHeight);
	
	if(PerHeight<150.0){
		printf("The person is Drawf.\n");
	}
	else if(PerHeight>150.0||PerHeight>165.0){
		printf("The person is average heighted\n");
	}
	 else if(PerHeight<165.0||PerHeight<195.0){
	printf("The person is taller\n");
	}
	else{
		printf("The person in not taller");
	}
	return 0;
}