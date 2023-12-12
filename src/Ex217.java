import java.util.Scanner;

public class Ex217 {
    
    public static void main(String[] args)
    {
        int numIncognita, resp=0, vidas=5;
        Scanner sc = new Scanner (System.in);

        numIncognita= (int) (Math.random()*(101-1) + 1);
        System.out.println("Bienvenido a Adivina mi numero.");
        System.out.println("Como puedes sospexar la finalidad del juego es adivinar el numero en el que estoy pensando.\nLas normas son sencillas:\n 1- Pensare un numero del 1 al 100\n 2- Te preguntare que numero cres que es\n 3- Si fallas te quitare un vida, si te quedas sin vidas pierdes\n 4- Pero tranquilo, te dare pistas, si me dices un numero grande te dire que es mas pequeño y a la inversa\n 5- Si estas cansado y no eres capaz de adivinar mi numero escribe 999 y saldras\n Bueno espero que estes listo porque empezamos"); 
        do
        {
            System.out.print("Tienes "+ vidas + " Vidas, ¿Que numero cres que es? ");
            resp = sc.nextInt();
            if(resp>numIncognita)
            {
                System.out.println("El numero es mas pequeño");
                vidas--;
            }
            else if(resp<numIncognita)
            {
                System.out.println("El numero es mas grande");
                vidas--;
            }
        } while(resp!=numIncognita && vidas!=0 && resp!=999);
        if(resp==numIncognita)
        {
            System.out.println("Enorabuena as adivinado el numero");
        }
        else if(vidas==0)
        {
            System.out.println("Te as quedado sin vidas, el numero era "+ numIncognita);
        }
        else
        {
            System.out.println("Porque te sales? el numero era "+ numIncognita +"facil ");
        }
    }
}
