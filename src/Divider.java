import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Divider {
	static void operate(Stack<Integer> st){
		int d3=st.pop();
		int d4=st.pop();
		Operand.val=d4/d3;
	}
}

class ButtonDivideHandler implements ActionListener{
	Stack<Integer> st;
	TextField t;
	public ButtonDivideHandler(Stack<Integer> st,TextField t){
		this.st=st;
		this.t=t;
		}
	public void actionPerformed(ActionEvent pushingButtonDivide){
		t.setText("/");
		Divider.operate(st);
		}
	}