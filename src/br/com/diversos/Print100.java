package br.com.diversos;

public class Print100 {

	public static void main(String[] args)
	{
		Print100 p = new Print100();
		p.print(100);
	}
	
	public void print(int number) {
		if (number>0) {
			if ((number%3 == 0) && (number%5 ==0)) 
				System.out.println("FooBaa");
			else if (number%3 == 0) 
				System.out.println("Foo");
			else if (number%5 == 0) 
				System.out.println("Baa");
			
			print(number-1);
		}
		return;
	}

}