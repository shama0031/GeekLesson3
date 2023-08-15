public class Main {
    public static void main(String[] args) {
        double initialBalance = 15000;
        BankAccount account = new BankAccount();
        account.deposit(initialBalance);

        System.out.println("Initial balance " + account.getAmount());

        try{
            while(true){
                double cashWith = 6000;
                try{
                    account.withDraw(((double)cashWith));
                    System.out.println("Withdraw: "+ cashWith);
                }catch(LimitException ie){
                    System.out.println("Tried to withdraw: " + cashWith);
                    System.out.println("Remaining amount: " + ie.getRemainingAmount());
                    account.withDraw(ie.getRemainingAmount());
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Final account balance: " + account.getAmount());
    }
}
