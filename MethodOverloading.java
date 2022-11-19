package Overloading;

public class MethodOverloading {
	
		
		void A(int x,int y)
		{
			int z=x+y;
			System.out.println("Addition of Number is"+z);
		}
		void A(int x, float y)
		{
			float z=x+y;
			System.out.println("Addition of Number is"+z);
		}
		void A(float x,int y)
		{
			float z=x+y;
			System.out.println("Addition of Number is"+z);
		}
	
	
	public static void main(String[] args) {
		MethodOverloading a=new MethodOverloading();
		a.A(21,3);
		a.A(254,3.1f);
		a.A(545.1f,3);

	}

}
