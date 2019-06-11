package day1.exercice2.c;

import java.util.Comparator;

public class ProductComparatorByTitle implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		return arg0.getTitle().compareTo(arg1.getTitle());
	}

}
