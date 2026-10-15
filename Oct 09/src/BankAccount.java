class BankAccount{
    private double balance = 0.00;

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public double checkBalance(){
        return balance;
    }
}