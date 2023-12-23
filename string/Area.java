

package string;

	import java.util.Scanner;

	public class Area{

		public static double rectangle(double l,double b) {
			double area=l*b;
			return area;
		}
		public static double square(double a) {
			double area=a*a;
			return area;
		}
		public static double triangle(double l,double b) {
			double area=0.5*l*b;
			return area;
		}

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the length and breath:");
		double length=in.nextDouble();
			double breath=in.nextDouble();
			
			System.out.println("Area of Rectangle="+rectangle(length,breath));
			System.out.println("Area of Square="+square(length));
			System.out.println("Area of Triangle="+triangle(length,breath));
			
		}

	}


