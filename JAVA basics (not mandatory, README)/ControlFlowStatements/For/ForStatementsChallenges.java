public class ForStatementsChallenges {
    public static void main(String[] args) {

        // challenge 1. Count the divisible by 3 and 5 numbers, then print their sum.
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Number found is: " + i);
            }
            if (count == 6) {
                break;
            }
        }
        System.out.println("The sum is:" + sum);

        // challenge 2.isOdd. Lecture 68
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println(isOdd(3));
        System.out.println(isOdd(6));
        System.out.println(isOdd(8));
        System.out.println(isOdd(11));
        System.out.println(isOdd(112));
        System.out.println(isOdd(131));
        System.out.println(isOdd(-131));
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        sumOdd(1, 23);
        sumOdd(19, 21);
        sumOdd(3, 232);

    }

    // challenge 2.isOdd. Lecture 68
    public static boolean isOdd(int number) {

        return (number > 0 && number % 2 != 0); 
        // return (number > 0 && number % 2 != 0) ? true : false;

    }

    public static int sumOdd(int start, int end) {
        if (end >= start && (end > 0 && start > 0)) {
            int count = 0;
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    count = count++;
                    sum += i;
                    System.out.println("I am an odd number, my name is:" + i);
                }
            }
            System.out.println("The sum is " + sum);
            System.out.println("-----------------------------");
            return sum;

        } else {
            return -1;
        }
    }
}
