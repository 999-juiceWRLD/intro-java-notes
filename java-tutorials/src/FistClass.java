public class FistClass {
    public static void main(String[] args) {
        System.out.println("This is the fist class, not first!");

        double myFirstValue = 20.00D;
        double mySecondValue = 80.00D;

        double newVal = myFirstValue + mySecondValue;
        System.out.println("Result is " + newVal);

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score is less than 5000");
        } else if (levelCompleted > 5) {
            System.out.println("Not bad");
        } else {
            System.out.println("Got here");
        }

        calculateScore(10, 3);
    }

    public static void calculateScore(int number1, int number2) {
        System.out.println("The sum is: " + (number1 + number2));
    }
}
