package Letra_While;

public class DN_while {

    int tamaño = 5;

    public void imprimir() {
        int i = 0;
        while (i < tamaño) {
            int j = 0;
            while (j < tamaño) {
                if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print(" ");
            j = 0;
            while (j < tamaño) {
                if (j == 0 || j == tamaño - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
