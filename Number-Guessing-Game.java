import javax.swing.*;

public class NumberGuessingGame {
    public static void main (String[] args) {
        int rangeNumber = (int) (Math.random() * 100 + 1); //Add 1 to change the range to 1 - 100 instead of 0 - 99
        int enterNumber = 0;

        System.out.println("The No. can be: " + rangeNumber);
        int count = 1;

            while (rangeNumber != enterNumber) {
                String box = JOptionPane.showInputDialog(null,
                        "Please guess the No. between 1 to 100", "Number Guessing Game", 3);

                enterNumber = Integer.parseInt(box);
                JOptionPane.showInputDialog(null, "" + determineNoGuess(rangeNumber, enterNumber, count));

                count++;
            }
        }

        public static String determineNoGuess ( int rangeNumber, int enterNumber, int count){
        if (enterNumber <= 0 || enterNumber > 100) {
            return "Your guess no is not found";
        } else if (enterNumber == rangeNumber) {
            return "You're correct!\nTotal guesses: " + count;
        } else if (enterNumber < rangeNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        } else if (enterNumber > rangeNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        } else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
