/**
 * 
 */
package day1.exercice2.c;

import java.util.Collections;
import java.util.List;

/**
 * @author 610151
 *
 */
public class ProductInfo {
	static enum sortMethod{ByTitle,ByPrice};
	private sortMethod method;
	public ProductInfo(sortMethod method) { 
		this.method = method;
	}
	public void sort(List<Product> list) {
		if(method == sortMethod.ByPrice)
			Collections.sort(list, new ProductComparatorByPrice());
		else if (method == sortMethod.ByTitle)
			Collections.sort(list, new ProductComparatorByTitle());
	}
}
