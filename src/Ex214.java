import java.util.Scanner;

public class Ex214 {
    public static void main(String[] args)
    {
        int numeroMes=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Que numero de mes quieres poner: ");
        numeroMes=sc.nextInt();
        if(numeroMes==2)
        {
            System.out.println("Este mes tiene 28 0 29 días");
        }
        else if(numeroMes==4 || numeroMes==6 || numeroMes==9 || numeroMes==11)
        {
            System.out.println("Este mes tiene 30 días");
        }
        else if(numeroMes==1 || numeroMes==3 || numeroMes==5 || numeroMes==7 || numeroMes==8 || numeroMes==10 || numeroMes==12)
        {
            System.out.println("Este mes tiene 30 días");
        }
        else
        {
            System.out.println("El numero es incorrecto");
        }
    }
}
