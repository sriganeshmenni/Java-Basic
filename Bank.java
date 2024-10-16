public class Bank {
    //Properties
    String acno,CustName;
    double bal;
    String Branch;
    long Mob;
    public Bank(){
        System.out.println("++++Properties are intaialized With Default++++");
    }
    public Bank(String Account,String Customer,double amount,String branchname,long Mobile_number){
                 acno = Account;
                 CustName = Customer;
                 bal = amount;
                 Branch = branchname;
                 Mob = Mobile_number;
    }
    public void displayCustomerinfo(){
        System.out.println("==============================================");

        System.out.println("Customer Acc Number : "+acno);
        System.out.println("Customer Name : "+CustName);
        System.out.println("Customer Balance : "+bal);
        System.out.println("Branch : "+Branch);
        System.out.println("Customer Mobile Number : "+Mob);

        System.out.println("==============================================");

    }
    public void Deposit(double amt){
        System.out.println("==============================================");

        bal = bal+amt;
        System.out.println(amt+"is Credited into your Account");
        System.out.println("New Balance is "+bal);

        System.out.println("==============================================");

    }
    public void withdraw(double amt){
        System.out.println("==============================================");

        if(bal-amt<500) 
        System.out.println("You should Maintain 500 in your Account");
        else{
            bal = bal-amt;
            System.out.println(amt+"is Debited from your Account Remaining Balance is "+bal);
        }
        System.out.println("==============================================");

    }
    public double checkbalance(){
        System.out.println("==============================================");

        return bal;

       

    }
    public static void main(String args[]){
          Bank Cus1 = new Bank("41841664108","Sri ganesh", 990000, "State Bank of India",9347129335l);
          Cus1.displayCustomerinfo();
          Cus1.Deposit(150000);
          Cus1.withdraw(2000);
    }
}
