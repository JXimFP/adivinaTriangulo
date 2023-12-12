import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex235 {
    public static void main(String[] args)
    {
        double[] precios={0.25, 0.37, 0.40, 0.45, 0.58, 1.23, 1.33, 1.45, 2.03, 3.01, 2.99};
        int pais=0;
        Scanner sc=new Scanner(System.in);
        boolean paisExistente=false;
        double precioTotal=0.0, peso=0.0;
        DecimalFormat df = new DecimalFormat("#.00");

        do
        {
            System.out.println("Pais destino:");
            System.out.println("1- Portugal");
            System.out.println("2- Francia");
            System.out.println("3- Italia");
            System.out.println("4- Reino Unido");
            System.out.println("5- Alemania o Grecia");
            System.out.println("6- Canadá");
            System.out.println("7- Estados Unidos");
            System.out.println("8- México");
            System.out.println("9- Colombia");
            System.out.println("10- Chile");
            System.out.println("11- Argentina");
            pais=sc.nextInt();
            if(pais>=0 && pais<=10)
            {
                paisExistente=true;
            }
            else
            {
                System.out.println("Error, este pais no esta en la lista, pon un pais que si lo este.");
            }
        }while(!paisExistente);
        System.out.print("Cuanto pesa el paquete: ");
        peso=sc.nextDouble();
        precioTotal=peso*precios[pais-1];
        System.out.println("El precio total ed de "+ df.format(precioTotal) +"euros");
    }
}
