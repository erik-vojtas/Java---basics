public class ProductOfDigits {

//    Create a function that takes numbers as arguments, adds them together,
//    and returns the product of digits
//    until the answer is only 1 digit long.
//    sumDigProd(16, 28) ➞ 6
//// 16 + 28 = 44
//// 4 * 4 =  16
//// 1 * 6 = 6
//    sumDigProd(0) ➞ 0
//    sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2
//    Notes
//    The input of the function is at least one number.

    public static void main(String[] args) {
        int[] i = {16,28};
        int[] j = {0};
        int[] k = {1, 2, 3, 4, 5, 6};
        System.out.println(sumDigProd(i));
        System.out.println(sumDigProd(j));
        System.out.println(sumDigProd(k));

    }

    public static long sumDigProd(int[] nums) {
        int sum = 0;
        for(int n: nums) {
            sum += n;
        }
        if (sum == 0) {
            return 0;
        }
        // System.out.println("sum = " + sum);
        String strSum = String.valueOf(sum);
        int sumDigProd = 1;
        while(strSum.length() > 1) {
            sumDigProd = 1;
            for(int i = 0; i < strSum.length(); i++) {
                sumDigProd *= Integer.parseInt(String.valueOf(strSum.charAt(i)));
            }
            // System.out.println("strSum = " + strSum);
            strSum = String.valueOf(sumDigProd);
        }
        return sumDigProd;
    }

}
