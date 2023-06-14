public class Account {
    String iban;
    Person owner;
    double balance;
    MyDate dayOpen;



    Account(String iban,Person owner,double balance, MyDate dayOpen){
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
        this.dayOpen = dayOpen;

    }

    public String toString(){
        return iban + " " + owner + " " + balance + " " + "("+dayOpen.toString()+")";
    }

    public void incomeTransaction(double amount) {
        balance = balance + amount;
    }



}
