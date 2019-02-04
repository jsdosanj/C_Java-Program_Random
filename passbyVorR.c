
#include <stdio.h>

void DoubleByVal(int x);
void DoubleByRef(int *x);

int main(void)
{
    int x = 20;
    printf("x = %d\n", x);
    
    DoubleByVal(x);
    printf("x = %d\n", x);
    
    x = 20;
    DoubleByRef(&x);
    printf("x = %d\n", x);

}

void DoubleByVal(int x)
{
    x *= 2;
}

void DoubleByRef(int *x)
{
    *x *= 2;
}
