public class SwitchForWhileLoops {

    public static void main(String[] args) {

        printDayOfTheWeek(3);
        printDayOfTheWeek(6);
        printDayOfTheWeek(0);
        printDayOfTheWeek(10);
        System.out.println("-------------------------------------------------");

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("-------------------------------------------------");

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(4, 2020));
        System.out.println(getDaysInMonth(4, 2019));
        System.out.println("-------------------------------------------------");

        System.out.println(sumThreeAndFive());
        System.out.println("-------------------------------------------------");

        System.out.println(sumDigits(125));
        System.out.println("-------------------------------------------------");

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(4));

        System.out.println("-------------------------------------------------");
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


        System.out.println("-------------------------------------------------");

        System.out.println(hasSharedDigit(23, 35));
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

        System.out.println("-------------------------------------------------");

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

        System.out.println("-------------------------------------------------");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-2));
        System.out.println(isPerfectNumber(1));

        System.out.println("-------------------------------------------------");

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(100));

        System.out.println("-------------------------------------------------");

        printSquareStart(5);
        printSquareStart(8);

        System.out.println("-------------------------------------------------");


        System.out.println("-------------------------------------------------");
        


    }

    public static void printDayOfTheWeek(int num) {
        switch (num) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Number: " + num + " has not been found!");
                break;
        }
    }


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return 30;
            }
        }
    }

    public static int sumThreeAndFive() {
        int sum = 0;
        int c = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                c += 1;
                if (c == 5) {
                    break;
                }
            }
        }
        return sum;
    }


    public static int sumDigits(int num) {
        int sum = 0;
        if (num < 10) {
            return -1;
        } else {
            while (num > 0) {
                sum += num % 10;
                num = num/10;
            }
        }
        return sum;
    }


    public static boolean isPalindrome(int num) {
        int originalNum = num;
        String newDigit = "";
        num = Math.abs(num);
        while (num > 0) {
            newDigit += num % 10;
            num = num/10;
        }
        if (Integer.parseInt(newDigit) == originalNum) {
            return true;
        }
        return false;
    }


    public static int sumFirstAndLastDigit(int num) {
        int sum = 0;
        int firstDigit = 0;
        String strNum = String.valueOf(num);
        if (num < 0) {
            firstDigit = Integer.parseInt(strNum.substring(0,2));
        } else {
            firstDigit = Integer.parseInt(strNum.substring(0,1));
        }
        int lastDigit = Integer.parseInt(strNum.substring(strNum.length() -1));
        sum += firstDigit + lastDigit;
//        System.out.println(firstDigit + " + " + lastDigit + " = " + sum);
        return sum;
    }

    public static int hasSharedDigit(int n1, int n2) {
        String commonNum = "";
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
            return -1;
        } else {
            String strOne = String.valueOf(n1);
            String strTwo = String.valueOf(n2);
            for (int i = 0; i < strOne.length(); i++) {
                for (int j = 0; j < strTwo.length(); j++) {
                    if (strOne.charAt(i) == strTwo.charAt(j)) {
                        if (!commonNum.contains(String.valueOf(strOne.charAt(i)))) {
                            commonNum += strOne.charAt(i);
                        }
                    }
                }
            }
        }
        return Integer.parseInt(commonNum);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestCommonDivisor = 1;
//        int min = first<second ? first : second;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 2; i < Math.min(first, second); i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
        }
    return greatestCommonDivisor;
    }

//      public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        while (first != second) {
//            if (first > second)
//                first = first - second;
//            else {
//                second = second - first;
//            }
//        }
//        return second;
//    }
//}

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int divisor = 1;
        if (num < 1) {
            return false;
        } else if (num == 1) {
            sum += divisor;
            return sum == num;
        } else {
            while (divisor <= (num/2)) {
                if ((num % divisor) == 0) {
                    sum += divisor;
                }
                divisor ++;
            }
        }
        return sum == num;
    }

    public static int getLargestPrime(int num) {
        int largestPrime = 2;
        if (num < 2) {
            return -1;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                largestPrime = i;
                i--;
            }
        }
        return largestPrime;
    }

    public static void printSquareStart(int num) {
        for(int row = 1; row <= num; row++) {
            System.out.println();
            if (row == 1 || row == num) {
                System.out.print("*".repeat(num));
            }
            for (int column = 1; column <= num; column++) {
                if (row > 1 && row < num) {
                    if (column == 1 || column == num || row == column || column == num - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.println();
    }

}
