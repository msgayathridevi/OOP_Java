package OOP.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population;

    public Human(){
    }

    static void message() {
        System.out.println("meaow..!!");
        // System.out.println(this.age); // no, 'this' only when using objects
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

//        whenever object created count population
//        population variable common to all objects not specifically this object,
//        so replace thi  -> class_name

//        this.population++; // this also same result
        Human.population++;

        Human.message();
    }

    public static void main(String[] args) {
        
    }


}
