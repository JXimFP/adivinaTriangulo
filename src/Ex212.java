import java.util.Scanner;

public class Ex212 {
    public static void main(String[] args)
    {
        double precio=0.0, precioTotal=0.0, descuentomaximo=0.0, descuento=0.0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Pon el descuento maximo: ");
        descuentomaximo = sc.nextDouble();
        do
        {
            System.out.print("Pon el precio del producto: ");
            precio = sc.nextDouble();
            if(precio<0)
            {
                System.out.println("El precio no puede ser negativo");
            }
        }while(precio<0);
        if(precio>=100.0)//Saber si el descuento es meyor al maximo
        {
            descuento = (precio*8)/100;
            if(descuento > descuentomaximo)
            {
                precioTotal= precio-descuentomaximo;//Igualar el descuento maximo
            }
            else
            {
                precioTotal= precio - descuento;
            }
        }
        else
        {
            precioTotal = precio;
        }
        System.out.print("El precio total es de "+ precioTotal);
    }
}
