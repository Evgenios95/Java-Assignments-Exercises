public class WhileAndDoWhileStatements {
    public static void main(String[] args) {

        // simple while loop
        int count = 0;
        while (count != 7) {
            System.out.println("Counting number is : " + count);
            count++;
        }

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        // simple while loop with break.
        count = 1;
        while (true) {
            if (count == 7) {
                break;
            }
            System.out.println("Counting number issss : " + count);
            count++;
        }

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        // do while statement
        count = 7;
        do {
            System.out.println("Counting number is : " + count);
            count++;
        } while (count != 13);

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        // do while sattement 2 with if statement in it
        count = 32;
        do {
            System.out.println("Counting number is : " + count);
            count++;

            if (count > 39) {
                break;
            }
        } while (count != 6);

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        // challenge isEvenNumber determining if its an even number or not
        int number = 4;
        int finishNumber = 20;
        int countingEvens = 0;
        while (number <= finishNumber) {
            number++;  
            if (!isEvenNumber(number)) {
                continue;
            }
            countingEvens++;
            if (countingEvens >= 5) {
                break;
            }
            System.out.println("Even numbers " + number);    
        }
        System.out.println("Total evens found " +countingEvens);

    }

    //is it even?
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
