package day6;

public class OverloadingCase2 {
    public void m2(String s) {
        System.out.println("String version");
    }

    public void m2(Object o) {
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        OverloadingCase2 c = new OverloadingCase2();

        c.m2(new Object()); 
        c.m2("Vinay");
        c.m2(null); // This will call the String version because String is more specific than Object
    }
}
