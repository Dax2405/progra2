package Letra_do_while;

public class N_do {

    int tamaño = 5;

    public void imprimir() {
        int i = 0;
        do {
            int j = 0;
            do {
                if (j == 0 || j == tamaño - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamaño);
            System.out.println();
            i++;
        } while (i < tamaño);
    }
}
