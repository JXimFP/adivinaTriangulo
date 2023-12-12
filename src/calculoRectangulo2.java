
import java.util.Scanner;

public class calculoRectangulo2 
{
	public static void main(String[] args) 
	{
		int largo, ancho;
		double perimetro;
		double area;
		Scanner sc = new Scanner (System.in);

		System.out.print("Escribe el largo del rectangulo:");
		largo= sc.nextInt();
		System.out.print("Escribe el anvho del rectangulo:");
		ancho= sc.nextInt();
		perimetro= (largo+ancho)*2;
		area= largo*ancho;
		System.out.println("El perimetro de un rectangulo es "+ perimetro +" y el area es "+ area);
	}
}
