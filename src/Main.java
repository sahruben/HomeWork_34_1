public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1200, 0.10);
        System.out.println(savingsAccount.calculateInterestRate());

        CreditAccount creditAccount = new CreditAccount(1200, 0.20);
        System.out.println(creditAccount.calculateInterestRate());

    }
}
