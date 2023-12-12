import java.util.Scanner;

public class Ex213 {
    public static void main(String[] args)
    {
        int num1=0, num2=0, resp=0;
        double total=0.0;
        Scanner sc= new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        num1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        num2 = sc.nextInt();
        System.out.println("¿Que quieres hacer? \n1- Sumar\n2- Restar\n3- Multiplicar\n4- Dividir");
        resp = sc.nextInt();
        switch(resp)
        {
            case 1:
            {
                total=num1+num2;
                System.out.println("La seuma es "+ total);
                break;
            }
            case 2:
            {
                total=num1-num2;
                System.out.println("La resta es "+ total);
                break;
            }
            case 3:
            {
                total=num1*num2;
                System.out.println("La multiplicacion es "+ total);
                break;
            }
            case 4:
            {
                total=num1/num2;
                System.out.println("La division es "+ total);
                break;
            }
        }
    }
}
