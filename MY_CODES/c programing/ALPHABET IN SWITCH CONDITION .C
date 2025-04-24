// write a c program to inpute any alphabate and check whether it is vowel or consonant.

#include<stdio.h>
#include<ctype.h>
int main()
{
	char alpha;
	printf("enter an alphabate");
	scanf("%c",&alpha);
	alpha=tolower(alpha);
	switch(alpha)
	{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		printf("vowel");
		break;
		default:
		printf("consonant");
	}
	return 0;
}