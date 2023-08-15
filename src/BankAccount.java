public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount += sum;
    }
    public void withDraw(double sum) throws LimitException {
        if(sum > amount){
            throw new LimitException("Request amount exceeds account balance " + amount);
        }
        amount -= sum;
    }
}
