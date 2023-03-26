package OOP.Principles.Inheritance;

public class Class {
    
}

class Box{
    double l, h, w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
        System.out.println("Box def const");
    }

    // cube
    Box (double side) {

        // super(); // Object class
        this.w = side;
        this.l = side;
        this.h = side;
        System.out.println("box 1 param const");
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    // what u receive here is box type
    Box (Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void info(){
        System.out.println("Running the box");
    }
}
