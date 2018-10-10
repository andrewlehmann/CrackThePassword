import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drew on 10/9/2018.
 */
class Solver {
    String solve(int passwordLength) {
        List<String> permutations = getNonOverlappingPermutations(passwordLength);

        return buildFinalAnswer(permutations);
    }

    private String buildFinalAnswer(List<String> strings) {
        String finalAnswer = "";

        for (String string : strings) {
            if (!finalAnswer.contains(string)) {
                finalAnswer = finalAnswer + string;
            }
        }

        return finalAnswer;

    }

    private List<String> getNonOverlappingPermutations(int length) {
        if (length < 1) {
            return new ArrayList<>();
        }

        return getPermutations(length);
    }

    private List<String> getPermutations(int length) {
        List<String> numbers = new ArrayList<>();

        for (int i = 1; i < ((int) Math.pow(10, length)); i++) {
            numbers.add(
                String.format("%" + length + "s", i).replace(' ', '0'));
        }

        return numbers;


    }
}
