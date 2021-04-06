public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(54));
    }

    public static int getLargestPrime(int number) {
        if (number < 2)
            return -1;

        /**
         * katarxas dinw timh sto i oso o arithmos dia 2 gia na parw to megalytero
         * diaireth tou. 27*2 = 54. meta elegxw kai lew an o arithmos de dinei ypoloipo
         * dwse ton arithmo sto i. otan ftanei sto 9, katalabainei pws afhnei 0 ypoloipo
         * kai to pairnei sthn i. to idio me to 3. to 3 einai kai prime enw to 27 kai to
         * 9 oxi. ara to 3 einai h apanthsh sto 54.
         */

        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }

}
