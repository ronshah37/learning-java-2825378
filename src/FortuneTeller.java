import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);

        int inputNumber = input.nextInt();
        if(inputNumber < 5) {
            System.out.println("Enjoy the goodluck a friend brings to you.");
        } else {
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
