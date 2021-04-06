public class SwitchStatement {
    public static void main(String[] args) {

        // first switch statement.
        int value = 5;
        switch (value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("3 or 4 or 5 or 6 value");
                System.out.println("Actually it was a " + value);
                break;

            default:
                System.out.println("Every other case");
                break;
        }

        // second switch statement/ exercise.
        char ch = 'D';
        switch (ch) {
            case 'A':
                System.out.println("It's A!");
                break;

            case 'B':
                System.out.println("It's B!");
                break;
            case 'C':
                System.out.println("It's C!");
                break;
            case 'D':
            case 'E':
                System.out.println("It's D or E!");
                System.out.println("Actually a " + ch + "!");
                break;
            default:
                System.out.println("Not found, sorry!");
                break;
        }

        // switch with Strings. Exercise 3
        System.out.println("\n");
        String month = "JaNuaRy";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Here we are");
                break;
            case "June":
                System.out.println("Yeah it's June, really?");
                break;
            default:
                System.out.println("Neither!");
                break;
        }

        // calling the methid printDayOfTheWeek
        printDayOfTheWeek(3);
        printDayOfTheWeek(-3);

        // calling the method printNumberInWord
        printNumberInWord(3);
        printNumberInWord(6);
        printNumberInWord(16);
        printNumberInWord(-6);

    }

    // day of the week challenge with switch statements
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

        // challenge 2
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

}
