import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Multiplier {
	static void operate(Stack<Integer> st){
		int d3=st.pop();
		int d4=st.pop();
		Operand.val=d3*d4;
	}
}

class ButtonMultiplyHandler implements ActionListener{
	Stack<Integer> st;
	TextField t;
	public ButtonMultiplyHandler(Stack<Integer> st,TextField t){
		this.st=st;
		this.t=t;
		}
	public void actionPerformed(ActionEvent pushingButtonMultiply){
		t.setText("*");
		Multiplier.operate(st);
		}
	}