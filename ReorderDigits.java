import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReorderDigits {

    // Create a function that reorders the digits of each numerical element in an array based
    // on ascending (asc) or descending (desc) order.

    //Notes
    //Single-digit numbers should be ordered the same regardless of direction.
    //Numbers in the array should be kept the same order.

    public static void main(String[] args) {

        System.out.println(reorderDigits(Arrays.asList(515, 341, 98, 44, 211), "asc"));
        System.out.println(reorderDigits(Arrays.asList(515, 341, 98, 44, 211), "desc"));
        System.out.println(reorderDigits(Arrays.asList(63251, 78221), "asc"));
        System.out.println(reorderDigits(Arrays.asList(63251, 78221), "desc"));
        System.out.println(reorderDigits(Arrays.asList(1, 2, 3, 4), "asc"));
        System.out.println(reorderDigits(Arrays.asList(1, 2, 3, 4), "desc"));

    }

    public static List<Integer> reorderDigits(List<Integer> nums, String direction) {
        if (direction.equals("asc")) {
            Collections.sort(nums);
        } else if (direction.equals("desc")) {
            Collections.reverse(nums);
        }
        return nums;
    }

}
