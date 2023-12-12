import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int altura=0, cont=1, cerca=0, lejos=0, base=0, tronco=0;
        String colorines="";
        
        System.out.print("Escribe la base del triangulo que que deve ser un numero inpar: ");
        altura=sc.nextInt();
        base=calculoBase(altura);
        cerca=(base/2);
        lejos=(base/2);
        tronco=(base/2);
        do
        {
            for(int cont2=0;cont2<base;cont2++)
            {
                if(cont==1 && cont2==tronco)
                {
                    System.out.print("\u001B[33m+");
                }
                else if(cont2<cerca || cont2>lejos)
                {
                    System.out.print(" ");
                }
                else if(cont2>=cerca && cont2<=lejos)
                {
                    colorines=bolasNavidad(colorines);
                    System.out.print(colorines);
                }
            }
            System.out.print("\n");
            cerca-=1;
            lejos+=1;
            cont+=1;
        }while(altura!=cont);
        cerca=tronco-1;
        lejos=tronco+2;
        for(int cant=0;cant<3;cant++)
        {
            for(cont=0;cont<lejos;cont++)
            {
                if(cont>=cerca && cont<=lejos)
                {
                    System.out.print("\u001B[33mH");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int calculoBase(int alturatriangulo)
    {
        int basado=1;
        for(int cont=0;cont<alturatriangulo;cont++)
        {
            basado+=2;
        }
        return basado;
    }

    public static String bolasNavidad(String colorAnterior)
    {
        int numAleatori= (int) (Math.random()*(0 - 100)+100);
        int colorAleatorio= (int) (Math.random()*(0 - 4)+4);
        String colores[]={"\u001B[34m@", "\u001B[31m@", "\u001B[35m@", "\u001B[33m@"};
        String color="";

        if(numAleatori<80 || colorAnterior.equals("\u001B[31m@") || colorAnterior.equals("\u001B[34m") || colorAnterior.equals("\u001B[35m@") || colorAnterior.equals("\u001B[33m@"))
        {
            color="\u001B[32m#"; // Verde
        }
        else
        {
            color=colores[colorAleatorio];
        }
        return color;
    }
}
