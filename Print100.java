package exemplos;

public class Print100 {

	public static void main(String[] args)
	{
		for (int i=1; i <101; i++) {
			if ((i%3 == 0) && (i%5 ==0)) {
				System.out.println("FooBaa");
				continue;
			} else if (i%3 == 0) {
				System.out.println("Foo");
				continue;
			} else if (i%5 == 0) 
				System.out.println("Baa");
		}
		
	}

}
