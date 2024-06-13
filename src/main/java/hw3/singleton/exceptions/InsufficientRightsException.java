package hw3.singleton.exceptions;

import hw3.singleton.User;

public class InsufficientRightsException extends RuntimeException{
    public InsufficientRightsException(User user, String str){
        super(str);
        System.out.println(String.format("Insufficient rights for %s to access %s", user.getName(), str));
    }
}