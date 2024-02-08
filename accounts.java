public class accounts {
  private String accTitle;
  private int accNo;
  private double balance;

  public String getAccTitle(){
    return accTitle;
  }
  public void setaccTitle(String accTitle){
    this.accTitle= accTitle;
  }

  public int getAccNo(){
    return accNo;
  }
  public void setaccNo(int accNo){
    this.accNo= accNo;
  }
  public double getbalance(){
    return balance;
  }
  public void setbalance(double balance){
    this.balance= balance;
  }

  public void deposit(double amount) {
	balance= balance+ amount;

}
public void withdrawn(double amount){
    balance = balance - amount ;
}
public void display(){
    System.out.println("Account Title= "+getAccTitle());
    System.out.println("Accounts Number= "+getAccNo());
    System.out.println("Balance= "+getbalance());
}
}
