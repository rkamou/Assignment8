/**
 * 
 */
package day2.exercice4;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author 610151
 *
 */
public class exercice4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Collections.sort(Arrays.asList(names), String::compareToIgnoreCase);
		Arrays.asList(names).forEach(System.out::println);
		
		System.out.println();
		String[] names1 = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names1, String::compareToIgnoreCase);
		Arrays.asList(names1).forEach(System.out::println);
		
		System.out.println();
		String[] names2 = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		Arrays.sort(names2);
		Arrays.asList(names2).forEach(System.out::println);
		
	}

}
