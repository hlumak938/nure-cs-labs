package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class BurrowsWheelerController {
    public static String ESCAPE_CHARACTER = "$";
    public String encode(String phrase) {
        if (phrase.contains(ESCAPE_CHARACTER)) {
            throw new IllegalArgumentException();
        }
        String basePhrase = phrase + ESCAPE_CHARACTER;
        List<String> rotatedPhrases = new ArrayList<>();
        for (int i = 0; i < basePhrase.length(); i++) {
            rotatedPhrases.add(basePhrase.substring(i) + basePhrase.substring(0,
                    i));
        }
        return rotatedPhrases.stream()
                .sorted()
                .map(str -> str.substring(str.length() - 1))
                .collect(Collectors.joining());
    }
    public String decode(String phrase) {
        if(!phrase.contains(ESCAPE_CHARACTER)) {
            throw new IllegalArgumentException();
        }
        int len = phrase.length();
        List<String> table = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            table.add("");
        }
        for (int j = 0; j < len; ++j) {
            for (int i = 0; i < len; ++i) {
                table.set(i, phrase.charAt(i) + table.get(i));
            }
            table.sort(String::compareTo);
        }
        for (String row : table) {
            if (row.endsWith(ESCAPE_CHARACTER)) {
                return row.substring(0, len - 1);
            }
        }
        return "";
    }
}