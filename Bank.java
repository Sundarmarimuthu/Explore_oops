
abstract class Bank_Account{
    private String AH_Name;
    private double balance;
    private String City;
    Bank_Account(String name,double amt,String city){
        AH_Name=name;
        balance=amt;
        City=city;

    }
    public abstract void display();

    public String get_AH_Name(){
        return AH_Name;
    }
    public void set_AH_Name(String AH_Name){
        this.AH_Name=AH_Name;
    }
    public double get_balance(){
        return balance;
    }
    public void set_balance(double balance){
        this.balance=balance;
    }
    public String get_City(){
        return City;
    }
    public void set_City(String city){
        City=city;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("The Balance after deposit: "+balance);
        }
        else System.out.println("please deposit some money");
        
    }
    public void  withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("The Balance After withdraw: "+balance);
        }
        else System.out.println("Insufficent balance");
    }

}
class savings_Account extends Bank_Account{
    public savings_Account(String name, double amt,String city) {
        super(name, amt,city);
    }
    @Override
    public void display(){
        System.out.println("Savings Account : ");
        System.out.println("Account Holder Name : "+get_AH_Name());
        System.out.println("Account Balance : "+get_balance());
        System.out.println("Account Holder City :"+get_City());
    }
}

public class Bank {
    public static void main(String[] sm){
        savings_Account save=new savings_Account("Sundar",1000000000.00,"Dindigul");
        save.deposit(5000.00);
        save.withdraw(5000000.00);
        save.display();

    }

    
}
