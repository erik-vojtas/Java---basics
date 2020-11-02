import java.util.Arrays;

public class ArraySum {

//    Write a function that finds the sum of an array. Make your function recursive.
//    sum([1, 2, 3, 4]) ➞ 10
//    sum([1, 2]) ➞ 3
//    sum([1]) ➞ 1
//    sum([]) ➞ 0



    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,};
        int[] array3 = {1,2,};
        int[] array4 = {1,};
        int[] array5 = {};
        System.out.println(sum(array1));
        System.out.println(sum(array2));
        System.out.println(sum(array3));
        System.out.println(sum(array4));
        System.out.println(sum(array5));
    }


    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }

    }

}
