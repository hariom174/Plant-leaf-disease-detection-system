// write a c program to convert a string to a double:

#include<stdio.h>
int main()
{
      char name[]="8.0 2.0";
      char *ptr_end;
      double x,y;
      
      x=strtod(name,&ptr_end);
      y=strtod(ptr_end,NULL);
      
      printf("Output=%2lf\n\n",x/y);
      return 0;	
}