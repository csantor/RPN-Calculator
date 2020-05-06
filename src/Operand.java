public class Operand {
	public static int val;
	
    public void addDigit(int ch)
    {
        val=val*10+ch;
    }
    public void deleteLastDigit()
    {
        val=val/10;
        
    }
    public void complete()
    {
       //push tou telesteou sti stoiva
    	Calc.st.push(val);
    	val=0;
    }
    public void reset()
    {
    	while (!Calc.st.empty()){
    		Calc.st.pop();
    	}
    }
    public void clearLastValue()
    {
    	val=0;
    	System.out.println(val);
    }
}
