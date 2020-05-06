import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Stack;

public class CalculatorGui extends Frame{
	public static Operand op;
	public static Stack<Integer> st;
	public static int val;
	public static Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
	public static Button buttonBackspace,buttonEnter,buttonCE,buttonC,buttonDot,buttonPlus,buttonMinus;
	public static Button buttonMultiply,buttonDivide,buttonEquals;
	
	public CalculatorGui(Operand op) {
		
		super("Java Polish Reverse Calculator");
		this.setLayout(null);
		this.setLocation(50,100);
		this.setSize(283,297);
		this.setBackground(Color.CYAN);
		this.setVisible(true);
		this.addWindowListener(new CloseWindowAndExit());
		
		TextField t=new TextField("text",5);
		t.setEditable(false);
		t.setBounds(13, 55, 257, 30);
		this.add(t);
		
		button0=Buttons.makebutton("0", 64, 265, 35, 28);
		button1=Buttons.makebutton("1", 64, 232, 35, 28);
		button2=Buttons.makebutton("2", 104, 232, 35, 28);
		button3=Buttons.makebutton("3", 144, 232, 35, 28);
		button4=Buttons.makebutton("4", 64, 199, 35, 28);
		button5=Buttons.makebutton("5", 104, 199, 35, 28);
		button6=Buttons.makebutton("6", 144, 199, 35, 28);
		button7=Buttons.makebutton("7", 64, 166, 35, 28);
		button8=Buttons.makebutton("8", 104, 166, 35, 28);
		button9=Buttons.makebutton("9", 144, 166, 35, 28);
		buttonBackspace=Buttons.makebutton("Backspace", 64, 100, 75, 28);
		buttonEnter=Buttons.makebutton("Enter", 204, 100, 56, 28);
		buttonCE=Buttons.makebutton("CE", 144, 133, 35, 28);
		buttonC=Buttons.makebutton("C", 144, 100, 35, 28);
		buttonDot=Buttons.makebutton(".", 144, 265, 35, 28);
		buttonPlus=Buttons.makebutton("+", 195, 265, 35, 28);
		buttonMinus=Buttons.makebutton("-", 195, 232, 35, 28);
		buttonMultiply=Buttons.makebutton("*", 195, 199, 35, 28);
		buttonDivide=Buttons.makebutton("/", 195, 166, 35, 28);
		buttonEquals=Buttons.makebutton("=", 235, 265, 35, 28);
		
		
		button0.addActionListener(new Button0Handler(t,op));
		button1.addActionListener(new Button1Handler(t,op));
		button2.addActionListener(new Button2Handler(t,op));
		button3.addActionListener(new Button3Handler(t,op));
		button4.addActionListener(new Button4Handler(t,op));
		button5.addActionListener(new Button5Handler(t,op));
		button6.addActionListener(new Button6Handler(t,op));
		button7.addActionListener(new Button7Handler(t,op));
		button8.addActionListener(new Button8Handler(t,op));
		button9.addActionListener(new Button9Handler(t,op));
		buttonBackspace.addActionListener(new ButtonBackspaceHandler(t,op));
		buttonEnter.addActionListener(new ButtonEnterHandler(op,t));
		buttonCE.addActionListener(new ButtonCEHandler(op,t));
		buttonC.addActionListener(new ButtonCHandler(op,t));
		buttonDot.addActionListener(new ButtonDotHandler());
		buttonPlus.addActionListener(new ButtonPlusHandler(Calc.st,t));
		buttonMinus.addActionListener(new ButtonMinusHandler(Calc.st,t));
		buttonMultiply.addActionListener(new ButtonMultiplyHandler(Calc.st,t));
		buttonDivide.addActionListener(new ButtonDivideHandler(Calc.st,t));
		buttonEquals.addActionListener(new ButtonEqualsHandler(op,t));
		
		this.add(button0);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(buttonBackspace);
		this.add(buttonEnter);
		this.add(buttonCE);
		this.add(buttonC);
		this.add(buttonDot);
		this.add(buttonPlus);
		this.add(buttonMinus);
		this.add(buttonMultiply);
		this.add(buttonDivide);
		this.add(buttonEquals);
		}

class CloseWindowAndExit extends WindowAdapter{
	public void windowClosing(WindowEvent closeWindowAndExit){
		System.exit(0);
	}
}
class Button0Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button0Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton0){
		op.addDigit(0);
		t.setText(""+Operand.val);
		}
	}
class Button1Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button1Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton0){
		op.addDigit(1);
		t.setText(""+Operand.val);
	}
}
class Button2Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button2Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton2){
		op.addDigit(2);
		t.setText(""+Operand.val);
	}
	}
class Button3Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button3Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton3){
		op.addDigit(3);
		t.setText(""+Operand.val);
	}
	}
class Button4Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button4Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton4){
		op.addDigit(4);
		t.setText(""+Operand.val);
	}
	}
class Button5Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button5Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton5){
		op.addDigit(5);
		t.setText(""+Operand.val);
	}
	}
class Button6Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button6Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton6){
		op.addDigit(6);
		t.setText(""+Operand.val);
	}
	}
class Button7Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button7Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton7){
		op.addDigit(7);
		t.setText(""+Operand.val);
	}
	}
class Button8Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button8Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton8){
		op.addDigit(8);
		t.setText(""+Operand.val);
	}
	}
class Button9Handler implements ActionListener{
	TextField t;
	Operand op;
	public Button9Handler(TextField t, Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButton9){
		op.addDigit(9);
		t.setText(""+Operand.val);
	}
	}
class ButtonBackspaceHandler implements ActionListener{
	TextField t;
	Operand op;
	public ButtonBackspaceHandler(TextField t,Operand op){
		this.t=t;
		this.op=op;
	}
	public void actionPerformed(ActionEvent pushingButtonBackspace){
		op.deleteLastDigit();
		t.setText(""+Operand.val);
	}
	}
class ButtonEnterHandler implements ActionListener{
	Operand op;
	TextField t;
	public ButtonEnterHandler(Operand op,TextField t){
		this.op=op;
		this.t=t;
	}
	public void actionPerformed(ActionEvent pushingButtonEnter){
		t.setText("Enter");
		op.complete();
	}
	}
class ButtonCEHandler implements ActionListener{
	Operand op;
	TextField t;
	public ButtonCEHandler(Operand op,TextField t){
		this.op=op;
		this.t=t;
	}
	public void actionPerformed(ActionEvent pushingButtonCE){
		t.setText("CE");
		op.reset();
	}
	}
class ButtonCHandler implements ActionListener{
	Operand op;
	TextField t;
	public ButtonCHandler(Operand op,TextField t){
		this.op=op;
		this.t=t;
	}
	public void actionPerformed(ActionEvent pushingButtonC){
		t.setText("C");
		op.clearLastValue();
	}
	}
class ButtonDotHandler implements ActionListener{
	public void actionPerformed(ActionEvent pushingButtonDot){
		System.out.println(".");
		}
	}
class ButtonEqualsHandler implements ActionListener{
	Operand op;
	TextField t;
	public ButtonEqualsHandler(Operand op,TextField t){
		this.op=op;
		this.t=t;
	}
	public void actionPerformed(ActionEvent pushingButtonEquals){
		t.setText(""+Operand.val);
	}
	}
}
