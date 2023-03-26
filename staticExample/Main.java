package OOP.staticExample;

public class Main {
    public static void main(String[] args) {
        /*
        Human g3 = new Human(20, "Gayathri", 10000, false);
        Human dv = new Human(21, "Devi", 20000, true);
        Human arpit = new Human(34, "Arpit", 15000, true);


        System.out.println(g3.population); // 2
        System.out.println(dv.population); // 2
        System.out.println(arpit.population); // 3
        System.out.println(Human.population); // good convention
         */

        System.out.println(Human.population);

        // greeting(); // error
    }

    static void fun(){
        // greeting(); // no
        // Main.greeting(); // no
        //  requires a instance but this func is not dependent on instance(static)

        Main obj = new Main();
        obj.greeting(); // yes
    }
    
    // we know obj for fun2 will be created
    // the obj will be taken for inside non-static methods/members
    void fun2(){
        greeting(); // fine
    }

    // belongs to an obj, b'coz this can have instance which static variables cannot
    // depends on object
    void greeting() {
        System.out.println("Hello y'all!!");
        fun(); // static inside a non-static -> yes
    }
}
