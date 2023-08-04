public class LetterB {

    public static void main(String[] args) {
        int row = 7;
        int col = 6; // We use 6 columns to get the correct shape of the letter "B"

        char[][] bHarfi = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 0 || (i == 0 || i == row - 1 || i == row / 2) && j < col - 1 || j == col - 1 && (i != 0 && i != row - 1 && i != row / 2)) {
                    bHarfi[i][j] = '*';
                } else {
                    bHarfi[i][j] = ' ';
                }
            }
        }

        // B harfini ekrana yazdır
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(bHarfi[i][j]);
            }
            System.out.println();
        }
    }
}