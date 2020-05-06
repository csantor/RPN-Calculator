import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Subtracter {
	static void operate(Stack<Integer> st){
		int d3=st.pop();
		int d4=st.pop();
		System.out.println("sub");
		Operand.val=d4-d3;
	}
}

class ButtonMinusHandler implements ActionListener{
	Stack<Integer> st;
	TextField t;
	public ButtonMinusHandler(Stack<Integer> st,TextField t){
		this.st=st;
		this.t=t;
		}
	public void actionPerformed(ActionEvent pushingButtonMinus){
		t.setText("-");
		Subtracter.operate(st);
		}
	}
