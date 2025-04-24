#include<stdio.h>
int checkAnargram(char *str1,char *str2);
int main()
{
    char str1[100],str2[100];
    printf("Function:Whether two given string are anagram:\n");
    printf("Pears and spare,stone and tones:\n");
    printf("------------------------------------\n");
    printf("Enter the first string:");
    fgets(str1,sizeof str1,stdin);
    printf("Enter the second string:");
    fgets(str2,sizeof str2,stdin);
    if(checkAnargram(str1,str2)==1)
    {
        str1[strlen(str1)-1]='\0';
        str2[strlen(str2)-1]='\0';
        printf("%s and %s are not Anargram:\n\n",str1,str2);
    }
    else
    {
        str1[strlen(str1)-1]='\0';
        str2[strlen(str2)-1]='\0';
        printf("%s and %s are not Anargram:\n\n",str1,str2);
    }
    return 0;
}
//Function to check whether two passed string are anargram or not.
int checkAnargram(char *str1,char *str2)
{
    int str1chrctr[256]={0},str2chrctr[256]={0};
    int ctr;
    /*check the length of equality of Two strings*/
    if(strlen(str1)!=strlen(str2))
    {
        return 0;
    }
    //count frequency of character in str1
    for(ctr=0;str1[ctr]!='\0';ctr++)
    {
        str1chrctr[str1[ctr]]++;
    }
    //count frequency of character in str2
    for(ctr=0;str1[ctr]!='\0';ctr++)
    {
        str2chrctr[str2[ctr]]++;
    }
    //compare character count of both strings
    for(ctr=0;ctr<256;ctr++)
    {
       if(str1chrctr[ctr]!=str2chrctr[ctr])
       return 0;
    }
    return 1;
}