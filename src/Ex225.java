import java.util.Scanner;

public class Ex225 {
    public static void main(String[] args)
    {
        char[] letrasDni={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dni=0, resto=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Escribe tu DNI sin la letra:");
        dni=sc.nextInt();
        resto=dni % 23;
       System.out.println(dni +""+ letrasDni[resto]);
    }
}