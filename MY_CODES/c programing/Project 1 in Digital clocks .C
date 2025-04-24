#include<stdio.h>
#include <windows.h>
int main()
{
	 int hours,minu,sec;
	int d=1000;//we add a delay of 1000 milliseconds and will use it in the function sleep
	printf("Set time");
	scanf("%d%d%d",&hours,&minu,&sec);
	if(hours>12||minu>60||sec>60)
	{
		printf("ERROR ! \n");
		exit(0);
	}
	while(1)//this is an indefinite loup and anything inside will reapeat itself to infinity
	{
		sec++;
		if(sec>59)
	{
	minu++;
	sec=0;
  }
  if(minu>59)
  {
  	hours++;
  	minu=0;
}
  if(hours>12)
  {
  	hours=1;
  }
    printf("\n Clock:");
    printf("\n %0.2d:%0.2d:%0.2d",hours,minu,sec);//this writes our time in this format 00:00:00
    Sleep(d);//this function sleep slows down the while loop and make it more like a real clock
    system("cls");//this clears the clock
  }
  return 0;
}
