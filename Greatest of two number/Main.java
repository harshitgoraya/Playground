#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d", &a);
  scanf("%d", &b);
  if (a>b)
    printf("num1 is the greatest");
   if (b>a)
     printf("num2 is the greatest");
   if (a==b)
    printf("Both number Equal");
  return 0;
}