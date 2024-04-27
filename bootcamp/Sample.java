import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        String input = "synchronous";
        String result = Sample(input);
        System.out.println("Original String: " + input);
        System.out.println("String with Duplicate Vowels Removed: " + result);
    }

    public static String Sample(String input) {
        if (input == null) {
            return null;
        }

        
        HashSet<Character> uniqueVowels = new HashSet<>();
        
        
        StringBuilder result = new StringBuilder();

       
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            
            if (vowels.contains(String.valueOf(currentChar))) {
                
                if (!uniqueVowels.contains(currentChar)) {
                    uniqueVowels.add(currentChar);
                    result.append(currentChar);
                }
            } else {
                
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
