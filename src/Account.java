public class Account {

    private String id;
    private String name;
    public int balance ;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //getters:
    public String getId() {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getBalance () {
        return balance;
    }


    //setters:
    public void setId(String id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }


    //credit method:
    public int credit (int amount) {
        if(amount <= 0){
            System.out.println("you can't add 0 and less");
        }else{
            this.balance = balance + amount;
        }

        return balance;
    }

    //debit method:-
    public int debit(int amount){
        if(balance <= 0){
            System.out.println("you can't debit a negative or zero amount");
            return balance;
        }else if(amount > balance){
            System.out.println("you don't have enough balance");
            return balance;
        }

        this.balance = balance - amount ;
        return balance;
    }

    public int transferTo(Account account, int amount){
        if(amount > balance){
            System.out.println("you don't have enough balance");
        }else if(amount <= 0 ){
            System.out.println("you have to send 1 or greater");
        }

        account.balance = amount + account.balance;

        this.balance = balance - amount;
        return balance;
    }


    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

}
