import java.util.HashSet;
import java.util.Set;

public class OddOneOut {

//    Write a function that returns true if exactly one word
//    in the array differs in length from the rest. Return false in all other cases.

//    oddOneOut(["silly", "mom", "let", "the"]) ➞ true
//    oddOneOut(["swanky", "rhino", "moment"]) ➞ true
//    oddOneOut(["the", "them", "theme"]) ➞ false
//    oddOneOut(["very", "to", "an", "some"]) ➞ false

    public static void main(String[] args) {
        String[] arr1 = {"silly", "mom", "let", "the"};
        String[] arr2 = {"swanky", "rhino", "moment"};
        String[] arr3 = {"the", "them", "theme"};
        String[] arr4 = {"very", "to", "an", "some"};
        System.out.println(oddOneOut(arr1));
        System.out.println(oddOneOut(arr2));
        System.out.println(oddOneOut(arr3));
        System.out.println(oddOneOut(arr4));
    }

    public static boolean oddOneOut(String[] arr) {
        int countDiff = 0;
        Set<Integer> setOfLengths = new HashSet<>();
        for(String str: arr) {
            if (arr[0].length() != str.length()) {
                countDiff += 1;
            }
            setOfLengths.add(str.length());
        }
        if ((setOfLengths.size() <= 2) && (countDiff == 1 || countDiff == arr.length - 1)) {
            return true;
        }
        return false;
    }

}
