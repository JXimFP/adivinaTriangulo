import java.util.Scanner;

public class tresEnRayaBot {
    public static void main(String[] args)
    {
        char[][] tabla={{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char turnos=' ';
        String respX, respO;
        Scanner sc=new Scanner(System.in);
        boolean linea=false, posicionCorrecta=false;

        do
        {
            do
            {
                turnos='X';
                System.out.println("Jugador 1 escribe donde quieres la X: ");
                respX=sc.nextLine();
                posicionCorrecta=comprobarLetra(tabla, respX);
                if(posicionCorrecta==false)
                {
                    System.out.println("Esta casilla esta ocupada, intentalo de nuevo");
                }
            }while(!posicionCorrecta);
            tabla=asignarLetra(tabla, respX, turnos);
            imprimirTablero(tabla);
            linea=comprobacioGanar(tabla, turnos);
            if(linea==true)
            {
                break;
            }
            posicionCorrecta=false;
            do
            {
                turnos='O';
                Math.random();
                respO=respuestaBot();
                posicionCorrecta=comprobarLetra(tabla, respO);
            }while(!posicionCorrecta);
            tabla=asignarLetra(tabla, respO, turnos);
            linea=comprobacioGanar(tabla, turnos);
            imprimirTablero(tabla);
        }while(!linea);
        System.out.println("Enorabuena al jugador con "+turnos);
    }


    public static boolean comprobacioGanar(char[][] tablaComprobar, char turno)
    {
        int cont=0, cont2=0, horitzontal=0, vertical=0;
        boolean tresRaya=false;

        for(cont=0;cont<3;cont++) // Comprobar lineas horitssontal
        {
            for(cont2=0;cont2<3;cont2++)
            {
                if(tablaComprobar[cont][cont2]==turno)
                {
                    horitzontal+=1;
                }
            }
            if(horitzontal==3)
            {
                tresRaya=true;
            }
            else
            {
                horitzontal=0;
            }
        }
        for(cont=0;cont<3;cont++) // Comprobar lineas vertical
        {
            for(cont2=0;cont2<3;cont2++)
            {
                if(tablaComprobar[cont2][cont]==turno)
                {
                    vertical+=1;
                }
            }
            if(vertical==3)
            {
                tresRaya=true;
            }
            else
            {
                vertical=0;
            }
        }
        if(tablaComprobar[0][0]==turno && tablaComprobar[1][1]==turno && tablaComprobar[2][2]==turno)
        {
            tresRaya=true;
        }
        else if(tablaComprobar[0][2]==turno && tablaComprobar[1][1]==turno && tablaComprobar[2][0]==turno)
        {
            tresRaya=true;
        }
        return tresRaya;
    }

    public static void imprimirTablero(char[][] tablerito)
    {
        System.out.println("A   B   C");
        for(int cont=0; cont<3;cont++)
        {
            for(int cont2=0;cont2<3;cont2++)
            {
                System.out.print(tablerito[cont][cont2] +" | ");
            }
            System.out.print("\n");
            System.out.println("- - - - -");
        }
    }

    public static boolean comprobarLetra(char[][] tablerinchi, String posicion)   // Comprobar si esta ocupado
    {
        int columna=0, lineal=0;
        boolean ocupado=false;
        
        for(int cont=0;cont<2;cont++)
        {
            if(posicion.charAt(cont)=='a')
            {
                columna=0;
            }
            else if(posicion.charAt(cont)=='b')
            {
                columna=1;
            }
            else if(posicion.charAt(cont)=='c')
            {
                columna=2;
            }
            else if(posicion.charAt(cont)=='1')
            {
                lineal=0;
            }
            else if(posicion.charAt(cont)=='2')
            {
                lineal=1;
            }
            else if(posicion.charAt(cont)=='3')
            {
                lineal=2;
            }
        }
        if(tablerinchi[lineal][columna]=='X' || tablerinchi[lineal][columna]=='O')
        {
            ocupado=false;
        }
        else
        {
            ocupado=true;
        }
        return ocupado;
    }


    public static char[][] asignarLetra(char[][] tablerinchi, String posicion, char turno)   // Comprobar si esta ocupado
    {
        int columna=0, lineal=0;
        
        for(int cont=0;cont<2;cont++)
        {
            if(posicion.charAt(cont)=='a')
            {
                columna=0;
            }
            else if(posicion.charAt(cont)=='b')
            {
                columna=1;
            }
            else if(posicion.charAt(cont)=='c')
            {
                columna=2;
            }
            else if(posicion.charAt(cont)=='1')
            {
                lineal=0;
            }
            else if(posicion.charAt(cont)=='2')
            {
                lineal=1;
            }
            else if(posicion.charAt(cont)=='3')
            {
                lineal=2;
            }
        }
        tablerinchi[lineal][columna]=turno;
        return tablerinchi;
    }


    public static String respuestaBot()
    {
        int a=0, r=0;
        String fusion="";
        char columnaBot=' ', lineaBot=' ';

        a= (int) (Math.random()*99 - 97)+97;
        columnaBot=(char) a;
        r= (int) (Math.random()*51 - 49)+49;
        lineaBot=(char) r;
        fusion+=columnaBot +""+ lineaBot;
        return fusion;
    }
}
