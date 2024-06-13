package hw3.singleton;

import java.util.Random;

public class User {
    private int id;
    private String name;
    private Random random = new Random();
    public User(String name){
        id = random.nextInt(100);
        this.name = name;
    }

    public User(){}

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
