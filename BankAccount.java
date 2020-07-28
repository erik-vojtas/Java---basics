public class BankAccount {
    private String number;
    private double balance;
    private String cutomerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount() {
        this("5323", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty Constructor created...");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.cutomerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String cutomerName, String customerEmailAddress, String customerPhoneNumber) {
        this("23232", 10, cutomerName, customerEmailAddress, customerPhoneNumber);
    }

}
