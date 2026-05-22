package day5;

public class CountVCDS {
    public static void solution(String s) {
        s = s.toLowerCase();

        String vowels = "aeiou";
        String Decimals = "0123456789";
        String SpecialChars = "!@#$%^&*()_+{}|:\"<>?`~[]\\;',./";

        int vowelsCount = 0;
        int decimalsCount = 0;
        int consonantsCount = 0;
        int specialCharsCount = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(vowels.contains(Character.toString(ch))) {
                vowelsCount++;
            } else if(Decimals.contains(Character.toString(ch))) {
                decimalsCount++;
            } else if(SpecialChars.contains(Character.toString(ch))) {
                specialCharsCount++;
            } else {
                consonantsCount++;
            }
        }
        System.out.println("Count of Vowels: " + vowelsCount);
        System.out.println("Count of Decimals: " + decimalsCount);
        System.out.println("Count of Consonants: " + consonantsCount);
        System.out.println("Count of Special Characters: " + specialCharsCount);
    }

    public static void main(String[] args) {
        String s1 = "aeiouVinay@123$%^ckjvbfd 12345";
        solution(s1);
    }
}
