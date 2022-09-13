public class Homework3 {

    public static void main(String[] args) {
        int numbersDesc = 50;
        for (int i = 50; i <= numbersDesc; i -= 5) {
            System.out.println(i);
            if (i == 0) {
                System.out.println("STOP");
                break;
            }

//            for (int i = 50; i >= 0; i -= 5) {
//                System.out.println(i);
//            }
        }
    }
}