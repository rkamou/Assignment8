package day2.exercice2;

import java.util.function.Supplier;

public class MyRandomSupplier implements  Supplier<Double>{

	@Override
	public Double get() {
		// TODO Auto-generated method stub
		return Math.random();
	}

}
