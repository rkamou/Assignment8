/**
 * 
 */
package day1.exercice2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 610151
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listProduct = new ArrayList<>();
		listProduct.add(new Product("Chevy Cobalt",4.3,2));
		listProduct.add(new Product("Cadillac Escalade",13.0,3));
		listProduct.add(new Product("Ford Mustang",16.9,1));
		listProduct.add(new Product("Dodge Charger",13.6,2));
		listProduct.add(new Product("Mercedes Benz",18.1,4));
		listProduct.add(new Product("Toyota Highlander",11.2,2));
		listProduct.add(new Product("Mazda 3",9.1,1));
		listProduct.add(new Product("VolkWogen Passat",10.5,3));
		
		System.out.println("Sort By Price");
		ProductInfo psort = new ProductInfo(ProductInfo.sortMethod.ByPrice);
		psort.sort(listProduct);
		listProduct.forEach(product -> System.out.println(product.toString()));
		
		System.out.println("\n\n\nSort By Title");
		psort = new ProductInfo(ProductInfo.sortMethod.ByTitle);
		psort.sort(listProduct);
		listProduct.forEach(product -> System.out.println(product.toString()));
	}

}
