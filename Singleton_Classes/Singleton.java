package OOP.Singleton_Classes;

// not allow to call constructor
public class Singleton {
    private int num = 0;

    // only this file accessible
    private Singleton() {

    }

    // instance is not dependent on the obj of the class Singleton, we are not creating an obj for this class, but returning
    private static Singleton instance;

    // func to give instance
    public static Singleton getInstance(){
        // check whether only one opt is craeted or not
        if(instance == null){
            instance = new Singleton(); // constructor can be called b'coz same file though it is private
        }
        
        return instance;
    }
}
