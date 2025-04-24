#include<stdio.h>
int main()
{
	char alphab;
	printf("enter a char");
	scanf("%d",&alphab);
	
	if(alphab>122&&alphab<=299){
		printf("%d is a vowel",alphab);
	}
	else if(alphab>299){
		printf("%d is a digite",alphab);
	}
	else{
		printf("it is not a alphab and digite");
	}
	return 0;
}