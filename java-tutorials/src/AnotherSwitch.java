import java.nio.file.FileSystemNotFoundException;

public class AnotherSwitch {

    public static void main(String[] args) {
        char charValue = 'D';
        switch (charValue) {
            case 'A':
                System.out.println("It's alpha");
                break;

            case 'B':
                System.out.println("It's beta");
                break;

            case 'C':
                System.out.println("It's charlie");
                break;

            case 'D':
                System.out.println("It's delta");
                break;

            case 'E':
                System.out.println("It's efexor!");
                break;
            default:
                System.out.println("Bad decision");
        };
    }

}
