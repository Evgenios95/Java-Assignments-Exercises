public class Minion {
    private String name;
    private boolean minionStatus;
    private int minionPoints;

    public Minion (String name){
        this.name = name;
        minionPoints = 1;
        minionStatus = true;
    }

    public String getName(){
        return this.name;
    }

    public int getMinionPoints(){
        return minionPoints;
    }

    public String evilLaugh () {
        return ("Muahahaha");
    }

    public void printMinionStatus(){
        if (minionStatus == true){
            System.out.println(name + " is a minion.\n" + evilLaugh());
        } else {
            System.out.println(name + " is not a minion... anymore.");
        }
    }
    
public void undoMinion(){
    minionStatus = false;
    minionPoints = 0;
    System.out.println(name + " is no longer a minion and has lost all minion privileges.");
}

public void makeMinion(){
    minionStatus = true;
    minionPoints = 1;
    System.out.println(name + " is now a minion.");
}

public void givePoints (int minionPoints){
        if (minionStatus == true && minionPoints>=0){
            this.minionPoints += minionPoints;
        }
    }


public void revokePoints(int minionPoints){
        if (minionStatus == true && minionPoints>=1) {
            this.minionPoints -= minionPoints;
        } if (this.minionPoints < 1){ // So here we needed a nested statement in order to work. Facepalm
            undoMinion();
            
 }
}
}
