
public class BasicArithmetic {
	
	private int number1, number2;
	private String operator;
	
	private BasicArithmetic(int n1, int n2, String o) {
		number1 = n1;
		number2 = n2;
		operator = o;
		
	}
	
	public static BasicArithmetic createOperation(int n1, int n2, String o) {
		return new BasicArithmetic(n1, n2, o);
	}
	
	public int performOperation() {
		if (operator == "+") return number1 + number2;
		if (operator == "-") return number1 - number2;
		if (operator == "*") return number1 * number2;
		if (operator == "/") return number1 / number2;
		return 0;
	}

}
