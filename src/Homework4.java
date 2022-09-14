public class Homework4 {
    public static void main(String[] args) {
        // Write a loop, that will replace all letters o in the sentence with 0
        String str = "Lollipop!";
        String newString = "";
        int index = 0;
        while (index < str.length()) {
            char x = str.charAt(index);
            if (x == 'o') {
                newString = newString + 0;
            } else {
                newString = newString + x;
            }
            index++;
        }
        System.out.println(newString);
    }
}