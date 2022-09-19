
public class Account {
    private double balance;
    private String name;

    //en konsturktörer heter alltid samma som klass
    public Account(){
        this.balance = 0.0;
    }

    public Account(double firstBalance){
        this.balance = firstBalance;
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    //metod
    public void deposit(double amount){
        this.balance += amount;
        //balance = balance + amount; (det är samma som rader uppe)
    }

    //metod
    public double withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    public String toString(){
        return "Account name is: " + name + " and has a balance of: " + balance + " kr.";
    }
}

