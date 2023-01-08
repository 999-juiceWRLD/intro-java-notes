public class Challenge {
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Bad decision";
        };

        System.out.println("Today is " + dayOfWeek);
    };
    public static void main(String[] args) {
        //
        printDayOfWeek(5);
    }
}
