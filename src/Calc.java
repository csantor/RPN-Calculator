import java.util.Stack;

public class Calc {
	public static Stack<Integer> st=new Stack<Integer>();
	public static void main(String[] args) {
		Operand op=new Operand();
		Adder a=new Adder();
		CalculatorGui c1=new CalculatorGui(op);

	}

}

