public class Methods {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(-4,3));
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));
        System.out.println("---------------------------------------");

        System.out.println(toMilesPerHour(65));
        System.out.println("---------------------------------------");

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println("---------------------------------------");

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println("---------------------------------------");

        System.out.println(hasEqualSum(5,6,11));
        System.out.println(hasEqualSum(5,6,12));
        System.out.println("---------------------------------------");

        System.out.println(getDurationString(220, 30));
        System.out.println("---------------------------------------");
        System.out.println(getDurationString(3601));
        System.out.println("---------------------------------------");

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        System.out.println("---------------------------------------");

    }

    public static int sumOfNumbers(int num1, int num2){
        int message = 0;
        if ((num1 + num2) >= 0) {
            return num1 + num2;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } return false;
                } return true;
            }

        } return false;
    }

//    private static boolean isLeapYear(int year){
//        if(year >= 1 && year <= 9999){
//            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
//        }
//        return false;
//    }


    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
        String str1 = Double.toString(n1);
        String str2 = Double.toString(n2);
        String lastThree1 = str1.substring(0, Math.min(str1.length(), 4));
        String lastThree2 = str2.substring(0, Math.min(str2.length(), 4));
        System.out.println(lastThree1);
        System.out.println(lastThree2);

//        if (lastThree1.equals(lastThree2)) {
//            return true;
//        } else {
//            return false;
//        }
//    }

        if (Double.parseDouble(lastThree1) == Double.parseDouble(lastThree2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        if (n1 + n2 == n3) {
            return true;
        }
        return false;
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        } else {
//            long hours = Math.floorDiv(minutes , 60);
            long hours = minutes / 60;
            minutes = minutes % 60;

            return String.format("%02d", hours) +"H " + String.format("%02d", minutes) + "M " + String.format("%02d", seconds) + "S" ;

        }
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
//            long minutes = Math.floorDiv(seconds , 60);
            long minutes = seconds / 60;
            seconds = seconds  % 60;
            return getDurationString(minutes, seconds);
        }
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        } else {
            long years = minutes / 525600;
            long remainingMinutes = minutes % 525600;
            long days = remainingMinutes / 1440;
            System.out.println(minutes + " min = " + String.format("%02d", years) +" y " + String.format("%02d", days) + " d");
        }
    }



}

