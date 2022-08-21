import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        double randomNumber = Math.random();
        int randomNumberBetween0And1100 = (int) (randomNumber * 1100 + 1);
        int userNumber;
        boolean flag = true;
        System.out.println("I have randomly chosen a number between 1 and 1100");
        System.out.println("Try to guess it.");
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            userNumber = scanner.nextInt();
            if (randomNumberBetween0And1100 == userNumber) {
                System.out.println("Correct ... You Win!");
                flag = false;
            } else if (randomNumberBetween0And1100 > userNumber) {
                System.out.println("It's larger than " + userNumber);
            } else {
                System.out.println("It's smaller than " + userNumber);
            }

        }
    }
}
