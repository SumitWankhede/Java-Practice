package com.sumit;

/**
 * Created by Sumit on 27-Jun-17.
 */

class Movies{
    private String name;

    public Movies(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Batman extends Movies{
    public Batman() {
        super("Batman");
    }

    @Override
    public String plot() {
        return "An orphan kid becomes a crime fighting superhero ";
    }
}

class Cars extends Movies{
    public Cars() {
        super("Cars");
    }

    @Override
    public String plot() {
        return "Its a animated movie about racing cars.";
    }
}

class Mummy extends Movies{
    public Mummy() {
        super("Mummy");
    }

    @Override
    public String plot() {
        return "Old buried mummy comes back to rule the world.";
    }
}

class Forgetable extends Movies{
    public Forgetable() {
        super("Forgetable");
    }

    // no plot method
}

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movies movie = randomMovie();
            System.out.println("Movie # " + i + " " + movie.getName() + "\n"
                                + "Plot: " + movie.plot());
        }
    }

    public static Movies randomMovie(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Generated random number is: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Batman();
            case 2:
                return new Cars();
            case 3:
                return new Mummy();
            case 4:
                return new Forgetable();
        }
        return null;
    }
}
