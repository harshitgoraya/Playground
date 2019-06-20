#include <stdio.h>
int main() {
  int num, a;
  long b =1;
  scanf("%d", &num);
   for (a=1; a<=num; ++a)
   { b *= a;
   }
  printf("%d", b);
	return 0;
}