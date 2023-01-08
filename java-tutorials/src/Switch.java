public class Switch {
    public static void main(String[] args) {
        int value = 10;

        switch (value) {
            case 10:
                System.out.println(10);
                break;
            case 12:
                System.out.println(12);
                break;
            case 14:
                System.out.println(10);
                break;
            default:
                System.out.println("Default");
                break;
        }

        char k = 'K';

        switch (k) {
            case 'a' -> System.out.println('a');
            case 'b' -> System.out.println('b');
            case 'c', 'k' -> {
                System.out.println("it's c or k");
            }
            case 'K' -> System.out.println("The Champ is the K!");
            default -> System.out.println("Ahaha");
        }
    }
}
