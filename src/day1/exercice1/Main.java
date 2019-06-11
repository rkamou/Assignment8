/**
 * 
 */
package day1.exercice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

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
		BiFunction<Double, Double, List<Double>> bif = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};
		
		List<Double> result = bif.apply(2.0, 3.0);
		
		result.forEach(d -> System.out.println(d));
	}

}
