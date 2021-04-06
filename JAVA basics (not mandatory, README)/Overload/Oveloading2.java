package Overload;

public class Oveloading2 {
    public static void main(String[] args) {
        calcFeetAndInchesToCm(6.0, 0.0);
        calcFeetAndInchesToCm(-12.0, 0.0);
        calcFeetAndInchesToCm(157);
        calcFeetAndInchesToCm(13);
     
    }

    public static double calcFeetAndInchesToCm(double feet, double inches) {
        if (feet < 0 || (inches < 0 && inches > 12)) {
            System.out.println("Invalid");
            return -1;
        }

        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;

        System.out.println("f = " + feet + " i = " + inches + " CM = " + cm);
        return cm;
    }

    public static double calcFeetAndInchesToCm(double inches) {
        if (inches < 0) {
            System.out.println("Invalid");
            return -1;
        }

        double feet =  (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " " + feet + " " + remainingInches);
         return calcFeetAndInchesToCm(feet, remainingInches);
    }

}
