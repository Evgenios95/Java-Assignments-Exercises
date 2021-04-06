import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the age factory! \nPlease enter your name and your surname: ");
        String name = sc.nextLine();

        System.out.println("\nIt's time for your year of birth now: ");

        // does it qualify as an int? or not? If yes then proceed. If not then print that it's unable to parse it.
        boolean hasNextInt = sc.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = sc.nextInt();
            int age = 2020 - yearOfBirth;

            // nested if statement. After the input qualifies as an int, the next step is to check if the int is in the range of 1-120. If it is then print a message and a question. If not then the year inserted is invalid.
            if (age >= 0 && age <= 120) {

                System.out.println(
                        "\nSo, Mr " + name + ", you are born in " + yearOfBirth + " and that means that you are " + age
                                + " years old. Anything else I answer for you? Type yes or no :)");

                // the input from the user typing Yes or No should be turned to lowercase, so if he/she for exaple writes YeS NO then its converted to yes and no and gets accepted from the system.
                String answer = sc.next();
                answer = answer.toLowerCase();

                //now that it's converted, we need to check if the input is equal to yes or no, with lower case, and if it is, then it responds to us.
                if ("yes".equals(answer)) {
                    System.out.println("I'm bored to write more, you're boring.");
                } else if ("no".equals(answer)) {
                    System.out.println("See you around!");
                } else {
                    System.out.println("You can't even type yes or no?");
                }

            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse the year of your birth. Try to insert an integer.");
        }
        sc.close();
    }
}
