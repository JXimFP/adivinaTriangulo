import java.util.Scanner;

public class Ex232 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ancho=0, alto=0;
        boolean anchoCorrecto=false, altoCorrecto=false;

        do
        {
            System.out.print("Dime el ancho del rectangulo (Deve ser entre 1 y 77):");
            ancho=sc.nextInt();
            if(ancho<=0 || ancho>=77)
            {
                System.out.println("Recuerda, entre 1 y 77");
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
        PrintarRectangulo(ancho, alto);
    }

    public static void PrintarRectangulo(int anchoSumado, int altura)
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
            for(int cont2=0;cont2<anchoSumado;cont2++)
            {
                if(cont2==0 || cont2==anchoSumado-1)
                {
                    System.out.print("*");
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
