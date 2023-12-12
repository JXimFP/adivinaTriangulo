import java.util.Scanner;

public class PRUEBA
{
    public static void main (String[] args)
    {
        char[][] tablero = new char[9][9];
        char columnaResp;
        Scanner sc=new Scanner(System.in);
        int linea=0, resp=0, cont=0, cont2=0;
        String columnaRespString;

        do
        {
            System.out.println("Que quieres hacer\n1- Limpiar tablero\n2- Cambiar valor de un cuadrado");
            resp=sc.nextInt();
            sc.nextLine();
            if(resp==1)
            {
                tablero=limpiezaTablero(tablero);
            }
            else if(resp==2)
            {
                System.out.println("Escribe en que columna esta(A-I)");
                columnaRespString=sc.nextLine();
                columnaResp=columnaRespString.charAt(0);
                System.out.println("Escribe en que linea esta(1-9)");
                linea=sc.nextInt();
                tablero=cuadroCambiar(tablero, columnaResp, linea);   // Llamar la funcion
                for(cont=0; cont<tablero.length;cont++)
                {
                    for(cont2=0;cont2<tablero[cont].length;cont2++)
                    {
                        System.out.print(tablero[cont][cont2]+" ");
                    }
                    System.out.print("\n");
                }
            }
        }while(resp!=3);
    }
    public static char[][] limpiezaTablero(char[][] tableroInicial)
    {
        int cont=0, cont2=0;
          
        for(cont=0; cont<tableroInicial.length;cont++)
        {
        for(cont2=0;cont2<tableroInicial[cont].length;cont2++)
            {
                tableroInicial[cont][cont2]=' ';
            }
        }
        return tableroInicial;
    }
    public static char[][] cuadroCambiar(char[][] tableroEditar, char columna, int linea)//Quiero que me diga la columna y la linea
    {
        char[] columnas={'A','B','C','D','E','F','G','H','I'};
        int numeroColumna=0;
        
        for(int cont=0;cont<columnas.length;cont++)
        {
            if(columna==columnas[cont])
            {
                numeroColumna=cont;
            }
        }
        if(tableroEditar[numeroColumna][linea]=='X')
        {
            tableroEditar[numeroColumna][linea]=' ';
        }
        else if(tableroEditar[numeroColumna][linea]==' ')
        {
            tableroEditar[numeroColumna][linea]='X';
        }
        return tableroEditar;
    }
}
