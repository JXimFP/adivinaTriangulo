import java.util.Scanner;


public class Ex22D {
    public static void main(String[] args)
    {
        String[][] usuarioContraseña={{"Administrador", "Admin123"}, {"Usuario1", "123456789"}, {"Xim", "1"}};
        Scanner sc=new Scanner(System.in);
        int cont=0, intentos=3, todoCorrecto=0;
        String Usuario, Contrasenya;

        do
        {
            System.out.print("\nUsuario: ");
            Usuario=sc.nextLine();
            //Usuario=Usuario.replace("\n", "");
            System.out.print("\nContraseña: ");
            Contrasenya=sc.nextLine();
            //Contrasenya=Contrasenya.replace("\n", "");
            for(cont=0;cont<usuarioContraseña.length;cont++)
            {
                //usuarioContraseña[cont].[0] == usuario && usuarioContraseña[cont].[1] == contraseña

                // s1 == s2   s1.equals(s2)
                for(int cont2=0;cont2<usuarioContraseña[cont].length;cont2++)
                {
                    if(cont2==0)
                    {
                        if(Usuario.equals(usuarioContraseña[cont][cont2])) // equals compara Strings de forma correcta siempre, si pones == es probable que compare IDs
                        {
                            todoCorrecto+=1;
                        }
                    }
                    else if(cont2==1)
                    {
                        if(Contrasenya.equals(usuarioContraseña[cont][cont2]))
                        {
                            todoCorrecto+=1;
                        }
                    }
                }
            }
            if(todoCorrecto!=2)
            {
                System.out.println("Usuario o Contraseña incorrectos");
                intentos-=1;
            }
        }while(intentos!=0 && todoCorrecto!=2);
        if(intentos==0)
        {
            System.out.println("El ordenador se ha bloqueado");
        }
        if(todoCorrecto==2)
        {
            System.out.println("Acceso Autorizado");
        }
    }
}
