import java.util.Scanner;

public class Ex216 {
    public static void main(String[] args)
    {
        double hora=0.0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Que hora es? ");
        hora=sc.nextDouble();
        if(hora >= 9.00 && hora<=13.59)
        {
            System.out.println("Es horario de trabajo");
        }
        else if(hora>=14.00 && hora<=14.59)
        {
            System.out.println("Es tiempo libre");
        }
        else if (hora >= 16.00 && hora<=19.00)
        {
            System.out.println("Es horario de trabajo");
        }
    }
}
