#include <gmp.h>
#include <stdio.h>

int main() {
    mpz_t result;
    
    mpz_init(result);
    
    mpz_ui_pow_ui(result, 2, 82589933);
    mpz_sub_ui(result, result, 1);
    
    FILE *f = fopen("large_prime.txt", "w");
    if (f == NULL) {
        printf("Error opening file!\n");
        return 1;
    }
    mpz_out_str(f, 10, result);  
    fclose(f);

    mpz_clear(result);
    
    printf("Calculation complete. The result has been written to 'large_prime.txt'.\n");

    return 0;
}
