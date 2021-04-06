public class Regex1 {
    public static void main(String[] args) {
        String str = "Have a great day!";
        System.out.println(str);
        String str2 = str.replaceAll("Have", "Don't have");
        System.out.println(str2);

        //simple . matches every character
        String alphanum = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanum.replaceAll(".", "Y"));
        System.out.println(alphanum.replaceAll("^abcDeee", "EVGENIOS"));
        
    }
}
