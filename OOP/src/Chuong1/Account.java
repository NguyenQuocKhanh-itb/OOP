package Chuong1;

public class Account {
    private String id ;
    private String name ;
    private int balance = 0;
    public Account (String id , String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id , String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;

    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit (int amount){
        return this.balance = this.balance +amount;
    }
    public int debit (int amount){
        if(amount <= balance){
            this.balance = balance - amount;
        }
        else{
            System.out.println("So tien vuot qua so du");

        }
        return balance;
    }
    public int transferTo(Account another , int amount){
        if (amount <= balance){
        // chuyen tien vao tai khoan
        balance = balance - amount;
        another.balance = another.balance + amount;
        }
        else{
            System.out.println("So tien vuot qua so du");
        }
        return balance;
        //return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
