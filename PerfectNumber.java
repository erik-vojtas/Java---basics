public class PerfectNumber {

//    Create a function that tests whether or not an integer
//    is a perfect number. A perfect number is a number
//    that can be written as the sum of its factors,
//    (equal to sum of its proper divisors) excluding
//    the number itself.
//    For example, 6 is a perfect number,
//    since 1 + 2 + 3 = 6, where 1, 2, and 3 are all
//    factors of 6. Similarly, 28 is a perfect number,
//    since 1 + 2 + 4 + 7 + 14 = 28.

//    checkPerfect(6) ➞ true
//    checkPerfect(28) ➞ true
//    checkPerfect(496) ➞ true
//    checkPerfect(12) ➞ false
//    checkPerfect(97) ➞ false

    public static void main(String[] args) {
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
    }

    public static boolean checkPerfect(int num) {
        int sum = 0;
        if ((num > 0) && (num == (int)(num))) {

            int temp = num -1;
            while (temp != 0) {
                if (num % temp == 0) {
                    sum += temp;
                }
                temp -= 1;

            }
        }
        if (num == sum) {
            return true;
        }
        return false;
    }

}
