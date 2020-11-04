public class PhoneNumberWordDecoder {

//    Create a program that converts a phone number with letters to one with only numbers.
//            NumberLetter
                //0	none
                //1	none
                //2	ABC
                //3	DEF
                //4	GHI
                //5	JKL
                //6	MNO
                //7	PQRS
                //8	TUV
                //9	WXYZ

//    textToNum("123-647-EYES") ➞ "123-647-3937"
//    textToNum("(325)444-TEST") ➞ "(325)444-8378"
//    textToNum("653-TRY-THIS") ➞ "653-879-8447"
//    textToNum("435-224-7613") ➞ "435-224-7613"

//    All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
//    Check the Resources tab for more info on telephone keypads.

    public static void main(String[] args) {
        System.out.println(textToNum("123-647-EYES"));
        System.out.println(textToNum("(325)444-TEST"));
        System.out.println(textToNum("653-TRY-THIS"));
        System.out.println(textToNum("435-224-7613"));
    }

    public static String textToNum(String phone) {
        String newString = "";
        for (int i = 0; i < phone.length(); i++) {
            if (String.valueOf(phone.charAt(i)).contains("A") || String.valueOf(phone.charAt(i)).contains("B") || String.valueOf(phone.charAt(i)).contains("C")) {
                newString += String.valueOf(2);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("D") || String.valueOf(phone.charAt(i)).contains("E") || String.valueOf(phone.charAt(i)).contains("F")) {
                newString += String.valueOf(3);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("G") || String.valueOf(phone.charAt(i)).contains("H") || String.valueOf(phone.charAt(i)).contains("I")) {
                newString += String.valueOf(4);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("J") || String.valueOf(phone.charAt(i)).contains("K") || String.valueOf(phone.charAt(i)).contains("L")) {
                newString += String.valueOf(5);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("M") || String.valueOf(phone.charAt(i)).contains("N") || String.valueOf(phone.charAt(i)).contains("O")) {
                newString += String.valueOf(6);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("P") || String.valueOf(phone.charAt(i)).contains("Q") || String.valueOf(phone.charAt(i)).contains("R") || String.valueOf(phone.charAt(i)).contains("S")) {
                newString += String.valueOf(7);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("T") || String.valueOf(phone.charAt(i)).contains("U") || String.valueOf(phone.charAt(i)).contains("V")) {
                newString += String.valueOf(8);
                continue;
            } else if (String.valueOf(phone.charAt(i)).contains("W") || String.valueOf(phone.charAt(i)).contains("X") || String.valueOf(phone.charAt(i)).contains("Y") || String.valueOf(phone.charAt(i)).contains("Z")) {
                newString += String.valueOf(9);
                continue;
            }
            newString += String.valueOf(phone.charAt(i));
        }
        return newString;
    }

}
