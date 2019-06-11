package day1.exercice2.a;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		return Double.compare(arg0.getPrice(), arg1.getPrice());
	}

}
