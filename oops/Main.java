
class bank{
    public String name;
    public int accountNumber;
    private String password;

    public bank(String name, int accountNumber, String password) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        bank myAccount = new bank("John Doe", 123456, "securePassword");

        // Display account information
        myAccount.displayAccountInfo();

        // Authenticate user
        if (myAccount.authenticate("securePassword")) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}