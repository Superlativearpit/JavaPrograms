package src.recursion;

public class Decimal2Binary {
    public static String findBinary (int decimal, String result) {
        if(decimal == 0)
            return result;

            result = decimal % 2 + result;
            return findBinary(decimal/ 2, result);
    }

    public static void main(String[] args) {
        String Binary = Decimal2Binary.findBinary(233, "");
    }
}
