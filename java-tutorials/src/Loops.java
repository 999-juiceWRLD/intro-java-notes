import java.lang.reflect.Array;

public class Loops {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6};
        forLoopIt(myArr);

    }

    public static void forLoopIt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " well that's nice!");
        }
        System.out.println("length of the array is " + arr.length);
        System.out.println("==============================");

        String[] myName = {"AnkaraUniFedaisi"};
        sayMyName(myName);


        String[] newName = {"1", "h", "b", "z", "f", "m", "a", "n"};
        sayMyName(newName);
        practicWhileLoop(5);

        int[] someArr = {1, 2, 3, 101, 99, 0, 8, 4, 13, 21};

        practiceDoWhileLoop(someArr);
    }

    public static void sayMyName(String[] nameArr) {
        int i, length = nameArr.length;
        for (i = 0; i < length; i++) {
            System.out.print(nameArr[i] + "-");
        }
        System.out.println("");
    }

    public static void practicWhileLoop(int number) {
        int i = 0;
        while (i < number) {
            System.out.println("Hello, this number (" + number + ") is written " + i + " times lol");
            i++;
        }
    }

    public static void practiceDoWhileLoop(int[] arr) {
        int index = 0;
        do {
            System.out.println(index + 1 + ". element in the array is " + arr[index]);
            index++;
        } while (index < arr.length);
    }
}
