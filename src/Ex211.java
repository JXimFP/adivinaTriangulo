import java.util.Scanner;

public class Ex211 {
    public static void main(String[] args)
    {
        double nota=0.0;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Pon la nota del alumno del 1 - 10");
        nota=sc.nextDouble();
        if(nota>=9 && nota<=10)
        {
            System.out.println("Tiene un Sobresaliente");
        }
        else if(nota>=6.5 && nota<9)
        {
            System.out.println("Tiene un Notable");
        }
        else if(nota>=5 && nota<6.5)
        {
            System.out.println("Tiene un Suficiente");
        }
        else 
        {
            System.out.println("Tiene un insuficiente");
        }
    }
}
