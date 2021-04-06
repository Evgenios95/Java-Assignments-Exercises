public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes/1024;
        int remainingOnes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingOnes + " KB");
        }
    }

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(5326);
    }
}
