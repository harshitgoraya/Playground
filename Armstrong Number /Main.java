#include <stdio.h>
int main() {
	int num, original, rem, b;
  	
  	scanf("%d", &num);
  	original = num;
    while (num!=0)
    { rem = num % 10;
  	  b += rem*rem*rem;
      num /= 10;
    }
     if ( b == original )
       printf("Armstrong Number");
              else
              printf("Not an Armstrong Number");
	return 0;
}