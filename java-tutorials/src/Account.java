public class Account {

    // private attributes
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    // private attributes

    // getters
    public String getNumber() { return number;}
    public double getBalance() { return balance;}
    public String getCustomerName() { return customerName;}
    public String getCustomerEmail() { return customerEmail;}
    public String getCustomerPhone() { return customerPhone;}
    // getters

    // setters
    public void setNumber(String number) { this.number = number;}
    public void setBalance(double balance) { this.balance = balance;}
    public void setCustomerName(String customerName) { this.customerName = customerName;}
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail;}
    public void setCustomerPhone(String customerPhone) { this.customerPhone = customerPhone;}
    // setters

    public Account() {
        this("123", 10_000, "John Doe", "johndoe@company.com",
                "1111-111-1111");
        System.out.println("Empty Account() constructor has been invoked.");
    }

    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;

        System.out.println("Account() instance with arguments has been created. " +
                "Please don't forget to add attributes.");
    }

    public static void getUserAmount() {
        System.out.println("Kaç adet kullanıcımızın olduğunu maalesef söyleyemeyiz.");
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "$ is made. New balance is " +
                balance + "$.");
    }

    public void withdrawFunds(double withDrawalAmount) {
        if (balance - withDrawalAmount < 0) {
            System.out.println("Insufficient funds. You only have " + balance +
                    "$ in your account.");
        }
    }
}
