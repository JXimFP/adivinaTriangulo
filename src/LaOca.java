public class LaOca {
    public static void main(String[] args)
    {
        char[][] tableroOca=new char[8][8];

        imprimirTablero(tableroOca);
    }


    public static void imprimirTablero(char [][] tablero)
    {
        for(int cont=0;cont<tablero.length;cont++)
        {
            for(int cont2=0;cont2<tablero[cont].length;cont2++)
            {
                System.out.print("| "+ tablero[cont][cont2]);
            }
            System.out.print("\n");
            System.out.println("________________");
        }
    }

    public static int lanzamiento()
    {
        int[] carasDado={1, 2, 3, 4, 5, 6};
        int numAleatori=0;

        numAleatori= (int) (Math.random()*(0 - 6)+6);  // Has de obligar a se variable a que sigui int
        return carasDado[numAleatori];
    }
}
