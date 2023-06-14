import java.util.Objects;

public class Account {
    String iban;
    Person owner;
    double balance;

    public Account(String iban, Person owner, double balance) {
        this.iban = iban;
        this.owner = owner;
        this.balance = balance;
    }


    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Double.compare(account.getBalance(), getBalance()) == 0 && Objects.equals(getIban(), account.getIban()) && Objects.equals(getOwner(), account.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIban(), getOwner(), getBalance());
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", owner=" + owner +
                ", balance=" + balance +
                '}';
    }
}
