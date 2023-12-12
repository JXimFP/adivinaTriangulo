import java.util.Scanner;

public class Ex226 {
    public static void main(String[] args)
    {
        char caracter;
        double numAleatori=0.0;
        int cont;

        for(cont=0;cont<15;cont++)
        {
            numAleatori= (double) (Math.random()*(1 - 0.1)+0.1);
            caracter=caracterDevuelto(numAleatori);
            System.out.println(cont +1 +"    "+ caracter);
        }
    }

    public static char caracterDevuelto (double num1)
    {
        char letra;

        if(num1 <=0.5)
        {
            letra='1';
            return letra;
        }
        else if(num1 >=0.51 && num1 <=0.7)
        {
            letra='X';
            return letra;
        }
        else
        {
            letra='2';
            return letra;
        }
    }
}
