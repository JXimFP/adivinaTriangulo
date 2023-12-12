

public class Ex227 {
    public static void main(String[] args)
    {
        int[][] caracter=new int[3] [2];
        double numAleatori=0.0;
        int cont=0, cont2=0;

        for(cont=0;cont<caracter.length;cont++)
        {
            for(cont2=0;cont2<caracter[cont].length;cont2++)
            {
                numAleatori= (double) (Math.random()*(1 - 0.1)+0.1);
                caracter[cont][cont2]=caracterDevuelto(numAleatori);
            }
        }
        for(cont=0;cont<caracter.length;cont++)
        {
            System.out.print("[");
            for(cont2=0;cont2<caracter[cont].length;cont2++)
            {
                System.out.print(caracter[cont][cont2]+",");
            }
            System.out.print("]");
        }
    }

    public static int caracterDevuelto (double num1)
    {
        char letra;

        if(num1 <=0.5)
        {
            letra=1;
            return letra;
        }
        else if(num1 >=0.51 && num1 <=0.7)
        {
            letra='X';
            return letra;
        }
        else
        {
            letra=2;
            return letra;
        }
    }
}
