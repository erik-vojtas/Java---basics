

public class NoYelling {

//    Create a function that transforms sentences ending with multiple question marks ?
//    or exclamation marks ! into a sentence only ending with one without changing punctuation in the middle of the sentences.
//    noYelling("What went wrong?????????") ➞ "What went wrong?"
//    noYelling("Oh my goodness!!!") ➞ "Oh my goodness!"
//    noYelling("I just!!! can!!! not!!! believe!!! it!!!") ➞ "I just!!! can!!! not!!! believe!!! it!"
// Only change repeating punctuation at the end of the sentence.
//    noYelling("Oh my goodness!") ➞ "Oh my goodness!"
// Do not change sentences where there exists only one or zero exclamation marks/question marks.
//    noYelling("I just cannot believe it.") ➞ "I just cannot believe it."
//    Only change ending punctuation - keep the exclamation marks or question marks in the middle of the sentence the same (see third example).
//    Don't worry about mixed punctuation (no cases that end in something like ?!??!).
//    Keep sentences that do not have question/exclamation marks the same.

    public static void main(String[] args) {

        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));

    }

    public static String noYelling(String sentence) {
        StringBuilder _sb = new StringBuilder("");
        String[] words = sentence.split(" ");
        String lastWord = words[words.length-1];

        for (int i=lastWord.length()-1; i > 0; i--) {
            if (lastWord.charAt(i) == lastWord.charAt(i-1) && ! String.valueOf(lastWord.charAt(i)).matches("[a-zA-Z]+")) {
                continue;
            }
            _sb.insert(0, lastWord.charAt(i));
        }
        _sb.insert(0, lastWord.charAt(0));
        for (int i=words.length-2; i >=0; i--) {
            _sb.insert(0, words[i] + " ");
        }
        return _sb.toString();
    }

}
