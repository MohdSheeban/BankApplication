public interface BankInterface {
    public double checkBalance();
    public String addMoney(int amount);
    public String withdrawMoney(int amount, String enteredPassword);
    public double calculateInterest(int years);
}
