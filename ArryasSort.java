package CollectAssignment;

import java.util.*;

public class ArryasSort {
	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList<>();
		Product p1=new Product(1001,"Milk","Diary",25,"1/2 Litre");
		Product p2=new Product(1002,"Spinach","Vegtables",20,"1 Bunce");
		Product p3=new Product(1003,"Cereals","Groceries",120,"1 Kg");
		Product p4=new Product(1004,"Panner","Diary",40,"200 gram");
		Product p5=new Product(1005,"Rice","Groceries",50,"1 Kg");
		Product p6=new Product(1006,"Onions","Vegtables",30,"1 Kg");
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		
		Collections.sort(products,new PriceComparator());
		
		for(Product pro:products) {
			System.out.println(pro.productName+" "+pro.productId+" "+pro.price+" "+pro.size);
		}
		
		HashMap<String,Product[]> productListMap=new HashMap<>();
		productListMap.put("Diary", new Product[] {p1,p4});
		productListMap.put("Vegtables", new Product[] {p2,p6});
		productListMap.put("Groceries", new Product[] {p3,p5});
		
		
		
		System.out.println("");
		System.out.println("Bill.........");
		List<Product> cust1=new ArrayList<>();
		cust1.add(p1);
		cust1.add(p3);
		cust1.add(p6);
		cust1.add(p4);
		int[] quantity= {3,4,5,7};
		Cart customer1=new Cart(cust1,quantity);
		
		
		Formatter fmt = new Formatter();  
		fmt.format("%15s %15s %15s\n", "Product", "Quantity", "Price");  
		
		
		for(int i=0;i<quantity.length;i++) {
			fmt.format("%14s %14s %17s\n",cust1.get(i).productName,quantity[i],cust1.get(i).price);
		}
		System.out.println(fmt);
		
		System.out.println("              Total       : "+customer1.totalamount);
		System.out.println("              Discount    : "+customer1.discountrate);
		System.out.println("              FinalAmount : "+customer1.amountAfterDiscount);
	}	
}
