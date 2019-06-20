#include<stdio.h>
int main()
{
  int num, c;
  scanf ("%d", &num);
  int a = num/100;
  int b= num%10;
  c = a+b;
  printf ("%d", c);
  
  return 0;
}