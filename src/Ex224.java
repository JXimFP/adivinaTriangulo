import java.util.Scanner;

public class Ex224 {
    public static void main(String[] args)
    {
        String palabra;
        Scanner sc=new Scanner(System.in);
        int cont=0;

        System.out.print("Escribe una frase: ");
        palabra=sc.nextLine();
        String[] palabras=palabra.split(" ");
        System.out.println("Esta es la palabra al reves:");
        for(cont=palabras.length-1;cont>=0;cont--)
        {
            System.out.print(palabras[cont]+" ");
        }
    }
}
