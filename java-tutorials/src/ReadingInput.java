import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int currentYear = 2023;
        String usersDateOfBirth = "2003";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Date of birth: " + dateOfBirth);

        String num = "9.99";
        double numericNum = Double.parseDouble(num);
        System.out.println("Number is: " + numericNum);

        try {
            getInputFromConsole(currentYear);
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Please enter your name: ");
        System.out.println("Hello, " + name + ". Welcome to the club.");
        return "";
    }

    public static String getInputFromScanner(int currentYear) {
        // to use the scanner class, we have to create an instance of it.
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello user. What's your name? - Enter: ");
        String name = myScanner.nextLine();

        System.out.println("Hi, " + name + ". Keep on");
        System.out.println("And the year you were born: ");
        String yearBorn = myScanner.nextLine();
        int newYearBorn = Integer.parseInt(yearBorn);
        newYearBorn = Math.abs(currentYear - newYearBorn);

        System.out.println("You are " + newYearBorn + " years old i suppose");
        return "lol";
    }
}
