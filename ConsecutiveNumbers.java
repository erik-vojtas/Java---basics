import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveNumbers {
//    Create a function that determines whether elements in an array
//    can be re-arranged to form a consecutive list of numbers where
//    each number appears exactly once.

//    cons([5, 1, 4, 3, 2]) ➞ true, can be re-arranged to form [1, 2, 3, 4, 5]
//    cons([5, 1, 4, 3, 2, 8]) ➞ false
//    cons([5, 6, 7, 8, 9, 9]) ➞ false, 9 appears twice

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 4, 3, 2, 6,};
        int[] arr2 = {5, 1, 4, 3, 2, 8};
        int[] arr3 = {5, 6, 7, 8, 9, 9};
        System.out.println(cons(arr1));
        System.out.println(cons(arr2));
        System.out.println(cons(arr3));
    }

    public static boolean cons(int[] arr) {
//        // 1. quick solution
//        Arrays.sort(arr);
//        return (arr[arr.length - 1] - arr[0]) == (arr.length - 1);

        // 2. solution
        // check duplicates
        Set<Integer> setOfInt = new HashSet<Integer>();
        for (int n : arr) {
            if (!setOfInt.contains(n)) {
                setOfInt.add(n);
            } else {
                return false;
            }
        }

        // check consecutive numbers between min and max value
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        boolean found = false;
        for (int i=min+1; i < max; i++) {
            for (int n: arr) {
                if (i == n) {
                    found = true;
                    break;
                } else {
                    found = false;
                }

            }
        }
        return found;
    }

    }


}
