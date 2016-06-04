import javax.swing.*;
public class Detyra7_7_2
{	public String hiqi(String s)
	{	String pergjigja = "";
		for (int i = 0;i != s.length();i = i + 1)
			{  if (nukGjendetNe(pergjigja,s.charAt(i)))
				{	pergjigja = pergjigja + s.charAt(i);}
			}
		return pergjigja;
	}
	
	
	
	public boolean nukGjendetNe(String a,char c)
	{	boolean nukGjendet = true;
		for (int j = 0; j != a.length();j = j + 1)
			{	nukGjendet = nukGjendet && (c != a.charAt(j));}
		return nukGjendet;
	}

	public static void main(String[] args)
	{	Detyra7_7_2 k = new Detyra7_7_2();
		String hyrja = JOptionPane.showInputDialog("Shkruaje fjalen:");
		String heqja = k.hiqi(hyrja);
		JOptionPane.showMessageDialog(null,heqja);
	}
}

