import java.util.Scanner;

public class Ex228 {
    public static void main(String[] args)
    {
        int resp, numeroDecimal=0, cont=0, numBin=0;
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("\nQue quieres hacer?\n1- Pasar de decimal a binario\n2- Pasar de binario a decimal\n3- Salir");
            resp=sc.nextInt();
            sc.nextLine();  //Limpiar el escaner
            switch(resp)
            {
                case 1:
                {
                    System.out.print("Escribe un numero: ");
                    numeroDecimal=sc.nextInt();
                    String numBinArray=decimalBinario(numeroDecimal); // Llamar funcio
                    System.out.print(numBinArray);
                    break;
                }
                case 2:
                {
                    System.out.println("Escribe un numero en binario: ");
                    String numBinario=sc.nextLine();
                    int longitud=numBinario.length();
                    numBin=binarioDecimal(numBinario, longitud); //Llamamos a la funcion
                    System.out.println(numBin);
                    break;
                }
            }
        }while(resp!=3);
    }

    public static int binarioDecimal(String numeroBinario, int longitudNBin)
    {
        char digito;
        int cont=0, numBinFuncion1=0;

        for(cont=0;cont<numeroBinario.length();cont++) //tenemos que pasar de String a caracter y a numero
        {
            digito=numeroBinario.charAt(cont);
            if(digito=='1')
            {
                numBinFuncion1+= Math.pow(2, longitudNBin - 1 - cont); // La formula funciona porque cojemos el tamaño total de lo que nos an dado, le restamos uno porque enpezamos desde el 0 y le restamos cont para que vaya decrementando a medida que avanzamos para seber la posicion
            }
        }
        return numBinFuncion1;
    }

    public static String decimalBinario(int dividido)
    {
        int cont=0;
        String resto="";
        boolean sal=false;

        do
        {
            if(dividido%2==1)
            {
                resto= "1"+resto;
            }
            else if(dividido%2==0)
            {
                resto= "0"+ resto;
            }
            dividido=dividido/2;
            if(dividido==1)
            {
                resto= "1"+resto;
                sal=true;
            }
            else if(dividido==0)
            {
                resto= "0"+resto;
                sal=true;
            }
            cont=cont+1;
        }while(!sal);
        return resto;
    }
}