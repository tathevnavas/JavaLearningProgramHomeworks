package hw2.lfuCache;

public class InvalidSize extends RuntimeException{
    public InvalidSize(String s){
        super(s);
        throw new InvalidSize(s);
    }
}
