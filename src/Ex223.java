import java.util.Scanner;



public class Ex223 {
    public static void main(String[] args)
    {
        int cont, resp=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Cuantos numeros quieres poner?");
        resp=sc.nextInt();
        int []numeros1=new int[resp];
        for(cont=0;cont<resp;cont++)
        {
            System.out.print("Pon un numero: ");
            numeros1[cont]=sc.nextInt();
        }
        System.out.println("Los numeros pares que has proporcionado son:");
        for(cont=0;cont<resp;cont++)
        {
            if(numeros1[cont]%2==0)
            {
              System.out.println( numeros1[cont]);  
            }
        }
    }
}
