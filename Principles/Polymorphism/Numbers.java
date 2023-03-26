package OOP.Principles.Polymorphism;

public class Numbers {
    int sum(int a, char b){
        return a+b;
    }

    int sum(char b,  int a){
        return a+b;
    }

    int sum(int a, int b){
        return a+b;
    }

//    int sum(int a, int b){
    int sum(int a, int b, int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
//        obj.sum(); // no default method
        obj.sum(1,'c');
        obj.sum('c',1);
        obj.sum(1,1);
        obj.sum(1,2,3);
//        obj.sum(1,2,3, 4); // error



    }
}
