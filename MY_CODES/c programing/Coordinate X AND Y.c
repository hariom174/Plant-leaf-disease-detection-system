//writea c program to accept a coordinate point in a XY coordinate system and determine in which quardrant the coordinate point lies? 

#include<stdio.h>
int main()
{
	int x,y;
	printf("Enter a coordinate system :");
	scanf("%d%d",&x,&y);
	
	 if(x>0&&y>0)
	 {
	 	printf("The value an coordinate point=%d%d is a line first quardrant",x,y);
	 }
	 else if (x<0&&y>0)
	 {
	 	printf("The value an coordinate point=%d%d is a lies second quardant\n",x,y);
	 }
	 else if (x>0&&y>0)
	 {
	 	printf("The value an coordinate point(%d,%d) is a lies third quardant\n",x,y);
	 }
	 else if(x==0&&y==0)
	 {
	 	printf("The value an coordinate point=%d%d is a lies fourth quardant",x,y);
	 }
	 else{
	 	printf("Is not equal to");
	 }
	 return 0;
}
