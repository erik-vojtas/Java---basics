public class SevenBoom {

//    Create a function that takes an array of numbers and return "Boom!" if the number 7 appears in the array. Otherwise, return "there is no 7 in the array".

//    sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
//    sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
//    sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {8, 6, 33, 100};
        int[] arr3 = {2, 55, 60, 97, 86};

        System.out.println(sevenBoom(arr1));
        System.out.println(sevenBoom(arr2));
        System.out.println(sevenBoom(arr3));


    }

    public static String sevenBoom(int[] arr) {
        for(int n: arr) {
            if (n == 7) {
                return "Boom!";
            }
            String strNum = String.valueOf(n);
            for(int i=0; i<strNum.length(); i++) {
                if(String.valueOf(strNum.charAt(i)).contains("7")) {
                    return "Boom!";
                }
            }
        }
        return "there is no 7 in the array";
    }

}
