public class MinutesToYearsDaysCalculator {

    private static final String INVAL_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        printYearsAndDays(1555);
        printYearsAndDays(-1555);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVAL_VALUE_MESSAGE);
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = minutes / 525600;
            long remainingDays = days % 365;

            System.out.println("MM " + minutes + " YY " + years + " DD " + remainingDays);
        }
    }
}
