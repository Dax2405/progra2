package nombre;

public class Validadora {
    private static final String[] LETTERS = {"D", "A", "X"};
    private static final int ERR = -1;
    
    private static final int[][] MT = {
        {1, ERR, ERR, ERR},
        {ERR, 2, ERR, ERR},
        {ERR, ERR, 3, ERR},
        {ERR, ERR, ERR, 10}
    };

    private int getIndex(String letter) {
        for (int i = 0; i < LETTERS.length; i++) {
            if (LETTERS[i].equals(letter)) return i;
        }
        return ERR;
    }
    public void validateName(String name) {
        int q = 0;
        for (String letter : name.split("")) {
            int index = getIndex(letter);
            if (index == ERR) {
                System.out.println("Nombre no valido");
                return;
            }
            q = MT[q][index];
        }
        switch (q) {
            case 3: System.out.println("Nombre valido"); break;
            default: System.out.println("Nombre no valido"); break;
        }
    }
}
