package programs;
public class FormulaFixer {

    public int fixTheFormula(String input1) {
        // Lists to hold numbers and operators
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        // Parse input string
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }

        // Start calculation from the first number
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            int nextNumber = numbers.get(i + 1);
            char operator = operators.get(i);

            switch (operator) {
                case '+':
                    result += nextNumber;
                    break;
                case '-':
                    result -= nextNumber;
                    break;
                case '*':
                    result *= nextNumber;
                    break;
                case '/':
                    if (nextNumber == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= nextNumber;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operator: " + operator);
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        FormulaFixer fixer = new FormulaFixer();

        String input1 = "Fo+23the3*like2+";
        System.out.println("Output: " + fixer.fixTheFormula(input1)); // Expected: 17

        String input2 = "we8+you2-7to/*32";
        System.out.println("Output: " + fixer.fixTheFormula(input2)); // Expected: 2

        String input3 = "i*-t5s-t8h1e4birds";
        System.out.println("Output: " + fixer.fixTheFormula(input3)); // Expected: 35
    }
}

