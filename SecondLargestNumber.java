import java.util.Arrays;

public class SecondLargestNumber {

//    Write a function that takes an array of numbers and returns the second largest number.
//    secondLargest([10, 40, 30, 20, 50]) ➞ 40
//    secondLargest([25, 143, 89, 13, 105]) ➞ 105
//    secondLargest([54, 23, 11, 17, 10]) ➞ 23
    
    public static void main(String[] args) {
        int[] arr1 = {10, 40, 30, 20, 50, 50};
        int[] arr2 = {25, 143, 89, 13, 105};
        int[] arr3 = {54, 23, 11, 17, 10};
        System.out.println(secondLargest(arr1));
        System.out.println(secondLargest(arr2));
        System.out.println(secondLargest(arr3));
    }
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int n1 = 1;
        while (arr[arr.length - n1] == arr[arr.length - (n1+1)]) { //iterate over until two largest digits are different
            n1 += 1;
        }
        return (arr[arr.length - (n1 + 1)]);
    }


}




