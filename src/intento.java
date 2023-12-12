import java.util.ArrayList;
import java.util.Scanner;

public class intento {
    public static void main(String[] args)
    {
        ArrayList<Integer> numeros=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int resp=0;

        resp=sc.nextInt();
        for(int cont=0;cont<=resp;cont++)
        {
            numeros.add(cont);
        }

        for(int cont2=0;cont2<numeros.size();cont2++)
        {
            System.out.println(numeros.get(cont2));
        }
        Integer numero = Integer.parseInt("5");
        System.out.println(numero + 5);
    }
}