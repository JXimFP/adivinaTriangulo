import java.util.Scanner;

public class Ex230P2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int base=0, cont=0;
        boolean baseCorrecta=false;

        do
        {
            System.out.print("Escribe la base del triangulo que este entre 3 - 50: ");
            base=sc.nextInt();
            if(base>=3 && base<=50)
            {
                baseCorrecta=true;
            }
            else
            {
                System.out.println("Como ya he dicho tiene que estar entre 3 y 50, porfavor intentalo otra vez.");
            }
        }while(!baseCorrecta);
        
        do
        {
            for(int cont2=0;cont2<=cont;cont2++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            cont+=1;
        }while(base!=cont);
    }
}
