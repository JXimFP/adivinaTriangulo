import java.util.Scanner;

public class EX201 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1=0, num2=0, num3=0;

        System.out.print("Escribe el numero de un lado del triangula: ");
        num1=sc.nextInt();
        System.out.print("Escribe el numero de otro lado del triangulo: ");
        num2=sc.nextInt();
        System.out.print("Escribe el numero de el ultimo lado del triangulo: ");
        num3=sc.nextInt();
        int resp=trianRectan(num1,num2,num3);

        if(num1==num2 && num2==num3)
        {
            System.out.print("Es un triangulo Equilátero");
        }
        else if(resp==1)//Este if es un apaño porque havia hecho el ejercicio con el void y queria juntarlo
        {
            System.out.println("Es un triangulo rectangulo y la hipotenusa es "+ num3*num3);
        }
        else if(resp==2)//Este if es un apaño porque havia hecho el ejercicio con el void y queria juntarlo
        {
            System.out.println("Es un triangulo rectangulo y la hipotenusa es "+ num2*num2);
        }
        else if(resp==3)//Este if es un apaño porque havia hecho el ejercicio con el void y queria juntarlo
        {
            System.out.println("Es un triangulo rectangulo y la hipotenusa es "+ num3*num3);
        }
        else if((num1==num2 && num1!=num3) || num1==num3 || num2==num3)
        {
            System.out.println("Es un triangulo isosceles");
        }
        else
        {
            System.out.println("Es un triangulo escaleno");
        }
    }

    
    
    
    public static int trianRectan (int numero1, int numero2, int numero3)
    {
        int esOno=0;
        numero1=numero1*numero1;
        numero2=numero2*numero2;
        numero3=numero3*numero3;

        if(numero1+numero2==numero3)
        {
            esOno=1;
        }
        else if(numero3+numero1==numero2)
        {
            esOno=2;
        }
        else if(numero2+numero3==numero1)
        {
            esOno=3;
        }
        else
        {
            esOno=0;
        }
        return esOno;
    }
}
