package Java8;
import java.awt.*;
public class LambdaExpression 
{
	public static void main(String[] args) 
	{
		Frame frame=new Frame("Lambda Frame");
		Button btn=new Button("Click hare");
		btn.setBounds(50,50,50,50);
		btn.addActionListener(e -> System.out.println("Hi This is lambda Expression"));
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setSize(200,200);
		
		
	}

}
