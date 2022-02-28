package src.recursion;

public class StringReversal {
    public String strReversal(String input) {
        if(input.equals("")) {
            return "";
        }

        return strReversal(input.substring(1)) + input.charAt(0);
        /*
         The charAt() method returns the character at the specified index in a string.
         The index of the first character is 0, the second character is 1, and so on.
         substring()	Returns a new string which is the substring of a specified string
         The equals() method compares two strings, and returns true if the strings are equal, and false if not.
         */
    }


    public static void main(String[] args) {
        StringReversal str = new StringReversal();
        String a = str.strReversal("Hello World");
        System.out.println(a);
    }

}
