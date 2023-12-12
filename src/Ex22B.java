import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex22B {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pesoPaquete=0, zonaGeo=0;
        boolean pesoCorrecto=false, zonaCorrecta=false;
        double precioTotal=0.0, precioCasiTotal=0.0;

        do
        {
            System.out.println("Cuanto pesa el paquete?(Peso minimo 750gr)");
            pesoPaquete=sc.nextInt();
            if(pesoPaquete<750)
            {
                System.out.println("El peso no puede ser menor a 750");
            }
            else
            {
                pesoCorrecto=true;
            }
        }while(!pesoCorrecto);
        do
        {
            System.out.println("A donde se va a enviar el paquete?\n 1- Europa\n 2- America del Norte\n 3- América Central\n 4- América del Sur\n 5- Asia.");
            zonaGeo=sc.nextInt();
            if(zonaGeo<1 || zonaGeo>5)
            {
                System.out.println("No hay mas zonas, porfavor revisa las posibilidades");
            }
            else
            {
                zonaCorrecta=true;
            }
        }while(!zonaCorrecta);
        precioCasiTotal=Precio_peso(pesoPaquete);
        precioTotal=precioCasiTotal+calculoDestino(precioCasiTotal, zonaGeo);
        DecimalFormat df = new DecimalFormat("#.00");                       // Obliga a que el formato sea de dos numeros finales xx,00
        System.out.println("El precio total del envio es de "+ df.format(precioTotal) +" euros");
    }


    public static double Precio_peso(double pesoCalcular)
    {
        pesoCalcular=pesoCalcular*0.05;
        return pesoCalcular;
    }

    public static double calculoDestino(double precioPeso, int region)
    {
        double devolverSumDestino=0.0;
        double[] regiones={0.07, 0.12, 0.15, 0.18, 0.20};
        
        devolverSumDestino=regiones[region-1]*precioPeso;
        return devolverSumDestino;
    }
}
