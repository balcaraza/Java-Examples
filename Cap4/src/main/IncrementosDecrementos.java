package main;

public class IncrementosDecrementos {
	public static void main(String[] args) {
		
		int c= 5;
		System.out.printf("c antes del postincremento: %d%n", c);
		System.out.printf("		postincremento de c: %d%n", c++);
		System.out.printf("	c despues del postincremento: %d%n", c);
		
		System.out.println();
		
		c= 5;
		
		System.out.printf("c antes del preincremento: %d%n", c);
		System.out.printf("		preincremento de c: %d%n", c++);
		System.out.printf("	c despues del preincremento: %d%n", c);
	}

}
