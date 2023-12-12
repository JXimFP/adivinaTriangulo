import java.util.Scanner;

public class Ex230 {
    public static void main(String[] args)
    {
        String numHexadecimal;
        int numeroDecimal=0, cont=0, resp=0;
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("Menu\n1- Pasar de decimal a Hexadecimal\n2- Pasar de hexadecimal a decimal\n3- Salir");
            resp=sc.nextInt();
            sc.nextLine();
            switch (resp) {
            case 1:
                System.out.print("Escribe el numero decimal: ");
                numeroDecimal=sc.nextInt();
                char[] numeroPasadoHexa=pasandoAHexadecimal(numeroDecimal);
                System.out.print("El numero en Hexadecimal es: ");
                for(cont=0;cont<numeroPasadoHexa.length;cont++)
                {
                    System.out.print(numeroPasadoHexa[cont]);
                }
                break;
            case 2:
                System.out.print("Escribe el numero hexadecimal: ");
                numHexadecimal=sc.nextLine();
                numeroDecimal=HexadecimalDecimal(numHexadecimal);
                System.out.println(numeroDecimal);
                break;
        }
        }while(resp!=3);
    }

    public static char[] pasandoAHexadecimal(int numDecimal)
    {
        int resto[]=new int[5];
        boolean sal=false;
        int cont=0, regre=4;
        String hexadecimal="0123456789ABCDEF";
        char numPasadoHexa[]=new char[5];

        do
        {
            resto[cont]=numDecimal%16;
            numDecimal=numDecimal/16;
            if(numDecimal<=15)
            {
                resto[cont+1]=numDecimal;
                sal=true;
            }
            cont=cont+1;
        }while(!sal);
        for(cont=0;cont<resto.length;cont++)
        {
            char letraHEX=hexadecimal.charAt(resto[cont]);// Le decimo que el numero que esta dentro de la posicion de resto nos indique que caracter de hexadecimal es el correcto
            numPasadoHexa[regre]=letraHEX;
            regre=regre-1;
        }
        return numPasadoHexa;
    }


    public static int HexadecimalDecimal(String numeroHexa)
    {
        char[] Hexadecimales={'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int cont=0, numBinFuncion1=0;

        for(cont=0;cont<numeroHexa.length();cont++)
        {
            for(int cont2=0;cont2<Hexadecimales.length;cont2++)
            {
                if(numeroHexa.charAt(cont)==Hexadecimales[cont2])  // Saber que numero es en exadecimal
                {
                    numBinFuncion1+= cont2 * Math.pow(16, numeroHexa.length() - 1 - cont); // La formula funciona porque cojemos el tamaño total de lo que nos an dado, le restamos uno porque enpezamos desde el 0 y le restamos cont para que vaya decrementando a medida que avanzamos para seber la posicion
                }
            }
        }
        return numBinFuncion1;
    }
}
