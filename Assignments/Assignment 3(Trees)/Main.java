public class Main {
    public static void main(String[] args) {
        
        Forest forest = new Forest();
        forest.addTree(345);
        forest.addTree(620);
        forest.addTree(104);
        System.out.println(forest);
        forest.growOneYear();
        System.out.println(forest);
        forest.growOneYear();
        System.out.println(forest);
    }
}
