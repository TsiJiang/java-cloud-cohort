class Main{
    public static void main(String[] args){
        BankAccount xavierLong = new BankAccount();
        xavierLong.deposit(10000);
        xavierLong.withdraw(500);
        System.out.println(xavierLong.checkBalance());
    }
}