package day4Strings;

public class Demo {
    public static void main(String[] args) {
        String s1 = new String("Vinay");
        String s2 = new String("Vinay");

        StringBuffer sb1 = new StringBuffer("Vinay");
        StringBuffer sb2 = new StringBuffer("Vinay");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String s = new String("Vinay");
        s.concat("Trainer");
        s = s.concat("Developer");
        System.out.println(s);
    }
}
