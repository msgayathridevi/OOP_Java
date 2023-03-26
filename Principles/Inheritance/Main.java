package OOP.Principles.Inheritance;

import java.sql.SQLOutput;

public class Main {

    Main(){
        System.out.println("def main class");
    }

    public static void main(String[] args) {

        /*
        Box box = new Box(4.6, 4.7, 4.8);
        Box box2 = box;
        System.out.println(box.l + " " + box.w + " " + box.h);
        // cannot access child class using parent objs
//        box.weight; // no
         */

        /*
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,5);

        System.out.println(box3.h + " " + box3.weight);
         */

        /*
        // reference type is box
        // obj type boxwight
        Box  box5 = new BoxWeight(1,2,3,4);
        // cannot access the BoxWight properties -> weight no
        System.out.println(box5.w);
         */

        /*
        // no
        // refering child to a parent
        // Mahi is ur(Amar) child.. Amar knwos that --> no
        // Amar is ur(Mahi) dad.. letting know --> yes
        BoxWeight box6 = new Box(); // no
        BoxWeight box6 = new Box(1,2,3,4); // no
        */

        /*
        BoxPrice box = new BoxPrice(5,2,200);
        */

        A a = new A();
        B b = new B();
    }
}
