package day6;

class A {
    public void m1() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    public void m2() {
        System.out.println("Hello from class B");
    }
}

public class Demo {
    public static void main(String[] args) {

        // case 1
        A a = new A();
        a.m1();
        //a.m2(); // This will cause a compile-time error because m2() is not defined in class A

        // case 2
        B b = new B();
        b.m1(); // This will work because class B inherits from class A
        b.m2();

        // case 3
        A a1 = new B(); // This is called upcasting, where a reference of type A is used to refer to an object of type B
        a1.m1();

        // case 4
        //B b1 = new A(); // This will cause a compile-time error because class A is not a subclass of class B
    }
}