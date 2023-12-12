import java.util.Scanner;

public class Ex222 {
    public static void main(String[] args)
    {
        int cont=0, resp=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantos numero quieres escribir: ");
        resp=sc.nextInt();
        int[] numeros=new int[resp];//Crear un array
        puntoComa(numeros);
        int[] arrayYaIncrementa= arrayIncrementado(numeros);
        System.out.println("Array incrementado ");
        for(cont=0;cont<arrayYaIncrementa.length;cont++)
        {
            System.out.println(arrayYaIncrementa[cont]);
        }
    }

    public static void puntoComa(int []num1)
    {
        int cont=0;

        for(cont=0;cont<num1.length;cont++)
        {
            System.out.print(num1[cont]);
            if (cont!=num1.length-1) System.out.print(";");
        }
    }
    

    public static int[] arrayIncrementado (int []numIncrementar)
    {
        int cont=0;
        int[] incrementado=new int[numIncrementar.length];

        for(cont=0;cont<numIncrementar.length;cont++)
        {
            incrementado[cont]=numIncrementar[cont]+1;
        }
        return incrementado;
    }
}
