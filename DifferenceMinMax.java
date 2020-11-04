public class DifferenceMinMax {

//    Create a function that takes an array and returns the difference between the biggest and smallest numbers.

//    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
//// Smallest number is -50, biggest is 32.
//    differenceMaxMin([44, 32, 86, 19]) ➞ 67
//// Smallest number is 19, biggest is 86.

    public static void main(String[] args) {
        int[] arr1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] arr2 = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(arr1));
        System.out.println(differenceMaxMin(arr2));

    }

    public static int differenceMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n: arr) {
            if(n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return Math.abs(min - max);
    }

}
