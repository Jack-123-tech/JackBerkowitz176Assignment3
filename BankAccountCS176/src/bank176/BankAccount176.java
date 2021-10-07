package bank176;

public class BankAccount176 {

	private double balance;
	private long accountNum;
	private String name;
	private boolean overdrawn;
	double calInter;
	public BankAccount176() {
		balance=0;
		
	}
 public long getAccontNumber() {
	 return accountNum;
	 
	 
	 
	 
	 
 }
  public void setAccountNum(long accNum) {
	  accountNum=accNum;
  }
  public String getAccountName() {
	  return name;
  }
  public void setAccountName(String acctname) {
	  name=acctname;
  }
  
  public boolean isOverdrawn() {
	  return overdrawn;
  }
  public void setOverdrawn(boolean status) {
	  status=overdrawn;
  }
  public BankAccount176(double initialBalanace, String Accoutname, long accNum, boolean status) {
	  balance=initialBalanace;
	 accountNum=accNum ;
	  name=Accoutname;
	  overdrawn=status;
	  
	  
	  
  }
			public BankAccount176(double initialBalanace) {
				balance=initialBalanace;
			}
			public void desposit(double amount) {
				balance=balance+amount;
			}
			
			public void withdraw(double amount) {
				if(overdrawn) {
					System.err.println("Negetive Amount!!");
					return;
				}
				balance=balance-amount;
				if(balance<0) {
					overdrawn=true;
				}
				
			}
			 public void transfer(double amount, BankAccount176 otherAccout) {
				balance=balance-amount;
				otherAccout.desposit(amount);
			}
			 
			 public void  addInterest (double interest) {
				 calInter =balance*interest;
				 balance=balance+calInter;
			 }
			 
			 public String toString() {
				System.out.println( "The Account Number:"+accountNum+ "is owned by" +name+ "with a Balance:"+balance);
				return name;
			 }
			 
			 
			 
			public double getBalance() {
				return balance;
			}
}
