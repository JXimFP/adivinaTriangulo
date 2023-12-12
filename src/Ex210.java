import java.util.Scanner;

public class Ex210 {
    public static void main(String[] args)
    {
        double precio=0.0, precioTotal=0.0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Pon el precio del producto: ");
        precio = sc.nextDouble();
        if(precio>=100.0)
        {
            precioTotal= precio-(precio*8)/100;
        }
        else
        {
            precioTotal=precio;
        }
        System.out.print("El precio total es de "+ precioTotal);
    }
}
