package question2_assignment2_3560;

public class Ticket implements SaleableItem {
	
	public Ticket() {
		
	}
	@Override
	public void sellCopy() {
		System.out.println("Selling a ticket");
	}
}
