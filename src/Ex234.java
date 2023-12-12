import java.util.Scanner;

public class Ex234 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ancho=0, alto=0, separacion=0;
        boolean anchoCorrecto=false, altoCorrecto=false;

        do
        {
            System.out.print("En que posicion quieres poner la ventana (El maximo es 80): ");
            separacion=sc.nextInt();
            if(separacion>=80)
            {
                System.out.println("No puede ser mayor a 80");
            }
        }while(separacion>=80);
        do
        {
            System.out.print("Dime el ancho del rectangulo:");
            ancho=sc.nextInt();
            if(ancho<=0 || ancho+separacion>=80)
            {
                System.out.println("Recuerda, entre 0 y "+ (80-separacion));
            }
            else
            {
                anchoCorrecto=true;
            }
        }while(!anchoCorrecto);
        ancho+=4;
        do
        {
            System.out.print("Dime el alto del rectangulo (Deve ser entre 0 y 22):");
            alto=sc.nextInt();
            if(alto<0 || alto>22)
            {
                System.out.println("Recuerda, entre 0 y 22");
            }
            else
            {
                altoCorrecto=true;
            }
        }while(!altoCorrecto);
        PrintarRectangulo(ancho, alto, separacion);
    }

    public static void PrintarRectangulo(int anchoSumado, int altura, int separacionNecesaria)
    {
        String linea="";
        int cont=0, cont2=0, cont3=0, separacionMasAncho=separacionNecesaria+anchoSumado;

        
        for(cont=0;cont<separacionMasAncho;cont++)
        {
            if(cont>=separacionNecesaria)
            {
                System.out.print("*");
                linea+="*";
            }
            else
            {
                System.out.print(" ");
                linea+=" ";
            }
        }
        System.out.print("\n");
        for(cont=0;cont<altura;cont++)
        {
            for(cont2=0;cont2<separacionMasAncho;cont2++)
            {
                if(cont2>=separacionNecesaria)
                {
                    if(cont2==separacionMasAncho-1 || cont2==separacionNecesaria)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        if(altura==1)
        {
            System.out.print(linea);
        }
    }
}