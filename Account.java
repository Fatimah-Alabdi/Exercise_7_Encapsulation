public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public Account(String id, String name, int balance) {
     this.id = id;
     this.name = name;
     this.balance = balance;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount) {

        balance =+ amount;
        return balance;

    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("You don't have enough balance ");
        }
        return balance;
    }
    public int transfer(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("You don't have enough balance");
        }
        return balance;

    }
    public String toString(){
        return "ID: " + id + "\nName: " + name + "\nBalance: " + balance;
    }
}
