#include <stdio.h>
int main() {
	int n;
  scanf ("%d", &n);
   int p = n*2;
  for (int i=1; i<p; i = i+2)
    printf ("%d \n", i);
	return 0;
}