import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Adder{
	static int operate(Stack<Integer> st){
		int d3=st.pop();
		int d4=st.pop();
		return Operand.val=d3+d4;
	}

}
class ButtonPlusHandler implements ActionListener{
	Stack<Integer> st;
	TextField t;
	public ButtonPlusHandler(Stack<Integer> st,TextField t){
		this.st=st;
		this.t=t;
		}
	public void actionPerformed(ActionEvent pushingButtonPlus){
		t.setText("+");
		Adder.operate(st);
		}
	}
