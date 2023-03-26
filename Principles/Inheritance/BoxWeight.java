package OOP.Principles.Inheritance;

public class BoxWeight extends Box{

    // all properties of Box included
    // u can define ur own properties as well
    double weight;

    public BoxWeight() {
        this.weight = -1;
        this.w = 2; // np
//        h = 3;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
        System.out.println("box wt 2 param const");
    }

    public BoxWeight(double l, double h, double w, double weight) {


        // call the parent class constructor
        // used to intialize values present in the parent class
        // super values are intialized by parent class
        super(l, h, w);

        System.out.println("BoxWeight class constructor");

        // for accessing
//        super.h; // can use like this keyword

        this.weight = weight;

        System.out.println(this.w);
//        System.out.println(super.weight);
    }

    // copy constructor
    // BoxWeight type -> anga receive aguradhu Box type
    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }
}
