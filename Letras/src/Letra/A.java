package Letra;

public class A {
    // Imprimir letra A con * dado un tamaño
    int tamaño = 5;

    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño / 2 || j == 0 || j == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
