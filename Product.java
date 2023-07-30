package CollectAssignment;

import java.util.Comparator;

public class Product {
	int productId;
	String productName;
	String category;
	double price;
	String size;
	public Product(int productId, String productName, String category, double price, String size) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.size = size;
	}
	
}
class PriceComparator implements Comparator<Product>{
	public int compare(Product p1,Product p2) {
		if(p1.price==p2.price) {
			return 0;
		}
		else if(p1.price>p2.price) {
			return 1;
		}
		else {
			return -1;
		}
	}
}