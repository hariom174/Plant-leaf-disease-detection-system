#include<stdio.h>
 int main()
 {
 	int A,B,X;
 	printf("enter value A");
 	scanf("%d",&A);
 	printf("enter value B");
 	scanf("%d",&B);
 	printf("enter value X");
 	printf("Smallest aboslute value of different between X and integer between A and B(inclusive):\n");
 	
 	if(X<A){
 		printf("%d\n",A);
 		
	 }
	 else if(B>X){
	 	printf("%d\n",B);
	 }
	 else{
	 	printf("%d\n",X);
	 }
 	return 0;
 }
 
