import java.util.Scanner;

public class Ex218 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        int numAleatori, resp, numPetit=1, numGros=101;
        
        System.out.println("Bienvenido a voy a adivinar tu numero");
        System.out.println("Enpecemos con las normas:\n 1- Piensa en un numero del 1 al 100\n 2- Yo te dire un numero y tienes que decir si es mayor, menor o si es el numero correcto\nFacil verdad, pues empecemos");

        do
        {
            numAleatori= (int) (Math.random()*(numGros-numPetit) + numPetit);// Es necesario poner *(numGros-numPetit) no se porque
            System.out.println("Tu numero es el "+ numAleatori);
            System.out.println("1- El numero es mayor\n2- El numero es menor\n3- El numero es correcto");
            resp=sc.nextInt();
            if(resp==1)
            {
                if(numAleatori>=numGros)
                {
                    do //Con esto quiero asegurarme de que no se equivoca
                    {
                        System.out.println("Te estas contradiciendo, voy a preguntar otra vez:");
                        System.out.println("1- El numero es mayor\n2- El numero es menor\n3- El numero es correcto");
                        resp=sc.nextInt();
                    }while(resp!=2 && resp!=3);
                }
                numPetit=numAleatori;
            }
            else if(resp==2)
            {
                if(numAleatori<=numPetit)
                {
                    do
                    {
                        System.out.println("Te estas contradiciendo, voy a preguntar otra vez:");
                        System.out.println("1- El numero es mayor\n2- El numero es menor\n3- El numero es correcto");
                        resp=sc.nextInt();
                    }while(resp!=1 && resp!=3);
                }
                numGros=numAleatori;
            }
        }while(resp!=3);
        System.out.print("Bien, he adivinado el numero");
    }
}
