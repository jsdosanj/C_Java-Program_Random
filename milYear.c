#include <stdio.h>

int main(void)
{
    double balance, deposit = 1000, rate = 0.05; 
    int year = 0;

    while( balance < 10000000)
    {
        balance *= 1/05;
        year++;
    }
    printf("It takes %d years to have $1,000,000.00.\n", year);
}
