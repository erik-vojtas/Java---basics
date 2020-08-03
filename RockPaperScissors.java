import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        startGame();

    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        playGame(name);
    }


    public static void playGame(String name) {
        System.out.println("Hi " + name + "!" + "\n" +"1 - Rock, 2 - Paper, 3 - Scissors, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int max = 3;
        int min = 1;
        int range = (3 - 1) + 1;
        int computersInput = (int)(Math.random() * range) + 1;
        int playersInput = scanner.nextInt();
        if (playersInput == computersInput) {
            System.out.println("Draw");
        } else if (playersInput == 1 && computersInput == 2) {
            System.out.println(name + ", you have lost!");
        } else if (playersInput == 1 && computersInput == 3) {
            System.out.println(name + ", you have won!");
        } else if (playersInput == 2 && computersInput == 1) {
            System.out.println(name + ", you have won!");
        } else if (playersInput == 2 && computersInput == 3) {
            System.out.println(name + ", you have lost!");
        } else if (playersInput == 3 && computersInput == 1) {
            System.out.println(name + ", you have lost!");
        } else if (playersInput == 3 && computersInput == 2) {
            System.out.println(name + ", you have won!");
        }
        showMenuOfGame(name);
    }


    public static void showMenuOfGame(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 - quit, 1 - play again, enter a number: ");
        int playQuit = scanner.nextInt();
        if (playQuit == 0) {
            System.out.println("Game is quiting...");
        } else if (playQuit == 1) {
            playGame(name);
        }
    }

}
