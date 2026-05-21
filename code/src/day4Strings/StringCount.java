package day4Strings;

public class StringCount {
    public static void main(String[] args) {
        String input = "Hello World! 123";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}
