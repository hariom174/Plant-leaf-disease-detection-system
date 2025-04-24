// write a c program to count total number of notes in given amount?\

#include<stdio.h>
int main()
{
	int amount;
	int note500,note100,note50,note20,note10,note5,note2,note1;
	printf("enter amount");
	scanf("%d",&amount);
	if(amount>=500){
		note500 = amount/500;
		amount -= note500*500;
		printf("note500=%d\n",note500);
	}
	else if(amount>=100){
		note100 =amount/100;
		amount -= note100*100;
		printf("note100=%d\n",note100);
	}
	else if(amount>=50){
		note50 =amount/50;
		amount -= note50*50;
		printf("note50=%d\n",note50);
	}
	else if(amount>=20){
		note20 =amount/20;
		amount -= note20*20;
		printf("note20=%d",note20);
	}
	else if(amount>=10){
		note10 =amount/10;
		amount -= note10*10;
		printf("note10=%d\n",note10);
	}
	else if(amount>=5){
		note5 =amount/5;
		amount -=note5*5;
		printf("note5=%d\n",note5);
	}
	else if(amount>=2){
		note2 =amount/2;
		amount -=note2*2;
		printf("note2=%d\n",note2);
	}
	else if(amount>=1)
	{
		note1 =amount/1;
		amount -= note1*1;
		printf("note1=%d",note1);
	}
	else{
		printf("not an amount");
	}
	return 0;
}