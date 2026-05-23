package day6.Is_A;

class A {
    public void m1() {
        System.out.println("Hello from class A");
    }
}

class B {
    public void m2() {
        System.out.println("Hello from class B");
    }
}

// Java won't support multiple inheritance due to ambiguous nature

//class C extends A,B {

// Alternate approach to achieve multiple inheritance is by using interfaces
interface A1 {
    public void m1();
}

interface B1 {
    public void m2();
}

class C implements A1, B1 {
    public void m1() {
        System.out.println("Hello from interface A");
    }

    public void m2() {
        System.out.println("Hello from interface B");
    }
}