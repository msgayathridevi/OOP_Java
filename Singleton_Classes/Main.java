package OOP.Singleton_Classes;

public class Main {
    public static void main(String[] args) {

        // if constructor is private cannot access the constructor
        // Singleton obj = new Singleton();

        // when private constructor
        Singleton obj;
        obj = Singleton.getInstance();

        // only one obj is craeted in the memeory, giving same instance
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object


        // cannot access
        // obj.num;
    }
    
}
