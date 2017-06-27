import java.awt.*;
import java.awt.event.*;

public class Event implements ActionListener
{
	TextField x;
	public Event(TextField T)
	{
		x = T;
	}
	public void actionPerformed(ActionEvent ae)
	{
		x.setText("Bonjourno");
	}

}
