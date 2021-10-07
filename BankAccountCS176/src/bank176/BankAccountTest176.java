package bank176;

public class BankAccountTest176 {
	public static void main(String[] args) {		
		BankAccount176 harrysChecking=new BankAccount176(0.0,"Harry",12345,false);
		System.out.println(harrysChecking);
		
		harrysChecking.desposit(200);
		System.out.println(harrysChecking.getBalance()+":"+harrysChecking.isOverdrawn());
		harrysChecking.withdraw(500);
		System.out.println(harrysChecking.getBalance()+":"+harrysChecking.isOverdrawn());
		harrysChecking.desposit(400);
		System.out.println(harrysChecking.getBalance()+":"+harrysChecking.isOverdrawn());
		BankAccount176 harrysSaving=new BankAccount176(500.0,"Harry",87654,false);
		System.out.print(harrysSaving);
		harrysChecking.transfer(50, harrysSaving);
		System.out.println(harrysChecking.getBalance());
		System.out.print(harrysSaving.getBalance());
		harrysSaving.addInterest(.035);
		System.out.print(harrysSaving);
	}
 
 
}