import java.util.Scanner;

public class perimetroTriangulo 
{
    public static void main(String[] args)
    {
        int base=10, alto=3;
        double area;
        Scanner sc= new Scanner (System.in);

        System.out.print("Escribe un la base del triangulo: ");
        base= sc.nextInt();
        System.out.print("Escribe un la altura del triangulo: ");
        alto= sc.nextInt();
        area=(double)(base*alto)/2;
        System.out.println("El area del triangulo es: "+ area);
    }
}