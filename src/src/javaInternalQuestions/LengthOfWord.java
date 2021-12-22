package src.javaInternalQuestions;

public class LengthOfWord {
    public static void main(String[] args) {
        String[] fruits = { "Guava", "Banana", "Apple", "Papaya", "Melon", "Strawberry"};
        //System.out.println(fruits.length);
        for(int i = 0; i < fruits.length; i++) {
            String a = fruits[i];
            System.out.println(fruits[i]+" - "+a.length());
        }
    }

}