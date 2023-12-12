import java.util.Scanner;

public class Ex233 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ancho=0, alto=0;
        boolean altoCorrecto=false;
        String nombreVentana="";

        System.out.print("Dime el nombre  de la ventana:");
        nombreVentana=sc.nextLine();
        ancho=nombreVentana.length()+ 4;
        do
        {
            System.out.print("Dime el alto del rectangulo (Deve ser entre 1 y 22):");
            alto=sc.nextInt();
            if(alto<1 || alto>23)
            {
                System.out.println("Recuerda, entre 0 y 22");
            }
            else
            {
                altoCorrecto=true;
            }
        }while(!altoCorrecto);
        PrintarRectangulo(ancho, alto, nombreVentana);
    }

    public static void PrintarRectangulo(int anchoSumado, int altura, String Frase)
    {
        String linea="";
        int cont=0;

        for(cont=0;cont<anchoSumado;cont++)
        {
            System.out.print("*");
            linea+="*";
        }
        System.out.print("\n");
        for(cont=0;cont<altura;cont++)
        {
            int cont3=0;
            for(int cont2=0;cont2<anchoSumado;cont2++)
            {
                if(cont2==0 || cont2==anchoSumado-1)
                {
                    System.out.print("*");
                }
                else if(cont2==1 || cont2==anchoSumado-2)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(Frase.charAt(cont3));
                    cont3++;
                }
            }
            System.out.print("\n");
        }
        System.out.print(linea);
    }
}
