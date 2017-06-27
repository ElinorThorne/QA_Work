
public class Exam
{
	int Phy, Chem, Math;
	float Total, Per;
	
	public void Calculate()
	{
		Total = Phy + Chem + Math;
		Per = Total * 100/450;
	}
	public showResult()
	{
		System.out.println("Total : " + Total);
		System.out.println("Percentage : " + Per);
	}
}
