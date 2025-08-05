package programs;



public class WordMatcher {

    public static String identifyPossibleWords(String input1, String input2) {
        input1 = input1.toLowerCase();
        String[] candidates = input2.toLowerCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String word : candidates) {
            word = word.trim(); 

            if (word.length() != input1.length()) {
                continue; 
            }

            boolean match = true;
            for (int i = 0; i < input1.length(); i++) {
                char c1 = input1.charAt(i);
                char c2 = word.charAt(i);

                if (c1 == '_') {
                    continue; // Ignore the underscore position
                }

                if (c1 != c2) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0) {
                    result.append(":");
                }
                result.append(word.toUpperCase());
            }
        }

        if (result.length() == 0) {
            return "ERROR-009";
        }

        return result.toString();
    }

     public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer";

        String output = identifyPossibleWords(input1, input2);
        System.out.println(output);  // Output: FILER:FIXER:FIBER
    }
}
