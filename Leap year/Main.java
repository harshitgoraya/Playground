#include<stdio.h>
int main()
{ int y;
  scanf ("%d", &y);
  int a = y%4;
  if (a !=0)
    printf ("Not Leap year");
    else
      printf ("Leap year");
  return 0;
}