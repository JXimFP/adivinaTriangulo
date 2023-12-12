public class Examen {
    public static void main(String[] args) {
        
        int [][] tablero ={ { 1, 2, 3, 4, 5},{ 2, 2, 0, 0, 0},{ 3, 0, 3, 0, 0},{ 4, 0, 0, 4, 0},{ 5, 0, 0, 0, 5}};

        calculo(tablero);
    }

    public static void calculo(int[][] numeros)
    {
    int columnas=numeros.length;
    int[] totales=new int[columnas];
    int producto=0, diagonal=0;

    producto=numeros[0][0];
    for(int cont=0;cont<numeros.length;cont++)
    {
        for(int cont2=0;cont2<numeros[cont].length;cont2++)
        {
            totales[cont]+=numeros[cont][cont2];
        }
        producto=producto*numeros[cont][diagonal];
        diagonal++;
    }
        for(int cont3=0;cont3<totales.length;cont3++)
        {
          
            System.out.println("Suma fila "+cont3+" = "+ totales[cont3]);
        }
        System.out.println("Producto = "+ producto);
    }
}
