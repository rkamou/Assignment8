/**
 * 
 */
package day2.exercice2;


import java.util.function.Supplier;

/**
 * @author 610151
 *
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i))
		Supplier<Double> supp =Math::random;
		System.out.println(supp.get());
		
		//ii))
		Supplier<Double> supp1 =()->Math.random();
		System.out.println(supp1.get());
		
		//iii))
		MyRandomSupplier muSupp = new MyRandomSupplier();
		System.out.println(muSupp.get());
	}

}
