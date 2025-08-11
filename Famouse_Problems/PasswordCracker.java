import java.util.*;

public class PasswordCracker {
    static List<String> generatePasswords(
            char[] possibleChars,
            int length,
            List<Character> mustContain,
            List<Character> mustNotContain,
            Map<Integer, Character> fixedPositions,
            Map<Integer, Character> wrongPositions) {

        List<String> results = new ArrayList<>();
        generate("", possibleChars, length, mustContain, mustNotContain, fixedPositions, wrongPositions, results);
        return results;
    }

    static void generate(String current, char[] possibleChars, int length,
                         List<Character> mustContain,
                         List<Character> mustNotContain,
                         Map<Integer, Character> fixedPositions,
                         Map<Integer, Character> wrongPositions,
                         List<String> results) {

        if (current.length() == length) {
            // Must contain all required chars
            for (char c : mustContain) {
                if (current.indexOf(c) == -1) return;
            }
            // Must NOT contain forbidden chars
            for (char c : mustNotContain) {
                if (current.indexOf(c) != -1) return;
            }
            // Check fixed positions
            for (Map.Entry<Integer, Character> e : fixedPositions.entrySet()) {
                if (current.charAt(e.getKey()) != e.getValue()) return;
            }
            // Check wrong positions
            for (Map.Entry<Integer, Character> e : wrongPositions.entrySet()) {
                if (current.charAt(e.getKey()) == e.getValue()) return;
            }
            results.add(current);
            return;
        }

        for (char c : possibleChars) {
            generate(current + c, possibleChars, length, mustContain, mustNotContain, fixedPositions, wrongPositions, results);
        }
    }

    public static void main(String[] args) {
        char[] possibleChars = {'A', 'B', 'C', 'D', 'E'};
        int length = 5;

        List<Character> mustContain = Arrays.asList('A', 'D');
        List<Character> mustNotContain = Arrays.asList('C');

        // Fixed position: index 0 must be 'B'
        Map<Integer, Character> fixedPositions = new HashMap<>();
        fixedPositions.put(0, 'B');

        // Wrong position: index 1 cannot be 'A'
        Map<Integer, Character> wrongPositions = new HashMap<>();
        wrongPositions.put(1, 'A');

        List<String> passwords = generatePasswords(possibleChars, length, mustContain, mustNotContain, fixedPositions, wrongPositions);
        System.out.println("Possible passwords: " + passwords);
    }
}
