import java.util.ArrayList;
import java.util.List;


public class Forest {

    private List<Tree> trees;
    
    public Forest(){
        this.trees = new ArrayList<>(); 
    }

    public void addTree(int growthPct){
        this.trees.add(new Tree(growthPct));
    }

    public String toString(){
        String yesString="";
        for(Tree tree: this.trees){
            yesString += tree.toString(); 
        } return "Forest("+yesString+")";
    } 

    public void growOneYear(){
        for(Tree tree: this.trees){
            tree.growOneYear();
        }
    }

}