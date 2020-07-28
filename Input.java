import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name + ", how are you doing?");
//        scanner.close();

        System.out.println("-------------------------------------------------");

//        UserInputChallenge();

        System.out.println("-------------------------------------------------");

        System.out.println(MinMaxChallenge());

        System.out.println("-------------------------------------------------");


    }


    public static int UserInputChallenge() {
        Scanner myScanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = myScanner.hasNextInt();
            if (hasNextInt) {
                int inputNum = myScanner.nextInt();
                sum += inputNum;
                count++;
            } else {
                System.out.println("Wrong input...");
            }
            myScanner.nextLine(); // handle end of line (enter key)
        }
        myScanner.close();
        System.out.println("Sum of all your numbers = " + sum);
        return sum;
    }

    public static String MinMaxChallenge() {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter a number #: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int inputNum = scanner.nextInt();
                if (first) {
                    minNum = inputNum;
                    maxNum = inputNum;
                    first = false;
                }
                if (minNum > inputNum) {
                    minNum = inputNum;
                }
                if (maxNum < inputNum) {
                    maxNum = inputNum;
                }
            } else {
                System.out.println("Wrong input...");
                break;
            }
            scanner.nextLine();

        }
        scanner.close();
        return "Min Value = " + String.valueOf(minNum) + ", Max Value = " + String.valueOf(maxNum);
    }




}
