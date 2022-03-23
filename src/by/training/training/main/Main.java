package by.training.training.main;

import by.training.training.entity.Test1;

public class Main {

	public static void main(String[] args) {
		 
		Test1 test = new Test1(10,20);
		
		test.setX(30);
		
		test.print();
		
		test.setY(40);
		
		int sum = test.getSum();
		
		int biggest = test.getBiggest();
		
		System.out.println("Сумма переменных: " + sum + ", наибольшее из переменных: " + biggest);

	}

}
