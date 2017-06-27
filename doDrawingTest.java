//Main class to practice Inheritance and Abstract

public class doDrawingTest
{
	public static void main(String[] args)
	{
		DrawCircle C = new DrawCircle();
		DrawLine L = new DrawLine();
		doDrawing(C);
		doDrawing(L);
		doDrawing(L);
		doDrawing(C);
		doDrawing(C);
		doDrawing(L);
		doDrawing(C);
		

	}
	static public void doDrawing(Draw g)
	{
		g.Drawing();
	}
}

