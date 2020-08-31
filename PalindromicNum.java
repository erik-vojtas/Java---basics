public class PalindromicNum {

    public static void main(String[] args) {
        PalindromicNum(121);
        PalindromicNum(321);

    }

    public static boolean PalindromicNum(int num) {
        int original_num = num;
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original_num == reversed) {
            System.out.println(original_num + " is Palindromic number.");
            return true;
        }
    System.out.println(original_num + " is not Palindromic number.");
    return false;
    }

}
