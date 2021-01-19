package application;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Coltroller {
	
	@FXML
	private TextField txtResult;
	boolean bool = false;
	String s1="";
	String s2="";
	String operation="";
	double first;
	double second;
	public void getNumber(Event e) {
		Button b = (Button)e.getSource();
		if(!bool) {
			s1+=b.getText();
			txtResult.setText(s1);
		}
		else{
			s2+=b.getText();
			txtResult.setText(s1+operation+s2);
		}
	}
	
	public void getOperation(Event e) {
		if(operation.equals(""))
		first = Double.parseDouble(txtResult.getText());
		Button b = (Button)e.getSource();
		operation = b.getText();
		txtResult.setText(s1+operation);
		bool=true;
	}
	
	public void Result() {
		bool=false;
		s1="";
		second = Double.parseDouble(s2);
		s2="";
		switch(operation) {
		case "+":
			txtResult.setText(Double.toString(Operations.addition(first, second)));
			first = Operations.addition(first, second);
			break;
		case "-":
			txtResult.setText(Double.toString(Operations.subtraction(first, second)));
			first = Operations.subtraction(first, second);
			break;
		case "*":
			txtResult.setText(Double.toString(Operations.multiplication(first, second)));
			first = Operations.multiplication(first, second);
			break;
		case "/":
			txtResult.setText(Double.toString(Operations.division(first, second)));
			first = Operations.division(first, second);
			break;
		}
	}

}
