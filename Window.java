import java.awt.*;

public class Window
{

	public static void main(String[] args)
	{
		Frame Win=new Frame();
		TextField T = new TextField();
		Button B = new Button("Click");
		Win.add(T,BorderLayout.NORTH);
		Win.add(B);
		Event E = new Event(T);
		B.addActionListener(E);
		Win.setSize(300,500);
		Win.setVisible(true);	

	}

}
