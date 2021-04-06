public class Tree{ // class declaration
    // everything that's inside the scope of the tree class can access each other. eveyrhing that is in brackets.
    private int age;
    private double height;
    private double growthPct;

    public Tree( double growthPct) {
        this.age = 1;
        this.height=0.25;
        this.growthPct = growthPct;
    }

    public String toString(){ // for example here the scope is in brackets, inner scope, but the whole toString belongs to the class scope. ANY TIME WE SEE CURLY BRACKETS THATS A SCOPE.
        return ("Tree(age = ") + age + (", height = ")+height+(")");}




        // public void growOneYear(){
        //     age++;
        //     height = height * (1 + growthPct / 100);
        //     if (height>20){
        //         height = 20;
        //     }
        // }



    public void growOneYear(){
        age= age +1;
        
        if(height<20){
        height = height * (1 + growthPct / 100);
        } if(height>20) {
            height=20;
        }
    }
    

}

