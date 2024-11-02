package Letra_do_while;

public class F_do {

    int tamaño = 5;

    public void imprimir() {
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || i == tamaño / 2 || j == 0) {
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
