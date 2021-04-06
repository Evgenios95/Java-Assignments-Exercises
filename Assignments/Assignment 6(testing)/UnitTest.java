import java.util.Scanner;

public class UnitTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");

		

		while (sc.hasNextLine()) {
			String[] string = sc.nextLine().split(" ");
			if (string.equals("")) {
				System.out.println();
			}
			for (int i = 0; i < str.length; i++) {
						str[i] = str[i].toLowerCase();
					}
					
			for (int i = 0; i < string.length; i++) {
				String myString = string[i].toLowerCase();
				for (int k = 0; k < str.length; k++) {
					if (myString.contains(str[k])) {
						if (myString.equals(str[k])) {
							string[i] = yeap(string[i]);
						} else if (pun(myString) && myString.length() == str[k].length() + 1) {
							string[i] = yeap(string[i]);
						}
					}
				}
			}
			for (int i = 0; i < string.length; i++) {
				System.out.print(string[i] + ' ');
			}
			System.out.println();

		}
		sc.close();
	}
	public static boolean pun(String string) {
			char lastCharacter = string.charAt(string.length() - 1);
			if (lastCharacter == '?' || lastCharacter == '.' || lastCharacter == ',' || lastCharacter == '!') {
				return true;
			}
			return false;
		}

	public static String yeap(String st) {
		String t = "";
		char Slter[] = { '*', '&', '#', '$', '%' };
		int k = 0;
		for (int i = 0; i < st.length() - 1; i++) {
			t += Slter[k];
			k++;
			if (k == 5)
				k = 0;
		}
		if (pun(st) == false) {
			t += Slter[k];
		} else if (pun(st) == true) {
			t += st.charAt(st.length() - 1);
		} return t;
	}

	
}