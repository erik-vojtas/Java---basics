public class ReverseNumber {

//    Create a function that takes an integer n and reverses it.
//    rev(5121) ➞ "1215"
//    rev(69) ➞ "96"
//    rev(-122157) ➞ "751221"
//    This challenge is about using two operators that are related to division.
//    If the number is negative, treat it like it's positive.


    public static void main(String[] args) {
        System.out.println(rev(5121));
        System.out.println(rev(96));
        System.out.println(rev(-122157));


    }

    public static int rev(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            n = Math.abs(n);
        }
        String stringN = String.valueOf(n);
        String newString = new StringBuilder(stringN).reverse().toString();
        return Integer.parseInt(newString);
    }

}
