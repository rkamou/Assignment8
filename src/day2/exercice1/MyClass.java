package day2.exercice1;

import java.util.function.BiPredicate;

public class MyClass {
	Integer x;
	String y;

	public MyClass(Integer x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean myMethod(MyClass my) {

		BiPredicate<MyClass, MyClass> myclass = MyClass::equals;

		return myclass.test(this, my);
	}

	public static void main(String args[]) {

		MyClass my = new MyClass(1, "pogo");
		MyClass my1 = new MyClass(1, "pogo");
		System.out.println(my.myMethod(my1));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MyClass)) {
			return false;
		}
		MyClass other = (MyClass) obj;

		return this.getX() == other.getX() && this.getY().equals(other.getY());
	}

	/**
	 * @return the x
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public String getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(String y) {
		this.y = y;
	}

}
