import java.util.Scanner;

public class SumaBinaria {
    public static void main(String[] args)
    {
        char[] numBin={'0', '0', '0', '0'};
        int resp=0, cont=0;
        Scanner sc=new Scanner(System.in);
        boolean sortir=false;

        System.out.println("Dime un numero decimal: ");
        resp=sc.nextInt();
        for(cont=resp-1;cont>=0;cont--)
        {
            int cont2=3;
            if(numBin[cont2]=='0')
            {
                numBin[cont2]='1';
            }
            else if(numBin[cont2]=='1')
            {
                numBin[cont2]='0';
                cont2=cont2-1;
                do
                {
                    if(numBin[cont2]=='1')
                    {
                        numBin[cont2]='0';
                        cont2=cont2-1;
                    }
                    else
                    {
                        numBin[cont2]='1';
                        sortir=true;

                    }
                }while(sortir!=true);
            }
        }
        for(cont=0;cont<numBin.length;cont++)
        {
            System.out.print(numBin[cont]);
        }
    }
}
