import java.util.Scanner;

public class Ex22C {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String respuesta;
        boolean numerica=false, texto=false;

        System.out.print("Escribe lo que quieras: ");
        respuesta=sc.nextLine();
        for(int cont=0;cont<respuesta.length();cont++)
        {
            int letra=respuesta.charAt(cont);
            if(letra>=48 && letra<=57)
            {
                numerica=true;
            }
            else if(letra>=65 && letra<=90 || letra>=97 && letra<=122)
            {
                texto=true;
            }
        }
        if(numerica==true && texto==false)
        {
            System.out.println("El texto que as escrito en una cadena numérica");
        }
        else if(texto==true && numerica==false)
        {
            System.out.println("El texto que as escrito en una cadena texto");
        }
        else if(texto==true && numerica==true)
        {
            System.out.println("El texto que as escrito en una cadena alfanumérica");
        }
    }
}
