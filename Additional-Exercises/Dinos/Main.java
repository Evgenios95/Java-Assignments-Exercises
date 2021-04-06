public class Main {
    public static void main(String[] args) {
        DinoDatabase myDino = new DinoDatabase();
        myDino.addDino("FunnyYouAreExtinct", 3);
        myDino.addDino("FunnyYouAreExtinct", 5);
        myDino.addDino("FunnyYouAreExtinct", 7);
        myDino.updateDino("littleDino", 3);
        myDino.updateDino("FunnyYouAreExtinct", 72131);
        myDino.removeDino("FunnyYouAreExtinct");
        myDino.updateDino("FunnyYouAreExtinct", 72131);
        myDino.removeDino("Troels");
        myDino.addDino("Laura", 2);
        System.out.println(myDino.getWeight("Laura")); 
        myDino.addDino("Troels", 4);
        myDino.getDinoNames();
        myDino.addDino("Ethan", 69);
        System.out.println(myDino.getHeaviest());
    }


}
