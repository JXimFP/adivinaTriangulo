public class Ex22F {
    public static void main(String[] args)
    {
        int[] porcentajeSalidas={0, 0, 0, 0, 0, 0};
        int pares=0, inpares=0, dado=0, cont=0;

        for(cont=1;cont<=10;cont++)
        {
            dado=lanzamiento();
            porcentajeSalidas[dado-1]+=1;
            System.out.println("Lanzamiento "+ cont +": "+ dado);
            if(dado%2==0)
            {
                pares+=dado;
            }
            else
            {
                inpares+=dado;
            }
        }
        System.out.println("La suma de todos los pares que han salido es "+ pares);
        System.out.println("La suma de todos los inpares que han salido es "+ inpares);
        System.out.println("Este es el porcentaje de vezes que ha salido cada cara");
        for(cont=0;cont<porcentajeSalidas.length;cont++)
        {
            System.out.println(cont+1 +" -> "+ porcentajeSalidas[cont]*10 +"%");
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
