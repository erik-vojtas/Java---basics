import java.util.*;

public class LanguageNouns {


    public static void main(String[] args) {
        Map<String, String> ls = new HashMap<>();


//        getNoun();
    }

    public static void getNoun() {
        Map<String, String> list = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        list.put("die Abhängigkeit", "von,D");
        list.put("die Angst", "vor,D");
        list.put("die Antwort", "auf,A");

        int minimum = 0;
        int maximum = list.size();
        int randomNum = minimum + (int)(Math.random() * maximum);



        for (Map.Entry<String, String> entry : list.entrySet()) {
            boolean correctAnswer = false;
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Add the preposition and case example: von, D: ");
            System.out.println(key);
            while (!correctAnswer) {
                String input = scanner.nextLine();
                input.replaceAll("\\s+","");
                if (value.equalsIgnoreCase(input)) {
                    System.out.println("Correct! Keep going!");
                    correctAnswer = true;
                } else {
                    System.out.println("Try it again, " + key + ": ");
                }
            }

        }


    }


}
