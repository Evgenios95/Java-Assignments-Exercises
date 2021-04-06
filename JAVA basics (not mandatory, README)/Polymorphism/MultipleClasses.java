/**
 * Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
 */
class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats many people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alliens attempt to take over earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Trying to kill beasts and escape the maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

//This class has no plot() method. But still when its generated we see "No plot here". It's because polymorphism gives unique functionality for the class that has inherited from the superclass. Movie has a plot method.  
class ForgetableMovie extends Movie {

    public ForgetableMovie() {
        super("Forgetable Movie");
    }
}

public class MultipleClasses {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + 
            "\n" + "Plot: "  + movie.plot() + "\n--------------------");
        }
    }

    public static Movie randomMovie() {
        // generate a random number in order to select one of those movies randomly.
        // Used casting to transform to int. We multiply by 5 to define the range and
        // then we add 1 because we dont want the range to be from 0 to 4 but from 1 to
        // 5.
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated is: " + randomNumber);
        switch (randomNumber) {
            // it's redundant, peritto, to add breaks, we have returns at first lines.
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();
            default:
                return null;
        }
    }
}