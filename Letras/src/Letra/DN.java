package Letra;

public class DN {
    int tamaño = 5;

    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < tamaño; j++) {
                if (j == 0 || j == tamaño - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
