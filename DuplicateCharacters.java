import java.util.*;

public class DuplicateCharacters {

    // Create a function that returns the amount of duplicate characters in a string.
    // It will be case sensitive and spaces are included. If there are no duplicates, return 0.

    //    duplicates("Hello World!") ➞ 3
    // "o" = 2, "l" = 3.
    // "o" is duplicated 1 extra time and "l" is duplicated 2 extra times.
    // Hence 1 + 2 = 3
    //
    //    duplicates("foobar") ➞ 1
    //
    //    duplicates("helicopter") ➞ 1
    //
    //    duplicates("birthday") ➞ 0
    // If there are no duplicates, return 0

    public static void main(String[] args) {

        System.out.println(duplicates("Hello World!"));
        System.out.println(duplicates("foobar!"));
        System.out.println(duplicates("helicopter!"));
        System.out.println(duplicates("birthday!"));

    }

    public static int duplicates(String sentence) {
        Set<String> hashSet = new HashSet<String>();
        Map<String, Integer> duplicatesMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (hashSet.contains(String.valueOf(sentence.charAt(i)))) {
                if (duplicatesMap.containsKey(String.valueOf(sentence.charAt(i)))) {
                    int tempValue = duplicatesMap.get(String.valueOf(sentence.charAt(i)));
                    duplicatesMap.put(String.valueOf(sentence.charAt(i)), tempValue + 1);
                } else {
                    duplicatesMap.put(String.valueOf(sentence.charAt(i)), 1);
                }
            } else {
                hashSet.add(String.valueOf(sentence.charAt(i)));
            }
        }
        if (duplicatesMap.size() > 0) {
            int sum = 0;
            for (int n : duplicatesMap.values()) {
                sum  += n;
            }
            return sum;
        } else {
            return 0;
        }

    }

}
