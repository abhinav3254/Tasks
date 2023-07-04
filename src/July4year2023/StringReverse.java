package July4year2023;

public class StringReverse {
    public static void main(String[] args) {
        String name = "abhinav";
        reverseString(name);
    }
    public static void reverseString (String name) {
        var newName = "";

        for (int i = name.length()-1; i >= 0; i--) {
            newName = newName+name.charAt(i);
        }
        System.out.println(newName);
    }
}
