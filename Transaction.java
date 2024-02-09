public class Transaction extends accounts{
    private int TransactionNo;
    private double amount;
    private String date;{
        super(double balance);
    }
    @Override
    public void deposit(double amount){
        balance  = amount + balance;
    }
    
    public void withdrawn(double amount){
       balance = amount - balance;
    }

    public int getTransactionNo(){return TransactionNo;}
    public void setTransactionNo(int TransactionNo){
        this.TransactionNo=TransactionNo;
    }
    public double getamount(){return amount;}
    public void setAmount(double amount){
        this.amount=amount;
    }
    public String getDate(){return date;}
    public void setDate(String date){
        this.date=date;
    }
   
    public void display(){
        System.out.println("Transaction Amount= "+getamount());
        System.out.println("Transaction No= "+getTransactionNo());
        System.out.println("Transaction Date= "+getDate());
        
    }

}
