import java.util.Scanner;

public class Ex220 {
    public static void main(String[] args)
    {
        int cont=0, resp=0, respMenu=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Cuantos numeros quieres añadir?");
        resp=sc.nextInt();
        int []cadenaNum=new int[resp];//crear un array
        for(cont=0;cont<cadenaNum.length;cont++)
        {
            System.out.println("Escribe un numero: ");
            cadenaNum[cont]=sc.nextInt();
        }
        do
        {
            System.out.println("Que quieres hacer\n1- Cuel es el valor maximo\n2- Cuel es el valor minimo\n3- Calcular la media\n4- Salir");
            respMenu=sc.nextInt();
            switch (respMenu) 
            {
                case 1:
                {
                    int valorMaximo=calculoValorMaximo(cadenaNum, cadenaNum.length);
                    System.out.println("El numero mas grande es " + valorMaximo);
                    break;
                }
                case 2:
                {
                    int valorMinim=calculoValorMinim(cadenaNum, cadenaNum.length);
                    System.out.println("El numero mas pequeño es " + valorMinim);
                    break;
                }
                case 3:
                {
                    int valorMedia=calculoValorMedia(cadenaNum, cadenaNum.length);
                    System.out.println("La media de los numeros es " + valorMedia);
                    break;
                }
            }
        }while(respMenu<=4);
    }

    public static int calculoValorMaximo(int []valores, int cantidad) //Funcion para calcular cual es el mas grande
    {
        int numGros=valores[0], cont=0;
        for(cont=0;cont<cantidad;cont++)
        {
            if(valores[cont]>=numGros)
            {
                numGros=valores[cont];
            }
        }
        return numGros;
    }

    public static int calculoValorMinim(int []valores, int cantidad) //Funcion para calcular cual es el mas pequeño
    {
        int numPetit=valores[0], cont=0;
        for(cont=0;cont<cantidad;cont++)
        {
            if(valores[cont]<=numPetit)
            {
                numPetit=valores[cont];
            }
        }
        return numPetit;
    }

    public static int calculoValorMedia(int []valores, int cantidad) //Funcion para calcular la media
    {
        int total=0, cont=0;
        for(cont=0;cont<cantidad;cont++)
        {
            total=valores[cont]+total;
        }
        total=total/cantidad;
        return total;
    }
}
