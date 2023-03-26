package OOP.staticExample;

// outer classes cannot be static
public class InnerClasses {

    // dep on the class and not on the obj of that clss - when static
    // func main and Test can have instances of each other
    // static na only for the static main to access this class; inside members are not static
    static class Test{

        // if name is static na -> op -> Devi Devi 
        static String name;

        public Test(String name) {
            this.name = name;
        }

        // if toString() present
        @Override // annotations
        public String toString() {
            return "YOO";
        }
    }

    public static void main(String[] args) {
        // error b'coz Test is dependnt on InnerClasses which is instance
        // if Test is static np
        // or if the Test class is outside np - like Test and InnerClasses separately
        // they are objs of Test class
        Test a = new Test("Gayathri");
        Test b = new Test("Devi");

        System.out.println(a.name);
        System.out.println(b.name);

        // prints hashvalue b'coz no toString() in the object
        System.out.println(a);

        // prints YOO b'coz toString() func present in the object
        System.out.println(a);
    }
}
