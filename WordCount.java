

public class WordCount {

//    Create a method that takes a string and returns the word count. The string will be a sentence.
//    countWords("Just an example here move along") ➞ 6
//    countWords("This is a test") ➞ 4
//    countWords("What an easy task, right") ➞ 5

    public static void main(String[] args) {
        System.out.println(countWords1("Just an example here move along"));
        System.out.println(countWords1("This is a test"));
        System.out.println(countWords1("What an easy task, right"));

        System.out.println("----------------------------");

        System.out.println(countWords2("Just an example here move along"));
        System.out.println(countWords2("This is a test"));
        System.out.println(countWords2("What an easy task, right"));
    }

    // 1. solution
    public static int countWords1(String s) {
        int c = 1;
        for(int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).contains(" ")) {
                c += 1;
            }
        }
        return c;
    }

    // 2. solution

    public static int countWords2(String s) {
        if (!s.isEmpty()) {
            String[] stringArray = s.split(" ");
            return stringArray.length;
        }
        return 0;
    }



}
