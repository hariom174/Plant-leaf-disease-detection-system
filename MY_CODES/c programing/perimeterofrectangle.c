//Write a c program that prints the perimeter of a rectangle using its height and width as input;

#include<stdio.h>
int main()
{
        float width,rect,height,peri;
        printf("Enter the height and width of the rectangle:");
        scanf("%f%f",&height,&width);
        peri=20*(height+width);
        printf("Perimeter of the rectangle is:%f",peri);
        return 0;
}