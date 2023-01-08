public class SecondClassLol {
    public static void main(String[] args) {
        System.out.println("This is the second class");

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10_000, 8, 200);
        int age = calculateAge(2003);
        System.out.println(age);
    }
    public static void calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final score is: " + finalScore);
        }
    }
    public static int calculateAge(int birthYear) {
        return (2023 - birthYear);
    }
}
