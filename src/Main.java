public class Main {
    public static void main(String[] args) {

        Account salaryAccount = new Account();
        Account savingAccount = new Account(1000.0);
        Account myAccount = new Account(2000.0,"mySavingAccount");

        salaryAccount.deposit(400.0);
        Double money = salaryAccount.withdraw(50.0);
        salaryAccount.setName("salatyAccount");

        savingAccount.deposit(200.0);
        savingAccount.setName("savingAccount");


        myAccount.deposit(300);

        System.out.println(myAccount.getName());

        System.out.println(salaryAccount.getBalance());
        System.out.println(savingAccount.getBalance());
        System.out.println(myAccount.getBalance());

        //toString metod
        System.out.println(salaryAccount);
        System.out.println(savingAccount);
        System.out.println(myAccount);

    }
}