package maquinaexpendedora;
public class Maquina {
    private static final String[] COINS = { "5", "10", "25", "50", "100" };
    private static final int ERR = -1;
    private static final int[] PRODUCTS = { 100, 200, 300, 400, 500 };
    private static final int[][] MT = {
            { 1, 2, 5, 10, 20, ERR },
            { 2, 3, ERR, ERR, ERR, ERR },
            { 3, 4, ERR, ERR, ERR, PRODUCTS[0] },
            { 4, 5, ERR, ERR, ERR, ERR },
            { 5, 6, ERR, ERR, ERR, ERR },
            { 6, 7, 10, ERR, ERR, PRODUCTS[1] },
            { 7, 8, ERR, ERR, ERR, ERR },
            { 8, 9, ERR, ERR, ERR, ERR },
            { 9, 10, ERR, ERR, ERR, ERR },
            { 10, 11, ERR, ERR, ERR, ERR },
            { 11, 12, 15, 20, ERR, PRODUCTS[2] },
            { 12, 13, ERR, ERR, ERR, ERR },
            { 13, 14, ERR, ERR, ERR, ERR },
            { 14, 15, ERR, ERR, ERR, ERR },
            { 15, 16, ERR, ERR, ERR, ERR },
            { 16, 17, 20, ERR, ERR, PRODUCTS[3] },
            { 17, 18, ERR, ERR, ERR, ERR },
            { 18, 19, ERR, ERR, ERR, ERR },
            { 19, 20, ERR, ERR, ERR, ERR },
            { 20, ERR, ERR, ERR, ERR, ERR },
            { ERR, ERR, ERR, ERR, ERR, PRODUCTS[4] },
    };
    private int getIndex(String coin) {
        for (int i = 0; i < COINS.length; i++) {
            if (COINS[i].equals(coin)) return i;}
        return ERR;}
    public void validateMoney(String money) {
        int q = 0;
        for (String coin : money.split("-")) {
            int index = getIndex(coin);
            if (index == ERR) {
                System.out.println("Devolver dinero");
                return;
            }
            q = MT[q][index];
        }
        switch (MT[q][5]) {
            case 100: System.out.println("Caramelo"); break;
            case 200: System.out.println("Chocolate"); break;
            case 300: System.out.println("Agua"); break;
            case 400: System.out.println("Poncake"); break;
            case 500: System.out.println("Jugo"); break;
            default: System.out.println("Devolver dinero"); break;
        }
    }
}
