package t53;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Electronics> electronics = Arrays.asList(new Electronics("Laptop", 175000000, "hp"),
													  new Electronics("Mobile", 74000000, "Samsung"),
													  new Electronics("PowerBank",5000000,"Anker"));
		
		List<Clothing> clothes = Arrays.asList(new Clothing("T-Shirt", 1200000, "Medium"),
											   new Clothing("Jacket", 4500000, "Large"),
											   new Clothing("Coat", 6000000, "X-Large"));
		
		double totalElectronics = Utility.totalPrice(electronics);
		double totalClothes = Utility.totalPrice(clothes);
		
		System.out.printf("جمع مبلغ الکترونیک : %.0f",totalElectronics);
		System.out.println();
		System.out.printf("جمع مبلغ لباس : %.0f",totalClothes);
		

	}

}
