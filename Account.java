public class Account {
    private String fullName;
    private String email;
    private String phoneNumber;
    private int accountNumber;
    private double balance;

    public Account(String name, String email, String phone, int accNumber, double balance) {
        this.fullName = name;
        this.email = email;
        this.phoneNumber = phone;
        this.accountNumber = accNumber;
        this.balance = balance;
    }

    public void depositMoney(int ammount) {
        if (ammount <= 10) {
            System.out.println(ammount + "tk deposit unsuccessfull! You have to must deposit more then 10tk");
        } else if (ammount >= 3000) {
            System.out.println(ammount + "tk deposit unsuccessfull! You can not deposit more than 3000tk at once!");
        } else {
            this.balance += ammount;
            System.out.println(ammount + "tk deposit successfull! Now balance is: " + this.balance + "tk");
        }
    }

    public void withDrawMoney(int ammount) {
        if (ammount <= 10) {
            System.out.println(ammount + "tk withdraw unsuccessfull! You have to must withdraw more then 10tk");
        } else if (ammount >= 5000) {
            System.out.println(ammount + "tk withdraw unsuccessfull! You can not withdraw more than 5000tk at once!");
        } else {
            this.balance -= ammount;
            System.out.println(ammount + "tk withdraw successfull! Now balance is: " + this.balance + "tk");
        }
    }

    public void setDetails() {
    }

    public void getDetails() {
        System.out.println("The name is: " + this.fullName + ".\nEmail is: " + this.email + ".\nPhone number is: "
                + this.phoneNumber + "\nAccount number: " + this.accountNumber + "\nCurrent Balance: "
                + this.balance + " tk");
    }
}