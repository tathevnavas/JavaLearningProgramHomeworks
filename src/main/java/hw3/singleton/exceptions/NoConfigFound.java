package hw3.singleton.exceptions;

import hw3.singleton.User;

public class NoConfigFound extends RuntimeException{
    public NoConfigFound(User user){
        super();
        System.out.println(String.format("No config found for %s", user.getName()));
    }
}
