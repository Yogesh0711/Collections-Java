package CollectAssignment;

import java.util.List;

public class Cart {
	List<Product> productspurchased;
	int[] quantity;
	double totalamount;
	int discountrate;
	double amountAfterDiscount;
	
	public Cart(List<Product> productspurchased,int[] quantity) {
		this.productspurchased = productspurchased;
		this.quantity=quantity;
	}
	public double totalAmount() {
		double totAmount=0;
		for(int i=0;i<productspurchased.size();i++) {
			totAmount+=(productspurchased.get(i).price)*quantity[i];
		}
		this.totalamount=totAmount;
		return totAmount;
	}
	public int discountRate() {
		if(totalamount>=500&&totalamount<1000) {
			this.discountrate=10;
		}
		else if(totalamount>=1000) {
			this.discountrate=15;
		}
		else {
			this.discountrate=0;
		}
		return this.discountrate;
	}
	public double amountAfter() {
		if(discountrate!=0) {
			amountAfterDiscount=totalamount-((totalamount/discountrate)*100);
			return this.amountAfterDiscount;
		}
		else {
			return totalamount;
		}
	}
}
