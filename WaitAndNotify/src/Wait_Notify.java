
class Customer{
	int totalAmount = 10000;
	
	public synchronized void withdraw(int amount) {
		System.out.println("Total amount " + totalAmount + " withdrawing amount " + amount);
		if(totalAmount < amount) {
			System.out.println("Not enough amount.. waiting for deposit..");
			try {
				wait();
			}catch (Exception e) {}	
		}
		this.totalAmount -= amount;
		System.out.println("Withdrawal successful.. Remaining balance is " + this.totalAmount);
	}
	public synchronized void deposit(int amount) {
		System.out.println("Depositing amount " + amount);
		this.totalAmount += amount;
		System.out.println("Deposit is completed.. . and new total amount  is " + totalAmount);
		notify();
	}
}
class Deposit implements Runnable{
	Customer c;
	int depo;

	public Deposit(Customer c, int depo) {
		this.c = c;
		this.depo = depo;
	}

	@Override
	public void run() {
		c.deposit(depo);
		
	}
	
}
class Withdrawal implements Runnable{
	Customer c;
	int with;
	
	public Withdrawal(Customer c, int with) {
		this.c = c;
		this.with = with;
	}

	@Override
	public void run() {
		c.withdraw(with);
		
		
	}
	
	
}
public class Wait_Notify {

	public static void main(String[] args) {
		Customer c = new Customer();
		Thread w1 = new Thread(new Withdrawal(c,5000));
		Thread w2 = new Thread(new Withdrawal(c,4000));
		Thread w3 = new Thread(new Withdrawal(c,10000));
		Thread d = new Thread(new Deposit(c,20000));
		
		w1.start();
		w2.start();
		w3.start();
		d.start();


		
		
	}

}
