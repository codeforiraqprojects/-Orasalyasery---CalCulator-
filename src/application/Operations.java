package application;

import javax.swing.JOptionPane;

public class Operations {
	public static double addition(double x, double y) {
		return x + y;
	}
	public static double subtraction(double x, double y) {
		return x - y;
	}
	public static double multiplication(double x, double y) {
		return x * y;
	}
	public static double division(double x, double y) {
		double z= 0;
		if(y==0) {
			JOptionPane.showMessageDialog(null, "can't divide on Zero!");
		}
		else {
			z= x / y;
		}
		return z;
	}
}
