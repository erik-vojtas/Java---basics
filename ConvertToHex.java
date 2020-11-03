

public class ConvertToHex {
//    Create a function that takes a strings characters as ASCII and returns each characters hexadecimal value as a string.

//    toHex("hello world") ➞ "68 65 6c 6c 6f 20 77 6f 72 6c 64"
//    toHex("Big Boi") ➞ "42 69 67 20 42 6f 69"
//    toHex("Marty Poppinson") ➞ "4d 61 72 74 79 20 50 6f 70 70 69 6e 73 6f 6e"
//    Notes
//    Each byte must be seperated by a space.
//    All alpha hex characters must be lowercase.

    public static void main(String[] args) {
        System.out.println(toHex("hello world"));
//        toHex("Big Boi");
//        toHex("Marty Poppinson");
    }

    public static String toHex(String str) {
         // return str.chars().mapToObj(Integer::toHexString).collect(Collectors.joining(" "));
        String output = ""; // create String output variable
        int i = 0;
        for(char c : str.toCharArray()){
            output += Integer.toHexString((int) c);
            i++;
            if(i<str.length()){
                output +=" ";
            }
        }
        return output;
    }
}



