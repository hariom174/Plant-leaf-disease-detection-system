#include<stdio.h>
int main()
{
	int maths,phy,che;
	printf("enter 3 subj marks");
	scanf("%d%d%d",&maths,&phy,&che);
	
	if(maths>=40&&phy>=40&&che>=40)
	printf("pass");
	
	else{
		printf("fail");
	}
	return 0;
}