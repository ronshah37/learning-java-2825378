import java.util.Locale;
import java.util.Scanner;

public class MCQ {
    public static void main(String[] args) {
        String question = "In which city is CN Tower?";
        String optionOne = "Vancouver";
        String optionTwo = "Toronto";
        String optionThree = "Mumbai";
        String correctOption = optionTwo;

        System.out.println(question);
        Scanner input = new Scanner(System.in);
        System.out.println("Options are a) " + optionOne +" b) " + optionTwo + " c) " + optionThree + ". Type your answer.");
        String userInput = input.next();

        if(correctOption.toLowerCase().equals(userInput.toLowerCase())) {
            System.out.println("Congratulations!!! Your answer is correct.");
        } else {
            System.out.println("Unfortunately your answer is incorrect. The correct option is "+ correctOption);
        }
    }
}
