// find a c program to switch condition add,sub,mul,div,mul?
#include<stdio.h>
int main()
{
	
	int x,y,op;
	printf("Enter a number(+,-,*,/)");
	scanf("%c",&op);
	
	printf("Enter two number");
	scanf("%d%d",&x,&y);
	
	switch(op)
	{
		case'+':
			printf("sum=%d\n",x+y);
			break;
	
	   case'-':
	   	printf("different=%d\n",x-y);
	   	break;
	   	
	   	case'*':
	   		printf("product=%d\n",x*y);
	   		break;
	   		
	   	case'/':
		   printf("Quotient=%d",x/y);
		   break;
		  
		default:
		   printf("invaild operator");   	
	   	
		
	   }
	return 0;
}