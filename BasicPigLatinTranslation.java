public class BasicPigLatinTranslation {

//    Create a function that takes a string of words and moves the first letter of each word to the end of it,
//    then adds "ay" to the end of the word. This is called "Pig Latin" and it gets more complicated than
//    the rules in this particular challenge.
//    I've intentionally kept things simple, otherwise this would turn into an extremely tedious challenge.
//    Move the first letter of each word to the end of the word.
//            Add "ay" to the end of the word.
//    Words starting with a vowel (A, E, I, O, U) simply have "WAY" appended to the end.

//    pigLatin("Cats are great pets.")
//➞ "Atscay areway reatgay etspay."
//    pigLatin("Tom got a small piece of pie.")
//➞ "Omtay otgay away allsmay iecepay ofway iepay."
//    pigLatin("He told us a very exciting tale.")
//➞ "Ehay oldtay usway away eryvay excitingway aletay."
//    Notes
//    Be sure to preserve proper capitalization and punctuation.

    public static void main(String[] args) {
        System.out.println(pigLatin("Cats are great pets."));
        System.out.println(pigLatin("Tom got a small piece of pie."));
        System.out.println(pigLatin("He told us a very exciting tale."));
        System.out.println(pigLatin("Hurry!")); //Urryhay!
    }

    public static String pigLatin(String str) {
        String finalStr = "";
        String punct = str.substring(str.length()-1, str.length());
        String updatedStr = str.substring(0, str.length()-1);
        String[] arrOfStrings = updatedStr.split(" ");
        int c = 1;
        for (String s: arrOfStrings) {
            if (arrOfStrings.length == 1) {
                if (s.substring(0,1).toLowerCase().equals("a")|| s.substring(0,1).toLowerCase().equals("e") || s.substring(0,1).toLowerCase().equals("i") || s.substring(0,1).toLowerCase().equals("o") || s.substring(0,1).toLowerCase().equals("u")) {
                    finalStr += s.substring(0, s.length()) + "way" + punct;
                } else {
                    finalStr += s.substring(1, 2).toUpperCase() + s.substring(2, s.length()) + s.substring(0, 1).toLowerCase() + "ay" + punct;
                }
                return finalStr;
            }
            if (s.substring(0,1).toLowerCase().equals("a")|| s.substring(0,1).toLowerCase().equals("e") || s.substring(0,1).toLowerCase().equals("i") || s.substring(0,1).toLowerCase().equals("o") || s.substring(0,1).toLowerCase().equals("u")) {
                if (c == 1) {
                    finalStr += s.substring(0, 1).toUpperCase() + s.substring(1, s.length()) + "way ";
                } else if (c == arrOfStrings.length) {
                    finalStr += s.substring(0, s.length()) + "way" + punct;
                } else {
                    finalStr += s.substring(0, s.length()) + "way ";
                }
            } else {
                if (c == 1) {
                    finalStr += s.substring(1, 2).toUpperCase() + s.substring(2, s.length()) + s.substring(0, 1).toLowerCase() + "ay ";
                } else if (c == arrOfStrings.length) {
                    finalStr += s.substring(1, s.length()) + s.substring(0, 1) + "ay" + punct;
                } else {
                    finalStr += s.substring(1, s.length()) + s.substring(0, 1) + "ay ";
                }
            }

            c += 1;
        }
        return finalStr;
    }

}
