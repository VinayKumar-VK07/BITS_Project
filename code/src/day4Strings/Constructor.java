package day4Strings;

public class Constructor {
    public static void main(String[] args) {
        char[] ch = {'V', 'I', 'N', 'A', 'Y'};
        String s1 = new String(ch);

        byte[] b = {65, 66, 67, 68, 69};
        String s2 = new String(b);

        System.out.println(s1 + " " + s2);

        String s = "java programming";

        s = s.replace('j', 'l');
        System.out.println(s);

        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 7));

        String str1 = "java";
        String str2 = str1.toString();
        String str3 = str1.toLowerCase();
        String str4 = str1.toUpperCase();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);

        String st = new String("java");
        st = st.concat(" programming");
        System.out.println(st);

        String st1 = " ";
        st1 = st1.trim();
        System.out.println(st1.equals(" ")+ " "+ st1.isEmpty());

        StringBuffer sb = new StringBuffer();
        sb.append("123456781234562345678765456789");

        System.out.println(sb.capacity() + " " + sb.length());

    }
}
