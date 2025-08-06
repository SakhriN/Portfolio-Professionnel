package dbz.superexempledelespace.exo11;

public class BankAccount {
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    public synchronized void deposit(int money) {
        this.money = this.money + money;
        System.out.println(Thread.currentThread().getName()+ " a déposé " +money+ " euros. Solde actuel : "+ this.money);
    }


    public synchronized void withdraw(int money){

        if (this.money < money) {
            System.out.println(Thread.currentThread().getName()+ " n'a pa pu retirer " +money+ " euros (solde insuffisant). Solde actuel : "+ this.money);
        }else{
            this.money= this.money - money;
            System.out.println(Thread.currentThread().getName()+ " a retiré " +money+ " euros. Solde actuel : "+ this.money);
        }
    }




}
