public class Main {
    public static void main(String[] args) {
        System.out.print("Merhaba, Kahraman\n");

        // conditionals

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("Not an alien");

        if (!isAlien) {
            System.out.print("Another way to say it's not an alien\n");
        }

        isAlien = true;
        float collegeGPA = 3.99F;
        if (collegeGPA > 2.50 && isAlien) {
            System.out.print("\nGPA: " + collegeGPA);
            System.out.println("\nisAlien: " + isAlien);
        }

        if (collegeGPA == 3.99F || isAlien == false) {
            System.out.println("Something has happened");
        }

        int myNumber = 10;
        boolean isTen = myNumber == 10 ? true: false;
        System.out.println("Result is " + isTen + "\n");

        // Car Instance
        Car car1 = new Car();
        car1.describeCar();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());

        car1.setMake("Nissan");
        car1.setModel("Qashqai");
        car1.setColor("Dark Purple");
        car1.setDoorNum(5);
        car1.setConvertible(false);

        System.out.println("");

        car1.describeCar();

        // Account instance
        Account account1 = new Account();
        Account account2 = new Account("999", 4425, "John Doe",
                "john.doe@company.com", "545-145-1234");

        System.out.println("");

        System.out.println(account2.getNumber());
        System.out.println(account2.getCustomerName());

        Account.getUserAmount();
    }
}