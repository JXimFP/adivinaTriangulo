import java.util.Scanner;

public class EX229 {
    public static void main(String[] args)
    {
        boolean vectorLleno=false;
        int[] vectorTemperatura=new int[24];
        int[] temperaturaMaxmin=new int[4];
        double mediaFinal=0.0;
        int resp=0, cont;
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("Que quieres hacer?\n1- Rellenar el vector de forma manual\n2- Rellenar el vector de forma aleatoria\n3- Mostrar datos\n4- Obtener máximos y mínimos\n5- Temperatura media\n6- Salir");
            resp=sc.nextInt();
            switch (resp) 
            {
                case 1:
                    for(cont=0;cont<vectorTemperatura.length;cont++)
                    {
                        System.out.print("Escribe el "+ cont+1 +"r numero:");
                        vectorTemperatura[cont]=sc.nextInt();
                    }
                    vectorLleno=true;
                    break;
                case 2:
                    vectorTemperatura=vectorAleatorio(vectorTemperatura.length);
                    vectorLleno=true;
                    break;
                case 3:  //Mostrar valores del vector
                    if(vectorLleno==false)
                    {
                        System.out.println("Es necesario que el vector sea rellenado antes");
                        break;
                    }
                    else
                    {
                        for(cont=0;cont<vectorTemperatura.length;cont++)
                        {
                            System.out.println(cont+1+"h temperatura " + vectorTemperatura[cont]);
                        }
                    }
                    break;
                case 4:
                    if(vectorLleno==false)
                    {
                        System.out.println("Es necesario que el vector sea rellenado antes");
                        break;
                    }
                    else
                    {
                        temperaturaMaxmin=devolverMaxMin(vectorTemperatura); 
                        System.out.println("La temperatura mas alta sera de "+temperaturaMaxmin[0]+"º a las "+temperaturaMaxmin[1]+"h y la mas baja sera de "+temperaturaMaxmin[2]+"º a las "+temperaturaMaxmin[3]+"h");
                    }
                    break;
                case 5:
                    if(vectorLleno==false)
                    {
                        System.out.println("Es necesario que el vector sea rellenado antes");
                        break;
                    }
                    else
                    {
                        mediaFinal=mediaVector(vectorTemperatura);
                        System.out.println("La temperatura media de hoy es de "+mediaFinal+"º");
                    }
                    break;
                default:
                    break;
            }
        }while(resp!=6);
    }
    
    public static int[] vectorAleatorio(int tamañoVector)// Prove al vector con numeros aleatorios
    {
        int cont;
        int[] devolverVectorAleatorio=new int[tamañoVector];

        for(cont=0;cont<tamañoVector;cont++)
        {
            devolverVectorAleatorio[cont]= (int) (Math.random()*(40-0)+0);
        }
        return devolverVectorAleatorio;
    }


    public static int[] devolverMaxMin(int[] valoresVectores)  //Devuelve temperatura maxima y minima
    {
        int cont, Max=valoresVectores[0], Min=valoresVectores[0];
        int[] MinMaxEnviar={Max,1,Min,1};

        for(cont=1;cont<valoresVectores.length;cont++)
        {
            if(MinMaxEnviar[0]<valoresVectores[cont])
            {
                MinMaxEnviar[0]=valoresVectores[cont];
                MinMaxEnviar[1]=cont+1;
            }
            else if(MinMaxEnviar[2]>valoresVectores[cont])
            {
                MinMaxEnviar[2]=valoresVectores[cont];
                MinMaxEnviar[3]=cont+1;
            }
        }
        return MinMaxEnviar; // Es un array de 4 donde la posicion 0 temp. Maxima y 1 hoar, 2 temp. Maxima y 3 hoar
    }



    public static double mediaVector(int[] valoresVectores)
    {
        int cont;
        double media=0.0;

        for(cont=0;cont<valoresVectores.length;cont++)
        {
            media=media+valoresVectores[cont];
        }
        media=media/valoresVectores.length;
        return media;
    }
}
