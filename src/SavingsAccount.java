public class SavingsAccount implements Bank{

    private  double balance;

    private double interestRate;
    SavingsAccount(double balance, double interestRate)

    {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterestRate() {
        return this.interestRate;
    }






}
