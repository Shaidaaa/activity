class activity4 {

    public static void main(String[] args) {
        BankAccount user = new BankAccount("muhamad", 1200);
        user.setBalance(30);
        user.setName("ali");
        System.out.println(user.getBalance());
        System.out.println(user.getName());
    }

}
class BankAccount{

    private String name;
    private double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }
    public Boolean deposit(double amount) {
        if (amount>0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public Boolean withdraw(double amount) {
        if (amount < this.balance) {
            this.balance = this.balance - amount;
            return true;
        } else {
            return false;
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

}
