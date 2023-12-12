public class calculoDeEcuacion
{
	public static void main(String[] args)
	{
		int a = 4, b = 5, c = 1;
		double sol1 = 0;
		double sol2 = 0;

		sol1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		sol2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(sol1);
		System.out.println(sol2);
	}
}