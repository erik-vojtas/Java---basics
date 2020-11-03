public class BasicCalculator {
//    Create a function that takes two numbers and a mathematical operator + - / * and will perform
//    a calculation with the given numbers.
//
//    calculator(2, '+', 2) ➞ 4
//    calculator(2, '*', 2) ➞ 4
//    calculator(4, '/', 2) ➞ 2
//    If the input tries to divide by 0, return 0.

    public static void main(String[] args) {
        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '*', 2));
        System.out.println(calculator(4, '/', 2));
        System.out.println(calculator(4, '/', 0));
        System.out.println(calculator(4, '-', 2));
    }

    public static int calculator(int num1, char sign, int num2) {
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '/':
                if (num2 == 0) {
                    return 0;
                } else {
                    return num1 / num2;
                }
            case '*':
                return num1 * num2;
        }
        return 0;
    }

}
