import java.util.Scanner;

public class song {
   
public static void main(String[] args) {
    

Scanner scanner = new Scanner(System.in);

String[] song = scanner.nextLine().split(" ");



while (song.length != 4 || (!isInteger(song[0])) || (!song[2].equals("of")) || (!(song[1].substring(song[1].length() - 1)).equals("s"))) {
    song = scanner.nextLine().split(" ");
    }
    int loops = Integer.parseInt(song[0]);



for (int i=loops; i>1; i--) {
System.out.println(i + " " + song[1] + " " + song[2] + " " + song[3] + " on the wall");
System.out.println(i + " " + song[1] + " " + song[2] + " " + song[3]);
System.out.println("Take one down, pass it around");

if (i==2) {
    System.out.println("One " + (song[1].substring(0,song[1].length()-1)) + " " + song[2] + " " + song[3] + " on the wall\n");
    } else {
    System.out.println(i - 1 + " " + song[1] + " " + song[2] + " " + song[3] + " on the wall\n");
    }
}
    System.out.println("One " + (song[1].substring(0,song[1].length()-1)) + " " + song[2] + " " + song[3] + " on the wall");
    System.out.println("One " + (song[1].substring(0,song[1].length()-1)) + " " + song[2] + " " + song[3]);
    System.out.println("Take one down, pass it around");
    System.out.println("No more " + song[1] + " " + song[2] + " " + song[3] + " on the wall\n");
    scanner.close();
}

public static boolean isInteger(String s) {
try {
    int x = Integer.parseInt(s);
    if (x < 1 ) {
    return false;
    }
    } catch (NumberFormatException e) {
    return false;
    }
    return true;
    }

}
