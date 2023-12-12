import java.util.Scanner;

public class Ex215 {
    public static void main(String[] args)
    {
        int temp=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Que temperatura hace?");
        temp=sc.nextInt();
        if(temp>=21)
        {
            System.out.println("Activa el aire acondicionado");
        }
        else if(temp<=18)
        {
            System.out.println("Desactive el aire acondicionado");
        }
    }
}
