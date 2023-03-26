package OOP.staticExample;

// demo of initialization of static variables
public class staticInitialize {
    static int a = 4;
    static int b;

    // automatic run -  only once when class is loaded for the first time
    static {
        System.out.println("inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticInitialize obj = new staticInitialize();
        System.out.println(staticInitialize.a + " " + staticInitialize.b);

        staticInitialize.b += 3;
        System.out.println(staticInitialize.a + " " + staticInitialize.b);

        staticInitialize obj2 = new staticInitialize();
        System.out.println(staticInitialize.a + " " + staticInitialize.b);

    }


}
