public class Doggo {
    private String name;
    private boolean goodBoi;
    
    public Doggo(String name){
        this.name = name;
        goodBoi = false;
    }

    public String getName() {
        return name;
    }

    public void makeBark() {
        System.out.println(name + " said: Woof woof");
    }


    public void makeGoodBoi(){
        goodBoi = true;
    }


    //Make a method isGoodBoi which returns the value the good boi field (hint: it returns a boolean value).

    public boolean isGoodBoi(){
        return goodBoi;
    }

    public void whosAGoodBoi() {
        if (goodBoi) {
            System.out.println(name + " is such a goood boii");
        } else {
            System.out.println(name + " is not a good boi :(");
        }
    }


    public static void main(String[] args) {
        Doggo dog = new Doggo("Casper");
        System.out.println(dog.getName());
        dog.makeBark();
        dog.makeGoodBoi();
        dog.whosAGoodBoi();
        
    }
}
