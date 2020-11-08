public class ValidateCreditCardNumber {

//    Create a function that takes a number as an argument and returns true if the number is a valid credit card number, false otherwise.
//    Credit card numbers must be between 14-19 digits in length, and pass the Luhn test, described below:
//    Remove the last digit (this is the "check digit").
//    Reverse the number.
//    Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).
//    Add all digits.
//    Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.

//    validateCard(1234567890123456) ➞ false
//
//// Step 1: check digit = 6, num = 123456789012345
//// Step 2: num reversed = 543210987654321
//// Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
//// Step 4: sum = 58
//// Step 5: 10 - 8 = 2 (not equal to 6) ➞ false
//
//    validateCard(1234567890123452) ➞ true



    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123456L));
        System.out.println(validateCard(1234567890123452L));
        System.out.println(validateCard(1234567890123456L));
        System.out.println(validateCard(4508793361140566L));
        System.out.println(validateCard(709092739800713L));
        System.out.println(validateCard(5496683867445267L));


    }

    public static boolean validateCard(long num) {
        String nStr = String.valueOf(num);
        if (nStr.length() > 19 || nStr.length() < 14 ) {
            return false;
        }
        String nStr1 = nStr.substring(0, nStr.length()-1);
        int checkDigit = Integer.parseInt(nStr.substring(nStr.length()-1));
        String nStr2 = new StringBuilder(nStr1).reverse().toString();
        String nStr3 = "";
        for (int i = 0; i < nStr2.length(); i++) {
            if ((i+1) % 2 != 0) {
                int doubledInt = Integer.parseInt(String.valueOf(nStr2.charAt(i))) * 2;
                if (doubledInt > 9) {
                    int firstDigit = doubledInt/10;
                    int lastDigit = doubledInt % 10;
                    nStr3 += String.valueOf(firstDigit + lastDigit);
                } else {
                    nStr3 += String.valueOf(doubledInt);
                }
            } else {
                nStr3 += String.valueOf(nStr2.charAt(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < nStr3.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nStr3.charAt(i)));
        }
        int finalDigit = 10 - (sum % 10);
        if (finalDigit == checkDigit) {
            return true;
        } else {
            return false;
        }
    }

}
