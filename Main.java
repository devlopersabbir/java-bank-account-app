public class Main {
    public static void main(String[] args) {
        Account sabbir = new Account("Sabbir Hossain", "devlopersabbir@gmail.com", "01642562603", 55664499, 1000);
        sabbir.getDetails();
        sabbir.depositMoney(5000);
        sabbir.withDrawMoney(20);
    }
}