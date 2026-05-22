package day4Strings;

public class StringLength {
    public static void main(String[] args) {
        String s1 = "Vinay";
        System.out.println(s1.length());

        StringBuffer sb = new StringBuffer();
        sb.append("Vinay").append("Student").reverse().insert(2, "Java").delete(3,7);
        System.out.println(sb);
    }
}
