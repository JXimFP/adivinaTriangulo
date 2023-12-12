import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex22A {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int tiempoLlamada=0;
        double dinero=0.0;
        String inicioLlamada;
/*
        Esta es la simulacion de la llamada

        System.out.print("Inicia la llamada dandole a Enter...");
        inicioLlamada=sc.nextLine();
        LocalDateTime locaDate1 = LocalDateTime.now();
        int minutesInicio = locaDate1.getMinute();                // Saber el minuto inicial

        System.out.print("Final la llamada dandole a Enter...");
        inicioLlamada=sc.nextLine();
        LocalDateTime locaDate2 = LocalDateTime.now();
        int minutesFinales = locaDate2.getMinute();               // Saber el minuto final
        tiempoLlamada=minutesFinales-minutesInicio;             //Saber tiempo total
*/
        System.out.print("Tiempo de llamada: ");
        tiempoLlamada=sc.nextInt();
        for(int cont=1;cont<tiempoLlamada;cont++)
        {
            if(cont<=5)
            {
                dinero+=1;
            }
            else if(cont>5 && cont<=8)
            {
                dinero+=0.80;
            }
            else if(cont>8 && cont<=10)
            {
                dinero+=0.70;
            }
            else
            {
                dinero+=0.50;
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Si es domingo, el precio total es de: "+ df.format(dinero+(dinero*0.03)));
        System.out.println("Si es algun dia lectivo o Sabado, si es por la mañana: "+ df.format(dinero+(dinero*0.15)));
        System.out.println("Si es algun dia lectivo o Sabado, si es por la tarde: "+ df.format(dinero+(dinero*0.10)));
    }
}
