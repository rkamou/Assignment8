/**
 * 
 */
package day2.exercice3;

import java.util.Arrays;
import java.util.List;

/**
 * @author 610151
 *
 */
public class Exercice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		fruits.forEach(x -> System.out.println(x));
		
		System.out.println();
		
		fruits.forEach(System.out::println);
	}

}
