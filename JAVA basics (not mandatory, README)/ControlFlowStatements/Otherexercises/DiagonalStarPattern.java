public class DiagonalStarPattern {

    public static void main(String[] args) {
        printSquareStar(4);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1) {
                        System.out.print("*");
                    } else if (column == 0 || column == number - 1) {
                        System.out.print("*");
                    } else if (column == row) {
                        System.out.print("*");
                    } else if (column + row == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
