class abc{
    public 
    void h1(){
        System.out.println("Hello, you have called h1. ");
    }
}

class xyz{
    public 
    void h2(){
        System.out.println("Hello, you have called h2. ");
    }
}

public class Class_Creation {
    public static void main(String[] args) {
        abc o1 = new abc();
        xyz o1 = new xyz();
        o1.h1();
        o1.h2();
    }
}
